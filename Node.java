/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearchtree;

/**
 *
 * @author savannah
 */
public class Node {
    int data;
    Node left;
    Node right;
    
    public Node(){
        data = 0;
    //    left = null;
     //   right = null;
        
    }
    public Node(int data){
        this.data = data;
      //  this.right = right;
     //   this.left = left;
        
        
        
    }
    @Override
    public String toString(){
        return data + " ";
    }
}
