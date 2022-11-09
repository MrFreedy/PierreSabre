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

    public void provoquer(Yakuza adversaire){
        System.out.println("("+getNom()+") - "+"Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        if(2*honneur>=adversaire.getReputation()){
            System.out.printf("("+getNom()+") - "+"Je t'ai eu petit yakuza!\n");
            int argent=adversaire.getMoney();
            gagnerArgent(argent);
            honneur++;
            adversaire.perdre();
        }
        else{
            System.out.printf("("+getNom()+") - "+"J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.\n");
            adversaire.gagner(getMoney());
            honneur--;
            perdreArgent(getMoney());
        }
    }
}
