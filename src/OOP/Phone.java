package OOP;

public class Phone
{
    public static  void main(String[] args)//main method need to be static because it is the starting pint of
//            program and need need of object to create
    {
        Mobile obj=new Mobile();
        obj.brand="Apple";
        obj.price=15000;
        obj.name="SmartPhone";

        obj.show();

        Mobile obj1=new Mobile();
        obj1.brand="BApple";
        obj1.price=45000;
        obj1.name="SPhone";




//        Class.forName("Mobile");//this is to instantiate class if it is not used

        obj1.show();


        obj.show();
        System.out.println(Mobile.name);

        Mobile.show1();

    }
}
class Mobile
{
     String brand;
    int price;
    static String name;//static means commonly shared and can be accessed without object just with class
    //static means class member not object member





    static //static block is called only once 
    {
        name="Phone";
    }

    public  void show()
    {
        System.out.println(brand+":"+price+":"+name);
    }
    public static void show2(Mobile obj)
    {

        System.out.println(obj.brand+":"+obj.price+":"+name);
//        non static is allowed in static method when it has object
    }


    public  static void show1()
    {
        System.out.println(name);
    }//    we can use static in non static but not vice versa


}
