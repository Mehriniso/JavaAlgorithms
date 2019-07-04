package org.mehri.java.algo;

public class LinkedList
{

    private Node head;
    int count = 0;

    public LinkedList()
    {
        head = null;
    }

    public void displayLinkedList()
    {
        if(head == null)
        {
            System.out.println("Sorry, list is empty.");
            return;
        }


         else

        {
            Node currentNode = head;

            while(currentNode!=null)
            {
                System.out.print(currentNode.data + "  ");
                currentNode = currentNode.next;
            }

        }

    }

    public void insert(int data)
    {
        Node  newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            Node currentNode = head;
            Node previousNode = head;
          //   int count = 0;
            while(currentNode!=null)
            {
                count++;
                previousNode = currentNode;
                currentNode = currentNode.next;
//                System.out.println("--------"+count+".iteration"+"--------");
//                System.out.println( "Head data:" + head.data);
//                System.out.println( "previous data:" + previousNode.data);
//                if(currentNode!=null) {
//
//                    System.out.println("current data:" + currentNode.data);
//                }
//                System.out.print( "Head data:" + head.data);

            }
            previousNode.next = newNode;
        }
    }

    public void remove(int data)
    {
        Node currenNode = head;
        Node perviousNode = head;

        if(head.data == data)
        {
            head = head.next;
            return;
        }

        while(currenNode!=null)
        {
            if(currenNode.data == data)
            {
                perviousNode.next = currenNode.next;
                System.out.println(" Data  were removed successfully");
                return;
            }

             perviousNode = currenNode;
             currenNode = currenNode.next;
        }

        System.out.println("No matching data found");
        return;

    }

    public Node  find(int data)
    {
        Node currenNode = head;
        if(head.data == data)
            return head;
        {
        }

        while(currenNode!=null)
        {

            if(currenNode.data == data)

            {
                return currenNode;
            }

            currenNode = currenNode.next;
        }

        System.out.println("No matching data found");
        return null ;

    }


}
