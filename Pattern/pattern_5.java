public class pattern_5 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=n;
        int nsp = 0;
        while(row<=n){
            for(int i=0;i<nsp;i++){
                System.out.print("  ");
            }for(int i=0;i<nst;i++){
                System.out.print("* ");
            }
            nst--;
            nsp++;
            row++;
            System.out.println(" ");
        }
    }
}
