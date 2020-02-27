@echo off
color f1
goto start

:start2
echo Bitte stelle sicher das du den Dateinamen der .jar datei nicht verändert hast
set /p ramm=Geben sie die Gewünschten RamSpeicherPlatz ein z.b 1G, 2G:
java -Xms%ramm% -Xmx%ramm% -jar nukkit-1.0-SNAPSHOT.jar

:start
echo ------------------------------------
echo -                                   -
echo -     PlayerHelper                  -
echo -                                   -
echo -       startet für sie             -
echo -                                   -
echo -              Nukkit               -
echo -                                   -
echo ---------------------------v1.0------
goto start2



