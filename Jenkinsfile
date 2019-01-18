pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				echo "Running BUILD_ID: ${env.BUILD_ID} on JENKINS_URL: ${env.JENKINS_URL}"
				bat 'mvn clean package'
			}
		}
	}
}