pipeline{
    agent any
    // tools{
    //     maven 'Maven 3.8.6'
    //     jdk 'Java 17.0.4.1'
    // }
    stages{
        stage('Build'){
            steps{
                echo 'hello1'
                sh 'ls -l'
                sh 'mvn clean install'
            }

        }
    }
}