import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        int container = 23;
        String container2 = "Dharneesh";
        String john = "j";
        int a = 23;
        int b = 56;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        
        
       
        


        System.out.println("hello world ");
        System.out.println(container + container2 + john);
        System.out.println(john);
        System.out.println(container2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        System.out.println("sum = "+ c);
        System.out.println("sub = " + d);
        System.out.println("multiple = " + e);
        System.out.println("dividion = " + f);
        Scanner dinesh = new Scanner(System.in);
        System.out.println("Enter you name : ");
        String g = dinesh.nextLine();
        System.out.println("Enter your Number: ");
          int h = dinesh.nextInt();
        System.out.println(h);
        int i = dinesh.nextInt();
        int j = dinesh.nextInt();
        System.out.println(i + j);
        dinesh.close();
       
        

        
    }
    
}
