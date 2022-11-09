package personnages;

public class Ronin extends Humain{
    private String clan;
    private int honneur=1;

    public Ronin(String nom, String boissonFavorite, int money) {
        super(nom, boissonFavorite, money);
    }

    public void donner(Commercant beneficiaire){
        int argent=getMoney()/10;
        System.out.printf("("+getNom()+") - "+"%s prend ces %d sous.\n",beneficiaire.getNom(),argent);
        honneur++;
        perdreArgent(argent);
        beneficiaire.gagnerArgent(argent);
        System.out.printf("("+beneficiaire.getNom()+") - "+"%d sous ! Je te remercie généreux donateur!\n",argent);

    }

}
