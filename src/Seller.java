import java.time.LocalDate;

public class Seller {
    String name;
    LocalDate birthDate;
    Integer contracts;
    Double  soldCarrotsInTons;
    boolean senior;

    Seller(){}
    Seller(String name, LocalDate birthDate, Integer contracts, Double  soldCarrotsInTons, boolean senior){
        this.name = name;
        this.birthDate = birthDate;
        this.contracts = contracts;
        this.soldCarrotsInTons = soldCarrotsInTons;
        this.senior = senior;
    }
}