public class pattern_36 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int row = 1;
        while(row<=n){
            int val = 1;
            for(int i=1;i<=nst;i++){
                if (i<=row){
                    System.out.print(row+" ");
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
