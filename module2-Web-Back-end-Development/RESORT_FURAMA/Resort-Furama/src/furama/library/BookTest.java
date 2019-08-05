package furama.library;

public class BookTest {
    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<Book>();
        Book book1 = new Book("Code JavaScript 1", "john", 1998, 500);
        Book book2 = new Book("Code JavaScript 2", "john", 2010, 790);
        System.out.println("Add new books to the library :");
        bookLibrary.addElement(book1);
        bookLibrary.addElement(book2);
        for (Book book : bookLibrary.list) {
            System.out.println((book));
        }

        System.out.println("\n Delete books in the library :");
        bookLibrary.removeElement(book2);
        for (Book book : bookLibrary.list) {
            System.out.println((book));
        }

    }

}
