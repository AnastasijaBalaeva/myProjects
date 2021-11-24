package com.linkedlist;

public class Node<E> {

    private E element;
    private Node nextNode;

    public Node(E element){
        this.element = element;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public E getElement() {
        return element;
    }
}
