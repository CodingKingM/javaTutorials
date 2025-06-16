public class Book {
    private String title;
    private String author;
    private int pages;
    private static int sharedId = 1; //SHARED counter by all objects
    private int bookId; // PERSONAL TO each book object, every book has its own id

    //constructors
    public Book(){
        title = "No Title";
        author = "No Author";
        pages = 0;
        bookId = sharedId++; // // bookId gets 1, then nextId becomes 2
    }
    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    //getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }

    public void displayInfo(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println(" ----- ");
    }

}
