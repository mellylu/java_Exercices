package boucles;


public class Exercice7{


    public static void main (String[] args){
        int nb = Integer.parseInt(args[0]);
        for (int i=1; i<=nb; ++i){
            int resultat = nb * i;
            // System.out.printf("%nb" + " X " + "%i" + " = " + "%resultat", nb, i+1, resultat);
            System.out.println(nb + " X " + i + " = " + resultat);
        }
    }
}