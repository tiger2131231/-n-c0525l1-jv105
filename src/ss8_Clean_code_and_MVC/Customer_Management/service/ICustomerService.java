package ss8_Clean_code_and_MVC.Customer_Management.service;

import ss8_Clean_code_and_MVC.Customer_Management.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    boolean add(Customer customer);
    boolean deleteById(int id);
    boolean updateById(int id, Customer newCustomer);
}
