package ss5_Stack_Access_Modifier.bai_tap.Write_only;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();

        s.setName("Alice");
        s.setClasses("C03");
        s.display();
    }
}
