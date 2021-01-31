import java.util.*;

class GFG {
    String name;
    int rollNo;

    GFG(String s, int n)
    {
        name = s;
        rollNo = n;
    }

    public String toString()
    {
        return "Name : " + name + " | Roll No : " + rollNo;
    }

    public static void main(String[] args)
    {
        ArrayList<GFG> arr = new ArrayList<GFG>();

        GFG t1 = new GFG("Dika", 101);
        GFG t2 = new GFG("Dedi", 102);
        GFG t3 = new GFG("Aji", 103);
        GFG t4 = new GFG("Tirta", 104);

        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
        arr.add(t4);

        for (GFG c : arr)
            System.out.println(c);
    }
}