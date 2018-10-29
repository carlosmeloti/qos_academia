var cadColModulo = angular.module('cadColModulo',[]);

cadColModulo.controller("cadColController", function($scope, $http){
	
	$http.get('controller/json/colaboradores.json').then(function (response) {
		$scope.cadastrosColaboradores = response.data.colaboradores;

	})		
});