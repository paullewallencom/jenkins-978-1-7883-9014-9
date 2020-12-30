parameters([
    string(defaultValue: '', description: '', name: 'releaseVersion')]
),  

        stage('Start Release') {
          echo "releaseVersion: ${releaseVersion}"
          // TODO invoke our release script
        }


