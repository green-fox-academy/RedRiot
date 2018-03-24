public class Candy extends Sweets{
    public Candy() {
        this.type = type;
        this.price = 20 + raisePrice * price/100;
        this.sugar = 10;

    }
}
