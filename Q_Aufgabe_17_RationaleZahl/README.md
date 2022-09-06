# Praktische Aufgabe Nr. 17: Rationale Zahl

Diese Aufgabe stellt im Praktikum den Einstieg in die objektorientierte Programmierung dar. Es geht um positive rationale Zahlen, die als Bruch mit natürlichem Zähler und Nenner darstellbar sind.

Das Hauptziel dieser Aufgabe ist es, die Realisierung und Anwendung von Konstruktoren und Instanzmethoden zu üben, nicht die Feinheiten der Bruchrechnung. Falls also die letzten beiden Testfälle (s. u.) bei Ihnen nicht das gewünschte Ergebnis zeigen und sie keine Idee mehr haben, woran es liegen könnte, ist das nicht weiter schlimm.

Realisieren Sie eine Klasse RationaleZahl, deren Objekte rationale Zahlen repräsentieren und die folgende Methoden enthält:

• Einen Konstruktor RationaleZahl(long), durch den ein Objekt erzeugt wird, das die übergebene ganze Zahl repräsentiert (Auch ganze Zahlen sind rational!). Sie dürfen davon ausgehen, dass der Konstruktor nur mit aktuellem Parameter größer als 0 aufgerufen wird.

• Einen Konstruktor RationaleZahl(long, long), durch den ein Objekt erzeugt wird, das den Quotienten aus Zähler (erster Parameter) und Nenner (zweiter Parameter) repräsentiert. Sie dürfen davon ausgehen, dass der Konstruktor nur mit aktuellen Parametern größer als 0 aufgerufen wird.

• Eine Instanzmethode RationaleZahl addiere(RationaleZahl) zur Addition dieser und der übergebenen Zahl. Die Summe beider Zahlen soll als Ergebnis der Methode zurückgegeben werden. Das Objekt, das die Methode ausführt, und das übergebene Objekt sollen unverändert bleiben.

• Eine Instanzmethode String gibAlsText(), die eine textuelle Darstellung dieser rationalen Zahl liefert. Die Darstellung soll im Format (Beispiel) 13/12 oder 4 erfolgen, abhängig davon, ob die rationale Zahl ganzzahlig oder ein echter Bruch ist. Die Zahl soll in ihrer maximal gekürzten Form dargestellt werden (s. Testablauf).

Realisieren Sie außerdem eine Klasse RationaleZahlTest zum Test der Methoden der Klasse RationaleZahl. Realisieren Sie darin eine Methode main mit folgendem Testablauf. Die Schreibweise n/m meint dabei ein Objekt der Klasse RationaleZahl mit Zähler n und Nenner m.
