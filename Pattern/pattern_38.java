public class pattern_38 {
    public static void main(String[] args) {
            int n = 10;
            for(int i=n;i>=1;i--){
                    if(i%2!=0){
                        System.out.println(i);
                        System.out.println();
                    }
                }for(int i=1;i<=n;i++){
                    if(i%2==0){
                        System.out.println(i);
                        System.out.println();
                    }
                }
    }
}
