public class pattern_12 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst = 1;
        int nsp = n-1;
        while(row<=n){
            for(int i=0;i<nsp;i++){
                System.out.print("  ");
                //space change the shape of pattern
            }for(int i=0;i<nst;i++){
                if(i%2!=0){
                    System.out.print("! ");
                }else{
                    System.out.print("* ");
                }
            }
            nsp--;
            nst+=2; 
            row++;
            System.out.println(" ");
        }
    }
}
