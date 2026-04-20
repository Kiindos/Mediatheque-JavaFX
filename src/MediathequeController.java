import javafx.scene.control.ListView;

public class MediathequeController {
    private Mediatheque mediatheque;
    private ListView<String> liste;

    public MediathequeController(Mediatheque mediatheque, ListView<String> liste) {
        this.mediatheque = mediatheque;
        this.liste = liste;
    }

    public void ajouterDocument(String titre) {
        this.mediatheque.ajouter(new Livre(titre, "Inconnu", 2024));
        liste.getItems().add(titre);
    }
}