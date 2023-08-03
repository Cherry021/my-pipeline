def call(Map params){
    checkout([
        $class: 'GitSCM', 
        branches: [[name: params.branch]], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [], 
        submoduleCfg: [], 
        userRemoteConfigs: [[credentialsId: 'myCredentials', url: params.url]]])

}