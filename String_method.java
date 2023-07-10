import java.util.Scanner;

public class String_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Anoop Kumar";
        
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim()); // remove spaces from starting
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,9));
        System.out.println(name.replace("oo", "u"));
        System.out.println(name.startsWith("An"));
        System.out.println(name);
        sc.close();
    }
}
