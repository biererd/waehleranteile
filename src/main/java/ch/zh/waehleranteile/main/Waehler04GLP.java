package ch.zh.waehleranteile.main;

/**
 * Bereitstellung der Summe der GLP-Wähler unter Verwendung von Ganzzahl-Arithmetik.
 * bei den Grossratswahlen 2022 des Kantons Graubünden.
 * Datengrundlage:
 * https://www.gr.ch/DE/publikationen/abstimmungenwahlen/Grossratswahlen-2022/ResultateGrossratswahlen/20220515_Wahlprotokoll_Kantonsamtsblatt_Proporzwahl_kantonal.pdf
 * @author Daniel Bierer
 */
public class Waehler04GLP
    {
    /**
     * Bereitstellung der Summe der Wähler
     * @return Summe der Wähler
     */
    public static BigRational getWaehler()
        {
        return
        new BigRational("137/2")           //Alvaschein
        .add(new BigRational("0/1"))       //Avers
        .add(new BigRational("0/1"))       //Belfort
        .add(new BigRational("0/1"))       //Bergün
        .add(new BigRational("0/1"))       //Bregaglia
        .add(new BigRational("0/1"))       //Breil/Brigels
        .add(new BigRational("0/1"))       //Brusio
        .add(new BigRational("0/1"))       //Calanca
        .add(new BigRational("17580/21"))  //Chur
        .add(new BigRational("26/1"))      //Churwalden
        .add(new BigRational("1564/6"))    //Davos
        .add(new BigRational("0/4"))       //Disentis
        .add(new BigRational("405/3"))     //Domleschg
        .add(new BigRational("3336/11"))   //Fünf Dörfer
        .add(new BigRational("546/6"))     //Ilanz
        .add(new BigRational("98/1"))      //Jenaz
        .add(new BigRational("365/3"))     //Klosters
        .add(new BigRational("0/1"))       //Küblis
        .add(new BigRational("0/2"))       //Lumnezia/Lugnez
        .add(new BigRational("0/1"))       //Luzein
        .add(new BigRational("849/5"))     //Maienfeld
        .add(new BigRational("0/1"))       //Mesocco
        .add(new BigRational("4157/8"))    //Oberengadin
        .add(new BigRational("92/2"))      //Poschiavo
        .add(new BigRational("0/1"))       //Ramosch
        .add(new BigRational("822/7"))     //Rhäzuns
        .add(new BigRational("0/1"))       //Rheinwald
        .add(new BigRational("0/3"))       //Roveredo
        .add(new BigRational("0/1"))       //Safien
        .add(new BigRational("0/1"))       //Schams
        .add(new BigRational("0/2"))       //Schanfigg
        .add(new BigRational("325/3"))     //Schiers
        .add(new BigRational("37/1"))      //Seewis
        .add(new BigRational("0/3"))       //Suot Tasna
        .add(new BigRational("0/1"))       //Sur Tasna
        .add(new BigRational("0/1"))       //Surses
        .add(new BigRational("614/4"))     //Thusis
        .add(new BigRational("335/5"))     //Trins
        .add(new BigRational("0/1"));      //Val Müstair
        
        }
    }
