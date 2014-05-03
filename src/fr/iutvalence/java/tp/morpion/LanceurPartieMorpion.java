package fr.iutvalence.java.tp.morpion;

/**
 * Application permettant de lancer une partie de morpion
 */
public class LanceurPartieMorpion
{
	/**
	 * creation et lancement d'une partie de morpion
	 * @param args parametre de la ligne de commande
	*/
	public static void main(String[] args)
	{
		Morpion partieDeMorpion = new Morpion();
		partieDeMorpion.jouer();
		System.out.println(partieDeMorpion);
	}
}

