package ru.mirea.work17.task2;

public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> prev = null;
    private  Node<T> next = null;
    public Node(T dataValue){
        this.data = dataValue;
    }

    public Node(T dataValue, Node<T> next){
        this.next = next;
        this.data = dataValue;
    }

    public T getData(){
        return data;
    }

    public void setData(T dataValue){
        this.data = dataValue;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public int compareTo(Node<T> other){
        return data.compareTo(other.data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
