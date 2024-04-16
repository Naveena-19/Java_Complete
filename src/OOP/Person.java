package OOP;

public class Person {
    public static void main(String[] args)
    {
        Human Ravi= new Human();
        System.out.println(Ravi.getAge());
        Ravi.setAge(12);
        System.out.println(Ravi.getAge());


    }

}
class Human
{
    private int age;
    private String name;
//    private is keyword where its purpose is that it can be used only in the same cannot be accessed by any class
//    then what is purpose of making this?
//    this can accesse through methods that are allowed not directly used and changed
//    so it is better to keep the variables private most of the cases
    public int getAge()
    {

        return age;//can fetch the age  through method
    }
//    public void setAge(int age,Human obj)
//    {
//        obj.age=age;//need to pass object to access the instance variable
//        age=a;
//    }

    public void setAge(int age)
    {
        this.age=age; //this used to refere the current object
    }

}
