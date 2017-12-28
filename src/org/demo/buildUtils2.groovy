package org.demo

class buildUtils2 implements Serializable{
    def steps

    buildUtils2(steps){
        this.steps = steps
    }

    def timedGradleBuild(tasks){

        steps.timestamps{
            steps.sh "echo 'steps passed as an object'"
        }
    }
}