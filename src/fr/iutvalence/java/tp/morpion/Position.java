package fr.iutvalence.java.tp.morpion;

/**
 * Classe définissant la position d'une case
 */
public class Position
{
	/**
	 * Le numéro de la ligne
	 */
	private final int numeroDeLigne;
	
	/**
	 * Le numéro de la colonne
	 */
	private final int numeroDeColonne;


	/**
	 * Construit une nouvelle position avec le numero de la ligne et le numéro de la colonne
	 * @param numeroDeLigne le numero de la ligne
	 * @param numeroDeColonne le numero de la colonne
	 */
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		this.numeroDeLigne = numeroDeLigne;
		this.numeroDeColonne = numeroDeColonne;
	}

	/**
	 * @return le numero de la ligne
	 */
	public int obtenirNumeroDeLigne()
	{
		return this.numeroDeLigne;
	}

	/**
	 * @return le numero de la colonne
	 */
	public int obtenirNumeroDeColonne()
	{
		return this.numeroDeColonne;
	}
}
