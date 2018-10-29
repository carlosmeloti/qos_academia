var cadModModulo = angular.module('cadModModulo',[]);

cadModModulo.controller("cadModController", function($scope, $http){
	
	urlModalidades = 'http://localhost:8080/QoS_Academia/rest/modalidades';
	
	$scope.listarModalidades = function() {
		$http.get(urlModalidades).success(function (modalidade) { 
			$scope.cadastrosModalidades = modalidade;
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	
	

	$scope.selecionaModCol = function(cadModSelecionado) {
		$scope.cadastro = cadModSelecionado;

	}

	$scope.limparCampos = function(){
		$scope.cadastro = "";
	}
	
	$scope.salvar = function(){
		if ($scope.cadastro.id == undefined) {
			$http.post(urlModalidades, $scope.cadastro).success(function(modalidade){
				$scope.limparCampos();
				$scope.listarModalidades();
			}).error (function(erro) {
				alert(erro);
			}); 
				
	} else {
		$http.put(urlModalidades, $scope.cadastro).success(function(modalidade){
			$scope.listarModalidades();
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
		$http.delete(urlModalidades+'/'+$scope.cadastro.id).success(function() {
			$scope.listarModalidades();
			$scope.limparCampos();
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	}
	
	//Executa
	$scope.listarModalidades();		
});