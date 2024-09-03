public class Constructor {
    // variable declaration
    String CarName;
    String CarModel;
    int Price;
    public Constructor(){
        CarName="BMW";
        CarModel="x5";
        Price=150000;

    }
    public Constructor(String CarName,String CarModel,int Price){
        this.CarName=CarName;
        this.CarModel=CarModel;
        this.Price=Price;}
    public void show(){
        System.out.println(CarName);
        System.out.println(CarModel);
        System.out.println(Price);}
    public static void main(String[] args){
        Constructor car1=new Constructor();
        Constructor car2=new Constructor("audi","c_class",1600000);
        car2.show();
        car1.show();
        



    }
    
}
