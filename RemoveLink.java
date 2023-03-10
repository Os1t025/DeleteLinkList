public class RemoveLink 
{
    // Head of list
    Node head;
    // Linked list Node
    class Node
   {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    // main method
    public static void main(String[] args)
    {
        RemoveLink list = new RemoveLink();
         //list of numbers in link list
        list.data(71);
        list.data(40);
        list.data(21);
        list.data(33);
        list.data(11);
        list.data(50);
        
        System.out.println("Linked list:");
        list.printList();
        //Delete at N=2
        int N = 2;
        list.deleteNode(N);
 
        System.out.println("\nLinked List after Deletion:");
        list.printList();
    }
    // Function to delete the nth node from the end of the given linked list
    public void deleteNode(int key)
    {
        // First pointer will point to the head of the linked list
        Node first = head;
        // Second pointer will point to the Nth node from the beginning
        Node second = head;
        for (int i = 0; i < key; i++) 
        {
            // If count of nodes in the given linked list is <= N
            if (second.next == null) 
            {
                // If count = N , delete the head node
                if (i == key - 1)
                    head = head.next;
                return;
            }
            second = second.next;
        }
        // Increment both the pointers by one until second pointer reaches the end
        while (second.next != null) 
        {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
    }
    // Function to insert a new Node at front of the list
    public void data(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    // Function to print the linked list
    public void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
}