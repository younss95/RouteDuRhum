/**
 * Creation d'une classe cliente permettant de tester le programme de la route du rhum.
 *
 *
 * @author Younes Azirgui
 *
 */

public class Client {

    /**
     * Création de deux voiliers avec leur routes associées
     */
    public static void main(String[] args) {
        Monocoque mo = new Monocoque("Voilier1", new RouteAlizes());
        Multicoque mu = new Multicoque("Voilier2", new Routedirecte());

        System.out.println(mo);
    }
}
