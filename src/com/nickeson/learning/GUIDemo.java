package com.nickeson.learning;

//JDK 1.8.0
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.Graphics;
//import java.awt.Graphics2D;

/****************************************************************************
 * <b>Title</b>: ButtonDemo.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 13, 2016<p/>
 * updates:
 ****************************************************************************/

public class GUIDemo implements ActionListener {
	
	// instance vars
	JButton button;
	JButton button2;
	JFrame frame;

	// default constructor
	public GUIDemo() {
	}

	public static void main(String[] args) {
		// create an instance of ButtonDemo, which IS-A ActionListener
		GUIDemo guiDemo = new GUIDemo();
		guiDemo.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create reference to this ButtonDemo object as the caller to ActionListener object
		// 'register our interest' with the ActionListener object
		button = new JButton("Change Colors");
		button2 = new JButton("Change Label");
		
		button.addActionListener(this);
		button2.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		// single arg lands button in center of screen
		// frame.getContentPane().add(button);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.EAST, button2);			
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);	
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	// implement ActionListener interface method
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == button) {
			frame.repaint();
		} else {
			button2.setText("I've been Clicked");
		}
	}
}