<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

 <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home page | FMA Dashboad</title>
    <!-- Core CSS - Include with every page -->
    <link href="../assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="../assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="../assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
    <link href="../assets/css/style.css" rel="stylesheet" />
    <link href="../assets/css/main-style.css" rel="stylesheet" />
    <!-- Page-Level CSS -->
    <link href="../assets/plugins/morris/morris-0.4.3.min.css" rel="stylesheet" />
</head>
<body>
<div class="row">
                 <!-- page header -->
                <div class="col-lg-12">
                    <h3 class="page-header"><center>  Cause Code Details</center></h3>
                </div>
                <!--end page header -->
            </div>
  
<form:form action="saveCauseCode" commandName="CauseCodeBean" method='POST'>


   <div class="row">
                <div class="col-lg-12">
                    <!-- Form Elements -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             Cause Code Details
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form">
                                        <div class="form-group"> 
                                        <form:hidden path="causeCodeID"  value="${CauseCode.getCauseCodeID()}"/>
                                        
                                     <form:label path="engCauseCodeID">Engagement Name</form:label><br>
 										<form:select cssClass="form-control_login" path="engCauseCodeID">
 										<form:option value="0">--      Select      --</form:option>
										<form:options items="${engagements}" itemLabel="engagementName" itemValue="engagementID"/>
										</form:select>
                                            
                                        </div>
                                       
                                        <div class="form-group">
                                          <form:label path="causeCode">Cause Code</form:label>
                                        <form:select cssClass="form-control_login" path="causeCode">
										  <form:option value="Select" label="--      Select      --" />
										  <form:option value="Hardware Failure " label="Hardware Failure " />
										  <form:option value="Query/Analysis" label="Query/Analysis" />
										  <form:option value="Access Related" label="Access Related" />
										  <form:option value="Service Request" label="Service Request" />
										  <form:option value="Job Failure" label="Job Failure" />
										  <form:option value="Software Failure" label="Software Failure" />
										  <form:option value="3rd party" label="3rd party" />
										  <form:option value="Network Failure" label="Network Failure" />
										
										</form:select>
                                            
                                        </div>
                                        
                                        <div class="form-group">
                                            <form:label path="keyWord1">KeyWord1</form:label><br>
                                        <form:input cssClass="form-control_login" path="keyWord1" value="${CauseCode.keyWord1}"/>
                                            
                                        </div>
                                        
                                        <div class="form-group">
                                            <form:label path="keyWord2">KeyWord1</form:label><br>
                                         <form:input cssClass="form-control_login" path="keyWord2" value="${CauseCode.keyWord2}"/>
                                            
                                        </div>
                                        
                                        <div class="form-group ">
                                            <form:label path="keyWord3">KeyWord1</form:label><br>
                                          <form:input cssClass="form-control_login" path="keyWord3" value="${CauseCode.keyWord3}"/>
                                            
                                        </div>
                                      
                                        
                                           
                                       
                                        <button type="submit" class="btn btn-primary">save</button>
                                        <button type="reset" class="btn btn-success">Reset</button>
                                    </form>
                                     </div>
                                </div>
                                
                        </div>
                    </div>
                     <!-- End Form Elements -->
                </div>
            </div>
           

<c:if test="${!empty CauseCodeBeans}">
 
  <div class="row">
                <div class="col-lg-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             Cause Code Table
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th style="font-size: 80%;">Engagement Name</th>
                                            <th style="font-size: 80%;">Cause Code</th>
                                            <th style="font-size: 80%;">KeyWord1</th>
                                            <th style="font-size: 80%;">KeyWord2</th>
                                            <th style="font-size: 80%;">KeyWord3</th>
                                            <th style="font-size: 80%;">Edit</th>
                                            <th style="font-size: 80%;">Delete</th>
                                        </tr>
                                    </thead>
		
									
									
                                    <tbody>
									<c:forEach items="${CauseCodeBeans}" var="cau">
                                        <tr class="odd gradeX">
                                            <td style="font-size: 80%;"><c:out value="${cau.engagement.engagementName}"/></td>
                                            <td style="font-size: 80%;"><c:out value="${cau.causeCode}"/></td>
                                            <td style="font-size: 80%;"><c:out value="${cau.keyWord1}"/></td>
                                            <td style="font-size: 80%;"><c:out value="${cau.keyWord2}"/></td>
                                            <td style="font-size: 80%;"><c:out value="${cau.keyWord3}"/></td>
                                            <td style="font-size: 80%;" class="center"><a href="editCauseCode?causeCodeID=${cau.causeCodeID}">Edit</a></td>
                                            <td style="font-size: 80%;" class="center"><a href="deletecauseCode?causeCodeID=${cau.causeCodeID}">Delete</a></td>
                                        </tr>
										</c:forEach>  
                                    </tbody>
                                </table>
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
</c:if> 


</form:form>




</body>
</html>