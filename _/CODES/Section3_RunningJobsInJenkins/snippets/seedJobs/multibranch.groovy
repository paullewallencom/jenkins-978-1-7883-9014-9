folder('Continuous Delivery')
multibranchPipelineJob('Continuous Delivery/Build') {

  branchSources {
    git {
      remote('http://gitlab/packt/spring-boot-angular.git')
      credentialsId('gitlab-user-jenkins')
    }

  }
  triggers {
    cron('* * * * *')
  }

  orphanedItemStrategy {
    discardOldItems {
      numToKeep(20)
    }
  }

}
