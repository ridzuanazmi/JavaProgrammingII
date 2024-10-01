
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            String age = scanner.nextLine();
            int ageRecommendation = Integer.valueOf(age);

            bookList.add(new Book(title, ageRecommendation));
        }

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getTitle);
        Collections.sort(bookList, comparator);
        System.out.println(bookList.size() + " books in total.");
        System.out.println("Books:");
        bookList.forEach(book -> System.out.println(book));
//        bookList.stream()
//                .sorted((b1, b2) -> {
//                    return b1.getAgeRecommendation() - b2.getAgeRecommendation();
//                })
//                .th
//                .forEach(book -> System.out.println(book));
    }

}
