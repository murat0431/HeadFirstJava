import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        Random m = new Random();
        Random n = new Random();
        m = n;
        printSet(System.getenv().entrySet());
        Object o;
        o = new Object();
    }

    public static <K, V> void printSet(Set<Map.Entry<K, V>> s) {
        for(Map.Entry e : s) {
            System.out.println(s);
        }
    }
}
