package histoire;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {


    public static void main(String[] args) {

        Commercant marco= new Commercant("Marco", "Thé", 15);
        Yakuza yakuza= new Yakuza("Yaku Le Noir", "Whisky", 30, "Warsong", 0);
        yakuza.direBonjour();
        yakuza.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?\n");
        yakuza.extorquer(marco);
        marco.parler("J'ai tout perdu! Le monde est trop injuste...\n");


    }
}