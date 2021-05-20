# Praktische Aufgabe Nr. 6: Farbe

Mit dieser Aufgabe sollen Sie die Implementierung, Anwendung und Dokumentation (!) statischer
Methoden üben. Sie sollen eine Klasse Farbe schreiben, die zwei statische Methoden zum Umgang
mit Farben enthält. Die Repräsentation der Farben basiert auf dem Farbmodell RGB, das z. B. bei
Smartphones, Monitoren und Fernsehgeräten Anwendung findet.

RGB ist ein additives Farbmodell, bei dem Farben durch Addition von Anteilen von selbstleuchtendem
Rot, Grün und Blau „zusammengemischt“ werden. Durch Variation der jeweiligen Anteile entstehen
unterschiedliche Farben. 100% Rot und jeweils 0% Grün und Blau ergibt z. B. ein volles
Rot, 0% von allen Farben ergibt ein tiefes Schwarz und 80% von allen Farben ergibt ein schwaches
Grau.

Bei der digitalen Verarbeitung von Farben werden die Farbanteile von 0 bis 100% häufig durch ganzzahlige
Werte von 0 bis 255 repräsentiert, sodass sich eine RGB-Farbe durch ein Tupel (r; g; b) mit
ganzzahligen Anteilswerten r, g und b für die Farben Rot, Grün und Blau darstellen lässt. Da wir
bis jetzt nur elementare Datentypen kennengelernt haben, repräsentieren wir in dieser Aufgabe
ein Tupel (r; g; b) durch eine ganze Zahl im Format rrrgggbbb, wobei rrr, ggg und bbb für die
Farbanteile zwischen 0 und 255 stehen und führende Nullen weggelassen werden.

## Beispiele:
- Zahl 1: 255000000
- steht für Tupel: (255; 0; 0)

- Zahl 1: 205030007
- steht für Tupel: (205; 30; 7)

- Zahl 1: 20080
- steht für Tupel: (0; 20; 80)

- Zahl 1: 1
- steht für Tupel: (0; 0; 1)

- Zahl 1: 0
- steht für Tupel: (0; 0; 0)

## Realisieren Sie in der Klasse Farbe folgende Methoden:
1. Methode int invertiere(int), die zu einer Farbe ihre invertierte Farbe liefert. Bei der
invertierten Farbe ist jeder einzelne Farbanteil invertiert: aus 0 wird 255, aus 1 wird 254 usw.

2. Methode int gibNaechsteFarbe(int), die zu einer Farbe die nächste Farbe liefert. Für
die Frage, was die nächste Farbe ist, benötigen wir eine Anordnung der Farben. Stellen Sie
sich dafür eine Farbe wie den Stand auf einem 3-stelligen Tageskilometerzähler vor, nur dass
nun jede Stelle von 0 bis 255 (statt nur bis 9) geht. Die nächste Farbe entspricht dann dem um
einen Kilometer höheren Stand.

## Testfälle:
Realisieren Sie außerdem eine Methode main mit folgenden Testfällen. Die Übertragung der Schreibweise
(r; g; b) in die Darstellung rrrgggbbb müssen Sie selbst leisten.

- Testfall 1: Farbe (0; 0; 0) invertieren
- Sollergebnis 1: (255; 255; 255)

- Testfall 2: Farbe (10; 128; 255) invertieren
- Sollergebnis 2: (245; 127; 0)

- Testfall 3: nächste Farbe zu (10; 11; 12) berechnen
- Sollergebnis 3: (10; 11; 13)

- Testfall 4: nächste Farbe zu (10; 128; 255) berechnen
- Sollergebnis 4: (10; 129; 0)

- Testfall 5: nächste Farbe zu (0; 255; 255) berechnen
- Sollergebnis 5: (1; 0; 0)

- Testfall 6: nächste Farbe zu (255; 255; 255) berechnen
- Sollergebnis 6: (0; 0; 0)

Jeder Testfall soll durch einen Aufruf der entsprechenden Methode mit Bildschirmausgabe des Ergebniswerts
realisiert werden, also System.out.println(invertiere(...)).
