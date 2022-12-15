package jrh230_menuManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MenuManagerGUI extends MenuManager{

	JFrame mainFrame, detailsFrame;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18;
	JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15;
	JTextField tf1;
	JButton b1, b2, b3, b4, b5;
	JComboBox<Entree> cb1;
	JComboBox<Side> cb2;
	JComboBox<Salad> cb3;
	JComboBox<Dessert> cb4;

	JList<Menu> JLMenu;

	DefaultListModel<Menu> myListModel;

	JTextArea entreeDetails, sideDetails, saladDetails, dessertDetails, caloriesDetails, priceDetails;

	ArrayList<Menu> menus;

	int count;

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	private MenuManager mmGUI;


	public MenuManagerGUI() {

		MenuManager mmGUI = new MenuManager("data/dishes.txt");

		initGUI(mmGUI);
	}


	private void initGUI(MenuManager mmGUI) {


		
		mainFrame = new JFrame("Menu Manager");
		mainFrame.setBounds(100, 100, 500, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);


		p1 = new JPanel();
		p1.setBounds(25, 25, 150, 20);
		p1.setBorder(BorderFactory.createLineBorder(Color.black));
		mainFrame.add(p1);
		l1 = new JLabel("Build Your Own Menu");
		l1.setFont(new Font("Calibri", Font.BOLD, 12));
		p1.add(l1);

		p2 = new JPanel();
		p2.setBounds(400, 25, 150, 20);
		p2.setBorder(BorderFactory.createLineBorder(Color.black));
		mainFrame.add(p2);
		l2 = new JLabel("Created Menus");
		l2.setFont(new Font("Calibri", Font.BOLD, 12));
		p2.add(l2);

		p9 = new JPanel();
		p9.setBounds(400, 55, 250, 350);
		p9.setBorder(BorderFactory.createLineBorder(Color.black));
		mainFrame.add(p9);


		p3 = new JPanel();
		p3.setBounds(25, 350, 150, 20);
		p3.setBorder(BorderFactory.createLineBorder(Color.black));
		mainFrame.add(p3);
		l3 = new JLabel("Or Generate a Menu");
		l3.setFont(new Font("Calibri", Font.BOLD, 12));
		p3.add(l3);

		p4 = new JPanel();
		p4.setBounds(25, 75, 75, 20);
		p4.setBorder(BorderFactory.createLineBorder(Color.black));
		mainFrame.add(p4);
		l4 = new JLabel("Entree");
		l4.setFont(new Font("Calibri", Font.BOLD, 10));
		p4.add(l4);

		p5 = new JPanel();
		p5.setBounds(25, 105, 75, 20);
		p5.setBorder(BorderFactory.createLineBorder(Color.black));
		mainFrame.add(p5);
		l5 = new JLabel("Side");
		l5.setFont(new Font("Calibri", Font.BOLD, 10));
		p5.add(l5);

		p6 = new JPanel();
		p6.setBounds(25, 135, 75, 20);
		p6.setBorder(BorderFactory.createLineBorder(Color.black));
		mainFrame.add(p6);
		l6 = new JLabel("Salad");
		l6.setFont(new Font("Calibri", Font.BOLD, 10));
		p6.add(l6);

		p7 = new JPanel();
		p7.setBounds(25, 165, 75, 20);
		p7.setBorder(BorderFactory.createLineBorder(Color.black));
		mainFrame.add(p7);
		l7 = new JLabel("Dessert");
		l7.setFont(new Font("Calibri", Font.BOLD, 10));
		p7.add(l7);

		b1 = new JButton("Create Menu With These Dishes");
		b1.setBounds(55, 250, 250, 30);

		myListModel = new DefaultListModel();
		JLMenu = new JList(myListModel);
		JLMenu.setBounds(55, 250, 250, 30);
		JLMenu.setLayoutOrientation(JList.VERTICAL);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Entree entreeOption = (Entree) cb1.getSelectedItem();
				Side sideOption = (Side) cb2.getSelectedItem();
				Salad saladOption = (Salad) cb3.getSelectedItem();
				Dessert dessertOption = (Dessert) cb4.getSelectedItem();

				String name = JOptionPane.showInputDialog("Input a name for your menu");
				Menu YourMenu = new Menu(name, entreeOption, sideOption, saladOption, dessertOption);
				myListModel.addElement(YourMenu);
				p9.add(JLMenu);
			}
		});
		mainFrame.getContentPane().add(b1);

		b2 = new JButton("Generate a Random Menu");
		b2.setBounds(55, 450, 250, 30);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Input a name for your random menu");
				Menu m1 = mmGUI.randomMenu(name);
				myListModel.addElement(m1);
				p9.add(JLMenu);



			}
		});
		mainFrame.getContentPane().add(b2);

		b3 = new JButton("Details");
		b3.setBounds(400, 415, 75, 30);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				detailsFrame = new JFrame("My Created Menu");
				detailsFrame.setBounds(100, 100, 1000, 1100);
				detailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				detailsFrame.getContentPane().setLayout(null);

				p10 = new JPanel();
				p10.setBounds(25, 75, 75, 20);
				p10.setBorder(BorderFactory.createLineBorder(Color.black));
				detailsFrame.add(p10);
				l13 = new JLabel("Entree");
				l13.setFont(new Font("Calibri", Font.BOLD, 10));
				p10.add(l13);
				entreeDetails = new JTextArea();
				entreeDetails.setBounds(120, 65, 450, 40);
				detailsFrame.add(entreeDetails);
				Menu currentMenu = (Menu) myListModel.get(JLMenu.getSelectedIndex());
				//entreeDetails.setText(currentMenu.getName() + "\n" + currentMenu.description() + "\n" + currentMenu.totalCalories() + "\n" + currentMenu.totalPrice());
				entreeDetails.setText(currentMenu.getName() + "\n" + currentMenu.description() + currentMenu.totalCalories() + currentMenu.totalPrice());
				// 


				p11 = new JPanel();
				p11.setBounds(25, 165, 75, 20);
				p11.setBorder(BorderFactory.createLineBorder(Color.black));
				detailsFrame.add(p11);
				l14 = new JLabel("Side");
				l14.setFont(new Font("Calibri", Font.BOLD, 10));
				p11.add(l14);
				sideDetails = new JTextArea();
				sideDetails.setBounds(120, 155, 450, 40);
				detailsFrame.add(sideDetails);


				p12 = new JPanel();
				p12.setBounds(25, 255, 75, 20);
				p12.setBorder(BorderFactory.createLineBorder(Color.black));
				detailsFrame.add(p12);
				l15 = new JLabel("Salad");
				l15.setFont(new Font("Calibri", Font.BOLD, 10));
				p12.add(l15);
				saladDetails = new JTextArea();
				saladDetails.setBounds(120, 245, 450, 40);
				detailsFrame.add(saladDetails);

				p13 = new JPanel();
				p13.setBounds(25, 345, 75, 20);
				p13.setBorder(BorderFactory.createLineBorder(Color.black));
				detailsFrame.add(p13);
				l16 = new JLabel("Dessert");
				l16.setFont(new Font("Calibri", Font.BOLD, 10));
				p13.add(l16);
				dessertDetails = new JTextArea();
				dessertDetails.setBounds(120, 335, 450, 40);
				detailsFrame.add(dessertDetails);

				p14 = new JPanel();
				p14.setBounds(25, 425, 75, 20);
				p14.setBorder(BorderFactory.createLineBorder(Color.black));
				detailsFrame.add(p14);
				l17 = new JLabel("Total Calories: ");
				l17.setFont(new Font("Calibri", Font.BOLD, 10));
				p14.add(l17);
				caloriesDetails = new JTextArea();
				caloriesDetails.setBounds(120, 415, 450, 40);
				detailsFrame.add(caloriesDetails);
				//caloriesDetails.add(currentMenu.totalCalories());

				p15 = new JPanel();
				p15.setBounds(25, 515, 75, 20);
				p15.setBorder(BorderFactory.createLineBorder(Color.black));
				detailsFrame.add(p15);
				l17 = new JLabel("Total Price: $");
				l17.setFont(new Font("Calibri", Font.BOLD, 10));
				p15.add(l17);
				priceDetails = new JTextArea();
				priceDetails.setBounds(120, 505, 450, 40);
				detailsFrame.add(priceDetails);




				detailsFrame.setVisible(true);
			}
		});
		mainFrame.getContentPane().add(b3);

		b4 = new JButton("Delete All");
		b4.setBounds(467, 415, 100, 30);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				myListModel.removeAllElements();


			}
		});
		mainFrame.getContentPane().add(b4);

		b5 = new JButton("Save to File");
		b5.setBounds(560, 415, 100, 30);
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FileManager fm = new FileManager();
				ArrayList<Menu> fileMenus = new ArrayList<Menu>();
				
				int counter = 0;
				
				while (count< myListModel.size()) {
					fileMenus.add(myListModel.get(counter));
					
					count++;
				}
				
				fm.WriteMenu("data/menus.txt", fileMenus);




			}
		});
		mainFrame.getContentPane().add(b5);

		entrees = mmGUI.getEntrees();	
		Entree[] entreesArray = new Entree[entrees.size()];
		entreesArray = entrees.toArray(entreesArray);
		cb1 = new JComboBox<Entree>(entreesArray);
		cb1.setBounds(115, 60, 100, 50);
		mainFrame.getContentPane().add(cb1);

		sides = mmGUI.getSides();
		Side[] sidesArray = new Side[sides.size()];
		sidesArray = sides.toArray(sidesArray);
		cb2 = new JComboBox<Side>(sidesArray);
		cb2.setBounds(115, 90, 100, 50);
		mainFrame.getContentPane().add(cb2);

		salads = mmGUI.getSalads();
		Salad[] saladsArray = new Salad[salads.size()];
		saladsArray = salads.toArray(saladsArray);
		cb3 = new JComboBox<Salad>(saladsArray);
		cb3.setBounds(115, 120, 100, 50);
		mainFrame.getContentPane().add(cb3);

		desserts = mmGUI.getDesserts();
		Dessert[] dessertsArray = new Dessert[desserts.size()];
		dessertsArray = desserts.toArray(dessertsArray);
		cb4 = new JComboBox<Dessert>(dessertsArray);
		cb4.setBounds(115, 150, 100, 50);
		mainFrame.getContentPane().add(cb4);


		mainFrame.setVisible(true);


	}

	public static void main(String[] args) {

		MenuManagerGUI finalGUI = new MenuManagerGUI();


	}


}
