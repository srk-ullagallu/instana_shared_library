pipeline{
    agent any
    stages{
        stage("wish"){
            steps{
                 echo "Hello World!"
            }
        }
        stage("print the envi"){
            steps{
                sh 'printenv'
            }
        }
    }
    post{
        always{
            cleanWs()
        }
    }
}