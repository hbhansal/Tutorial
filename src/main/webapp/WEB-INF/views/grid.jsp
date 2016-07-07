<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home page | FMA Dashboad</title>
    <!-- Core CSS - Include with every page -->
    <link href="assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet" />
    <link href="assets/css/main-style.css" rel="stylesheet" />
    <!-- Page-Level CSS -->
    <link href="assets/plugins/morris/morris-0.4.3.min.css" rel="stylesheet" />
</head>

<body>

<form action="saveData" method="post" modelAttribute="datatoBeSaved">



<sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/test"
        user="root" password=""
    />
     
    <sql:query var="recFailureInfo"   dataSource="${myDS}">
        SELECT * FROM RecFailure;
    </sql:query>
    
    <sql:query var="causeCodeinfo"   dataSource="${myDS}">
        select distinct causeCode from causecodestatictable;
    </sql:query>
     
    <div >
        <table name="grid" border="1" cellpadding="5">
           <!--  <caption><h2>List of users</h2></caption> -->
            <tr>
                <th>Cal Reference</th>
                <th>Category</th>
                <th>Customer</th>
                <th>Open Date</th>
                <th>Priority</th>
                <th>Problem Summary</th>
                <th>Status</th>
                <th>Assigned To (Team)</th>
                <th>Closed At</th>
                <th>Closed By (Person)</th>
                <th>Fixed By (Person)</th>
                <th>Cause Code</th>
                <th>Edit Cause Code</th>
           </tr>
           
           
            <c:forEach var="info" items="${recFailureInfo.rows}">
                <tr>
                    <td><c:out value="${info.calRef}" /></td>
                    <td><c:out value="${info.category}" /></td>
                    <td><c:out value="${info.customer}" /></td>
                    <td><c:out value="${info.openDate}" /></td>
                    <td><c:out value="${info.Priority}" /></td>
                    <td><c:out value="${info.problemSummary}" /></td>
                    <td><c:out value="${info.Status}" /></td>
                    <td><c:out value="${info.AssignedTo}" /></td>
                    <td><c:out value="${info.closedAt}" /></td>
                    <td><c:out value="${info.closedBy}" /></td>
                    <td><c:out value="${info.fixedBy}" /></td>                    
                    <td><c:out value="${info.causeCode}" /></td>
                    <td>
                    <select name="select2">
                    <option><c:out value="" /></option>
                    <c:forEach var="ccinfo" items="${causeCodeinfo.rows}">
                    <option><c:out value="${ccinfo.causeCode}" /></option>
                    </c:forEach>                    
 						</select> </td>
                </tr>
            </c:forEach>
        </table>
    </div>
  <input type="submit" name="save" value="Save"/></input>
</form>
</body>
</html>