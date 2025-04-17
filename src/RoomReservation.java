import java.time.LocalDate;
import java.util.List;

public class RoomReservation {
    private LocalDate from, to;
    private List<Guest> guests;

    public RoomReservation(LocalDate from, LocalDate to, List<Guest> guests) {
        this.from = from;
        this.to = to;
        this.guests = guests;
    }

    public LocalDate getFrom() {
        return from;
    }
    public void setFrom(LocalDate from) {
        this.from = from;
    }
    public LocalDate getTo() {
        return to;
    }
    public void setTo(LocalDate to) {
        this.to = to;
    }
    public List<Guest> getGuests() {
        return guests;
    }
    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}