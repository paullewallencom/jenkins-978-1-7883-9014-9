#!/usr/bin/groovy
@Library('jenkins-library')
def maven = new de.mare.ci.jenkins.Maven()

node {
  echo maven.getProjectVersion()

}
