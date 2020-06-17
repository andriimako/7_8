import java.util.ArrayList;

public class Room {
    double area;
    ArrayList <Furniture> inTheRoom = new ArrayList<>();

    public Room(double area, ArrayList<Furniture> inTheRoom) {
        this.area = area;
        this.inTheRoom = inTheRoom;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setInTheRoom(ArrayList<Furniture> inTheRoom) {
        this.inTheRoom = inTheRoom;
    }

    public double getTotalPrice(ArrayList<Furniture> furniture){
        double TotalPrice =0;
        for (int i =0; i < furniture.size(); i++){
            TotalPrice += furniture.get(i).getPriceVAT();
        }
        return TotalPrice;
    }
}
