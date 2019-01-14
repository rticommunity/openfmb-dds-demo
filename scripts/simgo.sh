#! /bin/sh

if ! type "google-chrome" > /dev/null; then
  echo Google chrome is missing. Please install Chrome
  exit 1
fi

for terminal in xterm gnome-terminal lxterminal
do
  type ${terminal} >/dev/null 2>&1
  if test $? -eq 0 ; then
    TERM=${terminal}
    break
  fi
done

# Did we find one we know how to use? If not, error.
case ${TERM} in
  xterm) ;;
  gnome-terminal) ;;
  lxterminal) ;;
  *)
    echo "Terminal; ${TERM} is unknown! Program error!"
    exit 1
esac

### Make sure all component programs are available
PROGRAMS="../openfmb-dds-hmi/hmi/target/openfmb-hmi-0.0.5-SNAPSHOT-jar-with-dependencies.jar ../openfmb-dds-simulators/simulator/target/openfmb-simulators-0.0.5-SNAPSHOT-jar-with-dependencies.jar ../openfmb-dds-loadpublisher/target/loadpublisher-0.0.1-SNAPSHOT-jar-with-dependencies.jar"

for exe in ${PROGRAMS}
do
  if [ ! -r ${exe} ] ; then
    echo "${exe} is not present. Did you build the application?"
    exit 1
  fi

done


${TERM} -e "./hmi.sh" &
${TERM} -e "./reclosersim.sh" &
${TERM} -e "./batterysim.sh" &
${TERM} -e "./solarsim.sh" &
${TERM} -e "./islandbalancer.sh" &
${TERM} -e "./loadsim.sh" &
google-chrome http:/localhost:8080 &

### When the user is done let them kill the programs
echo -n "Press return to kill programs> "
read ignored

for exe in ${PROGRAMS}
do
  pkill -9 ${TERM}
done
pkill -9 -f http:/localhost:8080

 
