pipeline {
    agent { label "jenkins_slave" }
    stages {
        stage('Checkout repo') {
            steps {
                checkout scm
            }
            post {
                success {
                    echo "SUCCESS"
                }
            }
        }
    }
}