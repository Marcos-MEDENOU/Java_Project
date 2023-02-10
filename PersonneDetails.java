public class PersonneDetails {
    private String nom ;
    private String prenom ;
    private int age ;

    public PersonneDetails(){
        this.prenom = "Eric";
        this.nom = "ADANVOESSI";
        System.out.println("mon nom est : " + this.nom + " et mon prénom est : " + this.prenom + ".");
    }

    public PersonneDetails(int age){
        this.prenom = "Eric";
        this.nom = "ADANVOESSI";
        this.age = age;
        System.out.println("mon nom est : " + this.nom + ", mon prénom est : " + this.prenom + " et j'ai " + this.age + " ans.");
    }

    public void anniversaire(){
        this.age += 1;
        System.out.println("Mon age actuel augmente de 1 et fait maintenant " + this.age +".");
    }

    public void setNom(String nom){
        this.nom = nom;
        
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setAge(int age){
        this.age = age;

    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public int getAge(){
        return this.age;
    }

    public void afficher(){
        System.out.println("Mon nom au complet est : " + this.nom + " " + this.prenom + " et j'ai actuellement " + this.age + " ans.");
    }

}
