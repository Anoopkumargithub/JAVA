public class pattern_19 {
    public static void main(String[] args) {
        int n=7;
        int nst1=(n/2)+1;
        int nst2=(n/2);
        int nsp=-1;
        int row=1;
        while(row<n){
            for(int i=1;i<=nst1;i++){
                System.out.print("* ");
            }
            for(int i=1;i<=nsp;i++){
                System.out.print("  ");
            }for(int i=1;i<=nst2;i++){
                System.out.print("* ");
            }
            if(row<=(n/2)){
                nst1--;
                if(row!=1)
                nst2--;
                nsp+=2;
            }
                else{
                    nst1++;
                    nsp-=2;
                    if(row!=n-1)
                    nst2++;
            }
            System.out.println();
            row++;
        }
    }
}
