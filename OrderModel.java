import java.util.ArrayList;

public class OrderModel {

    private double total;

    ArrayList<OrderItem> Order = new ArrayList<OrderItem>();

    public OrderModel() {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    void AddItem(OrderItem newItem) {
        Order.add(newItem);
    }

    void clear() {
        Order.clear();
    }
}
