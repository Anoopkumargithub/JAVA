public class pattern_33 {
    public static void main(String[] args) {
        int n= 10;
        int nst = 1;
        int nsp = n-1;
        int row = 1;
        int val = n;
        while(row<=n){
            for(int i=1;i<=nsp;i++){
                System.out.print("  ");
            }int val2 = val;
            for(int i=1;i<=nst;i++){
                if(i==((nst/2)+1)){
                System.out.print("0 ");
            }else if(i<(nst/2)){
                System.out.print(val2+" ");
                val2++;
            }
            else{
                System.out.print(val2+" ");
                val2--;
            }
            }
            
            val--;
            nsp--;
            nst+=2;
            row++;
            System.out.println("  ");
        }
    }
}
