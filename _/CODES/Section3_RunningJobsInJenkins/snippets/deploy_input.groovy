if (branchName == 'master') {
    stage ('Deploy'){
        def releaseNotes = input id: 'prod-deploy', message: 'Want to release to Production Environment', ok: 'Deploy', parameters: [text(defaultValue: '', description: 'Release Notes', name: 'release_notes')]
        echo "Going to push our release notes: ${releaseNotes}"
    }
}
