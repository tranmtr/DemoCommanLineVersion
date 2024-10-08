package Library_Manager;

public class Document {
    private String id;
    private String title;
    private String author;
    private int quantity;
    private boolean isAvailable;

    /**
     * Constructor 1.
     *
     * @param id          : ma cua tai lieu
     * @param title       : ten cua tai lieu
     * @param author      : tac gia
     * @param quantity    : so luong
     * @param isAvailable : tinh trang con tai lieu hay khong
     */
    public Document(String id, String title, String author, int quantity, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /**
     * In ra id, title, author, available.
     */
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Quantity: " + quantity);
        System.out.println("Available: " + isAvailable);
    }
}
