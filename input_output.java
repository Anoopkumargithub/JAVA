import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no.1 ");
        // int a = sc.nextInt();
        // System.out.println(a);

        // System.out.println("Enter no.2 ");
        // float b = sc.nextFloat();
        // float c = sc.nextFloat();
        // System.out.println(b+c);

        // boolean d = sc.hasNextInt();
        // System.out.println(d);

        String str = sc.next();
        System.out.println(str);

        // String str1 = sc.nextLine();
        // System.out.println(str1);
        
        sc.close();
    }
}