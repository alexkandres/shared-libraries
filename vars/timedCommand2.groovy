// vars/timedCommand2

def call (String cmd, String logFilePath){
    timestamps{
        cmdOut = sh (script: "${cmd}", returnStdout:true).trim()
    }

    echo cmdOut

}