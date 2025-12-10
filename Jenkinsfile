pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Test') {
            steps {
                // Just runs the tests
                sh 'mvn clean test'
            }
        }

        stage('Build') {
            steps {
                // build
                // -DskipTests to avoid running them a second time.
                sh 'mvn package'
            }
        }
    }
}