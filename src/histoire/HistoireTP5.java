package histoire;

import personnages.*;

public class HistoireTP5 {

    public static void main(String[] args){

        Commercant marco = new Commercant("Marco","Coca-Cola",20);
        Commercant chonin = new Commercant("Chonin","Pepsi",52);
        Commercant kumi = new Commercant("Kumi", "Dr.Pepper",10);

        Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",50,"Warsong");

        Ronin roro = new Ronin("Roro","Shochu",50);

        Samourai akimoto = new Samourai("Akimoto","saké",80,"Miyamoto");

        Traitre masako = new Traitre("Masako","whisky",80,"Miyamoto");

        masako.faireLeGentil();

        masako.ranconner(kumi);
        masako.ranconner(chonin);
        masako.ranconner(marco);

        akimoto.direBonjour();
        masako.direBonjour();

        masako.ranconner(kumi);

        masako.faireConnaissanceAvec(yaku);

        masako.faireLeGentil();

        masako.faireConnaissanceAvec(roro);

    }
}
