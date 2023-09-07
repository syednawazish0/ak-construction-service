pipeline {
    agent any
    tools {
        maven 'Maven_Home'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/syednawazish0/ak-construction-service.git']]
                ])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t akconstruction/ak-construction .'
                }
            }
        }
         stage('Push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'access-token', variable: 'docker-hub')]) {
                    bat 'docker login -u syednawazisha -p %docker-hub%'
                }
                   
                   bat 'docker push syednawazisha/akconstruction:ak-construction'
                }
            }
        }
    }
}
