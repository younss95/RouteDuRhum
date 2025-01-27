public abstract class Voilier {

    private String nom;
    private SuivreRoute suivreRoute; // suivreRoute appartient à une classe qui implemente l'interface SuivreRoute


    public Voilier(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }

    public String toString() {
        return "Le nom du voilier est: "+ nom;
    }

    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.suivreRoute = suivreRoute;
    }

    public void appliqueSuivreRoute(SuivreRoute suivreRoute){
        suivreRoute.suivreRoute();

    }
}
