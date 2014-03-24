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
	private EtatCase etatcase;
	
	/**
	 * Constructeur de Case avec en parametre l'etat de la case
	 * @param etatCase L'etat de la case
	 */
	public Case(EtatCase etatCase)
	{
		this.etatcase = etatCase;
	}

	@Override
	public String toString()
	{
		return this.etatcase.toString();
	}	
	
}
