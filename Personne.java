public class Personne {
    public static void main(String[] args) {

        PersonneDetails personneDetail = new PersonneDetails();

        PersonneDetails personneDetail2 = new PersonneDetails(25);

        personneDetail2.anniversaire();

        personneDetail2.setNom("AMELAGODJI");
        personneDetail2.getNom();

        personneDetail2.setPrenom("Jean");
        personneDetail2.getPrenom();

        personneDetail2.setAge(22);
        personneDetail2.getAge();
        
        personneDetail2.afficher();
    }
}
