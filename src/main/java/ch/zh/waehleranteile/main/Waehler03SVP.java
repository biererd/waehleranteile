package ch.zh.waehleranteile.main;

/**
 * Bereitstellung der Summe der SVP-Wähler unter Verwendung von Ganzzahl-Arithmetik.
 * bei den Grossratswahlen 2022 des Kantons Graubünden.
 * Datengrundlage:
 * https://www.gr.ch/DE/publikationen/abstimmungenwahlen/Grossratswahlen-2022/ResultateGrossratswahlen/20220515_Wahlprotokoll_Kantonsamtsblatt_Proporzwahl_kantonal.pdf
 * @author Daniel Bierer
 */
public class Waehler03SVP
    {
    /**
     * Bereitstellung der Summe der Wähler
     * @return Summe der Wähler
     */
    public static BigRational getWaehler()
        {
        return
        new BigRational("217/2")           //Alvaschein
        .add(new BigRational("2/1"))       //Avers
        .add(new BigRational("38/1"))      //Belfort
        .add(new BigRational("33/1"))      //Bergün
        .add(new BigRational("55/1"))      //Bregaglia
        .add(new BigRational("83/1"))      //Breil/Brigels
        .add(new BigRational("199/1"))     //Brusio
        .add(new BigRational("56/1"))      //Calanca
        .add(new BigRational("30961/21"))  //Chur
        .add(new BigRational("101/1"))     //Churwalden
        .add(new BigRational("3030/6"))    //Davos
        .add(new BigRational("849/4"))     //Disentis
        .add(new BigRational("1125/3"))    //Domleschg
        .add(new BigRational("13623/11"))  //Fünf Dörfer
        .add(new BigRational("2821/6"))    //Ilanz
        .add(new BigRational("166/1"))     //Jenaz
        .add(new BigRational("824/3"))     //Klosters
        .add(new BigRational("113/1"))     //Küblis
        .add(new BigRational("435/2"))     //Lumnezia/Lugnez
        .add(new BigRational("67/1"))      //Luzein
        .add(new BigRational("2864/5"))    //Maienfeld
        .add(new BigRational("52/1"))      //Mesocco
        .add(new BigRational("6481/8"))    //Oberengadin
        .add(new BigRational("550/2"))     //Poschiavo
        .add(new BigRational("115/1"))     //Ramosch
        .add(new BigRational("3878/7"))    //Rhäzuns
        .add(new BigRational("21/1"))      //Rheinwald
        .add(new BigRational("411/3"))     //Roveredo
        .add(new BigRational("178/1"))     //Safien
        .add(new BigRational("41/1"))      //Schams
        .add(new BigRational("592/2"))     //Schanfigg
        .add(new BigRational("1320/3"))    //Schiers
        .add(new BigRational("112/1"))     //Seewis
        .add(new BigRational("896/3"))     //Suot Tasna
        .add(new BigRational("240/1"))     //Sur Tasna
        .add(new BigRational("57/1"))      //Surses
        .add(new BigRational("1679/4"))    //Thusis
        .add(new BigRational("1735/5"))    //Trins
        .add(new BigRational("178/1"));    //Val Müstair
        
        }
    }
