/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearchtree;

/**
 *
 * @author savannah
 */
public class BST {
   private Node root; //dont give user access
    
    public BST(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    //user uses this one, calls serach at line 27
    public Node search(int item){ 
        if(isEmpty())
            return null;
        else
            return search(root,item);
    }
    public Node search(Node curr, int item){
        if(curr.data == item)
            return curr;
        else if(curr == null)
            return null;
        else if(item < curr.data)
           return search(curr.left, item);
        else 
           return search(curr.right, item);
    }
     public void insert(int item) {
         root = insert(root, item);
     }   
     private Node insert(Node curr, int item){
         
         if(curr == null){
          Node n = new Node(item); //make node before inserting
             curr = n;
             return curr;
     }
         if(item < curr.data)
             curr.left = insert(curr.left,item);
         else
            curr.right = insert(curr.right, item);      
         return curr;
     }
     public void inorder(){
             inorder(root);
     }
     //2nd time seeing
     private void inorder(Node curr){
         if(curr!= null){
             inorder(curr.left);
             System.out.println(curr.data + " ");
             inorder(curr.right);
         }
     }
     
     public void preorder(){ 
         preorder(root);
     }
     //first time seeing
     private void preorder(Node curr){
         if(curr != null){
             System.out.println(curr.data + " ");
             preorder(curr.left);
             preorder(curr.right);
         }
         
     }
     public void postorder(){
         postorder(root);
     }
     //last time seeing
     private void postorder(Node curr){
         if(curr != null){
             postorder(curr.left);
             postorder(curr.right);
             System.out.println(curr.data + " ");
         }
     }
}
