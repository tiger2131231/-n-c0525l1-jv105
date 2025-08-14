package ss5_Stack_Access_Modifier.bai_tap.Quan_ly_san_pham_CRUD;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("------------Quản lý sản phẩm----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Thoát"
            );
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Danh sách sản phẩm:");
                    for (Product p : ProductManager.getAll()) {
                        if (p != null) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Nhập ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    int price = Integer.parseInt(scanner.nextLine());

                    Product product = new Product(id, name, price);
                    productManager.add(product);
                    System.out.println("Thêm sản phẩm thành công!");
                    break;

                case 3:
                    System.out.print("Nhập ID sản phẩm cần xoá: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    productManager.delete(deleteId);
                    break;

                case 4:
                    System.out.print("Nhập từ khoá tìm kiếm: ");
                    String keyword = scanner.nextLine();
                    productManager.search(keyword);
                    break;

                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
