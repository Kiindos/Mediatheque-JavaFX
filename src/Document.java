public class Document {
    private String titre;
    private boolean disponible;

    public Document(String titre) {
        this.titre = titre;
        this.disponible = true;
    }
    public void afficher(){
        System.out.println(this.titre + " " + this.disponible);
    }
    public String getTitre() {
        return this.titre;
    }
}