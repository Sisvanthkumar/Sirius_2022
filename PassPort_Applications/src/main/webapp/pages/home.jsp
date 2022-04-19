<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>PassPort-Website</title>
	<style>
		body {
		    background-image: url("https://wallpaperaccess.com/full/254367.png");
		    background-size : 100%;
		    background-repeat : no-repeat;
		}
		@import url(https://fonts.googleapis.com/css?family=Roboto:300);
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
		  position: relative;
		  z-index: 1;
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
<body >
	<div class="login-page">
	  <div class="title">Login Credentials</div>
	  <section class="form">
	    <form class="login-form" method="POST" action="/home" modelAttribute="LoginForm">
	      <input type="text" placeholder="email" name="email" required/>
	      <input type="password" placeholder="password" name="password" required>
	      <button>LOGIN</button>
	      <p class="message">Not registered? <a href="register">Create an account</a></p>
	    </form>
	  </section>
	</div>
</body>
</html>
