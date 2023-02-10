public class OperationBank {
    
    public static void main(String[] args) {
        Compte compte1 = new Compte(500000);
        Compte compte2 = new Compte(100000);
        compte1.depot();
        compte2.depot();
        compte2.retrait(10000);
        compte2.afficher();
    }
}
