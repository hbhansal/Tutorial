
<nav class="navbar-default navbar-static-side" role="navigation">
	<!-- sidebar-collapse -->
	<div class="sidebar-collapse">
		<!-- side-menu -->
		<ul class="nav" id="side-menu">
			<li>
				<!-- user image section-->
				<div class="user-section">
					<div class="user-section-inner">
						<!-- <img src="../assets/img/user.jpg" alt=""> -->
					</div>
					<div class="user-info">
						<div>${userName}</div>
						<div class="user-text-online" />
					</div>



				</div>
	</div>
	<!--end user image section-->
	</li>
	<li class="sidebar-search" />

	<li class="selected"><a
		href="<%=request.getContextPath()%>/user/overview"><i
			class="fa fa-fw"></i></a></li>
	<li><a href="<%=request.getContextPath()%>/user/overview"><i
			class="fa-fw"></i>Overview</a></li>
	<li><a href="<%=request.getContextPath()%>/user/importData""><i
			class="fa-fw"></i>Recurring Failure</a></li>

	<li><a href="<%=request.getContextPath()%>/user/report"><i
			class="fa-fw"></i>Report</a></li>
	<li><a href="<%=request.getContextPath()%>/user/potentialFailure"><i
			class="fa-fw"></i>Potential Failure</a></li>
	<li><a href="<%=request.getContextPath()%>/user/actionProposal"><i
			class="fa-fw"></i>Action Proposal</a></li>

	</ul>
	<!-- end side-menu -->
	</div>
	<!-- end sidebar-collapse -->
</nav>