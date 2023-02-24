/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author Julien Couderc
 */
public class Sapins
{
    /**
     * permet de retourner une chaîne de caractères avec nb caractères car identiques
     * @param nb  nombre de caractères de la chaîne
     * @param car caractère constituant la chaîne
     * @return la chaîne de caractères de nb caractères car
     */
    public static String genererStringLigne (int nb, char car){
        int compteur = nb;
        String ligne = "" ;
            while (compteur > 0 ) {
                ligne = ligne + car;
                compteur = compteur - 1 ;
                
            }
            
        

        return ligne; 
    }

     /**
     * permet de retourner une chaîne de caractères représentant le sapin plein demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin plein
     */
    public static String genererSapinPlein (int h){
        String sapin = "";
        int compteur = 0 ;
        int nb_espaces = h - 1;
        int nb_etoiles = 1;
        while (compteur < h ){
            sapin = sapin + genererStringLigne(nb_espaces, ' ');
            sapin = sapin + genererStringLigne(nb_etoiles, '*') +"\n";
            nb_espaces = nb_espaces - 1;
            nb_etoiles = nb_etoiles + 2 ;
            compteur = compteur + 1 ;
            
        }
        System.out.print(sapin);
        return sapin; // A modifier
    }


    /**
     * permet de retourner une chaîne de caractères représentant le sapin vide demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin vide
     */
    public static String genererSapinVide (int h){
        String sapin = "";
        int compteur = 1;
        int nb_espace = h - 1;
        int nb_espace_etoiles = 1;
        int socle = (h*2)-1;
        while (compteur < h ){
            if (compteur > 2){
                nb_espace_etoiles = nb_espace_etoiles + 2;
            }
            sapin = sapin + genererStringLigne (nb_espace, ' ') + '*';
            if (compteur > 1 ){
                sapin = sapin + genererStringLigne(nb_espace_etoiles,' ') + '*';
            }
            sapin = sapin + '\n';
            nb_espace = nb_espace - 1;
            compteur = compteur + 1 ;
        }
        
        sapin = sapin + genererStringLigne(socle, '*');
        
        System.out.print(sapin);
        return sapin;
    }

    /**
     * permet de retourner une chaîne de caractères représentant le sapin couche demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin couche
     */
    public static String genererSapinCouche (int h) {
        String sapin = "";
        int compteur = 0;
        int nb_etoiles = 1;
        while (compteur < h){
            nb_etoiles = nb_etoiles + 1;
            sapin = sapin + genererStringLigne(nb_etoiles, '*') + "\n";
            compteur = compteur + 1;
        }
        while (compteur >= 1){
            nb_etoiles = nb_etoiles - 1;
            sapin = sapin + genererStringLigne(nb_etoiles, '*') + "\n";
            compteur = compteur - 1;
        }
        
        System.out.print(sapin);
        return sapin;
    }

    public static void main (String [] args){
        genererSapinPlein(5);   
    }
   
}
