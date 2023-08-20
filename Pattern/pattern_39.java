public class pattern_39 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = n;
        int nsp = n-1;
        while(row<=n){
            for(int i=1;i<=nsp;i++){
                System.out.print(" ");
            }for(int i=1;i<=nst;i++){
                if (row==1 || row==n){
                    System.out.print("*");
                }else{
                if (i==1 || i==n){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            }
            nsp--;
            row++;
            System.out.println(" ");
        }
    }
}
