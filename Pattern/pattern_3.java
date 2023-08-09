public class pattern_3 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=n;
        while(row<=n){
            //star 
            for(int i=nst;i>=1;i--){
                System.out.print("* ");
            }
            nst--;
            row++;
            System.out.println(" ");
        }
    }
}
