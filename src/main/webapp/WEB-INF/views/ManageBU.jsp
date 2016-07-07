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
                    <h3 class="page-header"><center>  Business Unit </center></h3>
                </div>
                <!--end page header -->
            </div>
<form:form action="saveBussinessUnit" commandName="BussinessUnit" method='POST'>


   <div class="row">
                <div class="col-lg-12">
                    <!-- Form Elements -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             Business Unit
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form">
                                        <div class="form-group">
                                         <form:hidden path="busUnitID"  value="${BussinessUnit.getBusUnitID()}"/>
                                        <form:label path="engagementID">Engagement Name</form:label><br>
 										<form:select cssClass="form-control_login" path="engagementID">
 										<form:option value="0">--      Select      --</form:option>
										<form:options items="${engagements}" itemLabel="engagementName" itemValue="engagementID"/>
										</form:select>
                                            
                                        </div>
                                        
                                        
                                      <!-- templete   <div class="form-group">
                                            <form:label path="description">Engagement Description</form:label><br>
                                          <form:input path="description"/>
                                            
                                        </div> -->
                                        
                                        
                                        <div class="form-group">
                                            <form:label path="busUnitName">Bussiness Unit Name</form:label><br>
                                         <form:input cssClass="form-control_login" path="busUnitName" value="${BussinessUnit.busUnitName}"/>
                                            
                                        </div>
                                        
                                        <div class="form-group">
                                            <form:label path="description">Bussiness Unit Description</form:label><br>
                                          <form:input cssClass="form-control_login" path="description" value="${BussinessUnit.description}"/>
                                            
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
           


<c:if test="${!empty bussiness}">
  <div class="row">
                <div class="col-lg-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             Bussiness Table
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th style="font-size: 80%;">Engagement Name</th>
                                            <th style="font-size: 80%;">Bussiness Unit Name</th>
                                            <th style="font-size: 80%;">Description</th>
                                            <th style="font-size: 80%;">Edit</th>
                                            <th style="font-size: 80%;">Delete</th>
                                        </tr>
                                    </thead>
		
									
									
                                    <tbody>
									<c:forEach items="${bussiness}" var="bus">
                                        <tr class="odd gradeX">
                                            <td style="font-size: 80%;"><c:out value="${bus.engagement.engagementName}"/></td>
                                            <td style="font-size: 80%;"><c:out value="${bus.busUnitName}"/></td>
                                            <td style="font-size: 80%;"><c:out value="${bus.description}"/></td>
                                            <td style="font-size: 80%;" class="center"><a href="editBussinessUnit?busUnitID=${bus.busUnitID}">Edit</a></td>
                                            <td style="font-size: 80%;" class="center"><a href="deleteBussinessUnit?busUnitID=${bus.busUnitID}">Delete</a></td>
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