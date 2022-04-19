package com.example;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.service.FileStorageService;
import com.example.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	@Autowired
	FileStorageService fileStorageService;
	String isLoggedIn(HttpServletRequest request,String page) {
		System.out.println(request.getSession().getAttribute("validity"));
		String check=(String)request.getSession().getAttribute("validity");
		System.out.println(check.equals("true")+" "+check);
		if(check.equals("true")){
			return null;
		}
		return "redirect:home";
	}
	String getMail(HttpServletRequest request) {
		return (String)request.getSession().getAttribute("email");
	}

	@RequestMapping("home")
	public String home(HttpServletRequest request) {
		request.getSession().setAttribute("validity","false");
		System.out.println(request.getSession().getAttribute("validity"));
		return "home";
	}
	@RequestMapping("register")
	public String register() {
		return"register";
	}
	@RequestMapping("twelfth_certificate")
	public String twelfth_certificate(HttpServletRequest request) {
		System.out.println(isLoggedIn(request,"twelfth_certificate"));
		String logged= isLoggedIn(request,"twelfth_certificate");
		if(logged!=null)return logged;
		return "twelfth_certificate";

	}
	@RequestMapping("college_degree_certificate")
	public String college_degree_certificate(HttpServletRequest request) {
		String logged= isLoggedIn(request,"college_degree_certificate");
		if(logged!=null)return logged;
		return "college_degree_certificate";
	}
	@RequestMapping("aadhar_card")
	public String aadhar_card(HttpServletRequest request) {
		String logged=isLoggedIn(request, "aadhar_card");
		if(logged!=null)return logged;
		return "aadhar_card";

	}
	@RequestMapping("pan")
	public String pan(HttpServletRequest request) {	
		String logged= isLoggedIn(request,"pan");
		if(logged!=null)return logged;
		return "pan";

	}
	@RequestMapping("success")
	public String success(HttpServletRequest request) {
		
		String logged= isLoggedIn(request,"success");
		if(logged!=null)return logged;
		return "success";
	}
	@PostMapping("/home")
	public String homePage(HttpServletRequest request){
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String redirect=userService.userExist(email, password,request);
		request.getSession().setAttribute("email",email);
		return "redirect:"+redirect;
		
	}
	
	@PostMapping("/addUser")
	public String addUserPage(HttpServletRequest request){
		
		String userName=request.getParameter("userName");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		userService.addUser(userName, email, password);
		
		return "redirect:home";
	}
	
	@PostMapping("/twelfth_certificate")
	public String twelfth_certificate(@RequestParam("filename") MultipartFile file,HttpServletRequest request){
		
		fileStorageService.storeFile(file,userService.getUser(getMail(request)));
		return "redirect:college_degree_certificate";
	}
	
	@PostMapping("/college_degree_certificate")
	public String college_degree_certificate(@RequestParam("filename") MultipartFile file,HttpServletRequest request){
		
		fileStorageService.storeFile(file,userService.getUser(getMail(request)));
		return "redirect:aadhar_card";
	}
	
	@PostMapping("/aadhar_card")
	public String aadhar_card(@RequestParam("filename") MultipartFile file,HttpServletRequest request){
		
		fileStorageService.storeFile(file,userService.getUser(getMail(request)));
		return "redirect:pan";
	}
	
	@PostMapping("/pan")
	public String pan(@RequestParam("filename") MultipartFile file,HttpServletRequest request){
		
		fileStorageService.storeFile(file,userService.getUser(getMail(request)));
		return "redirect:success";
	}
}
