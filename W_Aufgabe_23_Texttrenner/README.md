# Praktische Aufgabe Nr. 23: Texttrenner

In vielen Anwendungen benötigt man die Funktion, einen Text anhand bestimmter Trennzeichen in Textteile zu trennen. Im Druckdialog eines Programms kann es z. B. ein Textfeld geben, in dem durch Komma getrennt die Nummern der zu druckenden Seiten eingegeben werden. Dieser Text muss dann an den Kommas getrennt werden, um die einzelnen Seitenzahlen zu erhalten.

In dieser Aufgabe sollen Sie eine Klasse Texttrenner realisieren, die eine solche Funktion anbietet und eine Zeichenkette anhand von Trennzeichen in einzelne Textteile (im Folgenden Wörter genannt) auftrennt.

Implementieren Sie in der Klasse Texttrenner also folgende Methoden:

• Einen Konstruktor Texttrenner(String, String) zur Erzeugung eines Texttrenner-Objekts, mit dessen Hilfe eine Zeichenkette (1. Parameter) anhand von Trennzeichen (2. Parameter) in Wörter getrennt werden kann. Jedes einzelne Zeichen des 2. Parameters ist ein Trennzeichen.

• Eine Instanzmethode boolean hatNochWoerter(). Die Methode liefert genau dann true, wenn der Texttrenner nach den bisher gelieferten Wörtern noch mindestens ein weiteres Wort enthält.

• Eine Instanzmethode String gibNaechstesWort(). Die Methode liefert das nächste Wort aus der zugrunde liegenden Zeichenkette. Falls die Zeichenkette kein Wort mehr enthält, liefert die Methode null.

Realisieren Sie außerdem eine Klasse TexttrennerTest zum Test der Methoden der Klasse Texttrenner. Realisieren Sie darin folgenden Testablauf.
