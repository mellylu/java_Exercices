package string;

public class Exercice6 {
     public static void main (String[] args){
        String str = args[0];
        Integer cptVoyelle = 0;
        Integer cptConsonne = 0;
        String[] tabConsonne = {"z", "r", "t", "p", "q", "s", "d", "f", "g", "h", "j", "k", "l", "m", "w", "x", "c", "v", "b", "n"};
        for (int i=0; i<str.length(); i++){
            if (i+1<=str.length()){
                if (str.substring(i, i+1).equals("a") 
                || str.substring(i, i+1).equals("e")
                || str.substring(i, i+1).equals("i")
                || str.substring(i, i+1).equals("o")
                || str.substring(i, i+1).equals("u")
                || str.substring(i, i+1).equals("y")){
                    cptVoyelle += 1;
                }
                for (String consonne : tabConsonne) {
                    if (consonne.equals(str.substring(i, i+1).toLowerCase())) {
                        cptConsonne += 1;
                    }
                }
            }
        }
        System.out.println("Il y a " + cptVoyelle + " voyelles et " + cptConsonne + " consonnes dans votre chaîne de caractère");
       }
    }
