# PowerScript To Java - BETA version

## Instruction
All instructions should be run in a terminal

### Clone the project
```git clone https://github.com/gmai2006/powerbuildertest.git```

### Run the gradle build to download all dependencies and setup your eclipse .classpath
```gradle dependencies ```
  

#### Prerequisites
  
  If you do not have JBoss installed in your computer.  You can download from here
  
  [JBoss 21] (https://download.jboss.org/wildfly/21.0.1.Final/wildfly-21.0.1.Final.tar.gz)

  IN the terminal, cd back to the project directory
  
  run the following gradle command
  
  ``` gradle build```
  
  cd to build/libs directory and copy the powerbuildertest.ear to <your JBos dir>/standalone/deployments/
  
  Start your JBoss 
  
  cd to <your Jboss dir>/bin and run ./standalone.sh
  
  [Enter this URL into your browser address] (http://localhost:8080/powerbuildertest/)


