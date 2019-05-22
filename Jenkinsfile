pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean package -DskipTests -Pprod'
            }
        }
        stage('Test') {
            steps {
                echo 'Test....'
                sh 'mvn test'
            }
        }
        stage('Integrated Tests') {
            steps {
                echo 'Running integrated test....'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}