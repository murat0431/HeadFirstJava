import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class D {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getMap().keySet());
        Map<String, Integer> myMap = c.getMap();
        myMap.put("Ali", 32);
        System.out.println(c.getMap().keySet());
        ArrayList



    }
}
