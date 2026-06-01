# Berechnung des Wähleranteils der FDP bei den Grossratswahlen 2022 im Kanton Graubünden

## Einführung

Es wurde aus den ganzen Zahlen im Wahlprotokoll der Grossratswahlen 2022 im Kanton Graubünden

https://www.gr.ch/DE/publikationen/abstimmungenwahlen/Grossratswahlen-2022/ResultateGrossratswahlen/20220515_Wahlprotokoll_Kantonsamtsblatt_Proporzwahl_kantonal.pdf

der Wähleranteil der FDP in Prozent mit Hilfe von Ganzzahlarithmetik berechnet:

$$ p = {3508315900 \over 159276431} \\% \approx 22.026585339547193 \\% $$

Der relative prozentuale Fehler der oben angegebenen Dezimalzahl wurde ebenfalls berechnet:

$$ e = {-57108183 \over 35083159000000000000000} \\% \approx -1.6277947775455454E-15 \\% $$

<br>

## Java-Quelltext
  
| Beschreibung           | Link                                                                                                               |
|:---------------------- |:------------------------------------------------------------------------------------------------------------------ |
| Hauptprogramm          | https://github.com/biererd/waehleranteile/blob/main/src/main/java/ch/zh/waehleranteile/main/Main.java              |
| Anzahl Wähler SP/Grüne | https://github.com/biererd/waehleranteile/blob/main/src/main/java/ch/zh/waehleranteile/main/Waehler01SPGruene.java |
| Anzahl Wähler FDP      | https://github.com/biererd/waehleranteile/blob/main/src/main/java/ch/zh/waehleranteile/main/Waehler02FDP.java      |
| Anzahl Wähler SVP      | https://github.com/biererd/waehleranteile/blob/main/src/main/java/ch/zh/waehleranteile/main/Waehler03SVP.java      |
| Anzahl Wähler GLP      | https://github.com/biererd/waehleranteile/blob/main/src/main/java/ch/zh/waehleranteile/main/Waehler04GLP.java      |
| Anzahl Wähler MitteGR  | https://github.com/biererd/waehleranteile/blob/main/src/main/java/ch/zh/waehleranteile/main/Waehler05MitteGR.java  |
  
<br>

## Python-Quelltext

| Beschreibung           | Link                                                                                                               |
|:---------------------- |:------------------------------------------------------------------------------------------------------------------ |
| Hauptprogramm          | https://github.com/biererd/waehleranteile/blob/main/python/kantonGR.py                                             |
| Anzahl Wähler SP/Grüne | https://github.com/biererd/waehleranteile/blob/main/python/waehler01SPGruene.py                                    |
| Anzahl Wähler FDP      | https://github.com/biererd/waehleranteile/blob/main/python/waehler02FDP.py                                         |
| Anzahl Wähler SVP      | https://github.com/biererd/waehleranteile/blob/main/python/waehler03SVP.py                                         |
| Anzahl Wähler GLP      | https://github.com/biererd/waehleranteile/blob/main/python/waehler04GLP.py                                         |
| Anzahl Wähler MitteGR  | https://github.com/biererd/waehleranteile/blob/main/python/waehler05MitteGR.py                                     |

