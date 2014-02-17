package fr.iutvalence.java.tp.morpion;

/**
 * @author duboitho
 * Classe permettant de lancer une partie de morpion
 */
public class LanceurPartieMorpion
{
	/**
	 * @param args
	 * creation et lancement d'une partie de morpion
	 */
	public static void main(String[] args)
	{
		Morpion game;
		game = new Morpion();
		game.jouer();
	}
}

 
