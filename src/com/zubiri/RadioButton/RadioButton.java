package com.zubiri.RadioButton;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RadioButton extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton frame = new RadioButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 165, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//private ButtonGroup bg;
		//bg=new ButtonGroup();
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setBounds(21, 8, 149, 23);
		contentPane.add(rdbtnA);
		group.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(21, 35, 149, 23);
		contentPane.add(rdbtnB);
		group.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(21, 62, 149, 23);
		contentPane.add(rdbtnC);
		group.add(rdbtnC);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Has seleccionado la opción: ");
				if (rdbtnA.isSelected()) {
		            System.out.println("A");
		        }else if (rdbtnB.isSelected()) {
		        	System.out.println("B");
		        }else if (rdbtnC.isSelected()) {
		        	System.out.println("C");
		        } 
			}
		});
		btnEnviar.setBounds(21, 93, 117, 25);
		contentPane.add(btnEnviar);
	}
}
