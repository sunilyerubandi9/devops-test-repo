pipeline {
	agent any
	tools {
		maven "Maven"
	}
	stages {
		stage('build') {
			steps {
				echo 'build.  ..'
				snDevOpsStep()
				sleep 5
			}
		}
		stage('test') {
			steps {
				echo 'testing... '
				snDevOpsStep()
				sleep 5
				//snDevOpsChange()
			}
		}
		stage('Deploy for development') {
			when {
				branch 'development'
			}
			steps {
				echo 'dev branch deployment...'
				snDevOpsStep()
				snDevOpsArtifact(artifactsPayload:"""{
				"artifacts": [
				{
					"name": "development_artifact.jar",
					"repositoryName": "jenkins-repo",
					"version": "1.1",
					"semanticVersion": "1.1.0",
				}],
				"stageName":"Deploy for development",
				}""")
				sleep 5
			}
		}
		stage('Deploy for production') {
			when {
				branch 'prod'
			}
			steps {
				echo 'prod branch deployment...'
				snDevOpsStep()
				sleep 5
			}
		}
	}
}
