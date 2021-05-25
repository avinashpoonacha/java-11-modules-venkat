/bin/rm -rf output

mkdir -p output/mlib

mkdir -p output/classes
javac -d output/classes `find first -name *.java`
jar -c -f output/mlib/first.jar -C output/classes .
/bin/rm -rf output/classes

mkdir -p output/classes
javac -d output/classes -classpath output/mlib/first.jar \
  `find second -name *.java`
jar -c -f output/mlib/second.jar -C output/classes .
/bin/rm -rf output/classes

echo "compiled like old code, run like modern code"
echo "Running code in the modulespath"
echo "specify the name of the module and the class within the module to run"
java -p output/mlib -m second/com.agiledeveloper.second.Second
