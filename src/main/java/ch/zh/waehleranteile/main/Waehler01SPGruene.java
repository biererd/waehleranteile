package ch.zh.waehleranteile.main;

/**
 * Bereitstellung der Summe der SP&Grüne-Wähler unter Verwendung von Ganzzahl-Arithmetik.
 * bei den Grossratswahlen 2022 des Kantons Graubünden.
 * Datengrundlage:
 * https://www.gr.ch/DE/publikationen/abstimmungenwahlen/Grossratswahlen-2022/ResultateGrossratswahlen/20220515_Wahlprotokoll_Kantonsamtsblatt_Proporzwahl_kantonal.pdf
 * @author Daniel Bierer
 */
public class Waehler01SPGruene
    {
    /**
     * Bereitstellung der Summe der Wähler
     * @return Summe der Wähler
     */
    public static BigRational getWaehler()
        {
        return
        new BigRational("265/2")           //Alvaschein
        .add(new BigRational("0/1"))       //Avers
        .add(new BigRational("49/1"))      //Belfort
        .add(new BigRational("85/1"))      //Bergün
        .add(new BigRational("76/1"))      //Bregaglia
        .add(new BigRational("115/1"))     //Breil/Brigels
        .add(new BigRational("59/1"))      //Brusio
        .add(new BigRational("43/1"))      //Calanca
        .add(new BigRational("65496/21"))  //Chur
        .add(new BigRational("148/1"))     //Churwalden
        .add(new BigRational("4661/6"))    //Davos
        .add(new BigRational("1006/4"))    //Disentis
        .add(new BigRational("1132/3"))    //Domleschg
        .add(new BigRational("9717/11"))   //Fünf Dörfer
        .add(new BigRational("3162/6"))    //Ilanz
        .add(new BigRational("59/1"))      //Jenaz
        .add(new BigRational("396/3"))     //Klosters
        .add(new BigRational("45/1"))      //Küblis
        .add(new BigRational("252/2"))     //Lumnezia/Lugnez
        .add(new BigRational("99/1"))      //Luzein
        .add(new BigRational("2747/5"))    //Maienfeld
        .add(new BigRational("119/1"))     //Mesocco
        .add(new BigRational("5258/8"))    //Oberengadin
        .add(new BigRational("341/2"))     //Poschiavo
        .add(new BigRational("78/1"))      //Ramosch
        .add(new BigRational("5243/7"))    //Rhäzuns
        .add(new BigRational("97/1"))      //Rheinwald
        .add(new BigRational("953/3"))     //Roveredo
        .add(new BigRational("42/1"))      //Safien
        .add(new BigRational("104/1"))     //Schams
        .add(new BigRational("228/2"))     //Schanfigg
        .add(new BigRational("657/3"))     //Schiers
        .add(new BigRational("31/1"))      //Seewis
        .add(new BigRational("810/3"))     //Suot Tasna
        .add(new BigRational("197/1"))     //Sur Tasna
        .add(new BigRational("124/1"))     //Surses
        .add(new BigRational("1174/4"))    //Thusis
        .add(new BigRational("2627/5"))    //Trins
        .add(new BigRational("0/1"));      //Val Müstair
        
        }
    }
