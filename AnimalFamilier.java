public class AnimalFamilier {
    private int age;
    private double taille;
    private double poids;
    private String couleur;

    public AnimalFamilier(int ageAnimal, double tailleAnimal, double poidsAnimal, String couleurAnimal){

        this.age = ageAnimal;
        this.taille = tailleAnimal;
        this.poids = poidsAnimal;
        this.couleur = couleurAnimal;

    }

    public static void manger(){
        
        System.out.println("Mon animal < Mouton > du nom de Junior mange parfois des herbes.");
    }

    public static void dormir(){
        System.out.println("Junior dort souvent à partir de 20h.");
    }

    public void afficher(){
        manger();
        System.out.println("Junior a " + this.age + " ans, sa taille fait depuis plus d'un ans " + this.taille + "cm, et pèse plus de " + this.poids + "kg. J'aime sa couleur qui est " + this.couleur + ".");
        dormir();
    }

    public static void main(String[] args) {
        AnimalFamilier myAnimal = new AnimalFamilier(8, 52, 15, "noir");

        myAnimal.afficher();
    }
}
