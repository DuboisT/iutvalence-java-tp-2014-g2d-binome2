package fr.iutvalence.java.tp.morpion;

/**
 * Cette classe représente une partie du jeu morpion
 */
public class Morpion
{
	
	/**
	 * Initialisation du symbole du joueur 1 en Croix
	 */
	public final Symbole SYMBOLE_JOUEUR_1 = Symbole.CROIX;
	
	/**
	 * Initialisation du symbole du joueur 2 en Rond
	 */
	public final Symbole SYMBOLE_JOUEUR_2 = Symbole.ROND;
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
	private static final int NOMBRE_DE_COUPS_POSSIBLES = 9;
	
	/**
	 * Le nombre de coup joués depuis le début de la partie
	 */
	private int nbCoup;


	/**
	 * 
	 */
	private Case[][] cases;
	
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
				this.cases[numLigne][numColonne] = new Case();
	}
	
	
	
	
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire1()
	{	
		if ((this.cases[0][0].obtenirEtat() == this.cases[0][1].obtenirEtat()) && (this.cases[0][0].obtenirEtat() == this.cases[0][2].obtenirEtat()) && (this.cases[0][0].obtenirEtat() != EtatCase.VIDE) );
			return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire2()
	{
		if ((this.cases[1][0].obtenirEtat() == this.cases[1][1].obtenirEtat()) && (this.cases[1][0].obtenirEtat() == this.cases[1][2].obtenirEtat()) && (this.cases[1][0].obtenirEtat() != EtatCase.VIDE) );
		return true;
	}
	
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire3()
	{
		if ((this.cases[2][0].obtenirEtat() == this.cases[2][1].obtenirEtat()) && (this.cases[2][0].obtenirEtat() == this.cases[2][2].obtenirEtat()) && (this.cases[2][0].obtenirEtat() != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire4()
	{
		if ((this.cases[0][0].obtenirEtat() == this.cases[1][0].obtenirEtat()) && (this.cases[0][0].obtenirEtat() == this.cases[2][0].obtenirEtat()) && (this.cases[0][0].obtenirEtat() != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire5()
	{
		if ((this.cases[0][1].obtenirEtat() == this.cases[1][1].obtenirEtat()) && (this.cases[0][1].obtenirEtat() == this.cases[2][1].obtenirEtat()) && (this.cases[0][1].obtenirEtat() != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire6()
	{
		if ((this.cases[0][2].obtenirEtat() == this.cases[1][2].obtenirEtat()) && (this.cases[0][2].obtenirEtat() == this.cases[2][2].obtenirEtat()) && (this.cases[0][2].obtenirEtat() != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire7()
	{
		if ((this.cases[0][0].obtenirEtat() == this.cases[1][1].obtenirEtat()) && (this.cases[0][0].obtenirEtat() == this.cases[2][2].obtenirEtat()) && (this.cases[0][0].obtenirEtat() != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire8()
	{
		if ((this.cases[0][2].obtenirEtat() == this.cases[1][1].obtenirEtat()) && (this.cases[0][2].obtenirEtat() == this.cases[2][0].obtenirEtat()) && (this.cases[1][1].obtenirEtat() != EtatCase.VIDE) );
		return true;
	}
	
	/**
	 * Recherche pour tous les cas de victoires possibles
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire()
	{

			if (rechercheVictoire1() == false )
				if (rechercheVictoire2() == false)
					if (rechercheVictoire3() == false)
						if (rechercheVictoire4() == false)
							if (rechercheVictoire5() == false)
								if (rechercheVictoire6() == false)
									if (rechercheVictoire7() == false)
										if (rechercheVictoire8() == false)
											return false;
			return true;
			
		
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


	/**
	 * methode pour jouer au morpion
	 */
	public void jouer()
	{
		new Morpion();
		System.out.println("Lancement de la partie, le joueur CROIX commence: "
				+ "\nbonne chance !" + "\n    0      1      2" + "\n0|_0,0_||_0,1_||_0,2_|\n1|_1,0_||_1,1_||_1,2_| Voici un exemple de grille pour les coordonnées\n2|_2,0_||_2,1_||_2,2_|\n\n");
		//while (this.nbCoup < NOMBRE_DE_COUPS_POSSIBLES)
			
			
				
			
			

			
		
	}
}

