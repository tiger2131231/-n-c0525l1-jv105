package ss8_Clean_code_and_MVC.Customer_Management.controller;

import java.util.Scanner;

public class MainController {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Chọn chức năng quản lý----------");
            System.out.println("Chức năng: " +
                    "\n 1. Quản lý khách hàng" +
                    "\n 2. Quản lý hội viên VIP" +
                    "\n 5. Thoát"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chức năng quản lý khách hàng");
                    CustomerController.displayMenu();
                    break;
                case 2:
                    System.out.println("Chức năng quản lý hội viên VIP");
                    // phát triển thêm
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
