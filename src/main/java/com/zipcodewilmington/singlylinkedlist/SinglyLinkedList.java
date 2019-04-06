package com.zipcodewilmington.singlylinkedlist;



/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<E extends Comparable>{

    private Node headNode;
    private int size;


    public void addNode(E value){
       Node node = new Node(value);
       //getLastNode().next = node;
        if(headNode == null){
            headNode = node;
        }else {
            Node lastNode = getLastNode();
            lastNode.next = node;
        }
     }


    public E remove(int index){
        Node node = headNode;
        Node nodeToRemove = null;
        int count = 0;

        while(count < index - 1){
            count++;
            node = node.next;
        }
        nodeToRemove = node.next;
        node.next = nodeToRemove.next;
        nodeToRemove.next = null;//to make sure the removed node is garbage collected
        return (E) nodeToRemove.value;
    }


    public int size() {
        Node node = headNode;
        int size = 0;
        while(node != null){
            size++;
            node = node.next;
        }
        return size;
    }

//    public void sort() {
//        Node prev = null;
//        Node current = headNode;
//        Node next = current.next;
//
//        while(next != null){
//            if(current.value.compareTo()){
//                if(current == headNode){
//                  headNode = current.next;
//                  headNode.next = current;
//                  current.next = next.next;
//                  headNode.next = current;
//                }
//            }
//        }
//    }

    private Node getLastNode(){
        Node node = headNode;
        while(node.next != null){
            node = node.next;
        } return node;
    }

    private  Node getNodeAfterHead(){
        Node node = headNode;
        while(node.next != null){
            node = headNode.next;
        }return node;
    }

    private Node getNodeByIndex (int index){
        Node node = headNode;
        for (int i = 0; i < index; i++) {
             node = node.next;
        }
        return node;
    }

    public E get(int index) {
        return (E) getNodeByIndex(index + 1).value;
    }

    public boolean contains(E value) {
        Node node = headNode;
        while(node.next != null){
            node = node.next;
            if(node.value == value){
                return true;
            }
        }
        return false;
    }

    static class Node<T> {

        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    }




