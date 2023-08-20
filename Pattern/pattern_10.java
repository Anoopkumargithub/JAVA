public class pattern_10 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 2*n-1;
        int nsp = 0;
        int row=1;
        while(row<=n){
            for(int i=1;i<=nsp;i++){
                System.out.print("  ");
            }
            for(int i=1;i<=nst;i++){
                System.out.print("* ");
            }
            for(int i=1;i<nsp;i++){
                System.out.print("  ");
            }
            nst-=2;
            nsp++;
            row++;
            System.out.println(" ");
        }
    } 
}
