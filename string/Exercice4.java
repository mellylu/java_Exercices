package string;

public class Exercice4 {
    
    public static void main (String[] args){
        String str = args[0];
        String newStr = "";
        for (int i=0; i<str.length(); i++){
            if ((i+1)%2==1){
                newStr += str.substring(i, i+1);
            }
        }
        System.out.println(newStr);
    }
}
