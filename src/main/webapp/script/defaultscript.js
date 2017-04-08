var module = angular.module("resumeFormat",[]);
module.controller("rf_ctrl", ['$scope','$http', '$compile', '$location', '$anchorScroll', function($scope, $http, $compile, $location, $anchorScroll) {
	
	 $scope.list = [];
     $scope.text = 'hello';
     	
     $scope.submit = function() {
    	 var skillDetails = {
    		languages : $scope.languages,
    		framework : $scope.framework,
    		devtech : $scope.devtech,
    		scripting : $scope.scripting,
    		methodologies : $scope.methodologies,
    		servers : $scope.servers,
    		databases : $scope.databases,
    		operatingsystem : $scope.operatingsystem,
    		othertools : $scope.othertools
         }	 
    	 var dataObj = JSON.stringify({
			name : $scope.name,
			email : $scope.email,
			phoneno : $scope.phoneno,
			linkedin : $scope.linkedin,
			github : $scope.github,
			summary : $scope.summary,
			skills: skillDetails
         });
    	 
    	 var list = document.querySelectorAll('#projectDetails');
         for(var i = 0; i < list.length; i++){
      	   console.log(list[i]);
         }
         console.log(dataObj);
         
       /*  var config = {headers : {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'}}
         $http.post('/ResumeFormat/webapi/resumeController/addUser', dataObj)
         .then(function(data) {
        	console.log('Success: ' + JSON.stringify({data: data}));
    	 }, function(reason) {
    		console.log('Failed: ' + JSON.stringify({data: data}));
    	 });*/
       
     };
    
     
 	 $scope.buttonClick = function(){
	   var el = '<table class="projectTable tableDefault" cellpadding="2" bgcolor="99FFFF" align="center"><tr><td>Project Name</td><td><input type="text" name=textnames ng-model="projName" size="60"></td></tr><tr><td>Client</td><td><input type="text" name=textnames ng-model="client" size="60"></td></tr><tr><td>Period</td><td><input type="date" name=textnames ng-model="fromDate" size="28"><input type="date" name=textnames ng-model="toDate" size="28"></td></tr><tr><td>Technologies Used</td><td><input type="text" name=textnames ng-model="technologies" size="60"></td></tr><tr><td>Responsibilities</td><td><textarea ng-model="responsibilities" rows="4" cols="50" maxlength="3000"></textarea></td></tr></table>'
	   angular.element(document.getElementById('projectDetails')).append(el);
//	   $location.hash('submit');
//       $anchorScroll();
	 }
     
}]);