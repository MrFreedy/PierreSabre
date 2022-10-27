package personnages;

public class Commercant extends Humain{

    public Commercant(String nom, String boissonFavorite, int money) {
        super(nom, boissonFavorite, money);
    }

    public int seFaireExtorquer(int argent) {
        return argent;
    }

    public void recevoirArgent(int argent) {
        System.out.printf("%d euros ! Je te remercie généreux donateur !\n", argent);

    }

}
