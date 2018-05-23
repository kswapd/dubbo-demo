
# dubbo-demo
-------------------

## Introduction
 `dubbo` demo project 

## Software architecture

### 1. zookeeper
  Use `zookeeper` as a service discovery server. 



## Install

### 1. zookeeper service for dubbo
  We use docker-compose files  to install zookeeper in docker environment, [Download docker-compose file here](https://gitee.com/kswapd/docker-devops.git),run:
  ```
    docker-compose up -d
  ```

### 2. Run dubbo provider and consumer


  * 2.1 Modify configuration file `commons.properties` in commons project.
  ```
  zookeeper.address=your-zookeper-server-ip
  zookeeper.port=your-zookeeper-server-port
  host.address=your-dubbo-service-ip
  provider.port=20980
  ```
  
  * 2.2 Run dubbo-provider module, this module also use dubbo-provider-bar as provider:

```
         cd dubbo-provider/target
         java -jar dubbo-provider-1.0-SNAPSHOT.jar
```

  * 2.3 Run dubbo-consumer module:

```
        cd dubbo-consumer/target
        java -jar dubbo-consumer-1.0-SNAPSHOT.jar
```
   After steps above, you will see `hello from dubbo provider hello` from console.


## Development Instructions
**MUST** follow the instructions of **NOTE** section.
* Please install `JDK 1.8` before build the project.
* **MUST NOT** add any domain logics to this project.
* **MUST NOT** push any jar files, use maven dependency instead.
* **MUST NOT** push any unnecessary binary files.
* **MUST** push source code with meaningful message `git commit -m "meaningful message"`.
* **MUST** import `codequality/codestyle-formatter.xml`, and **format source code** (CTRL+SHIFT+F) and **organize imports** (CTRL+SHIFT+O) before commit.
* **MUST** use standard `JavaDoc Tags` on all java source code.
* **SHOULD** use `English` in JavaDoc, comments and any source code related resources **as possible**.
* **SHOULD** follow [Java Coding Conventions](http://www.oracle.com/technetwork/java/codeconventions-150003.pdf) and [Java Style Guide](https://google.github.io/styleguide/javaguide.html) if you haven't to improve code quality.


## Contributor

### 1. Fork by kongxw@dcits.com
### 2. Pull Request



## Problems
 1. If meet dependency problem, run `mvn clean install`


## Other resource
