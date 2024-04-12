package OOP;

public class ReverseString {
    public static void main(String[] args) {
        String str="naveena";
        String rstr="";

        for(int j=str.length()-1;j>=0;j--)
        {

            rstr=rstr+str.charAt(j);
        }

        System.out.println(rstr);
    }
}
