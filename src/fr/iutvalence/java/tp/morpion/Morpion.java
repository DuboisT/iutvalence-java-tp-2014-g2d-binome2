package fr.iutvalence.java.tp.morpion;

/**
 * Cette classe représente une partie du jeu morpion
 */
public class Morpion
{
	/**
	 * Le nombre de lignes de la grille du morpion
	 * 
	 */
	private static final int NOMBRE_DE_LIGNES = 3;
	
	/**
	 * Le nombre de colonnes de la grille du morpion
	 * 
	 */
	private static final int NOMBRE_DE_COLONNES = 3;
	
	/**
	 * nombre de cases dans la grille
	 */
	private static final int NOMBRE_DE_COUPS_POSSIBLES = 9;
	
	/**
	 * Le nombre de coup joués depuis le début de la partie
	 */
	private int nombreDeCoupsJoues;

	/**
	 * La grille
	 */
	private EtatCase[][] cases;

	/**
	 * Creer une nouvelle partie de morpion prête a jouer
	 * Creer une grille de case
	 * La grille est initialisée avec toutes les cases vides
	 */
	public Morpion()
	{
		this.cases = new EtatCase[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
		
		for (int numLigne = 0; numLigne < NOMBRE_DE_LIGNES; numLigne++)
			for (int numColonne = 0; numColonne < NOMBRE_DE_COLONNES; numColonne++)
				this.cases[numLigne][numColonne] = EtatCase.VIDE;
	}
	
	
	/**
	 * @return si la case est vide ou non
	 */
	public boolean estOccupe()
	{
		if (this.etat == EtatCase.VIDE)
			return false;
		return true;
	}

	
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire1()
	{	
		if ((this.cases[0][0] == this.cases[0][1]) && (this.cases[0][0] == this.cases[0][2]) && (this.cases[0][0]!= EtatCase.VIDE) );
			return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire2()
	{
		if ((this.cases[1][0] == this.cases[1][1]) && (this.cases[1][0] == this.cases[1][2]) && (this.cases[1][0] != EtatCase.VIDE) );
		return true;
	}
	
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire3()
	{
		if ((this.cases[2][0] == this.cases[2][1]) && (this.cases[2][0] == this.cases[2][2]) && (this.cases[2][0] != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire4()
	{
		if ((this.cases[0][0] == this.cases[1][0]) && (this.cases[0][0] == this.cases[2][0]) && (this.cases[0][0] != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire5()
	{
		if ((this.cases[0][1] == this.cases[1][1]) && (this.cases[0][1] == this.cases[2][1]) && (this.cases[0][1] != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire6()
	{
		if ((this.cases[0][2] == this.cases[1][2]) && (this.cases[0][2] == this.cases[2][2]) && (this.cases[0][2] != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire7()
	{
		if ((this.cases[0][0] == this.cases[1][1]) && (this.cases[0][0] == this.cases[2][2]) && (this.cases[0][0] != EtatCase.VIDE) );
		return true;
	}
	/**
	 * @return True si il y a victoire, false dans le cas inverse
	 */
	public boolean rechercheVictoire8()
	{
		if ((this.cases[0][2] == this.cases[1][1]) && (this.cases[0][2] == this.cases[2][0]) && (this.cases[1][1] != EtatCase.VIDE) );
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
	 * @param numLigne .
	 * @param numColonne .
	 */
	public void poserSymbole(int numLigne, int numColonne)
	{
		if (Joueur.symbole == Symbole.CROIX)
			this.cases[numLigne][numColonne] = EtatCase.CROIX;
		else
			this.cases[numLigne][numColonne] = EtatCase.ROND;
	}
	
	
	
	
	/**
	 * @param position position de la case
	 * @return la position d'une case(numero de ligne et numero de colonne)
	 */
	private EtatCase obtenirCase(Position position)
	{
		return this.cases[position.obtenirNumeroDeLigne()][position.obtenirNumeroDeColonne()];
	}

	/**
	 * methode qui permet le lancement du jeu
	 */


	public String toString()
	{
		String morpionAsciiArt = "";
		
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
		
				morpionAsciiArt += this.obtenirCase(new Position(numeroDeLigne,numeroDeColonne));
			morpionAsciiArt += "\n";
		}
		
		return morpionAsciiArt;
	}

	public void set(int numLigne)
	{
		this.numLigne = numLigne;
	}

	/**
	 * methode pour jouer au morpion
	 */
	public void jouer()
	{
		System.out.println("Lancement de la partie, le joueur CROIX commence: "
				+ "\nbonne chance !" + "\n    0      1      2" + "\n0|_0,0_||_0,1_||_0,2_|\n1|_1,0_||_1,1_||_1,2_| Voici un exemple de grille pour les coordonnées\n2|_2,0_||_2,1_||_2,2_|\n\n");
		while (this.nombreDeCoupsJoues < NOMBRE_DE_COUPS_POSSIBLES)
			if (this.nombreDeCoupsJoues % 2 != 0)
				Joueur.symbole = Symbole.CROIX;
		
				poserSymbole(numLigne,numColonne);
		
			

	}
}

