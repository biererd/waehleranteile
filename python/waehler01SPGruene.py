# Berechnung der Wählerzahl der SP&Grüne
# bei den Grossratswahlen 2022 im Kanton GR
# basierend auf Ganzzahl-Arithmetik

from fractions import Fraction

def getwaehler():
  summe = (
  Fraction(265,2)       # Alvaschein
  +Fraction(0,1)        # Avers
  +Fraction(49,1)       # Belfort
  +Fraction(85,1)       # Bergün
  +Fraction(76,1)       # Bregaglia
  +Fraction(115,1)      # Breil/Brigels
  +Fraction(59,1)       # Brusio
  +Fraction(43,1)       # Calanca
  +Fraction(65496,21)   # Chur
  +Fraction(148,1)      # Churwalden
  +Fraction(4661,6)     # Davos
  +Fraction(1006,4)     # Disentis
  +Fraction(1132,3)     # Domleschg
  +Fraction(9717,11)    # Fünf Dörfer
  +Fraction(3162,6)     # Ilanz
  +Fraction(59,1)       # Jenaz
  +Fraction(396,3)      # Klosters
  +Fraction(45,1)       # Küblis
  +Fraction(252,2)      # Lumnezia/Lugnez
  +Fraction(99,1)       # Luzein
  +Fraction(2747,5)     # Maienfeld
  +Fraction(119,1)      # Mesocco
  +Fraction(5258,8)     # Oberengadin
  +Fraction(341,2)      # Poschiavo
  +Fraction(78,1)       # Ramosch
  +Fraction(5243,7)     # Rhäzüns
  +Fraction(97,1)       # Rheinwald
  +Fraction(953,3)      # Roveredo
  +Fraction(42,1)       # Safien
  +Fraction(104,1)      # Schams
  +Fraction(228,2)      # Schanfigg
  +Fraction(657,3)      # Schiers
  +Fraction(31,1)       # Seewis
  +Fraction(810,3)      # Suot Tasna
  +Fraction(197,1)      # Sur Tasna
  +Fraction(124,1)      # Surses
  +Fraction(1174,4)     # Thusis
  +Fraction(2627,5)     # Trins
  +Fraction(0,1)        # Val Müstair
  )
  return summe

