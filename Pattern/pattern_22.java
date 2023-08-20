public class pattern_22 {
    public static void main(String[] args) {
        int n= 7;
        int nst1 =n;
        int nst2 = n-1;
        int nsp = -1;
        int row = 1;
        while(row<=n) {
            for(int i=1;i<=nst1;i++){
                System.out.print(" * ");
            }for(int i=1;i<=nsp;i++){
                System.out.print("   ");
            }for(int i=1;i<=nst2;i++){
                System.out.print(" * ");
            }nst1--;
            if(row ==1){
                nst2=n-1;
            }else{
            nst2--;}
            nsp+=2;
            row++;
            System.out.println("  ");
        }
    }
}
