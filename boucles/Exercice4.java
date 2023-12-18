package boucles;


public class Exercice4{

    public static void main (String[] args){
        int nb = Integer.parseInt(args[0]);

        int nb2 = nb;

        for (int i=0; i<nb; ++i){

            var ligne = "";
            nb2 -= 1;
            for (int j=0; j<nb2; ++j){
                ligne = ligne.concat(" ");
            }
            for (int j=0; j<nb-nb2; ++j){
            ligne = ligne.concat("*");
            }
            
            System.out.println(ligne);
        }
    }
}