package string;

public class Exercice5 {
    public static void main (String[] args){
        String str = args[0];
        String newStr = "";
        for (int i=0; i<str.length(); i++){

                newStr += str.substring(str.length()-i-1, str.length()-i);
            
        }
        System.out.println(newStr);
    }
}
