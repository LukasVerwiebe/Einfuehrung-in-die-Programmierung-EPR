# Praktische Aufgabe Nr. 2: Reiskörner

In diesem Aufgabenblatt geht es darum, Berechnungen unter Verwendung von Variablen durchzuführen.
Alle Anweisungen sollen sich in der main-Methode der Klasse Reiskoerner befinden.
Verwenden Sie nur Variablen und Ausdrücke des Typs int.

## Einführung:

Vielleicht kennen Sie die Parabel vom Schachspiel und den Reiskörnern. Ein kluger Mann schenkte
seinem König ein kostbares Schachspiel. Zum Dank gewährte ihm der König einen Wunsch. Der
Mann sagte, er wolle nur ein paar Reiskörner: ein Korn auf das erste Feld, zwei auf das zweite,
immer die doppelte Anzahl auf jedes weitere. Der König hielt den Wunsch für bescheiden, doch er
täuschte sich. Um den Wunsch zu erfüllen, würde die weltweite Reisernte eines Jahres bei Weitem
nicht ausreichen.

## Aufgabe:

Für diese Aufgabe wandeln wir die Geschichte nun etwas ab:

• Auf dem ersten Feld darf mehr als nur ein Reiskorn liegen.

• Die Anzahl Reiskörner wird von Feld zu Feld nicht verdoppelt, sondern prozentual erhöht. Es
  gibt nur ganze Reiskörner, weshalb z. B. die 50%ige Erhöhung von 3 Reiskörnern zu 4 Körnern
  führt.

Realisieren Sie in der main-Methode einen Berechnungsablauf, um die Anzahl der Reiskörner zu berechnen,
die jeweils auf den ersten acht Feldern des Schachbretts liegen. Außerdem soll die Anzahl
der Reiskörner auf den acht Feldern insgesamt berechnet werden. Alle berechneten Werte sollen
auf dem Bildschirm ausgegeben werden, immer ein Wert pro Zeile der Ausgabe.

Beginnen Sie die Realisierung mit zwei Anweisungen, in denen Variablen für die Anzahl der Reiskörner
auf dem ersten Feld und für die prozentuale Erhöhung deklariert und mit Anfangswerten belegt
werden. Durch Veränderung der Werte dieser Variablen ist es dann einfach möglich, die Berechnung
für verschiedene Situationen durchzuführen.

## Beispiele für verschiedene Situationen:

### Beispiel 1:
Reiskörner auf erstem Feld 1: 1

Prozentuale Erhöhung 1: 100

Ausgabe 1: 1 | 2 | 4 | 8 | 16 | 32 | 64 | 128

Summe 1: 255

### Beispiel 2:
Reiskörner auf erstem Feld 2: 3

Prozentuale Erhöhung 2: 50

Ausgabe 2: 3 | 4 | 6 | 9 | 13 | 19 | 28 | 42

Summe 2: 124

### Beispiel 3:
Reiskörner auf erstem Feld 3: 10

Prozentuale Erhöhung 3: 0

Ausgabe 3: 10 | 10 | 10 | 10 | 10 | 10 | 10 | 10

Summe 3: 80
