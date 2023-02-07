pipeline {
    agent any
    tools {
        maven 'maven_3_9_0'
    }
    stages {
        stage('Build Maven 3.9.0') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/hirosaki217/devops-automation']])
                sh 'mvn clean install'
            }
        }
    }
}
