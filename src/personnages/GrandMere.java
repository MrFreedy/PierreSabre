package personnages;

import java.util.Objects;

public class GrandMere extends Humain{

    private static final String boissonFavorite = "tissane";
    private TypeHumain[] types = TypeHumain.values();

    public GrandMere(String nom, int money) {
        super(nom, boissonFavorite, money);
    }

    @Override

    public void memoriser(Humain humain) {
        if (nbConnaissance < 4) {
            memoire[nbConnaissance] = humain;
            nbConnaissance++;
        }else {
            parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !\n");
        }
    }

    public String humainHasard(){
        //faire en sorte qu'on obtienne différents
        int hasard = (int) (Math.random() * nbConnaissance);
        return types[hasard].toString();
    }

    public void ragoter(){
        for(int i =0; i<nbConnaissance; i++){
            parler("J'ai entendu dire que "+memoire[i].getNom()+" était "+humainHasard()+".\n");
            //if humainHasard()==TypeHumain.TRAITRE alors parler("J'ai entendu dire que "+memoire[i].getNom()+" était "+humainHasard()+".\n");
            if(humainHasard().equals("traitre")){
                parler("Je sais que "+memoire[i].getNom()+" est un "+humainHasard()+". Petit chenapan!\n");
            }

            }
        }



}
