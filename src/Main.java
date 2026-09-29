//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape s1;
        //What value can s1 hold

        //you cannot create object for abstract class
        // s1 = new Shape();
        s1 = new Circle("black", 30.5);

        Shape s2 = new Rectangle("Gold", 20, 25);

        Shape[] shapes = new Shape[2];
        shapes[0] = s1;
        shapes[1] = s2;

        for (Shape sh : shapes) {
            sh.calculateArea();
        }

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].calculateArea();
        }
    }
}