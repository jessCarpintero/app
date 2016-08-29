angular.module('appEdicom', ['ngRoute'])
.config(function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl: 'static/login.html',
		controller: 'loginControl'
	})
	.when('/folders', {
		templateUrl: 'static/folders.html'
	})
	.otherwise({
		redirectTo: '/'
	});
}).controller('loginControl', function($scope, $location, $log, $http) {
	$scope.submit = function () {
		var username = $scope.username;
		var password = $scope.domain;
		var domain = $scope.password;
		$log.debug("Username: " + username + "\n Pass: " + password  + "\n Domain: " + domain );
//		$http.get("http://localhost/rest/userservice/useraccess?username=" + username + "&password=" + password + "&domain=" + domain )
//        .then(function(res){
//        	$http.get('getFolders?type=J').then(function(response) {
//        	    $http({
//        	      url : 'https://webpre.sedeb2b.com/EdiwinES/services/mobile',
//        	      method : 'GET',
//        	      headers : {
//        	        'Authorization' :  angular.fromJson(res).token
//        	      }
//        	    }).then(function(response) {
//        	      angular.fromJson(response).description;
//        	      $log.debug(angular.fromJson(res).token);	
//        	    });   
//        	});
//        	$location.path('/folders');        	
//        }, function(res){
//          $scope.error = [{name: "Error!! " + res.status}];
//        });
		
   	      $http({
    	      url : 'https://webpre.sedeb2b.com/EdiwinES/services/mobile/registerSession?group=ASPEDITEST' + '&domain=' + domain + '&user=' + username + '&password=' + password + '&ediwinini=EDIWIN_ASPTEST.INI',
    	      method : 'GET',
    	      dataType: 'json',
    	      headers : {
    	    	  'Access-Control-Allow-Methods': 'GET,POST,OPTIONS',
    	    	  'Access-Control-Allow-Headers' : 'Content-Type',
    	    	  'Access-Control-Allow-Origin' :  '*'
    	      }
    	    }).success(function(data){
    	    	var securityToken = angular.fromJson(data);
            	$log.debug("Value token: " + securityToken.token);
            	$location.path('/folders');        	
            });  
	};
});