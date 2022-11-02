/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author omben
 */
public class Main {

    public static void main(String[] args) {
        SearchTree myTree = new SearchTree();
        
        myTree.insert(new Node(50));
        myTree.insert(new Node(10));
        myTree.insert(new Node(20));
        myTree.insert(new Node(30));
        myTree.insert(new Node(40));
        myTree.insert(new Node(60));
        myTree.insert(new Node(70));
        myTree.insert(new Node(80));
        myTree.insert(new Node(90));
        myTree.insert(new Node(100));
        
        //myTree.inorder();
        //myTree.preorder();
        myTree.postorder();
        
    }
    
}
