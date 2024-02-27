public class Main {
    public static void main(String[] args) {
        // Create instances of various books, movies, and music items
        Book b1 = new Book("Book Title 1: THE FIRST 90 DAYS" , "Author 1: Michael D.Watkins", "ISBN1", 30.0, 10);
        Book b2 = new Book("Book Title 2: ENGLISH PRONUNCIATION IN USE", "Author 2 : Mark Hanconk", "ISBN2", 25.0, 7);
        Movie movie1 = new Movie("Movie Title 1:Interstellar", "Director 1 :Christopher Nolan", "ISBN3", 25.0, 150);
        Music music1 = new Music("Music Title 1:  Grateful", "Artist 1: Neffex", "ISBN4", 12.0, "Singer 1");
        Novel novel1 = new Novel("Novel Title 1 : Girl In Pieces", "Author 3: Kathleen Glasgow", "ISBN5", 18.0, 8, "Fiction");
        AcademicBook academicBook1 = new AcademicBook("Academic Book Title 1:Networking A Beginner’s Guide", "Author 4", "ISBN6", 30.0, 15, "Network");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(movie1);
        System.out.println(music1);
        System.out.println(novel1);
        System.out.println(academicBook1);
        // Add media items to the store's available media list
        Store store = new Store();
        store.addMedia(b1);
        store.addMedia(b2);
        store.addMedia(movie1);
        store.addMedia(music1);
        store.addMedia(novel1);
        store.addMedia(academicBook1);

        // Create users
        User user1 = new User("User1: Kholud22", "Kholud22@gmail.com");
        User user2 = new User("User2: Mohammed20", "Mohammed20@hotmail.com");

        // Add users to the store
        store.addUser(user1);
        store.addUser(user2);
       // store.displayUsers();
        store.addMedia(b2);
        store.displayMedias();
        // Add items to users' shopping carts, remove items, and complete purchases
        user1.addToCart(b1);
        user1.addToCart(movie1);
        user1.removeFromCart(b1);
        user1.checkout();

        // Leave reviews for books and calculate the average rating for each book
        Review review1 = new Review("User1", 4.5, "Good book!");
        b1.addReview(review1);
        System.out.println("Average rating for " + b1.getTitle() + ": " + b1.getAverageRating());

    }
}
