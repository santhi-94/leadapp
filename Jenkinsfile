@Library('cicd-library@develop') _

node('master'){
        stage('Checkoutscm'){
              cleanWs()
              checkoutSource('https://github.com/santhi-94/leadapp.git','env.BRANCH_NAME')
        }
        stage('ComplieSource'){
          //  dir('${WORKSPACE}'){
            def mvnHome = tool 'Maven'
               bat "\"${mvnHome}\"\\bin\\mvn -B install"
               bat "\"${mvnHome}\"\\bin\\mvn  --version"   
           // }
        }
}
