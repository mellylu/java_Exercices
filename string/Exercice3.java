package string;

public class Exercice3 {
    public static void main (String[] args){
        String str = args[0];
       
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
