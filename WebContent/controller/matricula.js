var cadMatModulo = angular.module('cadMatModulo',[]);

cadMatModulo.controller("cadMatController", function($scope, $http){
	
	urlMatriculas = 'http://localhost:8080/QoS_Academia/rest/matriculas';
	urlConvenios = 'http://localhost:8080/QoS_Academia/rest/convenios';
	urlAlunos = 'http://localhost:8080/QoS_Academia/rest/alunos';
	urlPlanos = 'http://localhost:8080/QoS_Academia/rest/planos';
	
	$scope.listarMatriculas = function() {
		$http.get(urlMatriculas).success(function (matricula) {
			$scope.cadastrosMatricula = matricula;
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	
	$scope.listarConvenios = function() {
		$http.get(urlConvenios).success(function (convenio) {
			$scope.cadastrosConvenio = convenio;
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	
	$scope.listarAlunos = function() {
		$http.get(urlAlunos).success(function (alunos) {
			$scope.cadastrosAlunos = alunos;
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
	
	$scope.selecionaMatCol = function(cadMatSelecionado) {
		$scope.cadastro = cadMatSelecionado;

	}
	
	$scope.limparCampos = function(){
		$scope.cadastro = "";
	}
	
	$scope.salvar = function(){
		if ($scope.cadastro.id == undefined) {
			$http.post(urlMatriculas, $scope.cadastro).success(function(matricula){
				$scope.cadastrosMatricula.push($scope.cadastro);	
				$scope.listarMatriculas();
				$scope.limparCampos();
			}).error (function(erro) {
				alert(erro);
			}); 
				
	} else {
		$http.put(urlMatriculas, $scope.cadastro).success(function(matricula){
			$scope.listarMatriculas();
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
		$http.delete(urlMatriculas+'/'+$scope.cadastro.id).success(function() {
			$scope.listarMatriculas();
			$scope.limparCampos();
		}).error (function(erro) {
			alert(erro);
		}); 
	}
	}
	
	$scope.listarConvenios();
	$scope.listarMatriculas();
	$scope.listarPlanos();
	$scope.listarAlunos();
	
	
	
		
});