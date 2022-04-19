<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
  @import url(https://fonts.googleapis.com/css?family=Roboto:300);
  	body {
		    background-image: url("https://d27jswm5an3efw.cloudfront.net/app/uploads/2019/03/document-file-types-21.jpg");
		    background-size : 100%;
		    background-repeat : no-repeat;
		}
	.title{
	  margin-left:15px;
	  margin-bottom:40px;
	  font-family: "Roboto", sans-serif;
	  font-size:35px;
	  color:black;
	  font-weight:bold;
	  text-align:center;
	}
	.Twelfth-certificate-page {
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
	
	
	.container {
	  width: 60%;
	  margin:0 auto;
	}
	.progressbar {
	  counter-reset: step;
	}
	.progressbar li {
	  list-style: none;
	  display: inline-block;
	  width: 24%;
	  position: relative;
	  text-align: center;
	  cursor: pointer;
	}
	.progressbar li:before {
	  content: counter(step);
	  counter-increment: step;
	  width: 30px;
	  height: 30px;
	  line-height : 30px;
	  border: 1px solid black;
	  border-radius: 100%;
	  display: block;
	  text-align: center;
	  margin: 0 auto 10px auto;
	  background-color: black;
	  color:white;
	}
	.progressbar li:after {
	  content: "";
	  position: absolute;
	  width: 100%;
	  height: 1px;
	  background-color: #ddd;
	  top: 15px;
	  left: -50%;
	  z-index : -1;
	}
	.progressbar li:first-child:after {
	  content: none;
	}
	.progressbar li.active:before {
	  border-color: black;
	} 
	
</style>
</head>
<body>
<body >
	<div class="container">
      <ul class="progressbar">
        <li class="active">Step 1</li>
        <li>Step 2</li>
        <li>Step 3</li>
        <li>Step 4</li>
      </ul>
    </div>
	<div class="Twelfth-certificate-page">
	  <div class="title">Upload your 12th certificate</div>
	  <section class="form">
	    <form class="login-form" method="POST" action="/twelfth_certificate"  enctype="multipart/form-data">
	      <input type="file" id="myFile" name="filename" required>
	      <button>UPLOAD</button>
	    </form>
	  </section>
	</div>
</body>
</body>
</html>
