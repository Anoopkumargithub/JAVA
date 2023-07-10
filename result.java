import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of sub 1");
        float sub1 = sc.nextFloat();
        System.out.println("Enter no. of sub 2");
        float sub2 = sc.nextFloat();
        System.out.println("Enter no. of sub 3");
        float sub3 = sc.nextFloat();
        System.out.println("Enter no. of sub 4");
        float sub4 = sc.nextFloat();
        System.out.println("Enter no. of sub 5");
        float sub5 = sc.nextFloat();
        float total = (sub1 + sub2 + sub3 + sub4 + sub5)/5;
        System.out.println(total);
        sc.close();
    }
}
