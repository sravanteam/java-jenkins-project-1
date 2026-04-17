pipeline {
    agent any

   // tools {
     //   maven 'Maven'   // Must match the name in Jenkins Global Tool Config
       // jdk 'Java'      // Must match the name in Jenkins Global Tool Config
   // }

    stages {

        stage('Checkout') {
            steps {
                echo ' Cloning repository...'
                git branch: 'main', url: 'https://github.com/sravanteam/java-jenkins-project-1.git'
            }
        }

        stage('Build') {
            steps {
                echo ' Building with Maven...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo ' Running Unit Tests...'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                echo ' Packaging into JAR...'
                sh 'mvn package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo ' Deploying Application...'
                sh 'java -cp target/jenkins-java-demo-1.0-SNAPSHOT.jar com.demo.App'
            }
        }
    }

    post {
        success {
            echo ' Pipeline completed successfully!'
        }
        failure {
            echo ' Pipeline failed. Check the logs.'
        }
    }
}
