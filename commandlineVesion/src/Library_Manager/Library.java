package Library_Manager;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //private List<Document> documents = new ArrayList<>();
    //private List<User> users = new ArrayList<>();
    private List<Book> books;
    private List<Thesis> theses;
    //private List<StandardUser> standardUsers;
    //private List<Librarian> librarians;

    /**
     * contructor.
     */
    public Library() {
        // Khởi tạo các danh sách
        this.books = new ArrayList<>();
        this.theses = new ArrayList<>();
        //this.standardUsers = new ArrayList<>();
        //this.librarians = new ArrayList<>();
    }

    /**
     * Get the list of all books.
     * @return list book
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Get the list of all theses.
     * @return list
     */
    public List<Thesis> getTheses() {
        return theses;
    }

    /**
     * add books to the book list.
     * @param book add by Librarians
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * add theses to the thesis list.
     * @param thesis add by Librarians
     */
    public void addThesis(Thesis thesis) {
        theses.add(thesis);
    }

    /**
     * print list book.
     */
    public void printlistBooks() {
        System.out.println("All books in the library:");
        for (Book book : books) {
            book.printInfo();
        }
    }

    /**
     * print list thesis.
     */
    public void printlistThesis() {
        System.out.println("All thesis in the library:");
        for (Thesis thesis : theses) {
            thesis.printInfo();
        }
    }

    /**
     * delete book.
     * @param id book
     * @return
     */
    public void deleteBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                System.out.println("Book with ID " + id + " deleted.");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
        return ;
    }

    /**
     * clear the book list.
     */
    public void clearAllBook() {
        books.clear();
        System.out.println("All books cleared");
    }


}
