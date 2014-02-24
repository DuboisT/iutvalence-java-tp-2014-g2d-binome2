package fr.iutvalence.java.tp.morpion;


/**
 * Definie la grille de jeu 
 */
public class Grille
{
	
	/**
	 * largeur constante de la grille du morpion
	 */
	private static final int LARGEUR_GRILLE = 3;
	/**
	 * longueur constante de la grille du morpion
	 */
	private static final int LONGUEUR_GRILLE = 3;
	//private static final int NOMBRE_DE_CASES = 9;
	/**
	 * longueur de la grille
	 */
	private int longueur;
	/**
	 * largeur de la grille
	 */
	private int largeur;
	//private int nbCase;

	/**
	 * Construit  les dimensions de la grille
	 */
	public Grille()
	{
		this.largeur = LARGEUR_GRILLE;
		this.longueur = LONGUEUR_GRILLE;
		//this.nbCase = NOMBRE_DE_CASES;
	}


	
}
