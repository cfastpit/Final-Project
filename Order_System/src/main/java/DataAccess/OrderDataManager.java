package DataAccess;

import BusinessLayer.Order;
import java.util.ArrayList;

public class OrderDataManager {

    private ArrayList<Order> dataStore;

    public OrderDataManager() {
        this.dataStore = new ArrayList<Order>();
    }

    public ArrayList<Order> getAll() {
        return dataStore;
    }
public void create(Order orderToCreate) {
        // if we were using real databse - INSERT INTO BankAccount ...
        this.dataStore.add(orderToCreate);
    }
}
