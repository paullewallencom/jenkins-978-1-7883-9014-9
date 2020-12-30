folder('Android App')
multibranchPipelineJob('Android App/Build') {

  branchSources {
    git {
      remote('http://gitlab/packt/android-demo.git')
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
