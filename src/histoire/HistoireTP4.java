package histoire;
import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {


    public static void main(String[] args) {

        Commercant marco= new Commercant("Marco", "Thé", 15);
        Yakuza yakuza= new Yakuza("Yaku Le Noir", "Whisky", 30, "Warsong");
        Ronin roro = new Ronin("Roro", "Shochu", 60);

        roro.direBonjour();
        roro.donner(marco);

    }
}