package com.datastructure;

public class MyNode<k> {
    private k key;
    private MyNode next;

    public MyNode(k key) {
        this.key = key;
        this.next = null;
    }

    public void setNext(MyNode next) {
        this.next=next;
    }

    public MyNode getNext() {
        return next;
    }
}
