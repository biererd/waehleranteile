# Berechnung der Wähleranteile
# bei den Grossratswahlen 2022 im Kanton GR
# basierend auf Ganzzahl-Arithmetik

from fractions import Fraction

import waehler01SPGruene
import waehler02FDP
import waehler03SVP
import waehler04GLP
import waehler05MitteGR

waehlerzahl01SPGruene = waehler01SPGruene.getwaehler()
waehlerzahl02FDP      = waehler02FDP.getwaehler();
waehlerzahl03SVP      = waehler03SVP.getwaehler();
waehlerzahl04GLP      = waehler04GLP.getwaehler();
waehlerzahl05MitteGR  = waehler05MitteGR.getwaehler();

waehlersumme = (
  waehlerzahl01SPGruene+
  waehlerzahl02FDP+
  waehlerzahl03SVP+
  waehlerzahl04GLP+
  waehlerzahl05MitteGR
  )

waehleranteil01SPGruene = waehlerzahl01SPGruene/waehlersumme*Fraction(100,1);
waehleranteil02FDP      = waehlerzahl02FDP/waehlersumme*Fraction(100,1);
waehleranteil03SVP      = waehlerzahl03SVP/waehlersumme*Fraction(100,1);
waehleranteil04GLP      = waehlerzahl04GLP/waehlersumme*Fraction(100,1);
waehleranteil05MitteGR  = waehlerzahl05MitteGR/waehlersumme*Fraction(100,1);

print('Anzahl Wähler:')
print('SP-Grüne: ',waehlerzahl01SPGruene,'=',float(waehlerzahl01SPGruene))
print('FDP:      ',waehlerzahl02FDP,'=',float(waehlerzahl02FDP))
print('SVP:      ',waehlerzahl03SVP,'=',float(waehlerzahl03SVP))
print('GLP:      ',waehlerzahl04GLP,'=',float(waehlerzahl04GLP))
print('MitteGR:  ',waehlerzahl05MitteGR,'=',float(waehlerzahl05MitteGR))
print('')

print('Wähleranteile:')
print('SP-Grüne: ',waehleranteil01SPGruene,' ≈ ',float(waehleranteil01SPGruene))
print('FDP:      ',waehleranteil02FDP,' ≈ ',float(waehleranteil02FDP))
print('SVP:      ',waehleranteil03SVP,' ≈ ',float(waehleranteil03SVP))
print('GLP:      ',waehleranteil04GLP,' ≈ ',float(waehleranteil04GLP))
print('MitteGR:  ',waehleranteil05MitteGR,' ≈ ',float(waehleranteil05MitteGR))
print('')

print('Untersuchungen zum Wähleranteil der FDP:');
wertGR = Fraction(2203,100);
print('Wert gemäss Kanton GR=',wertGR);
wertOGD = Fraction(22026585339547193,1000000000000000);
print('Wert gemäss OGD =',wertOGD);

fehlerFileKantonGR = (waehleranteil02FDP-wertGR)/waehleranteil02FDP*Fraction(100,1);
fehlerOGD = (waehleranteil02FDP-wertOGD)/waehleranteil02FDP*Fraction(100,1);
print('Relativer Fehler in Prozent wertGR:  ',fehlerFileKantonGR,' ≈ ',float(fehlerFileKantonGR));
print('Relativer Fehler in Prozent wertOGD: ',fehlerOGD,' ≈ ',float(fehlerOGD));
