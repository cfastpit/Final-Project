/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.Customer;
import java.util.ArrayList;

public class CustomerDataManager {

    private ArrayList<Customer> dataStore;

    public CustomerDataManager() {
        this.dataStore = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getAll() {
        return dataStore;
    }
public void create(Customer customertToCreate) {
        // if we were using real databse - INSERT INTO BankAccount ...
        this.dataStore.add(customertToCreate);
    }
}
