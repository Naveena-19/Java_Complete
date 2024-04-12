package OOP;

public class Stringp {
    public static void main(String[] args)
    {
        String str= new String("naveena");
        System.out.println(str.hashCode());
        String s="naveena";
        String st="naveena";
        System.out.println(s.hashCode());
        System.out.println(st.hashCode());

        String str1= new String("naveena");
        System.out.println(str1.hashCode());
        System.out.println(str.equals(str1)); //every string has same hashcode pointing to same object

        System.out.println("_______________________________________________");
        String name="nave";
        System.out.println(name+"-"+name.hashCode());

        String name2=name+"ena";
        System.out.println(name2+"-"+name2.hashCode());

        name=name+"ena";

        System.out.println(name+"-"+name.hashCode());
        System.out.println("-----------------------------------------------------");
        //when we want to change string it is not possible because it is immutable instead  we have to create new
//        instance to avoid this we can actually use StringBuilder to manipulate Strings

        StringBuilder sb= new StringBuilder("naveena");
        sb=sb.reverse();
        System.out.println(sb);
        String sb2=sb.toString();
        System.out.println(sb2);
        sb2=sb2.replace('e','y');
        System.out.println(sb2);

StringBuffer su=new StringBuffer("naveena");
//StringBUffer same as StringBuilder the only difference is
//        StringBuffer is threadSafe where as StringBuilder is not





    }
}
