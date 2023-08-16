package com.Modul_2.Respon;

public class LinkedList {
    Node head;
    Node current, current1;

    void insertElement(String name, String nim){
        Node newNode = new Node(name, nim);
        if (head==null){
            head = newNode;
            head.next = null;
            return;
        }

        current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    void printList(){
        current = head;
        while(current != null){
            System.out.println(current.mhs.nim+"| "+current.mhs.nama);
            current = current.next;
        }
    }

    void bubbleSortNama(){
        current = head;
        while (current != null){
            current1 = head;
            while(current1.next != null){
                if (current1.mhs.nama.charAt(0)>current1.next.mhs.nama.charAt(0)){
                    mahasiswa temp = current1.mhs;
                    current1.mhs = current1.next.mhs;
                    current1.next.mhs = temp;
                }
                current1 = current1.next;
            }
            current = current.next;
        }
    }

    void bubbleSortNim(){
        current = head;
        while (current != null){
            current1 = head;
            while(current1.next != null){
                if (current1.mhs.nim.compareTo(current1.next.mhs.nim)>0){
                    mahasiswa temp = current1.mhs;
                    current1.mhs = current1.next.mhs;
                    current1.next.mhs = temp;
                }
                current1 = current1.next;
            }
            current = current.next;
        }
    }
}
