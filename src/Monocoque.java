/**
 * Classe Monocoque qui decrit le type du voilier
 *
 *
 * @author Younes Azirgui
 *
 */


public class Monocoque extends Voilier{


    /**
     * Construit l'objet de type Monocoque
     *
     *
     *  @param name identifiant de commande
     *  @param suivreRoute identifiant de produit
     */
    public Monocoque(String name, SuivreRoute suivreRoute){
        super(name, suivreRoute);

    }


    /**
     * Conversion de l'objet en chaine de caracteres.
     *
     * @return le type du voilier
     */

    public String toString(){
        return super.toString() +"\n Le type du voilier est: mutlicoque";

    }
}
