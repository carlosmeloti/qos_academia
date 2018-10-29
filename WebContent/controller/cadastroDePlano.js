var cadPlaModulo = angular.module('cadPlaModulo',[]);

cadPlaModulo.controller("cadPlaController", function($scope, $http){
	
urlPlanos = 'http://localhost:8080/QoS_Academia/rest/planos';
	
	$scope.listarPlanos = function() {
		$http.get(urlPlanos).success(function (plano) {
			$scope.cadastrosPlanos = plano;
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	

	$scope.selecionaPlaCol = function(cadPlaSelecionado) {
		$scope.cadastro = cadPlaSelecionado;

	}

	$scope.limparCampos = function(){
		$scope.cadastro = "";
	}
	
	$scope.salvar = function(){
		if ($scope.cadastro.id == undefined) {
			$http.post(urlPlanos, $scope.cadastro).success(function(plano){
				$scope.limparCampos();
				$scope.listarPlanos();
			}).error (function(erro) {
				alert(erro);
			}); 
				
	} else {
		$http.put(urlPlanos, $scope.cadastro).success(function(plano){
			$scope.listarPlanos();
			$scope.limparCampos();
		}).error (function(erro) {
			alert(erro);
		}); 
		
	}
	}
	
	$scope.excluir = function() {
		if ($scope.cadastro.id == undefined) {
			alert("Favor selecionar um registro");
			console.log("Favor selecionar um registro");
		
	}else{ 
		$http.delete(urlPlanos+'/'+$scope.cadastro.id).success(function() {
			$scope.listarPlanos();
			$scope.limparCampos();
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	}
	
	//Executa
	$scope.listarPlanos();		
});