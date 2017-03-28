import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 * 
 */

/**
 * @author Kog-Dev
 *
 */
public class SingleView extends JTextField {
	private Counter c;
	public SingleView(Counter in){
		c=in;
		setVisible(true);
		setText(Integer.toString(c.getVal()));
		setHorizontalAlignment(JTextField.CENTER);
	}
	public void update(){
		setText(Integer.toString(c.getVal()));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
