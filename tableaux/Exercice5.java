package tableaux;

public class Exercice5 {
    public static void main (String[] args){
        Integer valMin = Integer.parseInt((args[0]));

        for (int i=0; i<args.length; ++i){
            if (Integer.parseInt((args[i])) < valMin){
                valMin = Integer.parseInt((args[i]));
            }
        }
        System.out.println("La valeur minimale de tous les chiffres de la liste est : " + valMin);
    }
}
