def call(){
    withCredentials([string(credentialsId: 'sonar-pass', variable: '')]) {
    sh 'mvn verify package sonar:sonar'
}
}