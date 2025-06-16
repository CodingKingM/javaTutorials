public class Main {
    public static void main(String[] args) {

        // Constructor #1 - No parameters (default)
        Book b1 = new Book();
        System.out.println("=== Book b1 (default constructor) ===");
        b1.displayInfo();

        // Constructor #2 - One parameter (title only)
        Book b2 = new Book("Java Programming Tutorial");
        System.out.println("\n=== Book b2 (title constructor) ===");
        b2.displayInfo();

        // Constructor #3 - Two parameters (title and author)
        Book b3 = new Book("Python Guide", "Youtuber Malek");
        System.out.println("\n=== Book b3 (title + author constructor) ===");
        b3.displayInfo();

        // You can still use setters AFTER creating with constructors
        b2.setAuthor("Youtuber El desouki");  // Override the default author
        b2.setPages(300);
        System.out.println("\n=== Book b2 after using setters ===");
        b2.displayInfo();
    }
}