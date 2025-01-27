package Commande;

/**
 * Classe abstraite Commande.Voilier qui creer un Commande.Voilier qui possède un nom et une route à suivre
 *
 *
 *
 * @author Younes Azirgui
 *
 */


public abstract class Voilier {


    /**
     * Nom du voilier.
     */
    private String nom;


    /**
     * Route à suivre.
     */
    private SuivreRoute suivreRoute; // suivreRoute appartient à une classe qui implemente l'interface Commande.SuivreRoute


    /**
     * Constructeur de la classe Commande.Voilier qui prend en parametre un nom et une route à suivre
     * @param nom nom du voilier
     * @param suivreRoute route à suivre
     *
     */
    public Voilier(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }


    /**
     * Methode toString qui retourne une chaine de caractere avec le nom du voilier.
     *
     * @return nom du voilier
     */
    public String toString() {
        return "Le nom du voilier est: "+ nom;
    }



    /**
     * Définit la route à suivre pour le voilier.
     *
     * @param suivreRoute nouvelle route à suivre
     */

    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.suivreRoute = suivreRoute;
    }


    /**
     * Applique la route à suivre pour le voilier.
     *
     * @param suivreRoute route à suivre
     */
    public void appliqueSuivreRoute(SuivreRoute suivreRoute){
        suivreRoute.suivreRoute();

    }
}
