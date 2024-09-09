package datastructures.linear;

public abstract class AbstractList<T> {
    protected int size;

    public AbstractList() {
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public abstract void add(T element);

    public abstract void insert(int index, T element);

    public abstract T get(int index);

    public abstract T remove(int index);

    public abstract void clear();
}
