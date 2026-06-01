# Berechnung der Wählerzahl der FDP
# bei den Grossratswahlen 2022 im Kanton GR
# basierend auf Ganzzahl-Arithmetik

from fractions import Fraction

def getwaehler():
  summe = (
  Fraction(360,2)       # Alvaschein
  +Fraction(72,1)       # Avers
  +Fraction(0,1)        # Belfort
  +Fraction(117,1)      # Bergün
  +Fraction(262,1)      # Bregaglia
  +Fraction(0,1)        # Breil/Brigels
  +Fraction(84,1)       # Brusio
  +Fraction(133,1)      # Calanca
  +Fraction(32827,21)   # Chur
  +Fraction(90,1)       # Churwalden
  +Fraction(4240,6)     # Davos
  +Fraction(245,4)      # Disentis
  +Fraction(829,3)      # Domleschg
  +Fraction(5850,11)    # Fünf Dörfer
  +Fraction(2219,6)     # Ilanz
  +Fraction(167,1)      # Jenaz
  +Fraction(672,3)      # Klosters
  +Fraction(37,1)       # Küblis
  +Fraction(210,2)      # Lumnezia/Lugnez
  +Fraction(203,1)      # Luzein
  +Fraction(3229,5)     # Maienfeld
  +Fraction(284,1)      # Mesocco
  +Fraction(8091,8)     # Oberengadin
  +Fraction(798,2)      # Poschiavo
  +Fraction(173,1)      # Ramosch
  +Fraction(3509,7)     # Rhäzüns
  +Fraction(97,1)       # Rheinwald
  +Fraction(1881,3)     # Roveredo
  +Fraction(0,1)        # Safien
  +Fraction(191,1)      # Schams
  +Fraction(735,2)      # Schanfigg
  +Fraction(1037,3)     # Schiers
  +Fraction(118,1)      # Seewis
  +Fraction(680,3)      # Suot Tasna
  +Fraction(0,1)        # Sur Tasna
  +Fraction(304,1)      # Surses
  +Fraction(917,4)      # Thusis
  +Fraction(3230,5)     # Trins
  +Fraction(41,1)       # Val Müstair
  )
  return summe

