import java.util.Scanner;
public class greets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Welcome " + name );
        sc.close();
    }
}
