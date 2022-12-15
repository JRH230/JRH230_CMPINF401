import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class EasyGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					EasyGUI window = new EasyGUI();
					window.frame.setVisible(true);
			
	}

	/**
	 * Create the application.
	 */
	public EasyGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtTextArea = new JTextArea();
		txtTextArea.setColumns(10);
		txtTextArea.setRows(10);
		txtTextArea.setBounds(20, 20, 200, 200);
		frame.getContentPane().add(txtTextArea);
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTextArea.append(new Date().toString() + "\n");
			}
		});
		btnClickMe.setBounds(20, 230, 200, 29);
		frame.getContentPane().add(btnClickMe);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
