# Praktische Aufgabe Nr. 3: Stromrechnung

In dieser Aufgabe gehen wir von folgendem Anwendungshintergrund aus. Die Stromrechnung eines
Privathaushalts setzt sich aus einem verbrauchsabhängigen Anteil und einem Grundpreis zusammen.

Der Energieversorger bietet zwei Tarife an:

#### Tarif 1:
Grundpreis in EUR pro Monat:
5.75
Verbrauchspreis in Cent pro kWh:
23.49
#### Tarif 2:
Grundpreis in EUR pro Monat:
9.85
Verbrauchspreis in Cent pro kWh:
22.10

## Beschreibung:
Tarif 1 hat einen geringeren Grundpreis als Tarif 2, dafür jedoch einen höheren Verbrauchspreis. Bei
geringem Verbrauch ist also Tarif 1 günstiger, bei höherem Verbrauch Tarif 2. Der Energieversorger
legt für die Jahresrechnung stets den Tarif zugrunde, der zum kleineren Rechnungsbetrag führt.

Sie sollen nun eine Klasse Stromrechnung realisieren, in deren main-Methode der Rechnungsbetrag
für einen bestimmten Jahresverbrauch (in kWh) berechnet und durch System.out.println(...)
ausgegeben wird. Der Rechnungsbetrag soll in EUR und auf 2 Nachkommastellen gerundet berechnet
werden. (Der auszugebende Wert soll tatsächlich berechnet und nicht „textuell zusammengesetzt“
werden.)

## Rundung von Nachkommastellen:
Die Rundung auf zwei Stellen lässt sich durch einfache arithmetische Operationen und das Abschneiden
von Nachkommastellen berechnen.

## Anforderungen:
Berechnen Sie für die Lösung, die Sie per Moodle hochladen, den Rechnungsbetrag für einen Jahresverbrauch
von 3536 kWh. Das erwartete Ergebnis ist ein Betrag von EUR 899,61. Auf dem Bildschirm
soll nur die Zahl 899,61 ausgegeben werden.

Die Realisierung dieser Aufgabe soll mit der Deklaration von fünf Variablen für:

• den Jahresverbrauch in kWh,

• die Grundpreise in Euro und

• die Verbrauchspreise in Cent

und der Zuweisung der obigen Werte an diese Variablen beginnen. Sie dürfen weitere Variablen
nach Belieben verwenden. Deklarieren Sie für die Grund- und Verbrauchspreise Variablen der Typen
float oder double, denn diese Aufgabe dient dazu, die Anwendung der Gleitkommatypen zu üben.
Darstellungs- und Rechenungenauigkeiten, wie ich sie in den Code-Beispielen der Vorlesung gezeigt
habe, sind bei den Zahlen dieser Aufgabe nicht zu erwarten.
