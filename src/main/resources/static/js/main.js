
function myFunction() {

    var c1 = $("#curso1").val();
    var c2= $("#tema1").val();
    var search = {
	   'curso':c1,
	   'tema':c2
			};

	   $.ajax({
	        type: 'POST',
	        dataType: 'json',
	        url: 'http://127.0.0.1:8080/curso/add',
	       	data: search,

	  			     success: function (data) {

			         console.log("SUCCESS : ", data);
			       			},
			        error: function (e) {
						 console.log("ERROR : ", e);
			        }
	    });

angular.element('#mycontroller').scope().ButtonClick();

}


//with onclick
//handleClick(event: Event) {
/*
var app = angular.module('myApp', []);
    app.controller('customersCtrl', function($scope, $http) {
	//$scope.myFunc = function() {
        $http.get("http://127.0.0.1:8080/all").then(function (success) {
            //$scope.myData = response.data.records;
            $scope.myData = success.data;
            //console.log(myData);
        });
	//	};
    });
*/
 var app = angular.module('myApp', [])
    app.controller('customersCtrl', function ($scope, $http, $window) {
        $scope.ButtonClick = function () {
              $http.get("http://127.0.0.1:8080/curso/all").then(function (success) {
                      //$scope.myData = response.data.records;
                      $scope.myData = success.data;

                  });
                         }
                    });

