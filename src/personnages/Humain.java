package personnages;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Humain {
	private String nom;
	private String boissonFavorite;
	private int money;

	public Humain[] memoire = new Humain[30];

	public int nbConnaissance = 0;

	public Humain(String nom, String boissonFavorite, int money) {
		this.nom=nom;
		this.boissonFavorite=boissonFavorite;
		this.money=money;

		assert money>=0;
		assert nom!=null;
		assert boissonFavorite!=null;
		assert nbConnaissance>=0;
	}


	public void parler(String texte) {
		System.out.printf("("+getNom()+")"+" - "+texte);
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getBoisson() {
		return boissonFavorite;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void direBonjour() {
		System.out.printf("("+getNom()+") - "+"Bonjour ! Je m’appelle %s et j'aime boire du %s !\n", getNom(), getBoisson());
	}
	
	public void boire() {
		System.out.printf("Mmmm, un bon verre de %s ! GLOUPS !\n", getBoisson());
	}
	
	public void gagnerArgent(int gain) {
		money += gain;
	}
	
	public int perdreArgent(int perte) {
		money -= perte;
		return money;
	}
	
	public void acheter(String bien, int prix){
		if (prix>money) {
			System.out.printf("Je n'ai plus que %d sous en poche. Je ne peux même pas m'offrir %s à %d sous.\n",getMoney(),bien,prix);
		}
		else {
			System.out.printf("J'ai %d sous en poche. Je vais pouvoir m'offrir %s à %d sous.\n",money,bien,prix);
			perdreArgent(prix);
		}
	}

	public void memoriser(Humain humain){
		if (nbConnaissance < memoire.length){
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
		else {
			for (int i = 0; i < memoire.length-1; i++){
				memoire[i] = memoire[i+1];
			}
			memoire[memoire.length-1] = humain;
		}
	}

	public void listerConnaissance(){
		parler("Je connais beaucoup de monde dont :");
		for (int i =0; i<nbConnaissance; i++){
			if (i == nbConnaissance-1){
				System.out.printf(" %s.\n",memoire[i]);
			}
			else {
				System.out.printf(" %s,",memoire[i]);
			}
		}
	}

	public void repondre(Humain humain){
		direBonjour();
		memoriser(humain);
	}

	public void faireConnaissanceAvec(Humain humain){
		direBonjour();
		humain.repondre(this);
		memoriser(humain);

	}

}