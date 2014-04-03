package fr.iutvalence.java.tp.morpion;

// TODO écrire un commentaire
// TODO réfléchir à l'utilité de cette classe
/**
 * Represente les cases
 */
public class Case
{
	/**
	 * attribut nous donnant l'etat de la case
	 */
	private EtatCase etat;

	/**
	 * Constructeur de Case en l'initialisant a l'état VIDE
	 */
	public Case()
	{
		this.etat = EtatCase.VIDE;

	}

	/**
	 * @return l'etat de la case
	 */
	public EtatCase obtenirEtat()
	{
		return this.etat;
	}

	/**
	 * 
	 */

	public String toString()
	{
		return this.etat.toString();
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
	 * @param etat
	 *            methode qui permet de modifier l'etat de la case en y mettant
	 *            un symbole
	 */
	public void modifierEtatCase(EtatCase etat)
	{
		this.etat = etat;
	}

}
