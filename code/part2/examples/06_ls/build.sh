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

echo "The java from the JRE has these many modules in it"
java --list-modules | wc -l

echo ""
echo "The java from the JRE has these many modules in it with modulepath"
java -p output/mlib --list-modules | wc -l

echo ""
echo "We really don't need all those modules to run out little program"

echo ""
echo "jlink allows us to create a stripped down minimum binary for our program"

export JMODS="$JAVA_HOME/jmods"

jlink -p $JMODS:output/mlib \
  --add-modules com.agiledeveloper.thesecond \
  --launcher theutilapp=com.agiledeveloper.thesecond/com.agiledeveloper.second.Second\
  --output output/utilapp

echo ""
echo "We have our precious little java"
echo ""
echo "our java has only these modules"

./output/utilapp/bin/java --list-modules | wc -l
./output/utilapp/bin/java --list-modules 

echo ""
echo "two ways to run the program"

echo ""
echo "run our precious java"

./output/utilapp/bin/java -m com.agiledeveloper.thesecond/com.agiledeveloper.second.Second

echo ""
echo "or run the application we created above"

./output/utilapp/bin/theutilapp

