package conditions;

public class Exercice2 {

    public static void main (String[] args){
        int a = Integer.parseInt(args[0]);
        System.out.println("A = " + a);
        if (a%2 == 0){
            System.out.println("Oui A est pair");
        }
        else{
            System.out.println("Non A est impair");
        }
    }
}
