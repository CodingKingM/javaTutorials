public class Book {
    private String title;
    private String author;
    private int pages;
    private static int sharedId = 1; //SHARED counter by all objects
    private int bookId; // PERSONAL TO each book object, every book has its own id
    private static int noOfBooks;

    //constructors
    public Book(){//default constructor (Constructor 1)
        title = "No Title";
        author = "No Author";
        pages = 0;
        bookId = sharedId++; // // bookId gets 1, then nextId becomes 2
        noOfBooks++;
    }
    // Constructor 2
    public Book(String title){// takes the title and sets the default values for author and pages
        this.title = title;
        author = "No Author";
        pages = 0;
        bookId = sharedId++;
        noOfBooks++;
    }
    // Constructor 3
    public Book(String title, String author){
        this (title); // constructor chaining
        this.author = author;
        pages = 0;
        //bookId = sharedId++; //if we were to leave it whenever this (title) is called it bookId = sharedId++; from const. 2
        //noOfBooks++;

    }
    public static void resetIdCounter() {
        sharedId = 1;
    }
    public static int getNoOfBooks() {
        return noOfBooks;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
        // instead of (String t){
        // title = t;
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

    public void displayInfo(String prefix){
        System.out.println(prefix + "Book ID: " + bookId);
        System.out.println(prefix + "Title: " + title);
        System.out.println(prefix + "Author: " + author);
        System.out.println(prefix + "Pages: " + pages);
        System.out.println(" ----- ");
    }


}
