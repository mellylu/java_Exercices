package tableaux;

public class Exercice4 {
    public static void main (String[] args){
        Integer valMax = Integer.parseInt((args[0]));

        for (int i=0; i<args.length; ++i){
            if (Integer.parseInt((args[i])) > valMax){
                valMax = Integer.parseInt((args[i]));
            }
        }
        
        System.out.println("La valeur maximale de tous les chiffres de la liste est : " + valMax);
    }
}
