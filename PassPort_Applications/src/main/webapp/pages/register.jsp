<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Registration page</title>
	<style>
	@import url(https://fonts.googleapis.com/css?family=Roboto:300);
		body {
		    background-image: url("https://wallpaperaccess.com/full/254367.png");
		    background-size : 100%;
		    background-repeat : no-repeat;
		}
		.title{
		  margin-left:15px;
		  margin-bottom:40px;
		  font-family: "Roboto", sans-serif;
		  font-size:35px;
		  color:white;
		  font-weight:bold;
		}
		.login-page {
		  width: 360px;
		  padding: 8% 0 0;
		  margin: auto;
		}
		.form {
		  background: #FFFFFF;
		  max-width: 360px;
		  margin: 0 auto 100px;
		  padding: 45px;
		  text-align: center;
		  box-shadow : 2px 4px 4px 4px #5584AC;
		}
		.form input {
		  font-family: "Roboto", sans-serif;
		  background: #f2f2f2;
		  width: 100%;
		  border: 0;
		  margin: 0 0 15px;
		  padding: 15px;
		  box-sizing: border-box;
		  font-size: 14px;
		}
		.form button {
		   background:#035397;
		  width: 100%;
		  border: 0;
		  padding: 15px;
		  color: #FFFFFF;
		  font-size: 14px;
		  cursor: pointer;
		}
		.form button:hover {
		  background: #2FA4FF;
		}
		.form .message {
		  margin: 15px 0 0;
		  color: #b3b3b3;
		  font-size: 15px;
		}
		.form .message a {
		  color: #035397;
		  text-decoration: none;
		}
	</style>
</head>
<body>
	<div class="login-page">
  <div class="title">Registration Form</div>
  <div class="form">
    <form class="register-form" action="addUser" method="POST">
      <input type="text" placeholder="name" name="userName"/>
      <input type="text" placeholder="email address" name="email"/>
      <input type="password" placeholder="password" name="password"/>
      <button>CREATE</button>
      <p class="message">Already registered? <a href="home">Sign in here !</a></p>
    </form>
 </div>
</div>
</body>
</html>