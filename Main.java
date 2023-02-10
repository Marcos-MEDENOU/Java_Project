import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

    // static void reverse(String tab){
    //     String[] strArray = tab.split(" ");
    //     int[] numArray = new int[strArray.length];
    //     for(int i = 0; i < strArray.length; i++){
    //         numArray[i] = Integer.parseInt(strArray[i]);
    //     }

    //     System.out.println(Arrays.toString(numArray));
    //     Arrays.sort(numArray);
    //     System.out.println(Arrays.toString(numArray));
    // }

    // static void myHyp(int x, int y){

    //     System.out.println(Math.hypot(x,y));
    // }

    // public static void tab(int[] tab){

    //     Arrays.sort(tab);
    //     System.out.println(Arrays.toString(tab));
    // }
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre d'élève dans votre classe");
        int num1 = scanner.nextInt();
        double moyenne = 0;
        // System.out.println("Entrez un opérateur");
        // char oper = scanner.next().charAt(0);
        String[] name = new String[num1];
        double[] notes = new double[num1];
        for(int i = 0; i < notes.length; ++i ){

            System.out.println("Entrez le nom de l'élève N° " + (i+1));
            String nom = scanner.nextLine();
            
            System.out.println("Entrez la note N° " + (i+1));
            double num2 = scanner.nextDouble();
            notes[i] = num2;
            name[i] = nom;

            moyenne += num2;
        }

        for(int j = 0; j < name.length; ++j)

        System.out.println(moyenne / num1);
        System.out.println(Arrays.toString(notes));
        System.out.println(Arrays.toString(name));
        System.out.println("L'étudiant " + name + " à la note " + notes);
        

        //char operator = oper.charAt(0);
        //scanner.nextLine();

        // switch (oper) {
        //     case '*':
        //         System.out.println(num1 * num2);
        //         break;

        //     case '+':
        //         System.out.println(num1 + num2);
        //         break;

        //     case '/':
        //         System.out.println(num1 / num2);
        //         break;

        //     case '-':
        //         System.out.println(num1 - num2);
        //         break;
        
        //     default:
        //         System.out.println("Vous n'avez saisi aucun opérateur");
        //         break;
        // }

        // reverse("1 -1 -9 45 3 15 2 0 0 987");
        // Main hypo = new Main();
        // int[] table = {-3, 5, 3, 0, 7, 1};
        // tab(table);
        // hypo.myHyp(3, 4);

    }





}