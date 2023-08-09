public class pattern_20 {
    public static void main(String[] args) {
        int n=7;
	    int row=1;
	    int nsp1=3,nsp2=-1;
	   while(row<=n){
	        for(int i=1;i<=nsp1;i++){
	           System.out.print("  ");
	       }
	       System.out.print("* "); 
	       for(int i=1;i<=nsp2;i++){
	           System.out.print("  ");
	       }
	       if(row!=1&&row!=7)
	       System.out.print("*");
	       
	        if(row<(n/2)+1){
	           nsp1--;
	           nsp2+=2;
	       }
	       else{
	           nsp1++;
	           nsp2-=2;
	       }
	       System.out.println();
	row++;
}
    }
}
