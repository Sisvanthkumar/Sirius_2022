package com.example.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
    @Autowired
	private UserRepository userRepository;
    
    public String userExist(String email,String password,HttpServletRequest request) {
    	User mailCheck=userRepository.findByemail(email);
    	if(mailCheck == null) return "register";
    	else if(mailCheck.getPassword().equals(password)) {
    		request.getSession().setAttribute("validity","true");
    		return "twelfth_certificate";
    	}
    	else return "home";
    }
    
    public void addUser(String userName,String email,String password) {
    	User newUser=new User(userName,email,password);
    	System.out.println("vanthutan");
    	userRepository.save(newUser);
    }
    public User getUser(String email) {
    	return userRepository.findByemail(email);
    }
    
}
