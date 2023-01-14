package shop;

import java.util.ArrayList;

public class Guest {

    public ArrayList<Products> ViewProducts(Admin admin){

        return admin.ViewProducts();
    }

    public Customer GetRegistered(String name){
        Customer customer = new Customer(name);
        System.out.println("Customer Name " + customer.Name);
        return customer;
    }
}
