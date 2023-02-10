import java.util.Arrays;
import java.util.Collections;

public class Tableau {
    public static void sum() {

        int laSomme = 0;
        Integer[] num = {9, 7, 5, 3};
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println(Arrays.toString(num));
        
        for(int i = 0; i < num.length-1; i++){
            if( num.length <= 1){
                laSomme = 0;
            }else{
                laSomme += num[i] - num[i+1];
            }
        }
        System.out.println(laSomme);
    }
    public static void main(String[] args) {
        sum();
        
        
        String[][][] table = {
            {{"Eric", "Justin", "William", "Pacome"}},
            {{"Régine", "Damienne", "Solange", "Ella"}},
            {{"Justine", "Habib", "Edith", "Yves"}}
        };

        for(int i = 0; i < table.length; i++){
            System.out.println();
            for(int j = 0; j < table[i].length; j++){
                System.out.print(table[i][j] + " ");
            }
        }

        // System.out.println();

    }
}