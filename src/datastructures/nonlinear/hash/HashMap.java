package datastructures.nonlinear.hash;

import java.util.LinkedList;

public class HashMap<K, V> {
    private class Entry<K, V>{
        K key;
        V value;

        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }


    private final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] table;

    public HashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }


    public void put(K key, V value){
        int hash = getHash(key);
        LinkedList<Entry<K, V>> bucket = table[hash];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)){
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    public V get(K key) {
        int hash = getHash(key);
        LinkedList<Entry<K, V>> bucket = table[hash];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = getHash(key);
        LinkedList<Entry<K, V>> bucket = table[hash];

        bucket.removeIf(entry -> entry.key.equals(key));
    }

    public boolean containsKey(K key) {
        int hash = getHash(key);
        LinkedList<Entry<K, V>> bucket = table[hash];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (LinkedList<Entry<K, V>> bucket : table) {
            for (Entry<K, V> entry : bucket) {
                if (entry.value.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        int size = 0;
        for (LinkedList<Entry<K, V>> bucket : table) {
            size += bucket.size();
        }
        return size;
    }
}
