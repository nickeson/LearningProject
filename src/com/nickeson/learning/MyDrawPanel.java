package com.nickeson.learning;

//JDK 1.8.0
import java.awt.Color;
import java.awt.Graphics;
// import java.awt.Image;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import java.io.IOException;
// import javax.imageio.ImageIO;
// import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
// import java.awt.Graphics2D;  // required if we use Graphics2D myG = (Graphics2D)g;
// import java.awt.GradientPaint;

/****************************************************************************
 * <b>Title</b>: MyDrawPanel.java <p/>
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

// MyDrawPanel is a subclass of JPanel, which is a widget that we can add to a frame
@SuppressWarnings("serial")
public class MyDrawPanel extends JPanel {
	
	// constructor
	public MyDrawPanel() {
		// set the JPanel properties for when painting (or re-painting) the JPanel
		// this sets the JPanel background frame to opaque/grey
		setOpaque(true);
        setBackground(Color.gray); 
	}
	
	// this method is called automatically by the system when the panel is created
	public void paintComponent(Graphics g) {
		
		/* For methods available in Grahpics2D, we must use casting to use those methods
		 * with the Graphics object
		 * Graphics2D myG = (Graphics2D)g;
		 * 
		 * // calls the paintComponent method from the superclass 
		 * // i.e., prints component as if it weren't overridden
		 * // good for allowing background to 'shine through'
		 * super.paintComponent(g); 
		 */
		
		// paint the component using properties from the super class 
		// (in this case, sets opaque gray background in parent JPanel)
		// can be used to 're-paint' the whole JFrame from the ground up (not just ContentPane)
		// super.paintComponent(g);
		 
		// paint shapes in MyDrawPanel object (foreground)
		// g.setColor(Color.blue);
		// g.fillRect(20,50,100,100);
		
		// g.setColor(Color.green);
		// g.fillOval(110,20,80,40);
		
		// fill entire MyDrawPanel (foreground) with current color (default is black)
		// g.setColor(Color.white);
		// g.fillRect(0,0,20,20);
		// g.fillRect(0,0,this.getWidth(), this.getHeight());
		
		// setup RGB values for random color
		int r = (int) (Math.random() * 255);
		int gr = (int) (Math.random() * 255);	
		int b = (int) (Math.random() * 255);	
		
		Color randomColor = new Color(r, gr, b);
		g.setColor(randomColor);
		g.fillOval(80,70,100,110);
		
		// one way to add Image to the JFrame content pane, JPanel 'MyDrawPanel'
		//Image myPic = new ImageIcon("/home/nickeson/Documents/logo.png").getImage();
		//g.drawImage(myPic, 0, 0, this);
		
		// another way to add Image to the JFrame content pane, JPanel 'MyDrawPanel'	
		//BufferedImage myPic = null;
		//try {
		//	myPic = ImageIO.read(new File("/home/nickeson/Documents/logo.png"));
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
		//g.drawImage(myPic, 0, 0, this);
		
		// add functionality from Graphics2D subclass
		// Graphics2D myG = (Graphics2D)g;
		// setup gradient :: starting point, start color, end point, end color
		// GradientPaint myGrad= new GradientPaint(210,210,Color.red, 310,310, Color.green);
		// load 'virtual paintbrush' with Gradient 'myGrad'
		// myG.setPaint(myGrad);
		// fill the oval with whatever is loaded on our 'virtual paintbrush'
		// myG.fillOval(210,210,100,100);
	}
	
	public static void main(String[] args) {
		// setup new window frame, make visible, set size, setup close behavior
		JFrame myJframe = new JFrame();
		myJframe.setSize(600,600);
		myJframe.setVisible(true);
		myJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add/replace the content pane (which is a JPanel widget) to our JFrame		
		myJframe.getContentPane().add(new MyDrawPanel());	
		
		// set the contents of the content pane
		//myJframe.setContentPane(new MyDrawPanel()); 
	}
}