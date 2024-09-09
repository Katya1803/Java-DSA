package datastructures.linear;

public class LinkedList<T> extends AbstractList<T>{

    private class Node{
        T data;
        Node prev;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    private Node head;
    private Node tail;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    private Node getNode(int index){
        Node current;
        if(index < size/2){
            current = head;
            for(int i=0; i< index; i++){
                current = current.next;
            }
        } else {
            current = tail;
            for(int i = size -1; i > index; i--){
                current = current.prev;
            }
        }
        return current;
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        if(isEmpty()){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void insert(int index, T element) {
        Node newNode = new Node(element);

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index == 0) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else if (index == size) {
            add(element);
        } else {
            Node current = getNode(index);
            newNode.next = current;
            current.prev.next = newNode;
            newNode.prev = current.prev;
            current.prev = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return getNode(index).data;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node removedNode = getNode(index);

        if (removedNode == head){
            head = head.next;
            if (head != null) head.prev = null;
        } else if (removedNode == tail){
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            removedNode.prev.next = removedNode.next;
            removedNode.next.prev = removedNode.prev;
        }
        size--;
        return removedNode.data;
    }

    @Override
    public void clear() {
        head = tail = null;

        size = 0;
    }
}