public class pattern_35 {
    public static void main(String[] args) {
        int n = 7;
        int nst = n;
        int row = 1;
        while(row<=n){
            int val = 1;
            for(int i=0;i<nst;i++){
                if (i>=row){
                    System.out.print("* ");
                }else{
                System.out.print(val+" ");
            }
                val++;
            }
            row++;
            System.out.println(" ");
        }
    }
}
