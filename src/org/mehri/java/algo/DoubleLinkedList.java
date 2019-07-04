package org.mehri.java.algo;

public class DoubleLinkedList
{
    Node2  head;
    Node2  last;

    public DoubleLinkedList()
    {
        head = null;
        last = null;
    }

    public void  push(int data)
    {
        Node2  newNode = new Node2(data);

        if(head == null)
        {
            head = newNode;
            last = newNode;
        }

        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }


    public void append (int data )
    {
        Node2 newNode = new Node2(data);

        if(head== null) {
            head = newNode;
            last = newNode;
        }

        last.next = newNode;
        newNode.prev = last;
        last = newNode;
    }




    public void  remove(int data)
    {
        Node2 currentNode = head;

        while(currentNode!=null)
        {
            if(currentNode.data == data)
            {
                Node2  previousNode = currentNode.prev;
                previousNode.next = currentNode.next;
            }
            currentNode = currentNode.next;


        }

    }

    public void printList()
    {
        Node2 currentNode = head;

        System.out.println("--- Print double linked list ---");
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;

        }

        System.out.println("\n---------------------------");
    }

    public Node2 peek()
    {
        if(head!=null)
            return head;
        else
            return null;
    }

}
