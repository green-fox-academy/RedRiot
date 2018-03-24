public class Sweets {
    double price;
    double sugar;
    String type;
    static double raisePrice;

    public Sweets() {
        this.type = type;
        this.sugar = sugar;


    }
    public double raisedPrice() {
        this.price = price + raisePrice * price/100;
        return price;
    }
}
