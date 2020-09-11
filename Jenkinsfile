pipeline {
    agent { label "master" }
    stages {
        stage('Change build name') {
            steps {
                script {
                    changeCurBuildName(latest)
                }
            }
        }
        stage('Checkout repo') {
            agent { label "jenkins_slave" }
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'jenkinsWorkshop']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'xcodeburpx', url: 'https://github.com/xcodeburpx/jenkins_pipeline_workshop.git']]])
                sh "ls -al $WORKSPACE/jenkinsWorkshop"
            }
        }
    }
}