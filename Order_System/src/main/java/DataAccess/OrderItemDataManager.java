package DataAccess;


import BusinessLayer.OrderItem;
import java.util.ArrayList;

public class OrderItemDataManager {
       private ArrayList<OrderItem> dataStore;

    public OrderItemDataManager() {
        this.dataStore = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getAll() {
        return dataStore;
    }
public void create(OrderItem orderItemToCreate) {
        // if we were using real databse - INSERT INTO BankAccount ...
        this.dataStore.add(orderItemToCreate);
    } 
}
