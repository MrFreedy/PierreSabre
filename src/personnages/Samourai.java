package personnages;

public class Samourai extends Humain{

    private String nomSeigneur;


    public Samourai(String nom, String boissonFavorite, int money, String nomSeigneur){
        super(nom,boissonFavorite,money);
        this.nomSeigneur=nomSeigneur;
    }

    @Override
    public void direBonjour(){
        System.out.printf("("+getNom()+") - "+"Bonjour ! Je m’appelle %s et j'aime boire du %s ! Je suis fier de servir le seigneur %s.\n", getNom(), getBoisson(),getNomSeigneur());
    }

    public String getNomSeigneur(){
        return nomSeigneur;
    }

    @Override
    public void boire() {
        System.out.printf("("+getNom()+") - "+"Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du %s.\n", getBoisson());
    }
}
