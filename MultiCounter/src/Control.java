import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * 
 */

/**
 * @author Kog
 *
 */
public class Control extends JFrame {
	Counter c; SingleView v; JTextField title;
	public Control(){
		setTitle("Multi Counter");
		setPreferredSize(new Dimension(400,400));
		setLocation(1400,125);
		c = new Counter();
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagConstraints gbc = new GridBagConstraints();
				
		Action disable = new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        Object obj=e.getSource();
		        if(obj instanceof JTextField){
		        	JTextField tmp = (JTextField) obj;
		        	tmp.transferFocus();
		        }
		    }
		};
		
		v = new SingleView(c);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.ipady=50;
		gbc.weightx=1;
		gbc.weighty=1;
		gbc.gridwidth=5;
		gbc.fill=GridBagConstraints.BOTH;
		v.addActionListener(disable);
		add(v,gbc);

		title = new JTextField();
		title.addActionListener(disable);
		title.setHorizontalAlignment(JTextField.CENTER);
		String titlestr = "Type title here";
		title.setText(titlestr);
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.ipady=0;
		gbc.weighty=0.3;
		gbc.weightx = 1;
		add(title,gbc);

		JButton minus5 = new JButton("-5");
		minus5.addActionListener(new buttonListener());
		minus5.setActionCommand("-5");
		gbc.gridy=2;
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridwidth=1;
		gbc.weighty=0.3;
		gbc.weightx=0.5;
		add(minus5,gbc);

		JButton minus1 = new JButton("-1");
		minus1.addActionListener(new buttonListener());
		minus1.setActionCommand("-1");
		gbc.gridx=1;
		add(minus1,gbc);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new buttonListener());
		reset.setActionCommand("0");
		gbc.gridx=2;
		add(reset,gbc);
		
		JButton plus1 = new JButton("+1");
		plus1.addActionListener(new buttonListener());
		plus1.setActionCommand("1");
		gbc.gridx=3;
		add(plus1,gbc);
		
		JButton plus5 = new JButton("+5");
		plus5.addActionListener(new buttonListener());
		plus5.setActionCommand("5");
		gbc.gridx=4;
		add(plus5,gbc);
		
		setVisible(true);
		pack();
		title.selectAll();
	}

	
	private class buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String com = arg0.getActionCommand();
			int val = Integer.parseInt(com);

			try{
				String txt = v.getText();
				int n = Integer.parseInt(txt);
				c.set(n);
			} catch(NumberFormatException e) {
				;
			}
			
			if(val==0){
				c.reset();
			} else {
				c.inc(val);
			}
			v.update();
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Control();
		System.out.println("TODO: "
				+ "\n - Multi.");
	}

}
