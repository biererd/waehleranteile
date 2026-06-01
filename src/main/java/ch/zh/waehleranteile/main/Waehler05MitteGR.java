package ch.zh.waehleranteile.main;

/**
 * Bereitstellung der Summe der MitteGR-Wähler unter Verwendung von Ganzzahl-Arithmetik.
 * bei den Grossratswahlen 2022 des Kantons Graubünden.
 * Datengrundlage:
 * https://www.gr.ch/DE/publikationen/abstimmungenwahlen/Grossratswahlen-2022/ResultateGrossratswahlen/20220515_Wahlprotokoll_Kantonsamtsblatt_Proporzwahl_kantonal.pdf
 * @author Daniel Bierer
 */
public class Waehler05MitteGR
    {
    /**
     * Bereitstellung der Summe der Wähler
     * @return Summe der Wähler
     */
    public static BigRational getWaehler()
        {
        return
        new BigRational("1239/2")          //Alvaschein
        .add(new BigRational("7/1"))       //Avers
        .add(new BigRational("104/1"))     //Belfort
        .add(new BigRational("65/1"))      //Bergün
        .add(new BigRational("148/1"))     //Bregaglia
        .add(new BigRational("271/1"))     //Breil/Brigels
        .add(new BigRational("32/1"))      //Brusio
        .add(new BigRational("176/1"))     //Calanca
        .add(new BigRational("32374/21"))  //Chur
        .add(new BigRational("169/1"))     //Churwalden
        .add(new BigRational("1506/6"))    //Davos
        .add(new BigRational("5655/4"))    //Disentis
        .add(new BigRational("610/3"))     //Domleschg
        .add(new BigRational("10340/11"))  //Fünf Dörfer
        .add(new BigRational("7461/6"))    //Ilanz
        .add(new BigRational("159/1"))     //Jenaz
        .add(new BigRational("712/3"))     //Klosters
        .add(new BigRational("34/1"))      //Küblis
        .add(new BigRational("1180/2"))    //Lumnezia/Lugnez
        .add(new BigRational("94/1"))      //Luzein
        .add(new BigRational("1548/5"))    //Maienfeld
        .add(new BigRational("321/1"))     //Mesocco
        .add(new BigRational("4830/8"))    //Oberengadin
        .add(new BigRational("540/2"))     //Poschiavo
        .add(new BigRational("73/1"))      //Ramosch
        .add(new BigRational("7282/7"))    //Rhäzuns
        .add(new BigRational("90/1"))      //Rheinwald
        .add(new BigRational("1070/3"))    //Roveredo
        .add(new BigRational("216/1"))     //Safien
        .add(new BigRational("214/1"))     //Schams
        .add(new BigRational("109/2"))     //Schanfigg
        .add(new BigRational("844/3"))     //Schiers
        .add(new BigRational("121/1"))     //Seewis
        .add(new BigRational("1688/3"))    //Suot Tasna
        .add(new BigRational("110/1"))     //Sur Tasna
        .add(new BigRational("293/1"))     //Surses
        .add(new BigRational("1560/4"))    //Thusis
        .add(new BigRational("2517/5"))    //Trins
        .add(new BigRational("359/1"));    //Val Müstair
        
        }
    }
