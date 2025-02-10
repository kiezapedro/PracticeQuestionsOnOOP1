package Activity2;

public class Main {
    public static void main(String[] args) {
        // Create and test objects
        Student student = new Student("John Doe", 20, "Computer Science");
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", 295);

        // Print values to test
        System.out.println("Student Information: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());

        System.out.println("\nBook Information");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Pages: " + book.getNumPages());
    }
}
