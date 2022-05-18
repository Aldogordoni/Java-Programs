/**
 * 
 * Graph class to suggest possible friends to profiles
 * @author Fjoraldo Gordoni 
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Graph {

    BST bst;
	String filename;
	String name1;
	String name2;

	//the graph takes in a BST and the filename, which contains the edges to be added
	public Graph(BST bst, String filename){

		this.bst = bst;
		this.filename = filename;

	}

	/**
	 * function that builds the graph
	 */
	public void createGraph(){
		//creates a new file from the filename passed in the constructor
		File fileName = new File(filename);
		

		//tries to read it and throws exception if the file is not opened
        try {
            Scanner in = new Scanner(fileName);
			in.useDelimiter(",");
            name1 = in.next();
			name2 = in.next();
			in.close();

        } catch (FileNotFoundException e) {
            System.out.println("Cannot open " + filename);
            System.exit(-1);
        }

		//uses a stack to traverse the tree iteratively to add the edges to the profiles
		Stack<BSTNode> s = new Stack<BSTNode>();
		BSTNode curr = bst.root;

		while (curr != null || s.size() > 0)
        {
            while (curr !=  null)
            {
                s.push(curr);
                curr = curr.getLeft();
            }
            curr = s.pop();
 
			//couldn't complete it as instructions were very unclear
            //curr.getProfile().insertFriend(name1);
            curr = curr.getRight();
        }

	}

	/**
	 * function that outputs the friend recommendations
	 * @param users is the arraylist of profiles passed
	 * @returns an arraylist of BST
	 */
	public ArrayList<BST> friendRecommendations(ArrayList<Profile> users){
		ArrayList<BST> arrayBST = new ArrayList<BST>();

		for(Profile x : users){
			
		}
		
    	return arrayBST;
	}

	
	/**
	 * function that adds the profiles to the friendlists
	 * @param profiles with the friends to be added
	 * @return the list of profiles with the new added friends
	 */
	public ArrayList<Profile> getProfiles(ArrayList<Profile> profiles){
		
		for(Profile x : profiles){
			//should check if friend is already in the friend list
			x.insertFriend(x);
		}

		return profiles;
	}


}
