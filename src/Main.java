import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Liste des documents");
        Button boutonAjouter = new Button("Ajouter");
        Button boutonRechercher = new Button("Rechercher");

        TextField champTitre = new TextField();
        champTitre.setPromptText("Titre du document...");

        ListView<String> liste = new ListView<>();
        liste.getItems().add("Dune");
        liste.getItems().add("Inception");
        liste.getItems().add("Random Access Memories");

        HBox boutons = new HBox(10);
        boutons.getChildren().add(boutonAjouter);
        boutons.getChildren().add(boutonRechercher);

        VBox layout = new VBox(10);
        layout.getChildren().add(label);
        layout.getChildren().add(champTitre);
        layout.getChildren().add(liste);
        layout.getChildren().add(boutons);

        boutonAjouter.setOnAction(e -> {
            String titre = champTitre.getText();
            if (!titre.isEmpty()) {      // ← si pas vide
                liste.getItems().add(titre);
                champTitre.clear();
            }
        });

        boutonRechercher.setOnAction(e -> {
            // code exécuté au clic
            System.out.println("Recherche en cours...");
        });

        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Médiathèque");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}