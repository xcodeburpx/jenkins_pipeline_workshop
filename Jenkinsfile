pipeline {
    agent "Jenkins file"

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