import java.util.ArrayList;

public class House {


    private String address;
    private ArrayList<Room> rooms = new ArrayList<>();
    private int roomCount = 0;
    private static House house = new House("");

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public static House getHouse() {
        return house;
    }

    public static void setHouse(House house) {
        House.house = house;
    }

    private House(String address) {
        this.address = address;
    }

    public static House newHouse(String address) {
        house.address = address;
        return house;
    }


    void addRoom(Room room) {
        rooms.add(room);
        roomCount++;
    }

    void addRooms(ArrayList<Room> newRooms) {
        for (int i = 0; i < newRooms.size(); i++) {
            rooms.add(newRooms.get(i));
            roomCount++;
        }
    }

    public double getRoomCount() {
        return roomCount;
    }

}