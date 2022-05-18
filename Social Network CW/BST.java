/**
 * 
 * BST class that creates the tree where the nodes will be added, and the profiles will be stored
 * follows an in order type of sorting and uses recursion
 * @author Fjoraldo Gordoni 
 * @version 1.0.0
 * 
 */

public class BST {

    public BSTNode root;

    //the constructor is empty but sets the root of the BST to be null when created, to ensure the 
    //tree to be bug free when created
    BST(){
        this.root = null;
    }

    /**
     * function to add recursively nodes to the BST
     * @param current is the current node that we are dealing with
     * @param newNode is the node that we want to add
     * @return the new node added
     */
    private BSTNode addRecursive(BSTNode current, BSTNode newNode){

        //performs compare of the firstnames and assings comp to store the value
        //it will be 0< if smaller and 0> if greater
        int comp = current.getProfile().getFirstName().compareTo(newNode.getProfile().getFirstName());

        //if greater it will be stored to the left
         if (comp>0){
             //if the left of the node we are at is empty, the new node will be attached there
            if(current.getLeft() == null){
                current.setLeft(newNode);
            } else {
                //if not, it will call again the function, passing the node that is at the left as the current node
                addRecursive(current.getLeft(), newNode);
            }
            //same process for the right
        } else if (comp<0){
            if(current.getRight() == null){
                current.setRight(newNode);
            } else {
                addRecursive(current.getRight(), newNode);
            }
            //if the first names are the same, the node will be stored at the left anyways.
        } else if (comp==0){
            if(current.getLeft() == null){
                current.setLeft(newNode);
            } else {
                addRecursive(current.getLeft(), newNode);
            }
        } 
        return newNode;
    }
    
    /**
     * function that adds the profile using the recursive function
     * @param p is the profile which will be added
     */
    public void addProfile(Profile p){
        //if the root is null(new BST) the root will be assigned to be the profile to be added
        if(root == null){
            this.root = new BSTNode(p);
        } else {
            //if the root is not null, a recursive method will be called to traverse the tree and store
            //the profile at the right location
            addRecursive(root, new BSTNode(p));
        }
    }

    /**
     * function that prints alphabetically sorted the BST, calls traversalTree() function because it is required that
     * the function has no parameters passed, and this would be the most efficient and neater way to perform
     * the recursive search/printing
     */
    public void printAlphabeticalASC(){
        traversalTree(root);
    }

    /**
     * function that traverses the tree recursively to print the names alphabetically
     * @param node is the root passed by the tree
     */
    public void traversalTree(BSTNode node){
        //if the node is null, it will return
        if (node == null){
            return;
        } 
        //else it will recall the function going to the left of the node
        //until it can't anymore, print the profile there, go to the root,
        //print that one too and finally traverse all to the right until it can't anymore
        //and print that too
        traversalTree(node.getLeft());
        System.out.println(node.getProfile().getFirstName());
        traversalTree(node.getRight());
    }
    
}
