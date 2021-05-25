/bin/rm -rf output

mkdir -p output/mlib

mkdir -p output/classes
javac -d output/classes `find first -name *.java`
jar -c -f output/mlib/first.jar -C output/classes .
/bin/rm -rf output/classes

mkdir -p output/classes
javac -d output/classes -p output/mlib `find second -name *.java`
jar -c -f output/mlib/second.jar -C output/classes .
/bin/rm -rf output/classes

echo "running in the classpath"
java -classpath output/mlib/first.jar:output/mlib/second.jar \
  com.agiledeveloper.second.Second

echo "running in the modulepath"
java -p output/mlib \
  -m com.agiledeveloper.thesecond/com.agiledeveloper.second.Second


echo "old code running in the classpath - unnamed module"
echo "old code running in the modulepath - automatic module"
echo "modularized code running in the classpath - unnamed module"
echo "modularized code running in the modulepath - explicitly named module"

echo "let us examine the jar files"
jar -d -f output/mlib/first.jar
jar -d -f output/mlib/second.jar
