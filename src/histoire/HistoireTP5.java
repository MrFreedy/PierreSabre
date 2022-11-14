package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {

    public static void main(String[] args){

        Commercant marco = new Commercant("Marco","Coca-Cola",20);
        Commercant chonin = new Commercant("Chonin","Pepsi",52);
        Commercant kumi = new Commercant("Kumi", "Dr.Pepper",10);
        Yakuza yaku = new Yakuza("Yaku Le Noir","Wisky",50,"Warsong");
        Ronin roro = new Ronin("Roro","Shochu",50);

        /*marco.faireConnaissanceAvec(roro);

        marco.faireConnaissanceAvec(yaku);

        marco.faireConnaissanceAvec(chonin);

        marco.faireConnaissanceAvec(kumi);

        marco.listerConnaissance();*/

        yaku.direBonjour();
    }
}
