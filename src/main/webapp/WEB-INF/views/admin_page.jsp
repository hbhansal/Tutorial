   <nav class="navbar-default navbar-static-side" role="navigation">
            <!-- sidebar-collapse -->
            <div class="sidebar-collapse">
                <!-- side-menu -->
                <ul class="nav" id="side-menu">
                    <li>
                        <!-- user image section-->
                        <div class="user-section">
                            <div class="user-section-inner">
                                <!--  img src="../assets/img/user.jpg" alt="">-->
                            </div>
                            <div class="user-info">
                                <div>${userName}</div>
                            <div class="user-text-online"/>   
                            </div>
                            
                            
                                
                            </div>
                            
                        </div>
                        <!--end user image section-->
                    </li>
                    <li class="sidebar-search"/>
                                          
                    <li class="selected">
                         <a href="<%=request.getContextPath()%>/admin/ManageEngDetails"><i class="fa fa-dashboard fa-fw" style="text-align: left;"></i>	Admin  </a>
                    </li>
                    <li>
                    
                        <a  href="<%=request.getContextPath()%>/admin/ManageEngDetails"><i class="fa-fw_admin text-left" ></i> Engagement Details</a>
                    </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/admin/ManageBU"><i class="fa-fw text-left"></i> Business Unit</a>
                    </li>
                   
                     <li>
                        <a href="<%=request.getContextPath()%>/admin/ManageAppDetails"><i class="fa-fw text-left"></i> Application Details</a>
                    </li>
                    <li>
                          <a href="<%=request.getContextPath()%>/admin/ManageCauseCode"><i class="fa-fw text-left"></i> Cause Code details</a>
                    </li>
                   
                   
                </ul>
                <!-- end side-menu -->
            </div>
            <!-- end sidebar-collapse -->
        </nav>