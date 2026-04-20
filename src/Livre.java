public class Livre extends Document {
    private String auteur;
    private int annee;

    public Livre(String titre, String auteur, int annee) {  // pas de disponible
        super(titre);
        this.auteur = auteur;
        this.annee = annee;
    }
    public void afficher(){
        super.afficher();
        System.out.println(this.auteur);
        System.out.println(this.annee);
    }
}