import java.util.*;

public class Circle extends Shape {
    int radius;

    public Circle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input radius: ");
        this.radius = scan.nextInt();
    }
    
    @Override
    public void getArea() {
        System.out.print("The area of the Circle is: ");
        System.out.println(this.radius * 3.14);
    }
}
