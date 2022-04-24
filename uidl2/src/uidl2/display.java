package uidl2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class display {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JButton close;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					display window = new display();
//					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public display(String namestr,String phonestr,String genstr,String deptstr,String desstr) {
		initialize(namestr,phonestr,genstr,deptstr,desstr);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String namestr,String phonestr,String genstr,String deptstr,String desstr) {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setBounds(98, 64, 73, 27);
		frame.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setEditable(false);
		t1.setBounds(210, 66, 192, 30);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblPhone.setBounds(98, 142, 73, 27);
		frame.getContentPane().add(lblPhone);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setEditable(false);
		t2.setColumns(10);
		t2.setBounds(210, 144, 192, 30);
		frame.getContentPane().add(t2);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblGender.setBounds(98, 212, 73, 27);
		frame.getContentPane().add(lblGender);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setEditable(false);
		t3.setColumns(10);
		t3.setBounds(210, 214, 192, 30);
		frame.getContentPane().add(t3);
		
		JLabel lblDept = new JLabel("Dept:");
		lblDept.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDept.setBounds(98, 283, 73, 27);
		frame.getContentPane().add(lblDept);
		
		t4 = new JTextField();
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setEditable(false);
		t4.setColumns(10);
		t4.setBounds(210, 285, 192, 30);
		frame.getContentPane().add(t4);
		
		JLabel lblDes = new JLabel("Des:");
		lblDes.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDes.setBounds(98, 353, 73, 27);
		frame.getContentPane().add(lblDes);
		
		t5 = new JTextField();
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setEditable(false);
		t5.setColumns(10);
		t5.setBounds(210, 355, 192, 30);
		frame.getContentPane().add(t5);
		
		t1.setText(namestr);
		t2.setText(phonestr);
		t3.setText(genstr);
		t4.setText(deptstr);
		t5.setText(desstr);
		
		close = new JButton("close");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		close.setFont(new Font("Tahoma", Font.PLAIN, 14));
		close.setBounds(201, 424, 94, 36);
		frame.getContentPane().add(close);
		
		frame.setVisible(true);
	}

}
