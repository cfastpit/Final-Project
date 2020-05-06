
import java.util.Arrays;
import BusinessLayer.*;
import DataAccess.*;

public class OrderSystem {

    public static void main(String[] args) {
        System.out.print("this should ");

        CustomerDataManager customerDm = new CustomerDataManager();
        ProductDataManager productDm = new ProductDataManager();
        OrderDataManager orderDM = new OrderDataManager();
        OrderItemDataManager orderItemDm = new OrderItemDataManager();

        Customer customer1 = new Customer(1, "Bob", "Smith", "555-432-5490");
        Customer customer2 = new Customer(2, "Mark", "Jones ", "555-254-5440");
        Customer customer3 = new Customer(3, "Jhon", "Doe", "555-215-5699");

        Product product1 = new Product(1, "soap", 5, 12.44);
        Product product2 = new Product(2, "Icecream", 5, 2.44);
        Product product4 = new Product(3, "Gum", 5, 1.44);
        
        OrderItem orderItem1= new OrderItem(0, 0, 0, productDescription, 0, 0);
        Order order1=new Order(1, 1,"5/5/2020");
    }

}
