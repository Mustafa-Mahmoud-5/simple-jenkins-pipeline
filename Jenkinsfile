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
                // 1. Clean old files and run tests
                sh 'mvn clean test'
            }
        }

        stage('Build') {
            steps {
                // -DskipTests to avoid running them a second time.
                sh 'mvn package -DskipTests'
            }
        }
    }

    // draw a test reports graph in jenkins UI
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}