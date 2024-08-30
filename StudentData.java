import java.util.Scanner;

public class StudentData {

    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter the Student name: ");
        String[] studentNames = new String[5];
        int[][] cgpa = new int[5][5];

        for (int i = 0; i < 5; i++) { 
            System.out.print("Enter the name of student " + (i + 1) + ": "); 
            studentNames[i] = myobj.next(); 
            System.out.println("Enter cgpa for " + studentNames[i] + ": "); 
            cgpa[i][0] = myobj.nextInt();
            
            

            
    }
}
}