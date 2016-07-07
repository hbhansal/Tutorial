<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
#header{
	background-color: #5D6D7E; 
	height:60;
}
</style>

<div id="header" >
<table width="100%" class="ui-widget-header" > <tr> <td width="60">
<img src="/FMA_AUTO/images.png" width="200" height="60" align="top"/></td>

<td width="900" style=" color: white; align: center;"><h2>FMA Automation</h2></td>


 
  <td  align="right">
 
		Welcome : fmeaadmin |
		
<c:url value="loginPage" var="logoutUrl" />
<form id="logout" action="${logoutUrl}" method="post" >
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
<c:if test="${pageContext.request.userPrincipal.name != null}">
  <a href="javascript:Document.getElementById('logout').submit()">Logout</a>
</c:if>
		<!--  <a href="../login/logout" style="text-decoration: none;"><font color="white">Logout</font></a>  -->

</td>

 
 </tr></table>


</div>

<%-- <img src="<%=request.getContextPath()%>/images/logo-facile.jpg" width="170" height="60" /> --%>