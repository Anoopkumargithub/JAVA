import java.util.Scanner;

public class binary_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int i=1;
        while(n!=0){
            int rem = n%10;
            ans = ans + (int) rem*i;
            i = i*2;
            n = n/10;
        }System.out.println(ans);
        sc.close();
    }
}
