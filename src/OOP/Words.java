package OOP;



class A//every class in java extends Object class by default
{
    public A()
    {
        System.out.println("this is A");
    }
    public A(int n)
    {
        System.out.println("this is in A and int");
    }
}
class B extends A //b extends A not object but A extendsObkject class (multilevel inheritence)
{
    public B()
    {
        super();//even if it is not mentioned it is there //this calls the constructor of super class
        System.out.println("this is B");
    }
    public B(int n)
    {
//        super(n);//after passing parameter it will call parameterized constructor
        this();//this method calss the same class constructor
        System.out.println("this is in B and int");
    }

}
public class Words
{
    public static void main(String[] args)
    {
        B obj = new B(); //class constructor of both A and B
        B obj1 = new B(3);
    }
}
