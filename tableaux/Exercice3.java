package tableaux;

public class Exercice3 {

    public static void main (String[] args){
        Integer resultat = 0;

        for (int i=0; i<args.length; ++i){
            resultat += Integer.parseInt((args[i]));
        }
        
        System.out.println("La somme de tous les chiffres de la liste est : " + resultat);

    }
}
