<!DOCTYPE html>
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


<form:form action="saveEngagement" commandName="Engagement" method='POST'>

<div class="row">
                 <!-- page header -->
                <div class="col-lg-12">
                    <h3 class="page-header"><center>   Application Details </center></h3>
                </div>
                <!--end page header -->
            </div>
   <div class="row">
                <div class="col-lg-12">
                    <!-- Form Elements -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             Application Details
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form">
                                        <div class="form-group">
                                            <form:label  path="engagementName">Engagement Name</form:label><br>
 <select class="form-control_login">
  <option value="0">-- select --</option>
  <option value="AEP">AEP</option>
  <option value="Disney">WB</option>
  <option value="Warner Brothers">Coke</option>
  <option value="EFH">Monsanto</option>
   <option value="Visteon">Visteon</option>
</select>
                                            
                                        </div>
                                       <div class="form-group">
                                            <form:label path="description">Business Unit Name</form:label><br>
                                         <select class="form-control_login">
                                          <option value="0">-- select --</option>
  <option value="AEP">Enterprise</option>
  <option value="Disney">Customer</option>
  <option value="Warner Brothers">T&D</option>
  <option value="EFH">COG</option>
</select>
                                            
                                        </div>
                                        
                                        
                                      <!-- templete   <div class="form-group">
                                            <form:label path="description">Engagement Description</form:label><br>
                                          <form:input path="description"/>
                                            
                                        </div> -->
                                        
                                        
                                        <div class="form-group">
                                            <form:label path="ApplicationName">Application Name</form:label><br>
                                    		<input class="form-control_login" type="text"/>      	
									
                                            
                                        </div>
                                        
                                        <div class="form-group">
                                            <form:label path="TechnologyName">Technology Name</form:label><br>
                                        	<input class="form-control_login" type="text"/>
                                            
                                        </div>
                                        
                                        <div class="form-group">
                                            <form:label path="DatabaseName">Database Name</form:label><br>
                                          <input type="text" class="form-control_login"/>
										</div>
                                          <div class="form-group">
                                            <form:label path="ApplicationDescription">Application Description</form:label><br>
                                         <input type="text" class="form-control_login"/>
                                          
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
            


</form:form>



</body>
</html>