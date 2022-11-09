package personnages;

public class Yakuza extends Humain{

    private String clan;
    private int reputation=0;

    public Yakuza(String nom, String boissonFavorite, int money, String clan) {
        super(nom, boissonFavorite, money);
        this.clan=clan;

    }

    public void extorquer(Commercant victime){
        int argent=victime.seFaireExtorquer(victime.getMoney());
        System.out.printf("("+getNom()+") - "+"%s, si tu tiens à la vie donne moi ta bourse !\n",victime.getNom());
        reputation++;
        gagnerArgent(argent);
        victime.perdreArgent(argent);
        victime.parler("J'ai tout perdu! Le monde est trop injuste...\n");
        System.out.printf("("+getNom()+") - "+"J'ai piqué les %d sous de %s, ce qui me fait %d sous dans ma bourse. Hi ! Hi !\n",argent,victime.getNom(),getMoney());
    }

}
