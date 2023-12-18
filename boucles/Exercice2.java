package boucles;


public class Exercice2{


    public static void main (String[] args){
        int nb = Integer.parseInt(args[0]);
        int nb2 = 1;
        for (int i=0; i<nb; ++i){
            var ligne = "";
            for (int j=0; j<nb2; ++j){
                ligne = ligne.concat("*");
            }
            nb2 += 1;
            System.out.println(ligne);
        }
    }
}