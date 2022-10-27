package histoire;
import personnages.Commercant;

public class HistoireTP4 {


    public static void main(String[] args) {

        Commercant marco= new Commercant("Marco", "Thé", 20);
        marco.direBonjour();
        marco.parler("J'ai tout perdu! Le monde est trop injuste...\n");
        marco.recevoirArgent(15);
        marco.boire();


    }
}