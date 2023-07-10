import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //  --> Arthmetic operator  --> + , - , * , / , % , ++ , --
        System.out.println(sc.nextInt() + sc.nextInt());
        System.out.println(sc.nextInt() - sc.nextInt());
        System.out.println(sc.nextInt() * sc.nextInt());
        System.out.println(sc.nextInt() / sc.nextInt());
        System.out.println(sc.nextInt() % sc.nextInt());  // %--> give remainder
         */
        /*
        // --> Assignment Operator --> = , += , -= , *=
        int a = 10;
        System.out.println(a);
        int b = 10;
        b += 20 ;
        System.out.println(b);
         */
        // --> Comparision Operator --> == , >= , <= , < , > , !=
        // --> LOgical Operator --> && , || , !
        // --> Bitwise Operator --> & , | , ! , ^ , << , >> 
        int a = 100;
        int b = 011;
        System.out.println(a^b);
        System.out.println(a<<b); //(a  * 2^b)
        System.out.println(a>>b); // (a / 2^b) --> Q
        sc.close();


    }
}
