package fr.iutvalence.java.tp.morpion;

public class Joueur
{
		/**
		 * le nom du joueur de la partie
		 */
		private final String nomDeJoueur;
		
		/**
		 * le symbole associé au joueur en début de partie
		 */
		private final String symbole;
	

	
	
	/**
	 * @param nomDeJoueur nom du joueur
	 * @param symbole le symbole associé au joueur
	 */
	public Joueur(String nomDeJoueur, String symbole)
	{
		this.nomDeJoueur = nomDeJoueur;
		this.symbole = symbole;
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
	public String obtenirSymboleJoueur()
	{
		return this.symbole;
	}
}
