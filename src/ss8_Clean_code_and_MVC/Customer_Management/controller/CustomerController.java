package ss8_Clean_code_and_MVC.Customer_Management.controller;

import ss8_Clean_code_and_MVC.Customer_Management.entity.Customer;
import ss8_Clean_code_and_MVC.Customer_Management.service.CustomerService;
import ss8_Clean_code_and_MVC.Customer_Management.service.ICustomerService;
import ss8_Clean_code_and_MVC.Customer_Management.view.CustomerView;


import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public static void displayMenu() {
        ICustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Chọn chức năng quản lý khách hàng----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách"+
                    "\n 2. Thêm " +
                    "\n 3. Sửa" +
                    "\n 4. Xoá" +
                    "\n 5. Thoát"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                System.out.println("Danh sách");
                List<Customer> customerList = customerService.findAll();
                CustomerView.displayList(customerList);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Customer customer = CustomerView.inputDataForNewCustomer();
                    boolean  isAddSuccess = customerService.add(customer);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;
                case 3:
                    System.out.println("Sửa khách hàng");
                    int idUpdate = CustomerView.inputIdDelete(); // có thể tái dùng hàm nhập id
                    Customer newCustomer = CustomerView.inputDataForUpdate(idUpdate);
                    boolean isUpdateSuccess = customerService.updateById(idUpdate, newCustomer);
                    if (isUpdateSuccess) {
                        System.out.println("Sửa thành công!");
                    } else {
                        System.out.println("Không tìm thấy khách hàng với ID: " + idUpdate);
                    }
                    break;
                case 4:
                    System.out.println("Xóa khách hàng");
                    int idDelete = CustomerView.inputIdDelete(); // gọi view nhập id
                    boolean isDeleteSuccess = customerService.deleteById(idDelete);
                    if (isDeleteSuccess) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Không tìm thấy khách hàng với ID: " + idDelete);
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
