import hudson.model.FreeStyleProject
import jenkins.model.Jenkins
import hudson.tasks.Shell

job1 = Jenkins.instance.createProject(FreeStyleProject, 'job1')
// fake a 100 MB workspace
job1.buildersList.add(new Shell('dd if=/dev/zero of=bigfile bs=1024 count=51200'))
job1.save()
