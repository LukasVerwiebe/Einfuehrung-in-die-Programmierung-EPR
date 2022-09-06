# Praktische Aufgabe Nr. 15: Ziffern Sortieren

Realisieren Sie eine Klasse ZiffernSortieren mit einer statischen Methode public static long sortiere(long), die die Ziffern der übergebenen Zahl nach dem Verfahren Sortieren durch Mischen sortiert.

Sie benötigen dafür zusätzliche Methoden, u. a. eine Methode long mische(long, long). Diese Methode mischt bzw. verschmelzt zwei ziffernweise sortierte Zahlen zu einer sortierten Zahl.

Sortieren durch Mischen arbeitet für Zahlen mit mindestens zwei Ziffern rekursiv nach folgendem Verfahren:
1. Die Ziffernfolge wird in zwei gleich lange Ziffernfolgen aufgeteilt, wobei die Reihenfolge der Ziffern nicht erhalten bleiben muss.
2. Die beiden Ziffernfolgen werden mit dem gleichen Verfahren sortiert (hier ist die Rekursion).
3. Die Ziffernfolgen, die aus dem Sortieren resultierenden, werden zu einer sortierten Folge verschmolzen.

Hinweis: Sie müssen die Nullen nicht vorab ausfiltern. Entwickeln Sie die Methoden einfach unter der Annahme, dass die Ziffer 0 nicht vorkommt. Sie werden anschließend sehen, dass die Nullen von alleine verschwinden.

Sortieren durch Mischen ist ein sehr effizientes Sortierverfahren. In der Praxis sortiert man i. A. jedoch nicht die Ziffern einer Zahl, sondern z.B. Wörter oder andere Daten. Da wir bisher noch keine anderen Daten als Zahlen kennengelernt haben, wenden wir es hier auf die Ziffern einer Zahl an. Vom Prinzip her ist das kein Unterschied.

Beispiele für die Funktionsweise von sortiere:
![image](https://user-images.githubusercontent.com/63674539/188528514-f27dc36f-d5b8-4f79-ac8d-f8b5fde6c9ef.png)

Beispiele für die Funktionsweise von mischen:
![image](https://user-images.githubusercontent.com/63674539/188528543-000b4ad5-43e8-4303-93aa-29d2906c32bc.png)
