import java.util.Scanner;
import java.lang.*;
public class If {
    Scanner hema =new Scanner(System.in);
    int a=hema.nextInt();
    public void display(){
        if (a>0){System.out.println(" it is positive");}
        else if (a<0){System.out.println(" it is negative");}
        else {System.out.println("zero");}
    }
    public static void  main(String[] args){
        System.out.println("Enter the value A:");
        If obj=new If();
        obj.display();
    }  
}
