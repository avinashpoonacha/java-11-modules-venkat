/bin/rm -rf output

mkdir -p output/mlib

mkdir -p output/classes
javac -d output/classes `find first -name *.java`
jar -c -f output/mlib/first.jar --module-version 1.2.3 -C output/classes .
/bin/rm -rf output/classes

echo "version is a nice glorified timestamp, not used for anything"
jar -d -f output/mlib/first.jar

mkdir -p output/classes
javac -d output/classes -p output/mlib `find second -name *.java`
jar -c -f output/mlib/second.jar -C output/classes .
/bin/rm -rf output/classes

java -p output/mlib \
  -m com.agiledeveloper.thesecond/com.agiledeveloper.second.Second

