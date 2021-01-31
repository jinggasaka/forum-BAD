package enumerasi;
import java.util.Enumeration;
import java.util.Hashtable;
public class enumerasi {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "Satu");
        ht.put("2", "Dua");
        ht.put("3", "Tiga");
        Enumeration e = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
