public class Product implements OrderItem {
    String ItemName;

    double price;

    @Override
    public String getItemName() {
        return ItemName;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
