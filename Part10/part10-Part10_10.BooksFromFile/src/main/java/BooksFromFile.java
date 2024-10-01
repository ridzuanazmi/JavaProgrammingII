
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println("Please enter the file name:");
        String fileName = scanner.nextLine();
        List<Book> bookList = BooksFromFile.readBooks(fileName);
        bookList.forEach(book -> System.out.println(book));
    }

    // read the file given as the parameter and forms book data from it
    public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .filter(parts -> parts.length == 4) // Ensure there are exactly 4 parts
                    .map(parts -> new Book(
                    parts[0], // name
                    Integer.parseInt(parts[1]), // publishing year
                    Integer.parseInt(parts[2]), // page count
                    parts[3] // author
            ))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            return List.of(); // Return an empty list in case of an error
        }
    }

}
