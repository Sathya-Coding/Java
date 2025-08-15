
import java.text.SimpleDateFormat;
import java.util.*;

class LibraryBook {
    String title;
    Date issueDate;
    Date returnDate;

    LibraryBook(String title, String issue, String ret) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.title = title;
        this.issueDate = sdf.parse(issue);
        this.returnDate = sdf.parse(ret);
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return title + " | Issued: " + sdf.format(issueDate) + " | Return: " + sdf.format(returnDate);
    }
}

public class frameworkcollectionbooksortbydates  {
    public static void main(String[] args) throws Exception {
        List<LibraryBook> books = Arrays.asList(
                new LibraryBook("Java", "01/07/2025", "15/07/2025"),
                new LibraryBook("Python", "03/07/2025", "10/07/2025"),
                new LibraryBook("C++", "01/07/2025", "12/07/2025")
        );

        books.sort(Comparator
                .comparing((LibraryBook b) -> b.issueDate)
                .thenComparing(b -> b.returnDate));

        System.out.println("Books sorted by Issue Date and Return Date:");
        for (LibraryBook book : books) {
            System.out.println(book);
        }
    }
}

