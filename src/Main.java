import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executing program in first homework...");

        Seller seller1 = new Seller("Honza", LocalDate.of(2005, 1, 5), 21, 61.1, true);
        Seller seller2 = new Seller("Martin", LocalDate.of(2002, 1, 11), 7, 53.2, false);

        System.out.println(seller1.getName());
        System.out.println(seller2.getName());
    }
}