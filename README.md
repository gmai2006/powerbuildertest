# Auto-generated JEE application from a legacy PowerBuilder application
This is a beta version of the generated JEE application from a legacy PowerBuilder application (https://sourceforge.net/projects/openpay/) using datascience9 automated legacy application transformation (https://datascience9.com/microservices).

## Components
Back-end is JEE and the front-end is React

### Clone the project
```git clone https://github.com/gmai2006/powerbuildertest.git```

## Instruction
All instructions should be run in a terminal
1. gradle buildReact
2. gradle copyReact
3. gradle -x test build
4. Copy the *.war from the build/lib/ folder to wilfly_dir/standalone/deployment folder
5. Launch the browser
6. http://localhost:8080/powerbuilderreacttest2/
7. Load the test data http://localhost:8080/powerbuilderreacttest2/rest/admin/loadata
8. View the tables and queries



 
