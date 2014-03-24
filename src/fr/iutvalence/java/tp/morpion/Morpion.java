package fr.iutvalence.java.tp.morpion;

/**
 * Cette classe représente une partie du jeu morpion
 */
public class Morpion
{
	/**
	 * Le nombre de ligne de la grille du morpion
	 */

	private static final int NOMBRE_DE_LIGNE = 3;
	
	/**
	 * Le nombre de colonne de la grille du morpion
	 * 
	 */
	private static final int NOMBRE_DE_COLONNE = 3;
	
	/**
	 * nombre de cases dans la grille
	 */
	private static final int NOMBRE_DE_CASES = 9;
	


	/**
	 * 
	 */
	private Case[][] cases;
	
	// TODO (done) écrire un commentaire plus précis (comment est initialisée la
	// grille)
	/**
	 * Creer une nouvelle partie de morpion prête a jouer
	 * Creer une grille de case
	 * La grille est initialisée avec toutes les cases vides
	 */
	public Morpion()
	{
		this.cases = new Case[NOMBRE_DE_LIGNE][NOMBRE_DE_COLONNE];
		
		for (int numLigne = 0; numLigne < NOMBRE_DE_LIGNE; numLigne++)
			for (int numColonne = 0; numColonne < NOMBRE_DE_COLONNE; numColonne++)
				this.cases[numLigne][numColonne] = new Case(EtatCase.VIDE);
	}
	
	
	public boolean placerSymbole(int ligne, int colonne)
	{
		if (EtatCase.Case[ligne][colonne] != Case(EtatCase.VIDE){
			return false;
		}
		else 
			this.cases[ligne][colonne] = Case(EtatCase.CROIX)
	}
	
	
	
	/**
	 * @param position position de la case
	 * @return la position d'une case(numero de ligne et numero de colonne)
	 */
	private Case obtenirCase(Position position)
	{
		return this.cases[position.obtenirNumeroDeLigne()][position.obtenirNumeroDeColonne()];
	}

	/**
	 * methode qui permet le lancement du jeu
	 */


	public String toString()
	{
		String morpionAsciiArt = "";
		
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNE; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNE; numeroDeColonne++)
		
				morpionAsciiArt += this.obtenirCase(new Position(numeroDeLigne,numeroDeColonne));
			morpionAsciiArt += "\n";
		}
		
		return morpionAsciiArt;
	}
}

