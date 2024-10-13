import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main( String[] args ) {
        Map<String, String> map = new HashMap<>();
        map.put("USA", "North America");
        map.put("Belarus", "Europe");
        map = Collections.unmodifiableMap( map );
        MapUtility<String, String> mu = new MapUtility<>(map);
        System.out.println(mu.get("Germany"));
        // java.lang.UnsupportedOperationException
    }
}