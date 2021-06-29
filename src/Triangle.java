import java.util.*;
public class Triangle extends Shape {
    int height, base;

    public Triangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input base: ");
        this.base = scan.nextInt();
        System.out.print("Input height: ");
        this.height = scan.nextInt();
    }
    
    @Override
    public void getArea() {
        System.out.print("The area of the Triangle is: ");
        System.out.println(this.height * this.base / 2);
    }
}
