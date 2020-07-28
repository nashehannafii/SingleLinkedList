/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author xdragon
 */
public class Insertion {
    public Insertion head = null;
    public Insertion tail = null;
    
    public int data ;
    public Insertion next;
    
    public Insertion (int d){
        this.data = d;
        this.next = null;
    }
    
    public void pala (int kasihnama){
        Insertion node = new Insertion(kasihnama);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Insertion i = head;
            
            head = node;
            head.next = i;
        }
    }
    public void ekor(int i){
        Insertion newnode = new Insertion(i);
        
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    
    public void delete(int uhuy){
        if (uhuy == 0) {
            head = head.getnext();
            return;      
        }
        Insertion current = head;
        int kon = 0;
        while (kon < uhuy-1) {
            current = current.getnext();
            if (current == null) {
                throw new IndexOutOfBoundsException("ZONK");
            }
            kon++;
        }
        if (current.getnext() == null) {
            throw new IndexOutOfBoundsException("ZONK");
        }
        current.setnext(current.getnext().getnext());
    }
    
    public Insertion(){
        this.getClass();
    }
    
    public String pucek(){
        String output ="";
        Insertion current = head;
        while (current != null) {
            output += current.getdata()+",";
            current = current.getnext();
        }
        return output;
    }
    public int getdata(){
        return data;
    }
    
    public Insertion getnext(){
        return next;
    }
    
    public void setdata(int d){
        data = d;
    }
    public void setnext(Insertion tes){
        next = tes;
    }
    public static void main(String[] args) {
        Insertion tes = new Insertion();
        System.out.println("\nSebelum di Remove :");
         tes.pala(3);
         tes.pala(7);
         tes.pala(9);
         tes.pala(0);
         tes.ekor(1);
         tes.ekor(3);
         
         System.out.println(tes.pucek());
         
         System.out.println("\nSetelah di Remove :");
         tes.delete(3);
         System.out.println(tes.pucek());
    }
}
