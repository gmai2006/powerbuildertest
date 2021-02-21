# [FHIR](www.FHIR.org) - BETA version


## Instruction
All instructions should be run in a terminal

### Clone the project
```git clone https://github.com/gmai2006/fhir.git```

### Run the gradle build to download all dependencies and setup your eclipse .classpath
```gradle dependencies eclipse```

### Create a FHIR database
  Go to src/main/databases directory and start your mysql client.
  
  Then run the database creation script
```source ./database-creation.sql```

- load FHIR test data into the newly created database.

  Exit the mysql client.  
  
  Open a terminal and cd to src/main/database then run the following command
```mysql -u <sqluserid> -p --database fhir  < ./fhir-<timestamp>.sql```

### Test the RESTful services

#### Prerequisites
  
  If you do not have apache tomcat 9.0.8 installed in your computer.  You can download from here
  
  [tomcat 9.0.8] (http://www-us.apache.org/dist/tomcat/tomcat-9/v9.0.8/bin/apache-tomcat-9.0.8.tar.gz)

  IN the terminal, cd back to the project directory
  
  run the following gradle command
  
  ``` gradle war```
  
  cd to build/libs directory and copy the FHIR.war to <your tomcat 9.0.8 dir>/webapps
  
  Start your tomcat 
  
  cd to <your tomcat dir>/bin and run ./startup.sh
  
  [Enter this URL into your browser address] (http://localhost:8080/FHIR/rest/Account?status=active)
  
  You should see data returned in JSON format


## Update:
- Added REST layer validator


An implementation of the Fast Healthcare Interoperability Resources (FHIR) version 3.0.1.

This implentation is 100% auto generated

For more information about the FHIR please visit [https://www.hl7.org/fhir/overview.html](https://www.hl7.org/fhir/overview.html)

This implementation includes a relational database, Dao, service and RESTful layers

It has 2321 unit tests, 2321 integration tests. All passed.

Please do not modify the code directly.  if new features and changes are needed please update the templates instead.
Will provide an interface for updating the templates

if have questions please email: gmai2006@gmail.com

## LOC of generated code
<pre>
-----------------------------------------------------------------------------------
Language                         files          blank        comment           code
-----------------------------------------------------------------------------------
Java                              2004          50790          97986         327274
JSON                              1525              0              0         314856
SQL                                  4            434           1725          19054
XML                                  6              8              6            910
Groovy                               1             24              5             57
Markdown                             1              8              0             27
Python                               1              2              0             21
Visualforce Component                1              0              0             11
-----------------------------------------------------------------------------------
SUM:                              3543          51266          99722         662210
-----------------------------------------------------------------------------------
</pre>

