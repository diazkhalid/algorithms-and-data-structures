package com.Modul_3.Respon;

import java.io.PrintStream;

public class Tree {
    Node root;
    int size = 0;
    int num = 0;

    void insertFamily(Node akar, Node child){
        if (child.nama.compareTo(akar.nama)<0){
            if (akar.left == null){
                child.parent = akar.nama;
                akar.left = child;
            }else{
                insertFamily(akar.left, child);
            }
        }else{
            if(akar.right == null){
                child.parent = akar.nama;
                akar.right = child;
            }else{
                insertFamily(akar.right, child);
            }
        }
    }

    void addFamily(Node newNode){
        size ++;
        if (root == null){
            root = newNode;
        }else{
            insertFamily(root, newNode);
        }
    }

    Node search(Node akar, String nama, int lvl){
        if (root == null){
            return null;
        }else{
            if(akar.nama.compareToIgnoreCase(nama)==0){
                akar.level = lvl;
                return akar;
            }else if(akar.nama.compareToIgnoreCase(nama)>0){
                lvl = lvl + 1;
                return search(akar.left, nama, lvl);
            }else{
                lvl = lvl + 1;
                return search(akar.right, nama, lvl);
            }
        }
    }

    void child(Node akar){
        if (akar!=null){
            num++;
            if (akar.left == null && akar.right == null){
                System.out.print("\n"+num + ". " + akar.nama + " (" + akar.gender + "): " + "Tidak memiliki anak");
            }
            if (akar.left != null || akar.right != null){
                System.out.print("\n"+num + ". " + akar.nama + " (" + akar.gender + "): ");
            }
            if (akar.left != null){
                System.out.print(akar.left.nama+" ("+akar.left.gender+")");
                if(akar.right != null){
                    System.out.print(", ");
                }    
            }
            if (akar.right != null){
                System.out.print(akar.right.nama+" ("+akar.right.gender+")");
            }    
            child(akar.left);
            child(akar.right);

            
        }
    }
    
    Node getRoot(){
        return root;
    }

    void Relation(String nama,String nama2){
        int key = 0;
        Node temp = root;
        Node person = search(temp,nama,key);
        Node person2 = search(temp,nama2,key);
        String relate = "";
        int dif = person.level - person2.level;
        if(dif == 0){
            if(person.parent.equalsIgnoreCase(person2.parent)){
                if(person.gender.equalsIgnoreCase("Pria"))
                    relate = "Saudara";
                else 
                    relate = "Saudari";
            }else{
                Node parent1 = search(root,person.parent,key);
                Node parent2 = search(root,person2.parent,key);
                if(parent2.parent.equalsIgnoreCase(parent1.parent))
                    relate = "Sepupu";
                else 
                    relate = "Sepupu jauh";
            }
        }if (dif == -1){
            if(person2.parent.equals(person.nama)){
                if (person.gender.equalsIgnoreCase("Pria"))
                    relate = "Ayah";
                else 
                    relate = "Ibu";
            } else {
                if (person.gender.equalsIgnoreCase("Pria"))
                    relate = "Paman";
                else 
                    relate = "Bibi";
            }
        }else if(dif == 1){
            if((person2.left != null && person2.left.nama.equalsIgnoreCase(person.nama)) || (person2.right != null && person2.right.nama.equalsIgnoreCase(person.nama)))
                relate = "Anak";
            else{
                Node parent1 = search(root,person.parent,key);
                if(parent1.parent.equalsIgnoreCase(person2.parent))
                    relate = "Keponakan ";
                else 
                    relate = "Keponakan jauh";
            }
        }else if(dif == -2){
            if (person.parent != null) {
                Node parent1 = search(root,person.parent,key);
                Node parent2 = search(root,person2.parent,key);
                Node grandParent = search(root,parent2.parent,key);
                if (parent1.nama.equalsIgnoreCase(grandParent.parent)){
                    if (person.gender.equalsIgnoreCase("Pria"))
                        relate = "Kakek";
                    else 
                        relate = "Nenek";
                }else{
                    if (person.gender.equalsIgnoreCase("Pria"))
                        relate = "Kakek";
                    else 
                        relate = "Nenek";
                }
            }else{
                if (person.gender.equalsIgnoreCase("Pria"))
                    relate = "Kakek";
                else 
                    relate = "Nenek";
            }
        }else if(dif == 2)
            relate = "Cucu";
        else if(dif == -3){
            if (person.gender.equalsIgnoreCase("Pria"))
                relate = "Kakek Buyut";
            else 
                relate = "Nenek Buyut";
        }else if(dif == 3)
            relate = "Cicit";
        System.out.println(person.nama+" merupakan "+relate+" dari "+person2.nama);
        person.level = 0;
        person2.level = 0;
    }

    public void traversePreOrder(StringBuilder sb, String padding, String pointer, Node node) {
        if (node != null) {
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.nama);
            sb.append("\n");
    
            StringBuilder paddingBuilder = new StringBuilder(padding);
            paddingBuilder.append("│  ");
    
            String paddingForBoth = paddingBuilder.toString();
            String pointerForRight = "└──";
            String pointerForLeft = (node.right != null) ? "├──" : "└──";
    
            traversePreOrder(sb, paddingForBoth, pointerForLeft, node.left);
            traversePreOrder(sb, paddingForBoth, pointerForRight, node.right);
        }
    }
    public void print(PrintStream os) {
        StringBuilder sb = new StringBuilder();
        traversePreOrder(sb, "", "", this.root);
        os.print(sb.toString());
    }

}
