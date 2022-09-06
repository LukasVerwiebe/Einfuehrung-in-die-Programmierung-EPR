# Praktische Aufgabe Nr. 11: Wurzelberechnung

Realisieren Sie eine Klasse Wurzelberechnung mit einer statischen Methode public static double wurzel(double x, double epsilon) zur näherungsweisen Berechnung der Quadratwurzel einer Zahl 𝑥 ≥ 0. Die Methode soll das erste Folgenglied liefern, dessen Differenz zum vorhergehenden Folgenglied betragsmäßig kleiner als epsilon ist. Der zweite Parameter gibt somit die Genauigkeit der Berechnung an.

Die Folge 𝑟 ∶ ℕ0 → ℝ konvergiert für 𝑥 ≥ 0 gegen √𝑥. Sie kann als Grundlage für einen Algorithmus verwendet werden, um Quadratwurzeln näherungsweise zu berechnen. 𝑟 ist wie folgt definiert:

![image](https://user-images.githubusercontent.com/63674539/188524728-4a01e0be-db67-45df-a5ca-65452d655408.png)
