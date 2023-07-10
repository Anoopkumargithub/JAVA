import java.util.Scanner;
public class area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base of a triangle");
        int base = sc.nextInt();
        System.out.println("Enter Height of a triangle");
        int height = sc.nextInt();
        double area = (0.5)*base*height;
        System.out.println(area);
        sc.close();
    }
}
