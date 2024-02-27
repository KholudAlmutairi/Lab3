public class User {
    private String username;
    private String email;
    private Media[] purchasedMedia;
    private Media[] shoppingCart;
    private int purchasedMediaCount;
    private int shoppingCartCount;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMedia = new Media[10]; // Maximum 10 purchased media
        this.shoppingCart = new Media[10]; // Maximum 10 items in shopping cart
        this.purchasedMediaCount = 0;
        this.shoppingCartCount = 0;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void addToCart(Media media) {
        if (shoppingCartCount < 10) {
            shoppingCart[shoppingCartCount++] = media;
        }
    }

    public void removeFromCart(Media media) {
        for (int i = 0; i < shoppingCartCount; i++) {
            if (shoppingCart[i].equals(media)) {
                // Shift remaining elements to the left
                for (int j = i; j < shoppingCartCount - 1; j++) {
                    shoppingCart[j] = shoppingCart[j + 1];
                }
                shoppingCartCount--;
                break;
            }
        }
    }

    public void checkout() {
        // Transfer items from shopping cart to purchased media
        for (int i = 0; i < shoppingCartCount; i++) {
            if (purchasedMediaCount < 10) {
                purchasedMedia[purchasedMediaCount++] = shoppingCart[i];
            }
        }
        // Clear the shopping cart
        shoppingCart = new Media[10];
        shoppingCartCount = 0;
    }

    public void addToPurchasedMedia(Media media) {
        if (purchasedMediaCount < 10) {
            purchasedMedia[purchasedMediaCount++] = media;
        }
    }
}
