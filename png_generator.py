from subprocess import check_call
check_call(['dot','-Tpng','schema.dot','-o','schema.png'])
