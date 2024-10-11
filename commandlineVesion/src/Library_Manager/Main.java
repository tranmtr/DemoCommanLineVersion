package Library_Manager;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document("0001", "Tuyen tap nhac Viet", "Nguyen Van A", 2, true);
        Book book = new Book("0002", "Hat cho em", "Nguyen Van B", 5, true, "Am nhac", "1234567891234");
        Thesis thesis = new Thesis("0003", "OOP", "Nguyen Van C", 5, true, "UET", "Nguyen Van D", "Ke thua");
        doc.printInfo();
        System.out.println();
        book.printInfo();
        System.out.println();
        thesis.printInfo();
    }
}
