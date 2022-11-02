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
public class SearchTree {
 
    //declaring the root node
    Node root; 
    
	//to insert a node, i will use recursion by the help of a method called Insertion
	public void insert(Node node) { 
		
		root = Insertion(root, node);
	}
	private Node Insertion(Node root, Node node) {
		
		int data = node.data;
                
                //checking if the root is null
		if(root == null) { 
			root = node;
			return root; //if the root is null, the node becomes the root
		}
                
                //checking if the data in the root is less than the new inserted node
		else if(data < root.data) { 
			root.left = Insertion(root.left, node); //if it's less than the root, the node will be put to the left
		}
		else { 
			root.right = Insertion(root.right, node); //if it's greater than the root, the node will go to the right
		}
		
		return root;
	}
        
        //creating the inorder method that will traverse the tree inorder(left subtree, root, right subtree
        private void inorder(Node root){
		if(root != null) { //checking if the root is not null
                    inorder(root.left); //printing out the left subtree
                    System.out.println(root.data);  //printing the root
                    inorder(root.right);//printing the right subtree 
		}
        }
        
        //creating the preorder method that will traverse the tree preorder(root, left subtree, right subtree
        private void preorder(Node root){
            if(root != null){//checking that the root is not null
                System.out.println(root.data); //printing the root
                preorder(root.left); //printing the left subtree
                preorder(root.right); //printing the right subtree
            }
        }
        
        //creating the postorder class that will traverse the tree postorder(left subtree, right subtree, root)
        private void postorder(Node root){
            if(root != null){//checking if the root is not null
                postorder(root.left);//printing the left subtree
                postorder(root.right);//printing the right subtree
                System.out.println(root.data);//printing the root
            }
        }
        
	
        public void inorder() {
            inorder(root);
	}
        //Pre-order tree traversal
        public void preorder(){
            preorder(root);
        }
        public void postorder(){
            postorder(root);
        }
}

    

