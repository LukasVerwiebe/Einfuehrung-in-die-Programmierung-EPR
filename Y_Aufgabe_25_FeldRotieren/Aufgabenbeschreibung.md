# Praktische Aufgabe Nr. 25: FeldRotieren

Realisieren Sie eine Klasse FeldRotieren mit einer statischen Methode public static void rotiere(int[], int schrittweite), die die Komponenten eines Felds um eine bestimmte Schrittweite verschiebt. Werte, die durch die Verschiebung „rechts aus dem Feld herausrutschen“, kommen „links in das Feld“ wieder hinein.

Beispiel: Enthält das übergebene Feld vor Aufruf der Methode die Werte (7; 4; 2; 5; 10;􀀀3; 19) und ist die Schrittweite 3, dann soll das Feld nach Aufruf die Werte (10;-3; 19; 7; 4; 2; 5) enthalten.

Die Methode soll sich auch für den Fall, dass die Verschiebeschrittweite größer oder gleich der Länge des Felds ist, sinnvoll verhalten. Eine Verschiebung um n Schritte soll den gleichen Effekt haben, als wenn man n mal eine Verschiebung um einen Schritt durchführen würde.
