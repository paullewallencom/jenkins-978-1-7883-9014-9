folder('DSL_Pipeline')

pipelineJob('DSL_Pipeline/Spring-Angular') {

    triggers {
        scm('H/5 * * * *')
    }

    definition {    
        cpsScm {      
            scm {        
                git {          
                    remote { 
                        url('http://gitlab/packt/spring-boot-angular.git') 
                        credentials('gitlab-user-jenkins') 
                    }          
                    
                    scriptPath('Jenkinsfile')          
                    extensions { }      
                }      
            }    
        }  
    }
}