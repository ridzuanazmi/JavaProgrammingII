
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<LiteracyRate> literacyList = LiteracyComparison.getCsv("literacy.csv");
        Collections.sort(literacyList); // Already have the compareTo method overriden in the LiteracyRate class
        literacyList
                .forEach(row -> System.out.println(row));
    }
    
    // Method to read the CSV file
    public static List<LiteracyRate> getCsv(String filename) {
        try {
            return Files.lines(Paths.get(filename))
                    .map(line -> line.split(","))
                    .filter(parts -> parts.length == 6) // Ensure there are exactly 4 parts
                    .map(parts -> new LiteracyRate(
                    parts[3].trim(), // Country
                    Integer.parseInt(parts[4].trim()), // Year
                    parts[2].trim().replace(" (%)", ""), // Gender
                    Double.parseDouble(parts[5].trim()) // LiteracyRate
                    ))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            return List.of(); // Return an empty list in case of an error
        }
    }
}
