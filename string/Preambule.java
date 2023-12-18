package string;

public class Preambule {
    public static void main (String[] args){
        String a = args[0];
        System.out.println("Voici votre chaine de caractère : " + a);
        System.out.println("La longueur de votre chaine est : " + a.length());
        System.out.println("Le premier caractère est : " + a.substring(0, 1));
    }
}
