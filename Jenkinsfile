pipeline {
    agent any

    stages {
        stage('Maven Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
