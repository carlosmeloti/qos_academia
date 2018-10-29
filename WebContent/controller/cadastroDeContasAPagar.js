var cadContPagModulo = angular.module('cadContPagModulo',[]);

cadContPagModulo.controller("cadContPagController", function($scope, $http){
	

	urlContasAPagar = 'http://localhost:8080/QoS_Academia/rest/contasAPagar';
	urlFornecedores = 'http://localhost:8080/QoS_Academia/rest/fornecedores';
	
	$scope.listarContasAPagar = function() {
		$http.get(urlContasAPagar).success(function (contasAPagar) {
			$scope.cadastrosContasAPagar = contasAPagar;
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	
	$scope.listarFornecedores = function() {
		$http.get(urlFornecedores).success(function (fornecedor) {
			$scope.cadastrosFornecedores = fornecedor;
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	
	$scope.selecionaContPagCol = function(cadContPagSelecionado) {
		$scope.cadastro = cadConvSelecionado;

	}
	
	$scope.limparCampos = function(){
		$scope.cadastro = "";
	}
	
	$scope.salvar = function(){
		if ($scope.cadastro.id == undefined) {
			$http.post(urlContasAPagar, $scope.cadastro).success(function(contasAPagar){
				$scope.cadastrosContasAPagar.push($scope.cadastro);	
				$scope.listarContasAPagar();
				$scope.limparCampos();
			}).error (function(erro) {
				alert(erro);
			}); 
				
	} else {
		$http.put(urlContasAPagar, $scope.cadastro).success(function(contasAPagar){
			$scope.listarContasAPagar();
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
		$http.delete(urlContasAPagar+'/'+$scope.cadastro.id).success(function() {
			$scope.listarContasAPagar();
			$scope.limparCampos();
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	}
	
	$scope.listarContasAPagar();
	$scope.listarFornecedores();
	

	
	
});