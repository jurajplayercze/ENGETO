import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executing program in second homework...");

        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        guest2.setBirthDate(LocalDate.of(1995, 4, 5));

        System.out.println(guest2);

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);

        Room room3 = new Room(3, 3, false, true, 2400);

        room1.reserveRoom(guest1,LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26));

        room3.reserveRoom(List.of(guest1, guest2), LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));

    }
}