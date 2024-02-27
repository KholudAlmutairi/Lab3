public class Book extends Media {
    private int stock;
    private Review[] reviews;
    private int reviewCount;

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new Review[10]; // Maximum 10 reviews per book
        this.reviewCount = 0;
    }
    // Getters
    public int getStock(){
        return stock;
    }

    public int getReviewCount(){
        return reviewCount;
    }
    //Setters
    public void setStock(int stock){
        this.stock=stock;
    }

    public void setReviewCount(int reviewCount){
        this.reviewCount=reviewCount;
    }


    public void addReview(Review review) {
        if (reviewCount < 10) {
            reviews[reviewCount++] = review;
        }
    }

    public double getAverageRating() {
        if (reviewCount == 0) return 0;
        double totalRating = 0;
        for (int i = 0; i < reviewCount; i++) {
            totalRating += reviews[i].getRating();
        }
        double Average=totalRating / reviewCount;
        return Average;
    }

    public void purchase(User user) {
        if (stock > 0) {
            user.addToPurchasedMedia(this);
            stock--;
            System.out.println("Book purchased: " + getTitle());
        } else {
            System.out.println("Book out of stock: " + getTitle());
        }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println(quantity + " copies of " + getTitle() + " have been restocked.");
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", quantityInStock=" + stock +
                '}';
    }
}
