import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class Assending {


    Scanner input=new Scanner(System.in);
    List<String> username=new ArrayList<>();
    public void arange(){
        
        while(true){
            for (int i=0;i<1;i++){                                                            
                System.out.println("Enter the UserName:");
                String users=input.nextLine();
                username.add(users);
                

            }
            System.out.println("Do You Wanna To Edit The List:");
            String yes=input.nextLine();
            if(yes.equalsIgnoreCase("y")){
                continue;
            }
            else{
                break;
            }

        }
        System.out.print("Enter A/D:");
        String a=input.nextLine();
        if( a.equalsIgnoreCase("A")){
        Collections.sort(username);
        System.out.println("**********Ascending Order**********");
        for (String users:username){
        System.out.println(users);}
        System.out.println("Edit the list again:");
        String list=input.nextLine();
        if(list.equalsIgnoreCase("y")){
            
            arange();

        }

        }
        /*System.out.println("Do u wanna to Exit");
        String exit=input.nextLine();
        if(exit.equalsIgnoreCase("y")){}*/
        
    

        
    
    else if(a.equalsIgnoreCase("D")){
    Collections.sort(username,Collections.reverseOrder());
    System.out.println("**********Descending Order**********");
    for (String users:username){
        System.out.println(users);
        }
        System.out.println("Edit the list again:");
        String list=input.nextLine();
        if(list.equalsIgnoreCase("y")){
            arange();

        }}}
    
    ///public void ascending(){
    ///    Collections.sort(username);
    ///    System.out.println("**********Ascending Order**********");
    ///    for (String users:username){
    ///        System.out.println(users);
    ///    }
   /// }
    /*   public void descending(){
            Collections.sort(username,Collections.reverseOrder());
            System.out.println("**********Descending Order**********");
            for (String users:username){
                System.out.println(users);
            }

    }*/
    
    public static void main(String[] args){
        Assending obj=new Assending();
        obj.arange();
        ///obj.ascending();
        //obj.descending();
        }
    }
    

    

