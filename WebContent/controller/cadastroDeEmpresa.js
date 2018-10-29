var cadEmpModulo = angular.module('cadEmpModulo',[]);

cadEmpModulo.controller("cadEmpController", function($scope, $http){
	
	urlEmpresas = 'http://localhost:8080/QoS_Academia/rest/empresas';
	
	$scope.listarEmpresas = function() {
		$http.get(urlEmpresas).success(function (empresa) {
			$scope.cadastrosEmpresas = empresa;
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	
	

	$scope.selecionaEmpCol = function(cadEmpSelecionado) {
		$scope.cadastro = cadEmpSelecionado;

	}

	$scope.limparCampos = function(){
		$scope.cadastro = "";
	}
	
	$scope.salvar = function(){
		if ($scope.cadastro.id == undefined) {
			$http.post(urlEmpresas, $scope.cadastro).success(function(empresa){
				$scope.limparCampos();
				$scope.listarEmpresas();
			}).error (function(erro) {
				alert(erro);
			}); 
				
	} else {
		$http.put(urlEmpresas, $scope.cadastro).success(function(empresa){
			$scope.listarEmpresas();
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
		$http.delete(urlEmpresas+'/'+$scope.cadastro.id).success(function() {
			$scope.listarEmpresas();
			$scope.limparCampos();
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	}
	
	//Executa
	$scope.listarEmpresas();		
});