package conditions;

public class Exercice1 {

    public static void main (String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        if (c >= a && c <=b){
            System.out.println("Oui C est compris entre A et B");
        }
        else{
            System.out.println("Non C n'est compris entre A et B");
        }
    }
}
