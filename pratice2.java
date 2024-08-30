
public class pratice2 {
    static String name;
    int phonenumber;

    public pratice2(String name ,int phonenumber){
        this.name=name;
        this.phonenumber=phonenumber;
        

    }
    public static void main(String[] args) {
        pratice2 myobj = new pratice2("Dharneesh", 9600);
        myobj.method();
        

        
    }
    public void method(){
        System.out.println(name);
        System.out.println(phonenumber);


    }
    
}
