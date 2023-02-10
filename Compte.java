public class Compte {

    private int solde;

    public Compte(int solde){

        this.solde = solde;

        System.out.println("Vous avez éffectué un dépôt de " + this.solde + " FCA");
    }

    /**
     * Methode permettant d'éffectuer toutes les opérations concernant les dépôts
     */
    public void depot(){
        System.out.println("Votre solde actuel est de " + this.solde + " FCFA");
    }
        
    
    /**
     * Methode permettant d'éffectuer toutes les opérations concernant les retraits
     */
    
    public void retrait(int montant){
        this.solde -= montant;
        System.out.println("Vous avez fait un retrait de " + montant + " FCFA et votre nouveau solde est de " + this.solde + " FCFA");
    }


    /**
     * Methode permettant d'éffectuer toutes les opérations concernant les virements
     */

    public void virement(int montantVerse){
        this.solde += montantVerse;
        System.out.println("Vous avez reçu un virement de " + montantVerse + " FCFA et votre nouveau solde est de " + this.solde + " FCFA");
    }

    
    /**
     * Methode pour afficher toutes les opérations
     */
    public void afficher(){
        virement(200000);
    }

}
