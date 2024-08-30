import java.util.Scanner; // import the Scanner class to get user input
//The Scanner class is imported from the java.util package to enable user input from the console.


public class studentEvaluvation { // creating a class using studentEvaluvation class name
    //This line declares a public class named studentEvaluvation. In Java, the class name typically 
    //starts with an uppercase letter (conventionally). Here, it's lowercase, which is technically valid but against convention.

    public static void main(String[] args) { // intialization a main method
        //This is the entry point of the program. The main method is where the program starts executing.

        Scanner scanner = new Scanner(System.in); // intialization a Scanner Class
        //An instance of Scanner is created to take user input from the console.

        
        String[] studentNames = new String[10];// Array to hold the names of 10 students
        int[][] marks = new int[10][5]; // 10 students, 5 subjects (English, Tamil, Maths, Science, Social) // 2D array to hold marks of 10 students in 5 subjects
/*studentNames is a one-dimensional array to store the names of 10 students.
marks is a two-dimensional array to store the marks of these 10 students 
in 5 subjects: English, Tamil, Maths, Science, and Social.*/
        
        for (int i = 0; i < 10; i++) { // Input for student names and marks
            System.out.print("Enter the name of student " + (i + 1) + ": "); // print the statement 
            studentNames[i] = scanner.nextLine(); // print the statement on the next line

            System.out.println("Enter marks for " + studentNames[i] + ": "); // print the statement marks + student names 
            System.out.print("English: "); //print the statement to get the user input
            marks[i][0] = scanner.nextInt(); // print the statement on the next line
            System.out.print("Tamil: ");  //print the statement to get the user input
            marks[i][1] = scanner.nextInt(); // print the statement on the next line
            System.out.print("Maths: "); //print the statement to get the user input
            marks[i][2] = scanner.nextInt(); // print the statement on the next line
            System.out.print("Science: "); //print the statement to get the user input
            marks[i][3] = scanner.nextInt(); // print the statement on the next line
            System.out.print("Social: "); //print the statement to get the user input
            marks[i][4] = scanner.nextInt(); // print the statement on the next line
/*A loop iterates 10 times to gather data for each student.
studentNames[i] = scanner.nextLine(); takes the student's name as input and stores it in the studentNames array.
The next few lines prompt the user to input marks for each subject, which are then stored in the corresponding index of the marks array.
scanner.nextLine(); is called after reading the integers to clear the buff*/
            
            scanner.nextLine(); // Clear the scanner 

        }

        
        for (int i = 0; i < 10; i++) { // calaculating  displaying results for each student
            System.out.println("\nResults for " + studentNames[i] + ":"); //print the statement to get the user input

            
            int total = 0; // Calculate total and average marks
            for (int j = 0; j < 5; j++) {
                total += marks[i][j];
            }
            double average = total / 5.0; // calculating the marks for 5 subjects

            
            boolean passed = true; // Check if student passed
            for (int j = 0; j < 5; j++) { 
                if (marks[i][j] < 35) {
                    passed = false;
                    // whelether the student is failed exit the loop
                }
            }

            
            String classification = ""; // Determine the class the student passed in
            if (passed) {
                if (average >= 75) {
                    classification = "Distinction"; // evaluvating with there marks 
                } else if (average >= 60) {
                    classification = "First Class";  // evaluvating with there marks 
                } else if (average >= 50) {
                    classification = "Second Class";  // evaluvating with there marks 
                } else {
                    classification = "Third Class";  // evaluvating with there marks 
                }
            } else {
                classification = "Failed";  // evaluvating with there marks 
            }

            
            System.out.println("Classification: " + classification); // Display classification

            
            boolean eligibleForEngineering = (marks[i][2] + marks[i][3]) >= 180; // Check eligibility for Engineering College

            
            boolean eligibleForArts = (marks[i][3] + marks[i][4]) >= 130; // Check eligibility for Arts College

            
            if (eligibleForEngineering && eligibleForArts) { // Display eligibility
                System.out.println("Eligible for both Engineering and Arts College."); // print the statement on the next line
            } else if (eligibleForEngineering) {
                System.out.println("Eligible for Engineering College."); // print the statement on the next line
            } else if (eligibleForArts) {
                System.out.println("Eligible for Arts College."); // print the statement on the next line
            } else {
                System.out.println("Not eligible for Engineering or Arts College."); // print the statement on the next line
            }
            /*Another loop iterates over each student to process and display their results.
Total and Average:
The inner loop sums up the marks of the 5 subjects to calculate the total marks.
The average is then calculated by dividing the total by 5.
Pass/Fail Check:
Another loop checks if the student has failed any subject (marks less than 35). If so, the student is marked as "Failed."
Classification:
If the student passes all subjects, their performance is classified based on their average marks: "Distinction," "First Class," "Second Class," or "Third Class."
Eligibility:
The program checks if the student is eligible for Engineering or Arts college based on their marks in specific subjects:
Engineering: Requires Maths and Science marks to total at least 180.
Arts: Requires Science and Social marks to total at least 130.
The eligibility status is then printed.*/
        }

        scanner.close();  /*  close the scanner to avoid errors or its a procudure to close scanner.
        Closes the Scanner object to free up resources. It's good practice to
         close the scanner when it's no longer needed.*/
    }
}
