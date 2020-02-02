import java.util.HashMap;
import java.util.Map;

public class C {
    int number;
    private final String name = "Murat";
    private final Map<String, Integer> map = new HashMap<>();

    public C() {
        map.put("Murat", 25);
        map.put("Ahmet", 34);
    }
    public Map<String, Integer> getMap() {
        return map;
    }
    public void setName(String name) {

    }
    public String getName() {
        return name;
    }
}
