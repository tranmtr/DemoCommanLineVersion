package Library_Manager;
import java.util.ArrayList;
import java.util.List;

public class User {
    // Attributes
    private String id;
    private String name;
    private String email;
    private String password;
    private String position;
    private List<BorrowReturnTransaction> transactions;

    // Constructor
    public User(String id, String name, String email, String password, String position) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.position = position;
        this.transactions = new ArrayList<>(); // initialize an empty list of transactions
    }

    // Getters and Setters (optional if needed)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<BorrowReturnTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<BorrowReturnTransaction> transactions) {
        this.transactions = transactions;
    }

    // Methods
    public void printInfo() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Position: " + position);
    }

    /**
     * Day la ham lay ra sach bang id
     *
     * @param id ma xac nhan cua quyen sach
     * @return quyen sach do.
     */
    public Document findDocumentById(String id) {
        return Document.getDocumentById(id);
    }

    /**
     * Ham tra ve tap tai lieu bang title, do title co the trung nhau nen se tra ve 1 danh sach
     *
     * @param title ten tai lieu
     * @return tra ve tap tai lieu
     */
    public List<Document> findDocumentByTitle(String title) {
        List<Document> documents = Document.getAllDocuments(); // Get all documents
        List<Document> result = new ArrayList<>();

        // Loop through the list of documents and find matches by title
        for (Document doc : documents) {
            if (doc.getTitle().equalsIgnoreCase(title)) {
                result.add(doc);
            }
        }

        if (result.isEmpty()) {
            System.out.println("No document found with title: " + title);
        } else {
            System.out.println("Found " + result.size() + " document(s) with title: " + title);
        }

        return result;
    }

    public List<Document> findDocumentByAuthor(String author) {
        List<Document> documents = Document.getAllDocuments(); // Get all documents
        List<Document> result = new ArrayList<>();

        // Loop through the list of documents and find matches by title
        for (Document doc : documents) {
            if (doc.getTitle().equalsIgnoreCase(author)) {
                result.add(doc);
            }
        }

        if (result.isEmpty()) {
            System.out.println("No document found with title: " + author);
        } else {
            System.out.println("Found " + result.size() + " document(s) with title: " + author);
        }

        return result;
    }

    public void register(String name, String email, String password) {
        // Logic to register a new user
        this.name = name;
        this.email = email;
        this.password = password;
        System.out.println("User registered successfully: " + name);
    }

    public void register(String id, String name, String email, String password) {
        // Logic to register a new user
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        System.out.println("User registered successfully: " + name);
    }
}
