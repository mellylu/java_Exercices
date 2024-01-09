package string;

public class Exercice1 {
    public static void main (String[] args){
        String a = args[0];
        int cpt = 0;
        for (int i=0; i<a.length(); i++){
            if (i+1<=a.length()){
                if (a.substring(i, i+1).equals("e")){
                    cpt += 1;
                    
                }
            }
            
        }
        System.out.println("Il y a " + cpt + " e dans votre chaîne de caractère");
       }
}
