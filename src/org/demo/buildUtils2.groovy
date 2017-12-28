package org.demo

class buildUtils2 implements Serializable{
    def env
    def steps
    def age = "23"

    buildUtils2(steps){
        this.steps = steps
    }

    buildUtils2(env,steps){
        this.steps = steps
        this.env = env
    }

    def timedGradleBuild(tasks){
        steps.tool 'gradle3.2'
        steps.sh "echo 'Environment NAME = ${env.NAME}'"
        steps.timestamps{
            steps.sh "echo 'steps passed as an object'"
            steps.echo age
        }
    }
}