import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class PainInTheAssManualGUI {
	JFrame mainFrame;
	JLabel lblFirstName;
	JTextField txtFirstName;
	JButton btnSave;
	
	JComboBox cboAccounts;
	
	Account[] accountList = new Account[10];
	
	public PainInTheAssManualGUI(){
		Random r = new Random();
		for(int i = 0; i<10; i++){
			Account a = new Account(r.nextDouble(), i, "checking");
			accountList[i] = a;
		}
		
		for(int j = 0; j < accountList.length; j++){
			System.out.println(accountList[j]);
		}
		
		initGui();
		
	}
	
	private  void initGui(){
		mainFrame = new JFrame("Welcome to Java");
		mainFrame.setBounds(100, 100, 500, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		
		lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(10, 10, 150, 30);
		mainFrame.getContentPane().add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(170, 10, 150, 30);
		mainFrame.getContentPane().add(txtFirstName);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(170, 50, 100, 30);
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				populateTextField();
			}
		});
		mainFrame.getContentPane().add(btnSave);
		
		
		cboAccounts = new JComboBox(accountList);
		cboAccounts.setBounds(170, 80, 200, 30);
		mainFrame.getContentPane().add(cboAccounts);
		
		mainFrame.setVisible(true);
	}

	private void populateTextField(){
		txtFirstName.setText("Dmitriy");
	}
}
