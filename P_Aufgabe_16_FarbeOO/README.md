# Praktische Aufgabe Nr. 16: Farbe objekt-orientiert

In dieser Aufgabe realisieren Sie eine objekt-orientierte „Version“ der Klasse Farbe aus der früheren Aufgabe Farbe.

Realisieren Sie dazu eine Klasse Farbe, deren Objekte RGB-Farben repräsentieren und die folgende Methoden enthält:

• Einen Konstruktor Farbe(int, int, int), durch den eine RGB-Farbe erzeugt wird. Der erste Parameter gibt den Rot-Anteil an, der zweite den Grün-Anteil und der dritte den Blau-Anteil. Sie dürfen davon ausgehen, dass der Konstruktor nur mit aktuellen Parametern zwischen 0 und 255 aufgerufen wird.

• Eine Instanzmethode Farbe gibInvertierteFarbe(). Wendet man diese Methode auf eine Farbe an, soll sie die zu dieser Farbe invertierte Farbe liefern. Das Objekt, das die Methode ausführt, soll unverändert bleiben.

• Eine Instanzmethode Farbe gibNaechsteFarbe(). Wendet man diese Methode auf eine Farbe an, soll sie die zu dieser Farbe nächste Farbe liefern. (Zur Frage, was die nächste Farbe ist, schauen Sie bitte in die frühere Aufgabe Farbe.) Das Objekt, das die Methode ausführt, soll unverändert bleiben.

• Eine Instanzmethode String gibAlsText(). Wendet man diese Methode auf eine Farbe an, soll einen Text im Format (r, g, b) erzeugen, also z. B. (10, 254, 5) für eine Farbe, die durch new Farbe(10, 254,5) erzeugt wird.

Überlegen Sie sich zu Beginn, was sinnvolle Instanzvariablen der Klasse Farbe sind, wie also der Bauplan eines Farb-Objekts aussehen soll.
