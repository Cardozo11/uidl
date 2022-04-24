package uidl;

import java.awt.Dialog;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class emp {
	// show employee details in a message dialog box

	private JFrame frame;
	private JTextField nameT;
	private JTextField phoneT;
	private final ButtonGroup gender = new ButtonGroup();
	String namestr,phonestr,genstr,deptstr,desstr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emp window = new emp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public emp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Employee details");
		
		JLabel name = new JLabel("name");
		name.setFont(new Font("Verdana", Font.PLAIN, 16));
		name.setBounds(59, 50, 76, 39);
		frame.getContentPane().add(name);
		
		JLabel phone = new JLabel("Phone no:");
		phone.setFont(new Font("Verdana", Font.PLAIN, 16));
		phone.setBounds(59, 125, 85, 30);
		frame.getContentPane().add(phone);
		
		JRadioButton male = new JRadioButton("Male");
		gender.add(male);
		male.setFont(new Font("Tahoma", Font.PLAIN, 12));
		male.setBounds(186, 196, 103, 21);
		frame.getContentPane().add(male);
		genstr=male.getActionCommand();
		
		JRadioButton female = new JRadioButton("Female");
		gender.add(female);
		female.setFont(new Font("Tahoma", Font.PLAIN, 12));
		female.setBounds(186, 219, 103, 21);
		frame.getContentPane().add(female);
		genstr=female.getActionCommand();
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Sales", "Finance"}));
		cb1.setBounds(176, 263, 183, 39);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Manager", "Supervisor"}));
		cb2.setBounds(176, 337, 183, 39);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(59, 196, 85, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				namestr=nameT.getText().toString();
				phonestr=phoneT.getText().toString();
				deptstr=cb1.getSelectedItem().toString();
				desstr=cb2.getSelectedItem().toString();
				if(namestr.isEmpty() || phonestr.isEmpty()) {
					JOptionPane.showMessageDialog(frame,"Please Enter All The Details");	
				}
				else if(gender.isSelected(null)) {
					JOptionPane.showMessageDialog(frame,"Please Enter gender");
				}
				else {
				JOptionPane.showMessageDialog(frame,"Name: "+namestr+"\nPhone no: "+phonestr+"\ngender: "+genstr+"\ndept: "+deptstr+"\ndesignation: "+desstr);
				}
				
				
			}
		});
		submit.setBounds(249, 404, 110, 44);
		frame.getContentPane().add(submit);
		
		nameT = new JTextField();
		nameT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c=e.getKeyChar();
				
				if(!Character.isAlphabetic(c) && (!Character.isSpaceChar(c)) && (e.getKeyCode()!=KeyEvent.VK_BACK_SPACE) &&(e.getKeyCode()!=KeyEvent.VK_CAPS_LOCK)) {
					JOptionPane.showMessageDialog(frame, "Only Letters Allowed");
				}
			}
		});
		nameT.setBounds(176, 57, 228, 32);
		frame.getContentPane().add(nameT);
		nameT.setColumns(10);
		
		phoneT = new JTextField();
		phoneT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c=e.getKeyChar();
				if(!Character.isDigit(c)&& (e.getKeyCode()!=KeyEvent.VK_BACK_SPACE)) {
					JOptionPane.showMessageDialog(frame, "Only numbers Allowed");
				}
			}
		});
		phoneT.setBounds(176, 120, 228, 35);
		frame.getContentPane().add(phoneT);
		phoneT.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Department");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(40, 264, 110, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Designation");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(40, 338, 110, 30);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
