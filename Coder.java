import java.util.Scanner;
public class Coder {
    public static void main(String[] args) {
        int a = 23;
        int b = 34;
        int c = a+b;
        int d = c/a;
        int e = d*b;
        int f = e%c;
        System.out.println("Hello world");
        System.out.println(a);
        System.out.println(b);
        System.out.println("sum: "+c);
        System.out.println("division: "+d);
        System.out.println("mutiple: "+e);
        System.out.println("module: "+f);
        Scanner name = new Scanner(System.in);
        System.out.println("enter your name: ");
        name.nextLine();
        Scanner Phone  = new Scanner(System.in);
        System.out.println("enter your Phone: ");
        name.nextInt();
        Scanner Address = new Scanner(System.in);
        name.nextLine();
        System.out.println("enter your Address: ");
        name.nextLine();


    }
    
}
