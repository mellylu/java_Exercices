package string;

public class Exercice2 {
    public static void main (String[] args){
        String a = args[0];
       
        for (int i=0; i<a.length(); i++){      
            System.out.println(a.substring(i, i+1));
        }
    }
}
