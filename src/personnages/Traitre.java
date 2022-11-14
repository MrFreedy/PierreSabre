package personnages;

public class Traitre extends Humain{

    private String nomSeigneur;
    private int niveauTraitrise=0;


    public Traitre(String nom, String boissonFavorite, int money,String nomSeigneur){
        super(nom,boissonFavorite,money);
        this.nomSeigneur= nomSeigneur;


    }

    public String getNomSeigneur() {
        return nomSeigneur;
    }

    @Override
    public void direBonjour(){
        System.out.printf("("+getNom()+") - "+"Bonjour ! Je m’appelle %s et j'aime boire du %s ! Je suis fier de servir le seigneur %s. Mais je suis un traître et mon niveau de traîtrise est: %d. Chut!\n", getNom(), getBoisson(),getNomSeigneur(),niveauTraitrise);
    }

    public void ranconner(Commercant commercant){
        if (niveauTraitrise<3){
            int argentCommercant = commercant.getMoney();
            int argentRanconner=argentCommercant*2/10;
            commercant.perdreArgent(argentRanconner);

            gagnerArgent(argentRanconner);
            System.out.printf("("+getNom()+") - "+"Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi %d sous ou gare à toi !\n",argentRanconner);
            System.out.printf("("+commercant.getNom()+") - "+"Tout de suite grand %s.\n", getNom());
            niveauTraitrise++;
        }else{
            parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !\n");
        }
    }

    public void faireLeGentil(){
        if(nbConnaissance<1){
            parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.\n");
        }else{
            int don = getMoney()/20;
            int rand= (int)(Math.random()*nbConnaissance);

            //l'objet humain est tiré au hasard parmis les connaissances du taitre

            //cast de l'objet en Humain
            Humain ami =memoire[rand];

            String nomAmi = ami.getNom();
            parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+nomAmi+".\n");
            parler("Bonjour l'ami! Je voudrais vous aider en vous donnant "+don+" sous\n");
            ami.gagnerArgent(don);
            perdreArgent(don);
            String nom=getNom();
            ami.parler("Merci "+nom+"! Vous êtes quelqu'un de bien.\n");
            niveauTraitrise--;
        }
    }


}
