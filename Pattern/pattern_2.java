public class pattern_2 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = 1;
        while(row<=n){
            for(int i=1;i<=nst;i++){
                System.out.print("* ");
            }
            nst++;
            row++;
            System.out.println(" ");
        }
    }
}
