package OOP;

public class Add {
    public static void main(String[] args) {
//        int num1=8;
//        int num2=9;
//        int result=num1+num2;
//        System.out.println(result);
        Calculator calc = new Calculator();//object created using new keyword
//        calc= reference variable

       int result= calc.add(8,9);//using the object call the add method
        System.out.println(result);
    }
}
class Calculator
{
    public int add(int num1,int num2)
    {
       int r=num1+num2;
        return r;
    }
}
