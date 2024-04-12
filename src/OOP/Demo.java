package OOP;

public class Demo
{
    public static void main(String[] args)
    {
            Computer com1=new Computer();
            com1.playMusic();
            com1.getMeAPen(4);
    }

}

class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing");
    }
    public String getMeAPen(int a)
    {
        return "Pen";
    }
}
