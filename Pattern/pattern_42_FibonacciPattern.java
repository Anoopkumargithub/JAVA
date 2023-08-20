import java.util.Scanner;

public class pattern_42_FibonacciPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int a = 0, b = 1;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a + "\t");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
        
        sc.close();
    }
}