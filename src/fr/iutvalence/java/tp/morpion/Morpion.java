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
	
	/**
	 * Creer une nouvelle partie de morpion prête a jouer
	 * Creer une grille de case
	 */
	public Morpion()
	{
		this.cases = new Case[NOMBRE_DE_LIGNE][NOMBRE_DE_COLONNE];
		
		for (int numLigne = 0; numLigne < NOMBRE_DE_LIGNE; numLigne++)
			for (int numColonne = 0; numColonne < NOMBRE_DE_COLONNE; numColonne++)
				this.cases[numLigne][numColonne] = new Case(EtatCase.VIDE);
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
	 * methode qui permet le lancement du jeu  en l'indiquant au joueur 
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



