public class pattern_32 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int row = 1;
        int val = 1;
        while(row<=(2*n)){
            if(row<5){
                for(int i=1;i<=nst;i++){
                if(i%2==0){
                    System.out.print("*     ");
                }else{
                    System.out.print(val+"    ");
                }
            }
            val++;
            nst+=2;
        }else{
            for(int i=1;i<=nst;i++){
                if(i%2==0){
                    System.out.print("*     ");
                }else{
                    System.out.print(val+"    ");
                }
            }
            val--;
            nst-=2;
        }
            row++;
            System.out.println("  ");
        }
    }
}
