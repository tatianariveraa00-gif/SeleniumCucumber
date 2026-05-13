pipeline {
    agent any

    tools {
        jdk 'jdk17'
    }

    stages {
        stage('Test') {
            steps {
                bat 'gradlew test'
            }
        }
    }
}