import java.util.ArrayList;


public class ModifyListObject {
    public static void main(String[] args)
    {
        ArrayList <A> listA = new  ArrayList <A>();
        listA.add(new A("1"));
        listA.add(new A("2"));
        listA.add(new A("3"));

        listA.get(1).setName("4");

        for (A a:listA)
        {
            System.out.println(a.name);
        }
    }
}
