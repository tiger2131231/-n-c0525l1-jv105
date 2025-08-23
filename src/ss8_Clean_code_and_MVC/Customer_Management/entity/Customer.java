package ss8_Clean_code_and_MVC.Customer_Management.entity;

public class Customer extends Person {
    private int point;

    public Customer() {}

    public Customer(int id, String name, String email, String address, int point) {
        super(id, name, email, address);
        this.point = point;
    }
    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "point='" + point + '\'' +
                '}';
    }
}


