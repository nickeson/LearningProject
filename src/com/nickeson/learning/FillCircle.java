package com.nickeson.learning;

import java.awt.*;
import java.awt.event.*;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: FillCircle.java <p/>
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

@SuppressWarnings("serial")
public class FillCircle extends Frame {

	public FillCircle() {
	}

	public void paint(Graphics g) {
		Graphics2D ga = (Graphics2D)g;
		ga.setPaint(Color.red);
		ga.fillOval(150,150,100,100);
		ga.setColor(Color.orange);
		ga.fillRect(20,50,100,100);
	}
	
	public static void main(String[] args) {
		// create new instance of FillCircle named 'frame'
		FillCircle frame = new FillCircle();
		
		// setup listener for closing the window
		frame.addWindowListener(
		new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
		);
		
		// window frame size
		frame.setSize(400,400);
		frame.setVisible(true);
	}
}