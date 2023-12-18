package boucles;


public class Exercice6{

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

        var ligne = "";
        for (int j=0; j<nb; ++j){
            ligne = ligne.concat(" ");
        }
        System.out.println(ligne);

        nb2=Integer.parseInt(args[0]);
        for (int i=0; i<nb; ++i){
            ligne = "";
            for (int j=0; j<nb-nb2; ++j){
            ligne = ligne.concat(" ");
            }


            for (int j=0; j<nb2; ++j){
                ligne = ligne.concat("*");
            }
            
            nb2 -= 1;
            
            System.out.println(ligne);
        }


    }
}