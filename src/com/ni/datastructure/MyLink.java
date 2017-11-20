package com.ni.datastructure;

import java.util.LinkedList;

/**
 * Created by losil_000 on 2017/11/18.
 */
public class MyLink {



    Node head=null;

    class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;

        }
    }

    public void addNode(int d){
        Node newNode=new Node(d);
        if (head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;

    }

    public boolean deleteNode(int index){

        if (index<1 || index>length()){
            return false;
        }
        if (index==1){
            head=head.next;
            return true;
        }
        Node preNode=head;
        Node curNode=preNode.next;
        int i=1;
        while (curNode!=null)
        {
            if (i==index)
            {
                preNode.next=curNode.next;
                return true;
            }
            preNode=curNode;
            curNode=curNode.next;
            i++;
        }
        return false;




    }

    public int length(){
        int length=0;
        Node tmp=head;

        while (tmp!=null)
        {
            length++;
            tmp=tmp.next;
        }

        return length;
    }

    public static void main(String[] args) {
        MyLink myLink=new MyLink();

        myLink.addNode(1);
        myLink.addNode(2);
        myLink.addNode(3);
        myLink.addNode(4);
        //myLink.printRecursion(myLink.head);



    }

    public void printRecursion(Node node){

        if (node!=null)
        {
            if (node.next!=null)
            {
                printRecursion(node.next);

            }
            System.out.println(node.data);

        }
    }



}
