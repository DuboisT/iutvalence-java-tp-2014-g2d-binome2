package fr.iutvalence.java.tp.morpion;

/**
 * Cette classe représente une partie du jeu morpion
 */
public class Morpion
{
	/**
	 * la grille de la partie
	 */
	private Grille grille;

	/**
	 * le joueur 1 de la partie
	 */
	private Joueur joueur1;
	/**
	 * le joueur 2 de la partie
	 */
	private Joueur joueur2;

	// TODO écrire un commentaire plus précis (comment est initialisée la
	// grille)
	/**
	 * Creer une nouvelle partie de morpion prête a jouer Creer une grille de
	 * cases Prepare deux joueurs
	 */
	public Morpion()
	{
		this.grille = new Grille();
		this.joueur1 = new Joueur("le nom du joueur 1");
		this.joueur2 = new Joueur("le nom du joueur 2");
	}

	/**
	 * methode qui permet le lancement du jeu
	 */
	public void jouer()
	{
		System.out.println("Lancement de la partie");
	}

}
