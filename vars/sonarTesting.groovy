def call(){
    withCredentials([string(credentialsId: 'sonar-pass', variable: '')]) {
    sh 'mvn clean package sonar:sonar'
}
}