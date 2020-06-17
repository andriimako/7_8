public class Furniture {
    private String name;
    private double price;
    private static double VAT = 0.30;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public double getPriceVAT() {
        return price+price*VAT;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
