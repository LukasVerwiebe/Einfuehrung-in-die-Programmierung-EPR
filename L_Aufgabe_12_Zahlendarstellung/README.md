# Praktische Aufgabe Nr. 12: Zahlendarstellung

In dieser Aufgabe geht es um die Addition zweier natürlicher Zahlen (einschließlich 0), die in einem Stellenwertsystem zu einer Basis zwischen 2 und 10 dargestellt sind. Die Summe soll in der gleichen Darstellung zurückgegeben werden.

Realisieren Sie eine Klasse Zahldarstellung mit einer Methode long addiere(long, long, int) zur Addition zweier Zahlen. Die ersten beiden Parameter dienen der Übergabe der Zahlen, die addiert werden sollen, der dritte Parameter gibt an, zu welcher Basis die Zahlen dargestellt sind.

Beispiel: Durch den Ausdruck addiere(1001, 11, 2) sollen die Zahlen 9 und 3 (= Interpretation des ersten bzw. zweiten Parameters im 2er-System) addiert werden. Die Summe 12 soll in der 2er-Darstellung 1100 zurückgegeben werden.

Die Methode soll -1 zurückgeben, wenn die Darstellung von mindestens einem der beiden Summanden eine ungültige Ziffer enthält. Die gültige Darstellung einer Zahl zur Basis b enthält nur Ziffern aus {0; 1; : : : ; b - 1}.

Beispiele für das Verhalten der Methode addiere:

![image](https://user-images.githubusercontent.com/63674539/188525152-ecb4a94e-e058-43e8-99be-1c9ad8dcdbf9.png)
