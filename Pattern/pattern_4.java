public class pattern_4 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst = 1;
        int nsp = n-1;
        while(row<=n){
            for(int i=0;i<nsp;i++){
                System.out.print("  ");
                //space change the shape of pattern
            }for(int i=0;i<nst;i++){
                System.out.print("* ");
            }
            nsp--;
            nst++; 
            row++;
            System.out.println(" ");
        }
    }
}
