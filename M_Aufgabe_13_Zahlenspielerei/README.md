# Praktische Aufgabe Nr. 13: Zahlenspielerei

Mit dieser Aufgabe sollen Sie die Konzeption und Implementierung rekursiv definierter Methoden üben. Realisieren Sie eine Klasse Zahlenspielerei mit folgenden statischen Methoden:

Methode long verkette(long, long), die zwei Zahlen miteinander verkettet.

Methode boolean enthaelt(long, int), die für eine Zahl (1. Parameter) und eine Ziffer (2. Parameter) genau dann true liefert, wenn die Ziffer in der Dezimaldarstellung der Zahl vorkommt. Sie dürfen davon ausgehen, dass bei Anwendung der Methode beide Parameter größer oder gleich 0 sind und der zweite Parameter stets kleiner oder gleich 9 ist.

Methode int gibAnzahl(long, int), die angibt, wie häufig eine Ziffer (2. Parameter) in der Dezimaldarstellung einer Zahl (1. Parameter) vorkommt. Sie dürfen von den gleichen Annahmen wie bei der vorherigen Methode ausgehen.

Methode long filter(long, int), die für eine Zahl (1. Parameter) und eine Ziffer (2. Parameter) diejenige Zahl als Ergebnis liefert, bei der aus der übergebenen Zahl jedes Vorkommen der übergebenen Ziffer herausgestrichen ist. Sie dürfen von den gleichen Annahmen wie bei der vorherigen Methode ausgehen. Besteht die übergebene Zahl nur aus der übergebenen Ziffer (wie im 2. Beispiel), soll die Methode 0 liefern.
