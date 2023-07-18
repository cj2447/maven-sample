pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }
        // stage('api upload'){
        //     steps{
        //            jf '-v'
                
        //         // Show the configured JFrog Platform instances.
        //         jf 'c show'
                
        //         // Ping Artifactory.
        //         jf 'rt ping'
                
        //         // Create a file and upload it to a repository named 'my-repo' in Artifactory
        //         sh 'touch test-file'
        //         jf 'rt u test-file sample-repo/'
                
        //         // Publish the build-info to Artifactory.
        //         jf 'rt bp'
        //     }
        // }
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
