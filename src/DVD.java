public class DVD extends Document{
    private int duree;

    public DVD(String titre, int duree) {
        super(titre);
        this.duree = duree;
    }
    public void afficher(){
        super.afficher();
        System.out.println(this.duree);
    }
}