package fr.iutvalence.java.tp.morpion;

/**
 * les joueurs de la partie
 */
public class Joueur
{
		/**
		 * le nom du joueur de la partie
		 */
		public String nomDeJoueur;
		
		/**
		 * le symbole associé au joueur en début de partie
		 */
		public static Symbole symbole;
	

	
	
	/**
	 * @param nomDeJoueur nom du joueur
	 * @param symbole le symbole associé au joueur
	 */
	public Joueur(String nomDeJoueur, Symbole symbole)
	{
		this.nomDeJoueur = nomDeJoueur;
		Joueur.symbole = symbole;
	}
	
	     
	/**
	 * @return le nom d'un joueur
	 */
	public String obtenirNomJoueur()
	{
		return this.nomDeJoueur;

	}

	/**
	 * @return le symbole du joueur
	 */
	public Symbole obtenirSymboleJoueur()
	{
		return Joueur.symbole;
	}

	/**
	 * @return le symbole
	 */
	public Symbole getSymbole()
	{
		return Joueur.symbole;
	}
}
