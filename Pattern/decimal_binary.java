import java.util.Scanner;
public class decimal_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int i=1;
        while(n!=0){
            int rem = n%2;
            ans = ans + (int) rem*i;
            i = i*10;
            n = n/2;
        }System.out.println(ans);
        sc.close();
    }
}
