import java.util.ArrayList;

public class Mediatheque {
    private ArrayList<Document> documents;

    public Mediatheque() {
        this.documents = new ArrayList<>();
    }
    public void  ajouter(Document d){
        documents.add(d);
    }
    public void  afficherTous(){
        for (Document d : documents) {
            d.afficher();
        }
    }
    public Document chercher(String titre){
        for (Document d : documents) {
            if (d.getTitre().equals(titre)){
                return d;
            }
        }
        return null;
    }


}