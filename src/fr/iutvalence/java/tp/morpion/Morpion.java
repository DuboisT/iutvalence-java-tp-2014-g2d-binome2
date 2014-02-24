package fr.iutvalence.java.tp.morpion;

/**
 * Cette classe représente une partie du jeu morpion
 */
public class Morpion
{
	/**
	 * le grille de cette partie
	 */
	private Grille grille;
	/**
	 * le joueur 1 de cette partie
	 */
	private Joueur joueur1;
	/**
	 * le joueur 2 de cette partie
	 */
	private Joueur joueur2;

	
	/**
	 * Creer une nouvelle partie de morpion prête a jouer
	 * Creer une grille vide
	 * Prepare deux joueurs
	 */
	public Morpion()
	{
		this.grille = new Grille();
		this.joueur1 = new Joueur("le nom du joueur 1");
		this.joueur2 = new Joueur("le nom du joueur 2");
	}
	
	
	// TODO (done) écrire un commentaire plus précis
	/**
	 * methode qui permet le lancement du jeu  en l'indiquant au joueur 
	 */
	public void jouer()
	{
		System.out.println("Lancement de la partie");
	}

}


