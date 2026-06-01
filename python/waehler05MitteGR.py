# Berechnung der Wählerzahl der MitteGR
# bei den Grossratswahlen 2022 im Kanton GR
# basierend auf Ganzzahl-Arithmetik

from fractions import Fraction

def getwaehler():
  summe = (
  Fraction(1239,2)       # Alvaschein
  +Fraction(7,1)         # Avers
  +Fraction(104,1)       # Belfort
  +Fraction(65,1)        # Bergün
  +Fraction(148,1)       # Bregaglia
  +Fraction(271,1)       # Breil/Brigels
  +Fraction(32,1)        # Brusio
  +Fraction(176,1)       # Calanca
  +Fraction(32374,21)    # Chur
  +Fraction(169,1)       # Churwalden
  +Fraction(1506,6)      # Davos
  +Fraction(5655,4)      # Disentis
  +Fraction(610,3)       # Domleschg
  +Fraction(10340,11)    # Fünf Dörfer
  +Fraction(7461,6)      # Ilanz
  +Fraction(159,1)       # Jenaz
  +Fraction(712,3)       # Klosters
  +Fraction(34,1)        # Küblis
  +Fraction(1180,2)      # Lumnezia/Lugnez
  +Fraction(94,1)        # Luzein
  +Fraction(1548,5)      # Maienfeld
  +Fraction(321,1)       # Mesocco
  +Fraction(4830,8)      # Oberengadin
  +Fraction(540,2)       # Poschiavo
  +Fraction(73,1)        # Ramosch
  +Fraction(7282,7)      # Rhäzüns
  +Fraction(90,1)        # Rheinwald
  +Fraction(1070,3)      # Roveredo
  +Fraction(216,1)       # Safien
  +Fraction(214,1)       # Schams
  +Fraction(109,2)       # Schanfigg
  +Fraction(844,3)       # Schiers
  +Fraction(121,1)       # Seewis
  +Fraction(1688,3)      # Suot Tasna
  +Fraction(110,1)       # Sur Tasna
  +Fraction(293,1)       # Surses
  +Fraction(1560,4)      # Thusis
  +Fraction(2517,5)      # Trins
  +Fraction(359,1)       # Val Müstair
  )
  return summe

