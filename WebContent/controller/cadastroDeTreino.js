var cadTreModulo = angular.module('cadTreModulo',[]);

cadTreModulo.controller("cadTreController", function($scope, $http){
	
	urlTreinos = 'http://localhost:8080/QoS_Academia/rest/treinos';
	urlAlunos = 'http://localhost:8080/QoS_Academia/rest/alunos';
	urlModalidades = 'http://localhost:8080/QoS_Academia/rest/modalidades';
	
		$scope.listarTreinos = function() {
			$http.get(urlTreinos).success(function (treino) {
				$scope.cadastrosTreino = treino;
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
		
		
		$scope.listarModalidades = function() {
			$http.get(urlModalidades).success(function (modalidade) { 
				$scope.cadastrosModalidades = modalidade;
			}).error (function(erro) {
				alert(erro);
			}); 
		}
		
		

		$scope.selecionaTreCol = function(cadTreSelecionado) {
			$scope.cadastro = cadTreSelecionado;

		}

		$scope.limparCampos = function(){
			$scope.cadastro = "";
		}
		
		$scope.salvar = function(){
			if ($scope.cadastro.id == undefined) {
				$http.post(urlTreinos, $scope.cadastro).success(function(treino){
					$scope.cadastrosTreino.push($scope.cadastro);	
					$scope.listarTreinos();
					$scope.limparCampos();
				}).error (function(erro) {
					alert(erro);
				}); 
					
		} else {
			$http.put(urlTreinos, $scope.cadastro).success(function(treino){
				$scope.listarTreinos();
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
			$http.delete(urlTreinos+'/'+$scope.cadastro.id).success(function() {
				$scope.listarTreinos();
				$scope.limparCampos();
			}).error (function(erro) {
				alert(erro);
			}); 
		}
		}
		
		//Executa
		$scope.listarAlunos();
		$scope.listarModalidades();
		$scope.listarTreinos();
	

});