public class Movie extends Media {
    private int duration; // in minutes

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public void watch(User user) {
        user.addToPurchasedMedia(this);
        System.out.println("Movie watched: " + getTitle());
    }

    public void recommendSimilarMovies(Movie[] movieCatalog) {

    }

    @Override
    public String getMediaType() {
        return duration >= 120 ? "Long Movie" : "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + getTitle() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", duration=" + duration +
                '}';
    }
}