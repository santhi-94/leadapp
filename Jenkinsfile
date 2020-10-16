@Library('cicd-library@develop') _

//def pipeline = getPipeline()
//evaluate readTrusted(pipeline)
node('master'){
        stage('Checkoutscm'){
                cleanWs()
                checkoutSource('https://github.com/santhi-94/leadapp.git','env.BRANCH_NAME')
        }
        stage('ComplieSource'){
                complieSource('-U clean install','-Dmaven.test.skip=true')
        }
}

