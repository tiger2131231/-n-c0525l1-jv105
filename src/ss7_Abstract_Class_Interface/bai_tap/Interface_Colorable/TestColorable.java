package ss7_Abstract_Class_Interface.bai_tap.Interface_Colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[2] = new Square(6.0, "yellow", true);

        for (Shape shape : shapes) {
            System.out.println(shape);

            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            System.out.println();
        }
    }
}
