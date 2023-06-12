pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('Upload'){
            steps{
                // version = sh "find target -name "*.jar""
                rtUpload(
                    buildName: "$JOB_NAME",
                    buildNumber: "$BUILD_NUMBER",
                    serverId: "$serverId",
                    spec: '''{
                        "files":[
                            {
                            "pattern": "target/*.jar",
                            "target": "sample-repo",
                            "recursive": "false"
                        }
                        ]
                    }'''
                )
            }
        }
    }
}