package ss8_Clean_code_and_MVC.Customer_Management.repository;

import ss8_Clean_code_and_MVC.Customer_Management.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<Customer>();

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public boolean add(Customer customer) {
        customers.add(customer);
        return true;
    }
    @Override
    public boolean deleteById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customers.remove(customer);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean updateById(int id, Customer newCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                customers.set(i, newCustomer);
                return true;
            }
        }
        return false;
    }



}
