package fr.iutvalence.java.tp.morpion;

/**
 * Classe qui défini les états possibles des cases
 */
public enum EtatCase
{
//<<<<<<< HEAD
	/**
	 * La case est vide
	 */
	VIDE,
	/**
	 * La case est occupée par un symbole ROND
	 */
	ROND,
	/**
	 * La case est occupée par un symbole CROIX
	 */
	CROIX;
		
	public String toString()
	{
		if (this == VIDE) return "|___|";
		else if (this == ROND) return "|_O_|";
		else return "|_X_|";
	}
}
