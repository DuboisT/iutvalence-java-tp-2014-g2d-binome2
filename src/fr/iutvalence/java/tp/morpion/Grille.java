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
	private static final int NOMBRE_DE_CASES = 9;

	private Case[][] cases;
	
	/**
	 * construit les cases(vides par défaut) de la grille
	 */
	public Grille()
	{
		this.cases = new Case[LARGEUR_GRILLE][LONGUEUR_GRILLE];
		
		for (int numLigne = 0; numLigne < LARGEUR_GRILLE; numLigne++)
			for (int numColonne = 0; numColonne < LONGUEUR_GRILLE; numLigne++)
				this.cases[numLigne][numColonne] = new Case(EtatCase.VIDE);
	}
	
	
}
