package fr.iutvalence.java.tp.morpion;

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
	 */
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		this.numeroDeLigne = numeroDeLigne;
		this.numeroDeColonne = numeroDeColonne;
	}

	public int obtenirNumeroDeLigne()
	{
		return this.numeroDeLigne;
	}

	public int obtenirNumeroDeColonne()
	{
		return this.numeroDeColonne;
	}
}
