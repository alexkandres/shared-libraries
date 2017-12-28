package org.demo

class buildUtils2 implements Serializable{
    def steps

    buildUtils2(){
    }

    def timedGradleBuild(tasks){

//        timestamps{
        script{
            sh "echo 'steps passed as an object'"
        }
//        }
    }
}