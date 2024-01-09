package tableaux;

public class Exercice6 {
    public static void main (String[] args){
        Integer valProcheZero = Integer.parseInt((args[0]));
        // Integer[] listeValNegatives = new Integer[];
        Integer valProcheZeroPositive = 100;
        Integer valProcheZeroNegative = -100;

        for (int i=0; i<args.length; ++i){
            if (Integer.parseInt((args[i])) < 0){
                if(Integer.parseInt((args[i])) > valProcheZeroNegative){
                    valProcheZeroNegative = Integer.parseInt((args[i]));
                }
            }
            if (Integer.parseInt((args[i])) > 0){
                if(Integer.parseInt((args[i])) < valProcheZeroPositive){
                    valProcheZeroPositive = Integer.parseInt((args[i]));
                }
            }
            if (Integer.parseInt((args[i])) == 0){
                valProcheZero = Integer.parseInt((args[i]));
                break;
            }
            
        }
        
        if (-valProcheZeroNegative == valProcheZeroPositive){
            System.out.println("Les valeurs les plus proches de 0 par rapport à tous les chiffres de la liste sont : " + valProcheZeroPositive + " et " + valProcheZeroNegative);
        }
        else{
            if (-valProcheZeroNegative > valProcheZeroPositive){
                valProcheZero = valProcheZeroPositive;
            }
            if (-valProcheZeroNegative < valProcheZeroPositive){
                valProcheZero = valProcheZeroNegative;
            }
            System.out.println("La valeur la plus proche de 0 par rapport à tous les chiffres de la liste est : " + valProcheZero);
        
        }
        
    }
}
