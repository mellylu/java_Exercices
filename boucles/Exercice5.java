package boucles;


public class Exercice5{

    public static void main (String[] args){
        int nb = Integer.parseInt(args[0]);
        
        var cpt = 0;
       
        
        for (int j=0; j<nb; ++j){
            var y = Math.round((nb-cpt)/2);
            cpt += 1;
            var ligne = "";
            for (int i=0; i<y; ++i){
                ligne = ligne.concat(" ");
            }
            for (int i=0; i<cpt; ++i){
                ligne = ligne.concat("*");
                // if(cpt > 1){
                // }
            }
            for (int i=0; i<y; ++i){
                ligne = ligne.concat(" ");
            }
            
            // y-=1;
            System.out.println(ligne);
        }


        //     var ligne = "";
        //     nb2 -= 1;
            
        //     for (int j=0; j<nb2; ++j){
        //         ligne = ligne.concat(" ");
        //     }
        //     for (int j=0; j<nb-nb2; ++j){
        //     ligne = ligne.concat("*");
        //     }
            
            
        // }
    }
}