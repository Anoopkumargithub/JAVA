public class pattern_16 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nsp = n-1;
        int nst = 5;
        while(row<=(2*n)-1){
            //space
            for(int j=0;j<nsp;j++){
                System.out.print("  ");
            }//star
            for(int k=0;k<nst;k++){
                System.out.print(" * ");
            }
            if(row<n){
            nst--;
            nsp--;
            }else{
                nst++;
                nsp++;
            }
            row++;
            System.out.println(" ");
        }
    }
}
