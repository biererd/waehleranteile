# Berechnung der Wählerzahl der GLP
# bei den Grossratswahlen 2022 im Kanton GR
# basierend auf Ganzzahl-Arithmetik

from fractions import Fraction

def getwaehler():
  summe = (
  Fraction(137,2)       # Alvaschein
  +Fraction(0,1)        # Avers
  +Fraction(0,1)        # Belfort
  +Fraction(0,1)        # Bergün
  +Fraction(0,1)        # Bregaglia
  +Fraction(0,1)        # Breil/Brigels
  +Fraction(0,1)        # Brusio
  +Fraction(0,1)        # Calanca
  +Fraction(17580,21)   # Chur
  +Fraction(26,1)       # Churwalden
  +Fraction(1564,6)     # Davos
  +Fraction(0,4)        # Disentis
  +Fraction(405,3)      # Domleschg
  +Fraction(3336,11)    # Fünf Dörfer
  +Fraction(546,6)      # Ilanz
  +Fraction(98,1)       # Jenaz
  +Fraction(365,3)      # Klosters
  +Fraction(0,1)        # Küblis
  +Fraction(0,2)        # Lumnezia/Lugnez
  +Fraction(0,1)        # Luzein
  +Fraction(849,5)      # Maienfeld
  +Fraction(0,1)        # Mesocco
  +Fraction(4157,8)     # Oberengadin
  +Fraction(92,2)       # Poschiavo
  +Fraction(0,1)        # Ramosch
  +Fraction(822,7)      # Rhäzüns
  +Fraction(0,1)        # Rheinwald
  +Fraction(0,3)        # Roveredo
  +Fraction(0,1)        # Safien
  +Fraction(0,1)        # Schams
  +Fraction(0,2)        # Schanfigg
  +Fraction(325,3)      # Schiers
  +Fraction(37,1)       # Seewis
  +Fraction(0,3)        # Suot Tasna
  +Fraction(0,1)        # Sur Tasna
  +Fraction(0,1)        # Surses
  +Fraction(614,4)      # Thusis
  +Fraction(335,5)      # Trins
  +Fraction(0,1)        # Val Müstair
  )
  return summe

