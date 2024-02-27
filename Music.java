public class Music extends Media {
    private String artist;

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    //Getters
    public String getArtist(){
        return artist;
    }

    //Setters
    public  void setArtist(String artist){
        this.artist=artist;
    }


    public void listen(User user) {
        user.addToPurchasedMedia(this);
        System.out.println("Music listened: " + getTitle());
    }

    public void generatePlaylist(Music[] musicCatalog) {

    }

    @Override
    public String getMediaType() {
        return getPrice() >= 10 ? "Premium Music" : "Music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + getTitle() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", artist='" + artist + '\'' +
                '}';
    }
}