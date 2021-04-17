package com.datastructure;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = tail;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNode(tempNode);
        }
    }

    /*@Description:- To appending the data from given Node */

    public void append(INode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes : ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }

        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    // To Insert the nodes

    public INode insert(INode node , INode newNode) {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
}


