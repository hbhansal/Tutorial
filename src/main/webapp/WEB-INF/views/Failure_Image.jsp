<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>  <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Failure Information</title>
    <link href="../assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="../assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="../assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
    <link href="../assets/css/style.css" rel="stylesheet" />
    <link href="../assets/css/main-style.css" rel="stylesheet" />
    <!-- Page-Level CSS -->
    <link href="../assets/plugins/morris/morris-0.4.3.min.css" rel="stylesheet" />
    
    
    
</head>
<body>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript" src="https://www.google.com/jsapi"></script>
		<script type="text/javascript" src="../assets/scripts/visualization-chart-script.js"></script>
		
		<script type="text/javascript">
<!--

//-->

function crunchifyAjax() {
    $.ajax({
        url : 'user/Failure_Image.html',
        success : function(data) {
            $('#student-bar-chart').html(data);
        }
    });
}
</script>

<script type="text/javascript">
    var intervalId = 0;
    intervalId = setInterval(crunchifyAjax, 30000);
</script>

 <div class="row">
                 <!-- page header -->
                <div class="col-lg-12">
                    <h3 class="page-header"><center>Recurring Failure Information</center></h3>
                </div>
                <!--end page header -->
            </div>
  <div class="row">
<div class="user-section-inner">
                    <img src="../assets/img/Bar_chart.PNG" alt="">
                    <div id="student-bar-chart"></div>
 </div>
</div>

 <a href="<%=request.getContextPath()%>/user/overview">User Page Home</a>
            </body>
            </html>