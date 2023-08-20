public class pattern_14 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int nsp = n-1;
        int row = 1;
        while(row<=2*n-1){
            for(int i=1;i<=nsp;i++){
                System.out.print("  ");
            }for(int i=1;i<=nst;i++){
                System.out.print("* ");
            }if(row<=4){
                nsp--;
                nst++;
            }else{
                nst--;
                nsp++;
            }
            row++;
            System.out.println("  ");       
        }
    }
}
