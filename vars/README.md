# VARS/

- Area for hosting scripts that define variables that you
want to access in the pipeline

- Basename should be a valid Groovy identifier

Pipeline = http://jenkinsdv.gartner.com/job

## timedCommand

- JobURL http://localhost:8080/job/sharedLibraryVars1/configure

- Can define set
of methods in a
file

- "cmd" and
"cmdOut" here
are not
fields. These
are objects
created on
demand
```
script{
    timedCommand.cmd = 'ls -la'
    echo timedCommand.cmd
    timedCommand.runCommand()
    echo timedCommand.getOutput()
}
```
## timedCommand2
```
Give the example
```
## timedCommand3
```
Give the example
```
## timedCommand4
```
Give the example
```

## Authors
* **Alex Andres**  - [Alex.Andres@gartner.com](alex.andres@gartner.com)
