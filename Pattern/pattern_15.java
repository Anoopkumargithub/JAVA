public class pattern_15 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nsp = 0;
        int nst = n;
        while(row<=(2*n)-1){
            //space
            for(int j=0;j<nsp;j++){
                System.out.print("  ");
            }//star
            for(int k=0;k<nst;k++){
                System.out.print("* ");
            }
            if(row<n){
            nst--;
            nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
            row++;
            System.out.println(" ");
        }
    }
}
