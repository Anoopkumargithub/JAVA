import java.util.Scanner;

public class pattern_37 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        while(row<=n){
            for(int i=1;i<=nst;i++){
                System.out.print(i+" ");
            }
            nst++;
            row++;
            System.out.println(" ");
            sc.close();
        }
    }
}
