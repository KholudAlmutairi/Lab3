public class Store {
    private Media[] mediaList;
    private User[] userList;
    private int mediaCount;
    private int userCount;

    public Store() {
        this.mediaList = new Media[100]; // Maximum 100 media items
        this.userList = new User[100]; // Maximum 100 users
        this.mediaCount = 0;
        this.userCount = 0;
    }

    public void addMedia(Media media) {
        if (mediaCount < 100) {
            mediaList[mediaCount++] = media;
        }
    }

    public void addUser(User user) {
        if (userCount < 100) {
            userList[userCount++] = user;
        }
    }

    public void displayUsers() {
        for (int i = 0; i < userCount; i++) {
            System.out.println(userList[i].toString());

        }
    }

    public void displayMedias() {
        for (int i = 0; i < mediaCount; i++) {
            System.out.println(mediaList[i].toString());
        }
    }

    public Media searchBook(String title) {
        for (int i = 0; i < mediaCount; i++) {
            if (mediaList[i].getTitle().equals(title) && mediaList[i] instanceof Book) {
                return mediaList[i];
            }
        }
        return null;
    }
}


