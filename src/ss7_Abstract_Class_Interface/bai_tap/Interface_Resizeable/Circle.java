package ss7_Abstract_Class_Interface.bai_tap.Interface_Resizeable;

public class Circle implements Resizeable {
        private double radius;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public void resize(double percent) {
            this.radius += this.radius * percent / 100;
        }

        @Override
        public String toString() {
            return "Circle with radius = " + radius;
        }
}
