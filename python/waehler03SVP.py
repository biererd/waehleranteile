# Berechnung der Wählerzahl der SVP
# bei den Grossratswahlen 2022 im Kanton GR
# basierend auf Ganzzahl-Arithmetik

from fractions import Fraction

def getwaehler():
  summe = (
  Fraction(217,2)       # Alvaschein
  +Fraction(2,1)        # Avers
  +Fraction(38,1)       # Belfort
  +Fraction(33,1)       # Bergün
  +Fraction(55,1)       # Bregaglia
  +Fraction(83,1)       # Breil/Brigels
  +Fraction(199,1)      # Brusio
  +Fraction(56,1)       # Calanca
  +Fraction(30961,21)   # Chur
  +Fraction(101,1)      # Churwalden
  +Fraction(3030,6)     # Davos
  +Fraction(849,4)      # Disentis
  +Fraction(1125,3)     # Domleschg
  +Fraction(13623,11)   # Fünf Dörfer
  +Fraction(2821,6)     # Ilanz
  +Fraction(166,1)      # Jenaz
  +Fraction(824,3)      # Klosters
  +Fraction(113,1)      # Küblis
  +Fraction(435,2)      # Lumnezia/Lugnez
  +Fraction(67,1)       # Luzein
  +Fraction(2864,5)     # Maienfeld
  +Fraction(52,1)       # Mesocco
  +Fraction(6481,8)     # Oberengadin
  +Fraction(550,2)      # Poschiavo
  +Fraction(115,1)      # Ramosch
  +Fraction(3878,7)     # Rhäzüns
  +Fraction(21,1)       # Rheinwald
  +Fraction(411,3)      # Roveredo
  +Fraction(178,1)      # Safien
  +Fraction(41,1)       # Schams
  +Fraction(592,2)      # Schanfigg
  +Fraction(1320,3)     # Schiers
  +Fraction(112,1)      # Seewis
  +Fraction(896,3)      # Suot Tasna
  +Fraction(240,1)      # Sur Tasna
  +Fraction(57,1)       # Surses
  +Fraction(1679,4)     # Thusis
  +Fraction(1735,5)     # Trins
  +Fraction(178,1)      # Val Müstair
  )
  return summe

