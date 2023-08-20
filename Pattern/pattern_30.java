public class pattern_30 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int row = 1;
        while(row<=n){
            int val = n;
            for(int i=0;i<nst;i++){
                System.out.print(val+" ");
                val--;
            }
            row++;
            System.out.println(" ");
        }
    }
}
