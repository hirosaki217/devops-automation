pipeline {
    agent any
    tools {
        gradle 'gradle_8_0'
    }
    environment { 
        BRANCH_NAME = "dev-gradle"
    }
    stages {
        stage('Build Gradle 8.0_rc3') {
            steps {
                checkout scmGit(branches: [[name: "*/${BRANCH_NAME}"]], extensions: [], userRemoteConfigs: [[url: 'https://github.com/hirosaki217/devops-automation']])
            }
        }
        stage("build & SonarQube analysis") {
            
            steps {
              withSonarQubeEnv(installationName: 'sq1') {
                sh "chmod +x gradlew"
                sh './gradlew sonarqube'
              }
            }
        }
        stage("Quality Gate") {
            steps {
              timeout(time: 2, unit: 'MINUTES') {
                waitForQualityGate abortPipeline: true
              }
            }
        }
    }
}