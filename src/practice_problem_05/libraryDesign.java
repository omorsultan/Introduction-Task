package practice_problem_05;
class Book {

    private String title;
    private String author;


    public Book(String title) {
        this.title = title;
        this.author = null; // or set as "Unknown"
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + (author != null ? author : "Not provided"));
    }
}

public class libraryDesign {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics");
        Book book2 = new Book("Effective Java", "Joshua Bloch");

        book1.displayInfo();
        book2.displayInfo();
    }
}
