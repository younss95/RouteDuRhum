/**
 * Creation d'une classe cliente permettant de tester le programme de la route du rhum.
 *
 *
 * @author Younes Azirgui
 *
 */

public class Client {
    public static void main(String[] args) {
        Monocoque mo = new Monocoque("le abdel", new RouteAlizes());
        Multicoque mu = new Multicoque("le aziz", new Routedirecte());

        System.out.println(mo);
    }
}
