package ch.zh.waehleranteile.main;

/**
 * Bereitstellung der Summe der FDP-Wähler unter Verwendung von Ganzzahl-Arithmetik.
 * bei den Grossratswahlen 2022 des Kantons Graubünden.
 * Datengrundlage:
 * https://www.gr.ch/DE/publikationen/abstimmungenwahlen/Grossratswahlen-2022/ResultateGrossratswahlen/20220515_Wahlprotokoll_Kantonsamtsblatt_Proporzwahl_kantonal.pdf
 * @author Daniel Bierer
 */
public class Waehler02FDP
    {
    /**
     * Bereitstellung der Summe der Wähler
     * @return Summe der Wähler
     */
    public static BigRational getWaehler()
        {
        return
        new BigRational("360/2")           //Alvaschein
        .add(new BigRational("72/1"))      //Avers
        .add(new BigRational("0/1"))       //Belfort
        .add(new BigRational("117/1"))     //Bergün
        .add(new BigRational("262/1"))     //Bregaglia
        .add(new BigRational("0/1"))       //Breil/Brigels
        .add(new BigRational("84/1"))      //Brusio
        .add(new BigRational("133/1"))     //Calanca
        .add(new BigRational("32827/21"))  //Chur
        .add(new BigRational("90/1"))      //Churwalden
        .add(new BigRational("4240/6"))    //Davos
        .add(new BigRational("245/4"))     //Disentis
        .add(new BigRational("829/3"))     //Domleschg
        .add(new BigRational("5850/11"))   //Fünf Dörfer
        .add(new BigRational("2219/6"))    //Ilanz
        .add(new BigRational("167/1"))     //Jenaz
        .add(new BigRational("672/3"))     //Klosters
        .add(new BigRational("37/1"))      //Küblis
        .add(new BigRational("210/2"))     //Lumnezia/Lugnez
        .add(new BigRational("203/1"))     //Luzein
        .add(new BigRational("3229/5"))    //Maienfeld
        .add(new BigRational("284/1"))     //Mesocco
        .add(new BigRational("8091/8"))    //Oberengadin
        .add(new BigRational("798/2"))     //Poschiavo
        .add(new BigRational("173/1"))     //Ramosch
        .add(new BigRational("3509/7"))    //Rhäzuns
        .add(new BigRational("97/1"))      //Rheinwald
        .add(new BigRational("1881/3"))    //Roveredo
        .add(new BigRational("0/1"))       //Safien
        .add(new BigRational("191/1"))     //Schams
        .add(new BigRational("735/2"))     //Schanfigg
        .add(new BigRational("1037/3"))    //Schiers
        .add(new BigRational("118/1"))     //Seewis
        .add(new BigRational("680/3"))     //Suot Tasna
        .add(new BigRational("0/1"))       //Sur Tasna
        .add(new BigRational("304/1"))     //Surses
        .add(new BigRational("917/4"))     //Thusis
        .add(new BigRational("3230/5"))    //Trins
        .add(new BigRational("41/1"));     //Val Müstair
        
        }
    }
