package Commande;

/**
 * Classe Route Alizes qui implemente l'interface Commande.SuivreRoute
 * et qui renvoie la route à suivre ( en l'occurence la route Alizes )
 *
 *
 * @author Younes Azirgui
 *
 */



public class RouteAlizes implements SuivreRoute {


    /**
     * Affiche "Route Alizes" dans la console
     *
     */

    public void suivreRoute(){
        System.out.println("Route Alizes");
    }
}
