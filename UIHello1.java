import javax.swing.JOptionPane;

public class UIHello1{
	public static void main(String[]args){
		String name = 
			JOptionPane.showInputDialog("What's your name?");
			
		JOptionPane.showMessageDialog(null, "Hello "+name+"!",
			"Hello Message", 1);
	}
}