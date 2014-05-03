package fr.iutvalence.java.tp.morpion;

/**
 * les joueurs de la partie
 */
public class Joueur
{
	/**
	 * le nom du joueur de la partie
	 */
	private final String nomDeJoueur;

	/**
	 * le symbole associé au joueur 
	 */
	private final Symbole symbole;

	/**
	 * Creation d'un joueur de nom et de symbole donnés
	 * @param nomDeJoueur
	 *            nom du joueur
	 * @param symbole
	 *            le symbole associé au joueur
	 */
	public Joueur(String nomDeJoueur, Symbole symbole)
	{
		this.nomDeJoueur = nomDeJoueur;
		this.symbole = symbole;
	}

	/**
	 * @return le nom d'un joueur
	 */
	public String obtenirNom()
	{
		return this.nomDeJoueur;

	}

	/**
	 * @return le symbole du joueur
	 */
	public Symbole obtenirSymbole()
	{
		return this.symbole;
	}
}
