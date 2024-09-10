package datastructures.nonlinear.hash;

public class HashSet<E> {
    private final HashMap<E, Object> map;
    private static final Object DUMMY = new Object();  // Một giá trị mặc định để lưu trữ vào HashMap

    public HashSet() {
        map = new HashMap<>();
    }

    public void add(E e) {
        map.put(e, DUMMY);
    }

    public void remove(E e) {
        map.remove(e);
    }

    public boolean contains(E e) {
        return map.containsKey(e);
    }

    public int size() {
        return map.size();
    }
}
