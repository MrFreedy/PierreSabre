package histoire;
import personnages.Humain;

public class HistoireTP4 {


    public static void main(String[] args) {
        Humain prof;
        prof = new Humain("Prof", "Kombucha", 100);
        
        prof.getMoney();
        prof.acheter("une boisson", 12);
        prof.perdreArgent(12);
        prof.boire();
        prof.getMoney();
        prof.acheter("un jeu vidéo", 60);
        prof.perdreArgent(60);
        prof.getMoney();
        prof.acheter("un kimono", 50);
    }
}