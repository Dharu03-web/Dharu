public class add1{
    
    public static void main(String[] args){
        int a=7;
        int b=10;
        int c=a+b;
        int d=a-b;
        int e=a*b;
        
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.println("sum:"+c);
        System.out.println("sub:"+d);
        System.out.println("multiply:"+e);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        int f=a%b;
        float g=(float)a/b;
        int zero=0;
        float h=(float) a/zero;
        System.out.println("division:"+g);
        System.out.println("remainder:"+f);
        System.out.println("divbyzero:"+h);
        for(int i=1;i<11;i++){
            System.out.println(i+" hello world");
        }
        //for(int j=1;j<11;j++){
          //  System.out.println(j);
        //}
        int fact=1;
        for (int i=5;i>1;i--){
            fact*=i;
           
        }
        System.out.println("Factorial is:"+fact);
    }
}
