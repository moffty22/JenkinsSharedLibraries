def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "echo validate, compile and perform UnitTesting"
       sh "echo UnitTesting must passed for artifacts to be created"
       sh "mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "mvn clean sonar:sonar"
       sh "echo CodeQualityAnalysis completed"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "mvn clean deploy"
       sh "echo artifacts uploaded successfully"
       sh "echo Build and release completed" 
     }
}
