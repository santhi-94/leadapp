#!/usr/bin/env groovy
node('master'){
        stage('Checkoutscm'){
                cleanWs()
                checkoutSource('https://github.com/santhi-94/leadapp.git','env.BRANCH_NAME')
        }
        stage('ComplieSource'){
                complieSource('-U clean install','-Dmaven.test.skip=true')
        }
}