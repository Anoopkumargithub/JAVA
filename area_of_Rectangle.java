import java.util.Scanner;
public class area_of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the rectangle");
        int length = sc.nextInt();
        System.out.println("Enter breadth of the rectangle");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.print("Area of Rectangle: " );
        System.out.print(area);
        sc.close();
    }
}
