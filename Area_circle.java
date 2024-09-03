import java.util.Scanner;

public class Area_circle {
    Scanner scanner=new Scanner(System.in);
    int r=scanner.nextInt();

    public void main(){
        int pi=22/7;
        
        int circle=pi*(r*r);
        System.out.println(circle);

    }
    public static void main(String[] args){
        Area_circle obj=new Area_circle();
        obj.main();


    }
    
}
