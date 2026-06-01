package ch.zh.waehleranteile.main;

/**
 * Berechnung von Wähleranteilen bei den Grossratswahlen 2022
 * des Kantons Graubünden mit Ganzzahl-Arithmetik.
 * @author Daniel Bierer
 */
public class Main
    {
    
    /**
     * Berechnung der Wähleranteile bei den Grossratswahlen 2022
     * des Kantons Graubünden mit Ganzzahl-Arithmetik.
     * @param args
     */
    public static void main(String[] args)
        {
        BigRational waehler01SPGruene = Waehler01SPGruene.getWaehler();
        BigRational waehler02FDP      = Waehler02FDP.getWaehler();
        BigRational waehler03SVP      = Waehler03SVP.getWaehler();
        BigRational waehler04GLP      = Waehler04GLP.getWaehler();
        BigRational waehler05MitteGR  = Waehler05MitteGR.getWaehler();
        
        BigRational waehlerSumme = waehler01SPGruene
                .add(waehler02FDP)
                .add(waehler03SVP)
                .add(waehler04GLP)
                .add(waehler05MitteGR);
        
        BigRational waehlerAnteil01SPGruene = waehler01SPGruene.divide(waehlerSumme).multiply(new BigRational("100/1"));
        BigRational waehlerAnteil02FDP      = waehler02FDP.divide(waehlerSumme).multiply(new BigRational("100/1"));
        BigRational waehlerAnteil03SVP      = waehler03SVP.divide(waehlerSumme).multiply(new BigRational("100/1"));
        BigRational waehlerAnteil04GLP      = waehler04GLP.divide(waehlerSumme).multiply(new BigRational("100/1"));
        BigRational waehlerAnteil05MitteGR  = waehler04GLP.divide(waehlerSumme).multiply(new BigRational("100/1"));
        
        System.out.println("Wählerzahlen:");
        System.out.println(" - SP&Grüne: "+waehler01SPGruene.doubleValue());
        System.out.println(" - FDP:      "+waehler02FDP.doubleValue());
        System.out.println(" - SVP:      "+waehler03SVP.doubleValue());
        System.out.println(" - GLP:      "+waehler04GLP.doubleValue());
        System.out.println(" - MitteGR:  "+waehler05MitteGR.doubleValue());
        System.out.println("");
        
        System.out.println("Wähleranteile:");
        System.out.println(" - SP&Grüne: "+waehlerAnteil01SPGruene+" ≈ "+waehlerAnteil01SPGruene.doubleValue());
        System.out.println(" - FDP:      "+waehlerAnteil02FDP+" ≈ "+waehlerAnteil02FDP.doubleValue());
        System.out.println(" - SVP:      "+waehlerAnteil03SVP+" ≈ "+waehlerAnteil03SVP.doubleValue());
        System.out.println(" - GLP:      "+waehlerAnteil04GLP+" ≈ "+waehlerAnteil04GLP.doubleValue());
        System.out.println(" - MitteGR:  "+waehlerAnteil05MitteGR+" ≈ "+waehlerAnteil05MitteGR.doubleValue());
        System.out.println("");
        
        System.out.println("Untersuchungen zum Wähleranteil der FDP:");
        //BigRational fehlerFileKantonGR = new BigRational("22.030000000000000").sub(waehlerAnteil02FDP);
        //BigRational fehlerOGD = new BigRational("22.026585339547193").sub(waehlerAnteil02FDP);
        BigRational wertGR = new BigRational("2203/100");
        System.out.println("wertGR  = "+wertGR+" ≈ "+wertGR.doubleValue());
        BigRational wertOGD = new BigRational("22026585339547193/1000000000000000");
        System.out.println("wertOGD = "+wertOGD+" ≈ "+wertOGD.doubleValue());
        
        BigRational fehlerFileKantonGR = (waehlerAnteil02FDP.sub(wertGR)).divide(waehlerAnteil02FDP).multiply(new BigRational("100/1"));
        BigRational fehlerOGD = (waehlerAnteil02FDP.sub(wertOGD)).divide(waehlerAnteil02FDP).multiply(new BigRational("100/1"));
        System.out.println("Relativer Fehler in Prozent beim Wert des Kantons GR: "+fehlerFileKantonGR+"="+fehlerFileKantonGR.doubleValue());
        System.out.println("Relativer Fehler in Prozent beim Wert im OGD:         "+fehlerOGD+"="+fehlerOGD.doubleValue());
        }
        
    }
