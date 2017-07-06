<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html class="login-bg">
<head>
	<title>Detail Admin - Sign up</title>
    
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
    <!-- bootstrap -->
    <link href="css/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="css/bootstrap/bootstrap-responsive.css" rel="stylesheet" />
    <link href="css/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet" />

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="css/layout.css" />
    <link rel="stylesheet" type="text/css" href="css/elements.css" />
    <link rel="stylesheet" type="text/css" href="css/icons.css" />

    <!-- libraries -->
    <link rel="stylesheet" type="text/css" href="css/lib/font-awesome.css" />
    
    <!-- this page specific styles -->
    <link rel="stylesheet" href="css/compiled/signup.css" type="text/css" media="screen" />

    <!-- open sans font -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css' />

    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.js"></script>
<script>
$(document).ready(function(){
	$("a[name='register']").click(function(){
		var usernameExp = /^[a-zA-Z0-9_]{6,16}/;
		var passwordExp = /^[\w.]{6,20}$/;
		var authorityExp = /^[1-2]$/;
		var username = $("input[name='username']").val();
		var password = $("input[name='password']").val();
		var authority = $("input[name='authority']").val();
		if(!usernameExp.test(username)){
			alert("用户名只能由字母和数字组成，长度在6-16位之间");
			return;
		}
		if(!passwordExp.test(password)){
			alert("密码的组成可以为任意字符，长度必须在6-20之间");
			return;
		}
		if(!authorityExp.test(authority)){
			alert("权限只能在1-2");
			return;
		}
		if($("input[name='password']").val() == $("input[name='ConfirmPassword']").val()){
			$.ajax({
				type:"POST",
				url:"${pageContext.request.contextPath}/getMan.do",
				data:{"username":username},
				success:function(date){
					if(date == "0"){
						$("form[name='managerForm']").submit();
					}else{
						alert("用户名已经注册");	
					}					
				} 
			});
			
		}else{
			alert("两次输入的密码不正确");	
		}
	});
})
</script>
</head>

<body>
    <div class="header">
        <a href="index.html">
            <img src="img/logo.png" class="logo" />
        </a>
    </div>
    <div class="row-fluid login-wrapper">
        <div class="box">
            <div class="content-wrap">
                <h6>Sign Up</h6>
                <form name="managerForm" method="POST" action="${pageContext.request.contextPath}/addMan.do">
                <input class="span12" type="text" placeholder="username" name="username"/>
                <input class="span12" type="password" placeholder="Password" name="password"/>
                <input class="span12" type="password" placeholder="Confirm Password" name="ConfirmPassword"/>
                <input class="span12" type="authority" placeholder="authority" name="authority"/>
                </form>
                <div class="action">
                    <a class="btn-glow primary signup" name="register" >Sign up</a>
                </div>                
            </div>
        </div>

        <div class="span4 already">
            <p>Already have an account?</p>
            <a href="signin.html">Sign in</a>
        </div>
    </div>

	<!-- scripts -->
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/theme.js"></script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>