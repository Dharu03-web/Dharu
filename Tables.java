import java.util.Scanner; // user will get any tables

public class Tables {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int tables = myobj.nextInt();

        System.out.println(tables + " Times Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tables + " x " + i + " = " + (tables * i));
        }
    }
}
