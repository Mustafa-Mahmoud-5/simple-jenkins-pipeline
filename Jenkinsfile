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

        stage('Build & Test') {
            steps {
                sh 'mvn clean package'
            }
        }
    }

    post {
        always {
            // This tells Jenkins to look for test results (JUnit format)
            junit '**/target/surefire-reports/*.xml'
        }
    }
}