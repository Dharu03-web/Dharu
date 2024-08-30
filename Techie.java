import java.util.Scanner;
public class Techie {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double mark = scan.nextDouble();
        scan.next();
        String domain = scan.nextLine();
        System.out.println("My name is " + name);
        System.out.println("my mark is " + mark/10+ "/10");
        System.out.println("My department is " + domain);





    

    }
    
}
