package org.demo

class buildUtils2 implements Serializable{
    def env
    def steps
    def age = "23"

    //constructor
    buildUtils2(steps){
        this.steps = steps
    }

    buildUtils2(env,steps){
        this.steps = steps
        this.env = env
    }

    //use steps object to execute pipeline commands
    def timedGradleBuild(tasks){
        steps.sh "echo 'Environment NAME = ${env.NAME}'"
        steps.timestamps{
            steps.sh "echo 'steps passed as an object'"
            steps.echo age
        }
    }
}