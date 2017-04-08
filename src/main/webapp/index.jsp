<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<script src="script/angular.js"></script>
<script src="script/defaultscript.js"></script>

</head>
<body ng-app="resumeFormat" ng-controller="rf_ctrl">
  <!--   <p><a href="webapi/resumeController">Jersey resource</a> -->
   	<div id="content" class="content">
	<form ng-submit="submit()" >
		 <h2 class="personalDetailsLabel"><a>Personal Details</a></h2>
		 <table id="personalDetailsTable" class="tableDefault" cellpadding="2" bgcolor="99FFFF" align="center">
			<tr>
				<td>Name</td>
				<td><input type="text" name=textnames ng-model="name" size="47"></td>
			</tr>
			<tr>
				<td>Email Id</td>
				<td><input type="text" name=textnames ng-model="email" size="47"></td>
			</tr>
			<tr>
				<td>Phone No</td>
				<td><input type="text" name=textnames ng-model="phoneno" size="47"></td>
			</tr>
			<tr>
				<td>LinkedIn URL</td>
				<td><input type="text" name=textnames ng-model="linkedin" size="70"></td>
			</tr>
			<tr>
				<td>GitHub URL</td>
				<td><input type="text" name=textnames ng-model="github" size="70"></td>
			</tr>
			<tr>
				<td>Summary</td>
				<td><textarea ng-model="summary" rows="4" cols="50" maxlength="3000"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
		</table>
		 <h2 class="skillDetailsLabel"><a>Skills, Tools and Technologies</a></h2>
		 <table id="skillsTable" class="tableDefault" cellpadding="2" bgcolor="99FFFF" align="center">
			<tr>
				<td>Programming Languages</td>
				<td><input type="text" name=textnames ng-model="languages" size="60"></td>
			</tr>
			<tr>
				<td>Framework</td>
				<td><input type="text" name=textnames ng-model="framework" size="60"></td>
			</tr>
			<tr>
				<td>Development Technologies</td>
				<td><input type="text" name=textnames ng-model="devtech" size="60"></td>
			</tr>
			<tr>
				<td>Scripting Language</td>
				<td><input type="text" name=textnames ng-model="scripting" size="60"></td>
			</tr>
			<tr>
				<td>Methodologies</td>
				<td><input type="text" name=textnames ng-model="methodologies" size="60"></td>
			</tr>
			<tr>
				<td>Servers</td>
				<td><input type="text" name=textnames ng-model="servers" size="60"></td>
			</tr>
			<tr>
				<td>Databases</td>
				<td><input type="text" name=textnames ng-model="databases" size="60"></td>
			</tr>
			<tr>
				<td>Operating System</td>
				<td><input type="text" name=textnames ng-model="operatingsystem" size="60"></td>
			</tr>
			<tr>
				<td>Other tools and technologies</td>
				<td><input type="text" name=textnames ng-model="othertools" size="60"></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
		</table>
		
		<h2 class="projectDetailsLabel"><a>Project Details</a></h2>
		<div id="projectDetails" class="projectDetails">
		
		</div>
		
	 <input type="button" class="addProject" value="Add Project" align="center" ng-click="buttonClick()"/>
	 <input type="submit" id="submit" value="Submit" align="center"/>
	</form>
  </div>
</body>
</html>
