package no.hvl.dat100;

import java.util.Locale;

public class TheSwitchStatement {
    public static void main(String[] args) {
        String dag = "Mandag";
        switch (dag.toLowerCase(Locale.ROOT)) {
            case "mandag": case "tirsdag": case "onsdag": case "torsdag": case "fredag": case "lørdag": case "søndag":
                System.out.println("Idag er det " + dag.toLowerCase(Locale.ROOT));
                break;
            default:
                System.out.println("Denne dagen finnes ikke. Prov igjen");
                break;
        }

    }

}
