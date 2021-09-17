pipeline {
	agent any
	tools {
		maven "Maven"
	}
	stages {
		stage('build') {
			steps {
				echo 'build ...'
				snDevOpsStep()
				sleep 5
			}
		}
		stage('test') {
			steps {
				echo 'test .'
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
				echo 'dev branch deployment ...'
				snDevOpsStep()
				snDevOpsArtifact(artifactsPayload:"""{
				"name": "development_artifact.jar",
				"artifacts": [
				{
					"name": "development_artifact.jar",
					"repositoryName": "jenkins-repo",
					"version": "1.$(build.buildId)",
					"pipelineName":"$(system.teamProject)/$(build.definitionName)",
					"taskExecutionNumber":"$(build.buildId)",
					"stageName":"$(system.jobDisplayName)",
					"attemptNumber":"$(system.jobAttempt)",
					"branchName":"$(build.sourceBranchName)"
				}],
				"pipelineName":"$(system.teamProject)/$(build.definitionName)",
				"taskExecutionNumber":"$(build.buildId)",
				"stageName":"$(system.jobDisplayName)",
				"attemptNumber":"$(system.jobAttempt)",
				"branchName":"$(build.sourceBranchName)"
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
