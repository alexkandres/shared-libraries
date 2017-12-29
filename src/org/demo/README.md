# SRC/
- Intended to be setup with groovy files in the standard Java
directory structure (i.e. src/org/foo/bar.groovy).

- Added to the classpath when pipelines are executed.

- Any Groovy code valid to use here

## buildUtils
Job http://localhost:8080/job/sharedLibrarySrc1/configure
```
@Library('shared-libraries@master') _
...
script{
    def myUtils = new org.demo.buildUtils()
    myUtils.timedGradleBuild("clean build")
}
```

## buildUtils2
Job http://localhost:8080/job/sharedLibrarySrc2/configure
```
@Library('shared-libraries@master') 
import org.demo.*
//takes environment variable and steps as objects
def bldtools = new buildUtils2(env,steps)
...
script{
    bldtools.timedGradleBuild("clean build")
}
```

## buildUtils3
Job http://localhost:8080/job/sharedLibrarySrc3/configure
```
@Library('shared-libraries@master') 
import org.demo.buildUtils3
...
script{
    buildUtils3.timedGradleBuild(this,"clean build")
}
```

## Authors
* **Alex Andres**  - [Alex.Andres@gartner.com](alex.andres@gartner.com)
