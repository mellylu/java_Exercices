package boucles;

public class Exercice1{

    public static void main (String[] args){
        int nb = Integer.parseInt(args[0]);
        for (int i=0; i<nb; ++i){
            var ligne = "";
            for (int j=0; j<nb; ++j){
                ligne = ligne.concat("*");
            }
            System.out.println(ligne);
        }
    }
}