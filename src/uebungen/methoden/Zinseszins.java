package uebungen.methoden;

public class Zinseszins {
    public static void main(String[] args) {
        System.out.println(zinseszins(10000,0.001,100));
        System.out.println(zinseszinsloop(10000, 0.001,100));
    }
    private static double zinseszins(double kreditbetrag, double zinssatzProMonat, double rateProMonat ) {
        if (kreditbetrag <= 0) {
            return 0;
        } else {
            double zins = kreditbetrag*zinssatzProMonat;
            double tilgung = rateProMonat - zins;
            return zinseszins(kreditbetrag-tilgung, zinssatzProMonat, rateProMonat) + zins;
        }
    }
    // Test auf Ricntigkeit
    private static double zinseszinsloop(double kreditbetrag, double zinssatzProMonat, double rateProMonat){
        double gesamtzinsen= 0;
        while (kreditbetrag > 0) {
            double zins = zinssatzProMonat*kreditbetrag;
            double tilgung = rateProMonat - zins;
            gesamtzinsen = gesamtzinsen+zins;
            kreditbetrag = kreditbetrag - tilgung;
        }
        return gesamtzinsen;
    }
}
