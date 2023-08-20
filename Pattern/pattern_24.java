public class pattern_24 {
    public static void main(String[] args) {
        int n= 5;
        int nst= 1;
        int nsp = n-1;
        int row = 1;
        int val = 1;
        while(row<=n){
            for(int  i=1;i<=nsp;i++){
                System.out.print("  ");
            }for(int i=1;i<=nst;i++){
                System.out.print(val+" ");
            }nst+=2;
            nsp--;
            row++;
            val++;
            System.out.println(" ");
        }
    }
}
