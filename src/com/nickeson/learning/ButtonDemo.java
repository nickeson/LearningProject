package com.nickeson.learning;

//JDK 1.8.0
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.awt.Graphics;
// import java.awt.Graphics2D;

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

public class ButtonDemo implements ActionListener {
	
	JButton button;

	public ButtonDemo() {
	}

	public static void main(String[] args) {
		// create an instance of ButtonDemo, which IS-A ActionListener
		ButtonDemo bDemo = new ButtonDemo();
		bDemo.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		// create reference to this ButtonDemo object as the caller to ActionListener object
		// 'register our interest' with the ActionListener object
		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	// implement ActionListener interface method
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");
	}
}