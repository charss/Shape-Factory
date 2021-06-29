import java.util.Scanner;

public class Square extends Shape {

    int side;
   
    public Square() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input side: ");
        this.side = scan.nextInt();

    }

    @Override
    public void getArea() {
        System.out.print("The area of the square is: ");
        System.out.println(this.side * this.side);
    }
}
