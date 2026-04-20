public class CD extends Document{
    private String artiste;

    public CD(String titre, String artiste) {
        super(titre);
        this.artiste = artiste;
    }
    public void afficher(){
        super.afficher();
        System.out.println(this.artiste);
    }
}