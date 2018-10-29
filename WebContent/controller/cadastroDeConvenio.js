var cadConvModulo = angular.module('cadConvModulo',[]);

cadConvModulo.controller("cadConvController", function($scope, $http){
	
	urlConvenios = 'http://localhost:8080/QoS_Academia/rest/convenios';
	urlEmpresas = 'http://localhost:8080/QoS_Academia/rest/empresas';
	urlPlanos = 'http://localhost:8080/QoS_Academia/rest/planos';
	
		$scope.listarConvenios = function() {
			$http.get(urlConvenios).success(function (convenio) {
				$scope.cadastrosConvenio = convenio;
			}).error (function(erro) {
				alert(erro);
			}); 
		}
		
		$scope.listarEmpresas = function() {
			$http.get(urlEmpresas).success(function (empresa) {
				$scope.cadastrosEmpresa = empresa;
			}).error (function(erro) {
				alert(erro);
			}); 
		}
		
		$scope.listarPlanos = function() {
			$http.get(urlPlanos).success(function (plano) {
				$scope.cadastrosPlano = plano;
			}).error (function(erro) {
				alert(erro);
			}); 
		}
		
		

		$scope.selecionaConvCol = function(cadConvSelecionado) {
			$scope.cadastro = cadConvSelecionado;

		}

		$scope.limparCampos = function(){
			$scope.cadastro = "";
		}
		
		$scope.salvar = function(){
			if ($scope.cadastro.id == undefined) {
				$http.post(urlConvenios, $scope.cadastro).success(function(convenio){
					$scope.cadastrosConvenio.push($scope.cadastro);	
					$scope.listarConvenios();
					$scope.limparCampos();
				}).error (function(erro) {
					alert(erro);
				}); 
					
		} else {
			$http.put(urlConvenios, $scope.cadastro).success(function(convenio){
				$scope.listarConvenios();
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
			$http.delete(urlConvenios+'/'+$scope.cadastro.id).success(function() {
				$scope.listarConvenios();
				$scope.limparCampos();
			}).error (function(erro) {
				alert(erro);
			}); 
		}
		}
		
		//Executa
		$scope.listarEmpresas();
		$scope.listarPlanos();
		$scope.listarConvenios();
	

});