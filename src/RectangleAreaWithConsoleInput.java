import java.util.Scanner;
public class RectangleAreaWithConsoleInput {
    public static void Run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width");
        int width = input.nextInt();
        System.out.println("Enter height");
        int height = input.nextInt();
        int area = width * height;
        System.out.println("Area of rectangle is " + area);

    }
}
