import java.util.ArrayList

public class Combo {

    ArrayList<OrderItem> item = new ArrayList<OrderItem>();


    void AddItem(OrderItem newItem) {
        item.add(newItem);
    }

    @Override
    public String getItemName() {
        return null;
    }

    @Override double getPrice() {
        return null;
    }
}
