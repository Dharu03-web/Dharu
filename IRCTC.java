import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class IRCTC {

    private Random rand = new Random();
    private Scanner scanner;
    private Map<Integer, Booking> bookings = new HashMap<>(); 
    private Map<String, City> cities = new HashMap<>();
    private int choice;
    private String numberOfTickets;

    public IRCTC() {
        scanner = new Scanner(System.in);
        initializeCities();
    }

    public static void main(String[] args) {
        IRCTC reservation = new IRCTC();
        reservation.authentication();
    }

    private void initializeCities() {
        cities.put("Madurai".toLowerCase(), new City("Madurai", 100));
        cities.put("Kovai".toLowerCase(), new City("Kovai", 300));
        cities.put("Trichy".toLowerCase(), new City("Trichy", 350));
        cities.put("Nellai".toLowerCase(), new City("Nellai", 250));
        cities.put("Vellore".toLowerCase(), new City("Vellore", 200));
    }

    public void authentication() {
        System.out.println("Welcome to IRCTC");

        System.out.print("Enter the username: ");
        String username = scanner.nextLine();

        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        if (username.equalsIgnoreCase("admin") && password.equals("pass@123")) {
            System.out.println("The username & password are correct");
            System.out.println("Welcome " + username + "!");
            Action();
        } else {
            System.out.println("The username & password are incorrect");
            System.out.println("Invalid credentials, please retry.");
            authentication();
        }
    }

    public void Action() {
        System.out.println("What would you like to do?");
        System.out.println("1. Reserve Ticket");
        System.out.println("2. Show Bookings");
        System.out.println("3. Exit");

        choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                reserveTicket();
                break;
            case 2:
                showBookings();
                break;
            case 3:
                System.out.println("Exiting the program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                Action();
                break;
        }
    }

    public void reserveTicket() {
        System.out.println("Select the city: Madurai, Kovai, Trichy, Nellai, Vellore");
        String city = scanner.nextLine().toLowerCase();

        City selectedCity = cities.get(city);

        if (selectedCity == null) {
            System.out.println("Invalid city selection.");
            Action();
            return;
        }

        System.out.println("Select the timing: 06:00AM, 10:00AM, 02:00PM, 06:00PM, 10:00PM");
        String timing = scanner.nextLine();

        if (!selectedCity.getTimings().containsKey(timing)) {
            System.out.println("Invalid timing selection.");
            Action();
            return;
        }

        int availableSeats = selectedCity.getTimings().get(timing);

        if (availableSeats <= 0) {
            System.out.println("Sorry, no seats available for this timing.");
            Action();
            return;
        }
        System.out.println("number of seats : "+availableSeats);
        System.out.print("How many tickets do you want (max " + availableSeats + "): ");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();

        if (numberOfTickets > availableSeats) {
            System.out.println("Sorry, only " + availableSeats + " seats available.");
            Action();
            return;
        }

        System.out.print("Confirm the Ticket (Yes/No): ");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("Yes")) {
            System.out.println("Select the payment method: Cash, Card, Gpay");
            String payment = scanner.nextLine();

            for (int i = 0; i < numberOfTickets; i++) {
                int referenceNumber = rand.nextInt(2000000000); 
                int seatNumber = rand.nextInt(100) + 1; 

                bookings.put(referenceNumber, new Booking(city, timing, referenceNumber, seatNumber));
                selectedCity.updateSeats(timing, -1); 
            }

            System.out.println("Congratulations, your tickets are booked!");
            System.out.println("Transaction completed.");
            System.out.println("No of tickets booked: " + numberOfTickets);

            Action(); 
        } else {
            System.out.println("Booking not confirmed. Please try again.");
            Action(); 
        }
    }

    public void showBookings() {
        System.out.println("Showing all bookings:");

        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (Map.Entry<Integer, Booking> entry : bookings.entrySet()) {
                Booking booking = entry.getValue();
                System.out.println("City: " + booking.getCity());
                System.out.println("Timing: " + booking.getTiming());
                System.out.println("Ticket reference number: " + booking.getReferenceNumber());
                System.out.println("Seat number: " + booking.getSeatNumber());
                System.out.println(); 
            }
        }
        Action();
    }

    private class Booking {
        private String city;
        private String timing;
        private int referenceNumber;
        private int seatNumber;

        public Booking(String city, String timing, int referenceNumber, int seatNumber) {
            this.city = city;
            this.timing = timing;
            this.referenceNumber = referenceNumber;
            this.seatNumber = seatNumber;
        }

        public String getCity() {
            return city;
        }

        public String getTiming() {
            return timing;
        }

        public int getReferenceNumber() {
            return referenceNumber;
        }

        public int getSeatNumber() {
            return seatNumber;
        }
    }

    private class City {
        private String name;
        private Map<String, Integer> timings = new HashMap<>();

        public City(String name, int totalSeats) {
            this.name = name;
            this.timings.put("06:00AM", totalSeats / 5); // Assuming equal distribution of seats
            this.timings.put("10:00AM", totalSeats / 5);
            this.timings.put("02:00PM", totalSeats / 5);
            this.timings.put("06:00PM", totalSeats / 5);
            this.timings.put("10:00PM", totalSeats / 5);
        }

        public Map<String, Integer> getTimings() {
            return timings;
        }

        public void updateSeats(String timing, int change) {
            int currentSeats = timings.get(timing);
            timings.put(timing, currentSeats + change);
        }
    }
}
