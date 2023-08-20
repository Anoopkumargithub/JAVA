public class pattern_31 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int row = 1;
        while(row<=n){
            int val = n;
            for(int i=1;i<=nst;i++){
                if(row==val){
                    System.out.print("* ");
                }else{
                    System.out.print(val+" ");
                }
                val--;
            }
            row++;
            System.out.println(" ");
        }
    }
}
