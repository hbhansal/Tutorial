<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=UTF-8"%> 

<html>
	<head>
		<%-- <tiles:insertAttribute name="title" ignore="true" /> --%>
		<title>Welcome to FMA
	</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	

 			
	</head>

	<body background="/FMA_AUTO/Globe_world_map.jpg">

	<table>
	<tr height="60">
	<td width="1350" align="left">  
		<tiles:insertAttribute name="header" />  
		</td></tr>
		
		<tr height="500">
		<td align="left">
		<tiles:insertAttribute name="body" /> 
		</td> 
		 </tr>
		
		<tr height="60">
		<td align="left">
		<tiles:insertAttribute name="footer" />
		</td>   
	</tr> 
	
	</table> 

	
	
	</body>
</html>
	<%-- 
	on top si login page layout--%>