package OOP;

public class Add {
    public static void main(String[] args) {
//        int num1=8;//in main method num1 is local variable
//        int num2=9;
//        int result=num1+num2;
//        System.out.println(result);
        Calculator calc = new Calculator();//object created using new keyword
//        calc= reference variable

       int result= calc.add(8,9);//using the object call the add method
        System.out.println(result);
        System.out.println(calc.add(20.0,30.8));
    }
}
class Calculator
{
    int a;//it is instance variable
    public int add(int num1,int num2)
    {
       int r=num1+num2;
        return r;
    }

    public double add(double num1,double num2)//method overloading with same name and different parameters and signiture
    {
        return num1+num2;
    }
}
