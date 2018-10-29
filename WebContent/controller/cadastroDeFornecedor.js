var cadForModulo = angular.module('cadForModulo',[]);

cadForModulo.controller("cadForController", function($scope, $http){
	
	urlFornecedores = 'http://localhost:8080/QoS_Academia/rest/fornecedores';
	
	$scope.listarFornecedores = function() {
		$http.get(urlFornecedores).success(function (fornecedor) {
			$scope.cadastrosFornecedores = fornecedor;
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	
	

	$scope.selecionaForCol = function(cadForSelecionado) {
		$scope.cadastro = cadForSelecionado;

	}

	$scope.limparCampos = function(){
		$scope.cadastro = "";
	}
	
	$scope.salvar = function(){
		if ($scope.cadastro.id == undefined) {
			$http.post(urlFornecedores, $scope.cadastro).success(function(fornecedor){
				$scope.limparCampos();
				$scope.listarFornecedores();
			}).error (function(erro) {
				alert(erro);
			}); 
				
	} else {
		$http.put(urlFornecedores, $scope.cadastro).success(function(fornecedor){
			$scope.listarFornecedores();
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
		$http.delete(urlFornecedores+'/'+$scope.cadastro.id).success(function() {
			$scope.listarFornecedores();
			$scope.limparCampos();
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	}
	
	//Executa
	$scope.listarFornecedores();		
});