import java.util.Map;
import java.util.NoSuchElementException;

public class MapUtility<K,V> {
    private Map<K,V> map;
    public MapUtility(Map<K,V> map) {
        this.map = map;
    }
    public V get(K key) throws NoSuchElementException {
        return map.computeIfAbsent(key,
                                   k -> { throw new NoSuchElementException("Missing key:" + k); });
    }
}