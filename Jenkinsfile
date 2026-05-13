pipeline {
    agent any

    tools {
        jdk 'java'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'develop',
                url: 'https://github.com/tatianariveraa00-gif/SeleniumCucumber.git'
            }
        }

        stage('Verify Environment') {
            steps {
                bat 'java -version'
                bat 'echo %JAVA_HOME%'
                bat 'gradle -v'
            }
        }

        stage('Run Tests') {
            steps {

                // OPCION RECOMENDADA (si existe gradlew.bat)
                bat 'gradlew clean test'

                // OPCION ALTERNATIVA
                // bat 'gradle clean test'
            }
        }
    }

    post {

        always {
            junit '**/build/test-results/test/*.xml'
        }

        success {
            echo 'Tests ejecutados correctamente'
        }

        failure {
            echo 'Falló la ejecución'
        }
    }
}