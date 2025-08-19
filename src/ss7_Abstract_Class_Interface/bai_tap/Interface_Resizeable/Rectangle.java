package ss7_Abstract_Class_Interface.bai_tap.Interface_Resizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        this.width += this.width * percent / 100;
        this.height += this.height * percent / 100;
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width + ", height = " + height;
    }
}
