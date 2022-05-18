/**
 * 
 * BSTNode class which creates the nodes to be added in the BST
 * @author Fjoraldo Gordoni 
 * @version 1.0.0
 * 
 */

public class BSTNode{

    //has pointers to left and right, and the content of the node
    private BSTNode l;
    private BSTNode r;
    private Profile data;

    //the constructor takes in the content that the node must have
    public BSTNode(Profile data){
        this.data = data;
    }

    //getters and setters
    public Profile getProfile(){
        return data;
    }

    public BSTNode getRight() {
        return r;
    }

    public void setRight(BSTNode r) {
        this.r = r;
    }

    public BSTNode getLeft() {
        return l;
    }

    public void setLeft(BSTNode l) {
        this.l = l;
    }

}