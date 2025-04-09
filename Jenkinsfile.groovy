pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'echo Build Complete'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'echo Test Complete'
            }
        }
    }
}
