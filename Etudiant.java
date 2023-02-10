public class Etudiant {

    private String nom;
    private String prenom;
    private String filiere;
    private String nationalite;
    private int age;

    public Etudiant(String lName, String fName, int old, String filed, String contry){

        this.nom = lName;
        this.prenom = fName;
        this.age = old;
        this.filiere = filed;
        this.nationalite = contry;
    }

    
}