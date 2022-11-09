package personnages;

public class Yakuza extends Humain{

    private String clan;
    public int reputation=0;

    public Yakuza(String nom, String boissonFavorite, int money, String clan) {
        super(nom, boissonFavorite, money);
        this.clan=clan;

    }

    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
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

    public int perdre(){
        reputation--;
        System.out.printf("("+getNom()+") - "+"J'ai perdu mon duel et mes %s sous, snif... J'ai déshonoré le clan de %s.\n",getMoney(),getClan());
        return perdreArgent(getMoney());
    }

    public void gagner(int gain){
        reputation++;
        int argent=gain;
        gagnerArgent(argent);
        System.out.printf("("+getNom()+") - "+"Ce ronin pensait vraiment battre %s du clan de %s ? Je l'ai dépouillé de ses %d sous.\n",getNom(),getClan(),argent);

    }

}
