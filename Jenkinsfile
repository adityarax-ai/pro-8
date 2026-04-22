pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                echo 'Compiling Java file...'
                bat 'javac Calculator.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running Java program...'
                bat 'java Calculator'
            }
        }
    }
}
