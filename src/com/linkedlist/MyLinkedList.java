package com.linkedlist;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    public int count;

    @Override
    public void add(E element) {
        Node<E> node = new Node<>(element);
        if (first == null) {
            first = node;
        } else {
            last.setNextNode(node);
        }

        last = node;
        count++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MyLinkedList{ ");
        Node<E> currentNode = first;
        for (int i =0; i < count; i++){
            builder.append(currentNode.getElement().toString());
            builder.append(" ");
            currentNode = currentNode.getNextNode();
        }
        builder.append("}");
        return builder.toString();
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > count){
           throw new IndexOutOfBoundsException();
        }
        else if (index == count) {
            add(element);
            return;
        }

        Node<E> newNode = new Node<E>(element);
        if (index == 0) {
            newNode.setNextNode(first);
            first = newNode;
        }
        else {
            Node<E> node = getNode(index - 1);
            Node<E> nextNode = node.getNextNode();
            node.setNextNode(newNode);
            newNode.setNextNode(nextNode);
        }
        count++;
    }

    @Override
    public void clear() {
        Node<E> node = first;
        while (node != null) {
            Node<E> next = node.getNextNode();
            node.setNextNode(null);
            node.setElement(null);
            node = next;
        }
        last = null;
        count = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        return getNode(index).getElement();
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> current = first; current != null; current = current.getNextNode()) {
                if (current.getElement() == null)
                    return index;
                index++;
            }
        }
        else {
            for (Node<E> current = first; current != null; current = current.getNextNode()) {
                if (element.equals(current.getElement()))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        E element;
        if (index == 0) {
            element = first.getElement();
            Node<E> next = first.getNextNode();
            first.setElement(null);
            first.setNextNode(null);
            first = next;
        }
        else {
            Node<E> prev = getNode(index - 1);
            Node<E> remove = prev.getNextNode();
            if (index != count - 1) {
                prev.setNextNode(remove.getNextNode());
            }
            element = remove.getElement();
            remove.setElement(null);
            remove.setNextNode(null);
        }
        count--;
        return element;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> node = getNode(index);
        E oldElement = node.getElement();
        node.setElement(element);
        return oldElement;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[count];
        Node<E> currentNode = first;
        for (int i = 0; i < count; i++) {
            array[i] = currentNode;
            currentNode = currentNode.getNextNode();
        }
        return array;
    }

    @Override
    public <E1> E1[] toArray(E1[] a) {
        if (a.length < count) {
            a = (E1[]) new Object[count];
        }
        Node<E> node = first;
        Object[] array = a;
        for (int i = 0; i < count; i++) {
            array[i] = node.getElement();
            node = node.getNextNode();
        }
        return a;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(first);
    }

    private Node<E> getNode(int index) {
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNextNode();
        }
        return node;
    }

    public class MyIterator<E> implements Iterator {
        Node<E> node;

        MyIterator(Node<E> begin) {
            node = begin;
        }

        @Override
        public boolean hasNext() {
            return node.getNextNode() != null;
        }

        @Override
        public Node<E> next() {
            return node.getNextNode();
        }
    }
}
