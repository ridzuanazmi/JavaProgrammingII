
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        System.out.println("Please enter the file name:");
        String fileName = scanner.nextLine();
        read(fileName).forEach(input -> System.out.println(input));
    }

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)) // Reads the file as a stream of lines.
                    .forEach(row -> rows.add(row)); // Add each line(row) into rows List
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rows;
    }

}
