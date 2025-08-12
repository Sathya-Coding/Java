import java.util.ArrayList;
import java.util.Scanner;
      class Boook {
        private String title;
        private String author;
        private int bookId;
        private boolean isIssued;

        public Boook(String title, String author, int bookId) {
            this.title = title;
            this.author = author;
            this.bookId = bookId;
            this.isIssued = false;
        }

        public int getBookId() {
            return bookId;
        }

        public boolean isIssued() {
            return isIssued;
        }

        public void issueBook() {
            if (!isIssued) {
                isIssued = true;
                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Book is already issued.");
            }
        }

        public void returnBook() {
            if (isIssued) {
                isIssued = false;
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book was not issued.");
            }
        }

        public void showDetails() {
            if (!isIssued) {
                System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author);
            }
        }
    }

    // Main class
    public class oopslibrarymanagement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Boook> books = new ArrayList<>();

            // Add some books
            books.add(new Boook("Java Basics", "James Gosling", 101));
            books.add(new Boook("Python Crash Course", "Eric Matthes", 102));
            books.add(new Boook("Clean Code", "Robert C. Martin", 103));

            while (true) {
                System.out.println("\nLibrary Menu:");
                System.out.println("1. Show Available Books");
                System.out.println("2. Issue Book");
                System.out.println("3. Return Book");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("\nAvailable Books:");
                    for (Boook b : books) {
                        b.showDetails();
                    }
                } else if (choice == 2) {
                    System.out.print("Enter Book ID to issue: ");
                    int id = scanner.nextInt();
                    boolean found = false;
                    for (Boook b : books) {
                        if (b.getBookId() == id) {
                            b.issueBook();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found!");
                    }
                } else if (choice == 3) {
                    System.out.print("Enter Book ID to return: ");
                    int id = scanner.nextInt();
                    boolean found = false;
                    for (Boook b : books) {
                        if (b.getBookId() == id) {
                            b.returnBook();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found!");
                    }
                } else if (choice == 4) {
                    System.out.println("Exiting the Library System.");
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }


