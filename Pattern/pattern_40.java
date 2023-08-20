public class pattern_40 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 2*n+1;
        int nsp = 1;
        int row = 1;
        while(row<=((2*n)+1)){
            for(int i=1;i<=nsp;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=(nst);i++){
                System.out.print(" * ");
            }for(int i=1;i<=nsp;i++){
                System.out.print(" ");
            }
            nsp++;
            nst-=2;
            row++;
            System.out.println(" ");
        }
    }
}
