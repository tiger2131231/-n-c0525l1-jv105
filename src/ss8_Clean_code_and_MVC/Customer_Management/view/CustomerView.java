package ss8_Clean_code_and_MVC.Customer_Management.view;
import ss8_Clean_code_and_MVC.Customer_Management.entity.Customer;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayList(List<Customer> customerList) {
        for (Customer customer :customerList) {
            if (customer != null) {
                System.out.println(customer);
            } else {
                break;
            }

        }
    }

    public static Customer inputDataForNewCustomer() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm");
        int point = Integer.parseInt(scanner.nextLine());
        Customer customer = new Customer(id,name,email,address,point);
        return customer;
    }
    public static int inputIdDelete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID khách hàng cần xóa: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public static Customer inputDataForUpdate(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên mới");
        String name = scanner.nextLine();
        System.out.println("Nhập email mới");
        String email = scanner.nextLine();
        System.out.println("Nhập address mới");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm mới");
        int point = Integer.parseInt(scanner.nextLine());
        return new Customer(id, name, email , address , point);
    }

}
