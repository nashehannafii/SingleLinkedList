/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deleting;

/**
 *
 * @author xdragon
 */
public class Deleting {

    Node head;
    
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    void deleteNode(int key){
        Node awal = head, prev = null;
        if (awal != null && awal.data == key){
            head = awal.next;
            return;
        }
        while (awal != null && awal.data != key){
            prev = awal;
            awal = awal.next;
        }
        if (awal == null)
            return;
        prev.next = awal.next;
    }
    public void up(int data_baru){
        Node data_lagi = new Node(data_baru);
        data_lagi.next = head;
        head = data_lagi;
    }
    public void Printing(){
        Node Jnode = head;
        while (Jnode != null){
            System.out.println(Jnode.data+" ");
            Jnode = Jnode.next;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Deleting llist = new Deleting ();
        llist.up(9);
        llist.up(7);
        llist.up(3);
        llist.up(6);
        llist.up(0);
        llist.up(1);
        
        System.out.println("\n Created Deleting list is :");
        llist.Printing();
        llist.deleteNode(1);
        System.out.println("\n Linkedlist After Deletion at position 1 :");
        llist.Printing();
    }
    
}
