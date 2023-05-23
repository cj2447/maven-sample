pipeline{
    agent any
    // tools{
    //     maven 'Maven 3.8.6'
    //     jdk 'Java 17.0.4.1'
    // }
    stages{
        stage('Build'){

            steps{
                echo 'hello1'
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
                            "pattern": "target/.jar",
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