package org.demo

class buildUtils3 implements Serializable{

    //use steps object to execute pipeline commands
    def timedGradleBuild(script, tasks){
        script.sh "echo 'Environment NAME = ${env.NAME}'"
        script.timestamps{
            script.sh "echo 'steps passed as an object'"
            script.echo age
        }
    }
}