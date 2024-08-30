public class Men{
    String name;
    int Number;

    public Men(){

        this.name = "Aravind";
        this.Number = 8387;
        System.out.println(name);
        System.out.println(Number);

    }
    public Men (String name,int Number){
        this.name = name;
        this.Number = Number;
        System.out.println(name);
        System.out.println(Number);
    }
    public void printDetailsMultipleTimes(int times) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Prem " + (i + 1) + ":");
            System.out.println("Name: " + this.name);
            System.out.println("Number: " + this.Number);
        }
    }
    public static void main(String[] args) {
        Men myobj = new Men();
        Men yobj = new Men("Bushan",9227297);
        System.out.println("\nPrinting details of myobj 3 times:");
        myobj.printDetailsMultipleTimes(3);
    }
}
