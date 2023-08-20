public class pattern_21 {
    public static void main(String[] args) {
        int n= 6;
        int nst1 = 1;
        int nst2 = 1;
        int nsp = 2*n-3;
        int row = 1;
        while(row<=n){
            for(int i=1;i<=nst1;i++){
                System.out.print("* ");
            }for(int i=1;i<=nsp;i++){
                System.out.print("  ");
            }
            for(int i=1;i<=nst2;i++){
                System.out.print("* ");
            }nst1++;
            if(nst2<n-1){
                nst2++;
            }else{
                nst2=n-1;
            }
            nsp-=2;
            row++;
            System.out.println("  ");
        }
    }
}
