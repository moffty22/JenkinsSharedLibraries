def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "mvn clean deploy"
     }
  else if ("${stageName}" == "deploy2UAT")
  {
    sh "deploy adapters: [tomcat9(credentialsId: 'tomcat-credentials', path: '', url: 'http://3.129.218.197:8091/')], contextPath: null, war: 'target/*'"
}
}
