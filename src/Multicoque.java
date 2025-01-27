/**
 * Classe Multicoque qui decrit le type du voilier
 *  ( en l'occurence un type Multicoque )
 *
 *
 * @author Younes Azirgui
 *
 */



public class Multicoque extends Voilier{

    /**
     * Construit l'objet de type Multicoque
     *
     *
     *  @param nom nom du voilier
     *  @param suivreRoute la route que le voilier doit suivre
     */

    public Multicoque(String nom, SuivreRoute suivreRoute){
        super(nom, suivreRoute);
    }

    public String toString(){
        return super.toString() +"\n Le type du voilier est: multicoque";

    }
}
