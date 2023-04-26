pipeline {
    agent any

    stages {
        stage('repo') {
            steps {
                git branch: 'main', url: 'https://github.com/luisaque/pps3.git'
            }
        }

        stage('contruirTrabajo') {
            steps {
                sh 'sudo ./mvnw clean package'
            }
        }
        stage('Desplegar') {
            steps {
                sh './mvnw spring-boot:run'
            }
        }
    }
}
