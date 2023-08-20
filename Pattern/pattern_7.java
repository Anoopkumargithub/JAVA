public class pattern_7 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int row = 1;
        while(row<=n){
            for(int i=1;i<=nst;i++){
                if (row==1 || row==n){
                    System.out.print(" * ");
                }else{
                if (i==1 || i==n){
                System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
        }
            row++;
            System.out.println(" ");
        }
    }
}
