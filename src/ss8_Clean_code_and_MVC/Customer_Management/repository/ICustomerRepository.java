package ss8_Clean_code_and_MVC.Customer_Management.repository;

import ss8_Clean_code_and_MVC.Customer_Management.entity.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    boolean add(Customer customer);
    boolean deleteById(int id);
    boolean updateById(int id, Customer newCustomer);

}
