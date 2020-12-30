node {
    
      git credentialsId: 'ssh_node_node1', url: 'git@gitlab:packt/spring-boot-angular.git'

      stage('Build') {
          sh 'java -version'
      }

      stage('test') {
		parallel(
			'JDK 8': {
				node('JDK8') {
				    git credentialsId: 'ssh_node_node1', url: 'git@gitlab:packt/spring-boot-angular.git'
					sh './mvnw test'
				}
			},
			'JDK 9': {
				node('JDK9') {
				    git credentialsId: 'ssh_node_node1', url: 'git@gitlab:packt/spring-boot-angular.git'
					sh './mvnw test'
				}
			},
			failFast: false
		)    
	  }
}
