import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

// Exercice 1
/* Ecrire un programme qui demande à l'utilisateur de saisir le nombre d'étudiant dans sa classe et ensuite saisir l'ensemble des notes et afficher la moyen de la classe */

// Exercice 2
/*
 * Ecrire un programme qui permet d'afficher l'ensemble des étudiants de votre tableau et leurs notes respectives
 */

public class DetailEtudiant {
    
    public static void method() {
        int k = 5 ;
        String val = (((Object)k).getClass().getSimpleName());
        System.out.println(val);
        String g =null;
        double sum = 0;
        
        do{ 
            try {
                System.out.println("Veuillez saisir le nombre d'étudiant");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                g = (((Object)number).getClass().getSimpleName());
                // System.out.println(g);
                String[] name = new String[number];
                String[] prenom = new String[number];
                String[] filiere = new String[number];
                String[] nationalite = new String[number];
                int[] age = new int[number];
                double[] notes = new double[number];
                for(int i = 0; i < notes.length; i++) {
                    scanner.nextLine();

                    System.out.println("Veuillez entrer le nom de l'étudiant n° " + (i+1));
                    String nom = scanner.nextLine();
                    name[i] = nom;

                    System.out.println("Veuillez entrer le prénom de l'étudiant n° " + (i+1));
                    String fname = scanner.nextLine();
                    prenom[i] = fname;

                    System.out.println("Veuillez entrer l'age de l'étudiant n° " + (i+1));
                    int old = scanner.nextInt();
                    age[i] = old;
                    scanner.nextLine();

                    System.out.println("Veuillez entrer la filière de l'étudiant n° " + (i+1));
                    String filed = scanner.nextLine();
                    filiere[i] = filed;

                    System.out.println("Veuillez entrer la nationalité de l'étudiant n° " + (i+1));
                    String nation = scanner.nextLine();
                    nationalite[i] = nation;

                    // System.out.println("Veuillez entrer la note de l'étudiant n° " + (i+1));
                    // double marks = scanner.nextDouble();
                    // notes[i] = marks;


                    // sum += marks;
                }

                // for(int z = 0; z < name.length; z++)
                // {
                //     System.out.println("Nom : " + name[z] + " et sa note : " + notes[z]);
                // }
        
        //  System.out.println("La moyenne de la classe est " + sum / number);
         System.out.println(Arrays.toString(name));
         System.out.println(Arrays.toString(prenom));
         System.out.println(Arrays.toString(age));
         System.out.println(Arrays.toString(filiere));
         System.out.println(Arrays.toString(nationalite));
        //  System.out.println(Arrays.toString(notes));
        break;
            } catch (InputMismatchException e) {
                System.out.println("Vous n'avez pas entrer la bonne valeur");
            }    
        }while(val != g);       
        // System.out.println("Vous avez " + number + " étudiants");

    }
    
    public static void main(String[] args) {
        method();
    }
}
