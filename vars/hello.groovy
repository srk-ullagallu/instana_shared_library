def call() {
    pipeline {
        agent any
        stages {
            stage('stage-1') {
                steps {
                    echo 'stage-1'
                }
            }
            stage('stage-2') {
                steps {
                    echo 'stage-2'
                }
            }
            stage('stage-3') {
                steps {
                    echo 'stage-3'
                }
            }
            stage('stage-4') {
                steps {
                    echo 'stage-3'
                }
            }
            stage('stage-5') {
                steps {
                    echo 'stage-3'
                }
            }
        }
        post {
            always {
                echo 'I will always say Hello again!'
                cleanWs()
            }
        }
    }
}
