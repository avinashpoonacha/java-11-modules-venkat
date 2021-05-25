/bin/rm -rf output

mkdir -p output/mlib

mkdir -p output/classes
javac -d output/classes `find softdrink -name *.java`
jar -c -f output/mlib/softdrink.jar -C output/classes .
/bin/rm -rf output/classes

mkdir -p output/classes
javac -d output/classes -p output/mlib `find client -name *.java`
jar -c -f output/mlib/client.jar -C output/classes .
/bin/rm -rf output/classes

echo "run without any providers"
java -p output/mlib -m client/com.agiledeveloper.client.Client

echo "let us compile the cococola providers"
mkdir -p output/classes
javac -d output/classes -p output/mlib `find cococola -name *.java`
jar -c -f output/mlib/cococola.jar -C output/classes .
/bin/rm -rf output/classes

echo "run without one provider"
java -p output/mlib -m client/com.agiledeveloper.client.Client

echo "let us compile the pepsico providers"
mkdir -p output/classes
javac -d output/classes -p output/mlib `find pepsico -name *.java`
jar -c -f output/mlib/pepsico.jar -C output/classes .
/bin/rm -rf output/classes

echo "run without two provider"
java -p output/mlib -m client/com.agiledeveloper.client.Client

