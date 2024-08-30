public class Example { // nested if example//
    public static void main(String[] args) {
        int age = 25;
        boolean noLicense = true;

        if (age >= 17) {
            // First condition checks if the person is an adult
            System.out.println("You are not an  adult.");
            
            if (noLicense) {
                // Second condition checks if the person has a driving license
                System.out.println("You are  not allowed to drive.");
            } else {
                System.out.println("You are not allowed to drive without a license.");
            }
        } else {
            System.out.println("You are not an adult.");
        }
    }
}

