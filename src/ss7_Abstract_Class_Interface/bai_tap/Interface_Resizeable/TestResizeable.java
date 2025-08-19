package ss7_Abstract_Class_Interface.bai_tap.Interface_Resizeable;

import java.util.Random;

public class TestResizeable {
    public static void main(String[] args) {
        Random random = new Random();

        // Tạo mảng các hình
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(7);

        // Duyệt mảng và resize
        for (Resizeable shape : shapes) {
            double percent = random.nextInt(100) + 1; // random 1-100
            System.out.println("Trước khi resize: " + shape);

            double oldArea;
            if (shape instanceof Circle) {
                oldArea = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle && !(shape instanceof Square)) {
                oldArea = ((Rectangle) shape).getArea();
            } else {
                oldArea = ((Square) shape).getArea();
            }

            System.out.println("Diện tích cũ: " + oldArea);

            shape.resize(percent);
            System.out.println("Resize với tỉ lệ " + percent + "%");

            double newArea;
            if (shape instanceof Circle) {
                newArea = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle && !(shape instanceof Square)) {
                newArea = ((Rectangle) shape).getArea();
            } else {
                newArea = ((Square) shape).getArea();
            }

            System.out.println("Sau khi resize: " + shape);
            System.out.println("Diện tích mới: " + newArea);
            System.out.println("----------------------------------");
        }
    }
}

