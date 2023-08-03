def call(){
    withSonarQubeEnv(credentialsId: 'sonar-pass') {
    sh 'mvn clean package sonar:sonar'
}
}