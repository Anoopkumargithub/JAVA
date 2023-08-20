public class pattern_34 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 5;
        int nsp =-1;
        int row = n;
        while(row<=n){
            for(int i=1;i<=nst;i++){
                int val = 5;
                System.out.print(val+" ");
                val--;
            }
            for(int i = 1;i<=nsp;i++){
                System.out.print("  ");
            }
            nst--;
            nsp++;
            row++;
            System.out.println(" ");
        }
    }
}
