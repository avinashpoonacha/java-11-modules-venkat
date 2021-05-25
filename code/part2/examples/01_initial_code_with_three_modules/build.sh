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

mkdir -p output/classes
javac -d output/classes -p output/mlib `find third -name *.java`
jar -c -f output/mlib/third.jar -C output/classes .
/bin/rm -rf output/classes


java -p output/mlib \
  -m com.agiledeveloper.thethird/com.agiledeveloper.third.Third

