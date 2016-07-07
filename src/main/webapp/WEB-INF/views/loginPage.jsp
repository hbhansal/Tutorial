<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FMA Automation | login Dashboad </title>
    <!-- Core CSS - Include with every page -->
    <link href="../assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="../assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="../assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
   <link href="../assets/css/style.css" rel="stylesheet" />
   <link href="../assets/css/main-style.css" rel="stylesheet" />

</head>

<body class="body-Login-back">

    <div class="container">
       
        <div class="row">
            <div class="col-md-4 col-md-offset-4 text-center logo-margin ">
              <img src="../assets/img/logo.png" alt=""/>
                </div>
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">                  
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                    <c:url var="loginUrl" value="/j_spring_security_check" />
                       <form:form name='loginForm' id="loginForm" action="${loginUrl}" method='POST'>
                           <c:if test="${param.error != null}">
								<div class="row">
									<p>Invalid username and password.</p>
								</div>
							</c:if>
							<c:if test="${param.logout != null}">
								<div class="row">
									<p class="text-center">You have been logged out successfully.</p>
								</div>
							</c:if>
                           
                            <fieldset>
								<div style="color:red;">${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</div>
                                <div class="form-group">
                                   <input id="j_username" class="form-control_login" name="j_username" type="text" placeholder="Username"   autofocus> 
                                </div>
                                <div class="form-group">
                                    <input class="form-control_login" id="j_password" name="j_password" type="password" placeholder="Password" autocomplete="on"  >
                                </div>
								  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                                <!-- <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div> -->
                                <!-- Change this to a button or input when using this as a form -->
                                 <!--  <button id="subbtn" >LogIn</button> -->
                                <button class="btn btn-lg btn-success btn-block">Login</button>
                            </fieldset>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>

     <!-- Core Scripts - Include with every page -->
    <script src="../assets/plugins/jquery-1.10.2.js"></script>
    <script src="../assets/plugins/bootstrap/bootstrap.min.js"></script>
    <script src="../assets/plugins/metisMenu/jquery.metisMenu.js"></script>

</body>

</html>
