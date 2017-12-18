var app = angular.module("front-end", []);

app.service("mainService", mainService);
app.controller("mainCtrl", mainController);

function mainController($scope, mainService) {
    $scope.tekst ="Moja pierwsza apka";
    
    $scope.skladnikNumerJeden = 0;
    $scope.skladnikNumerDwa = 0;

    $scope.wynik = "";
    
    $scope.customSum = function () {
        mainService.customSumInService($scope.skladnikNumerJeden, $scope.skladnikNumerDwa).then(function (data) {
            $scope.wynik = data.data;
        })
    }

    $scope.customSub = function () {
        mainService.customSubInService($scope.skladnikNumerJeden, $scope.skladnikNumerDwa).then(function (data) {
            $scope.wynik = data.data;
        })
    }
}


function mainService($http) {
    return {
        customSumInService : function (s1, s2) {
            return $http.get("/api/math/add/" + s1 +"/" + s2)
        },
        customSubInService : function (s1, s2) {
            return $http.get("/api/math/sub/" + s1 +"/" + s2)
        }


    }

}