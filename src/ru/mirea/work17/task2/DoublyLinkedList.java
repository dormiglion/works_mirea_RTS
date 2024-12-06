package ru.mirea.work17.task2;

public class DoublyLinkedList<T extends Comparable<T>> {
    Node<T> head = null;
    Node<T> tail = null;

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
    }

    public void sort() {
        if (head == null || head == tail) {
            return;
        }
        Node<T> cur = head;
        Node<T> prevMin = null;
        while (cur != null) {
            Node<T> minNode = findMinNode(cur);
            if (minNode != cur) {
                removeNode(minNode);
                insert(minNode, prevMin);
                prevMin = minNode;
            }
            cur = minNode.getNext();
        }
    }

    private Node<T> findMinNode(Node<T> start) {
        Node<T> minNode = start;
        Node<T> curNode = start;
        while (curNode != null) {
            if (curNode.compareTo(minNode) < 0) {
                minNode = curNode;
            }
            curNode = curNode.getNext();
        }
        return minNode;
    }

    private void removeNode(Node<T> node) {
        if (node.getPrev() != null) {
            node.getPrev().setNext(node.getNext());
        } else {
            head = node.getNext();
        }

        if (node.getNext() != null) {
            node.getNext().setPrev(node.getPrev());
        } else {
            tail = node.getPrev();
        }
    }

    private void insert(Node<T> node, Node<T> start) {
        if (start != null){
            node.setNext(start.getNext());
            node.setPrev(start);
            start.setNext(node);
        }
        else {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.setNext(head);
                head.setPrev(node);
                head = node;
            }
        }
    }

    @Override
    public String toString() {
        Node<T> current = head;
        StringBuilder out = new StringBuilder("[");
        while (current != null) {
            out.append(current.getData() != null ? current.getData().toString() : "null");
            current = current.getNext();
            if (current != null) {
                out.append(", ");
            }
        }
        out.append("]");
        return "MyDoubleLinkedList{%s}".formatted(out.toString());
    }
}
