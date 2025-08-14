package ss5_Stack_Access_Modifier.bai_tap.Quan_ly_san_pham_CRUD;

public class ProductManager {
    private static Product[] productList = new Product[100]; // mảng lưu sản phẩm

    public static Product[] getAll() {
        return productList;
    }

    public void add(Product product) {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] == null) {
                productList[i] = product;
                break;
            }
        }
    }

    public void delete(int id) {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == id) {
                productList[i] = null;
                System.out.println("Đã xoá sản phẩm có ID: " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có ID: " + id);
    }

    public void search(String keyword) {
        boolean found = false;
        for (Product product : productList) {
            if (product != null && product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm phù hợp.");
        }
    }
}
