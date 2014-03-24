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
	 * Constructeur de Case avec en parametre l'etat de la case
	 * @param etat L'etat de la case
	 */
	public Case(EtatCase etat)
	{
		this.etat = etat;
	}
	
	/**
	 * @return l'etat de la case
	 */
	public EtatCase obtenirEtat()
	{
		return this.etat;
	}


	@Override
	public String toString()
	{
		return this.etat.toString();
	}	
	
}
