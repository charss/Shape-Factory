import java.util.*;

public class Rectangle extends Shape {

    int length;
    int width;
    public Rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input length: ");
        this.length = scan.nextInt();

        System.out.print("Input width: ");
        this.width = scan.nextInt();
    }

    @Override
    public void getArea() {
        System.out.print("The area of the Rectangle is: ");
        System.out.println(this.length * this.width);
    }
}
