def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "npm install"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "npm run sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "npm publish"
     }
  else if ("${stageName}" == "deployment")
  {
    sh "npm start"
}
}
