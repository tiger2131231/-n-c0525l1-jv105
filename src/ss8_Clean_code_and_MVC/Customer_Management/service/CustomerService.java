package ss8_Clean_code_and_MVC.Customer_Management.service;

import ss8_Clean_code_and_MVC.Customer_Management.entity.Customer;
import ss8_Clean_code_and_MVC.Customer_Management.repository.CustomerRepository;
import ss8_Clean_code_and_MVC.Customer_Management.repository.ICustomerRepository;


import java.util.List;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        List<Customer> customers = customerRepository.findAll();
        for (int i = 0; i <customers.size() ; i++) {
            if (customers.get(i)!=null){
                if (customers.get(i).getId()==customer.getId()){
                    System.out.println("id đã tồn tại");
                    return false;
                }
            }else {
                break;
            }

        }
        return customerRepository.add(customer);
    }

    @Override
    public boolean deleteById(int id) {
        return customerRepository.deleteById(id);
    }
    @Override
    public boolean updateById(int id, Customer newCustomer) {
        return customerRepository.updateById(id, newCustomer);
    }


}

