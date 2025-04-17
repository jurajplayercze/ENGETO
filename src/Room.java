import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Room {

    private final String ALREADY_RESERVED = "Room with id: %d is already reserved.";
    private final String NOT_ENOUGH_CAPACITY = "Room with id: %d does not have enough capacity.";
    private int roomId;
    private int capacity;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private final int price;
    private Map<LocalDate,List<Guest>> reservedFor;
    private List<RoomReservation> reservations = new ArrayList<>();

    public Room(int roomId, int capacity, boolean hasBalcony, boolean hasSeaView, int price) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.price = price;
    }

    public void reserveRoom(List<Guest> guests, LocalDate from, LocalDate to) {
        if (!this.reservedFor.isEmpty()) {
            System.out.printf(ALREADY_RESERVED, roomId);
            return;
        }
        if (guests.size() > capacity) {
            System.out.printf(NOT_ENOUGH_CAPACITY, roomId);
            return;
        }

        this.reservedFor.;
    }

    public int getRoomId() {
        return roomId;
    }
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public boolean hasBalcony() {
        return hasBalcony;
    }
    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
    public boolean hasSeaView() {
        return hasSeaView;
    }
    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }
    public int getPrice() {
        return price;
    }
}
