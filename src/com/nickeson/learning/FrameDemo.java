package com.nickeson.learning;

//JDK 1.8.0
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.BorderLayout;

/****************************************************************************
 * <b>Title</b>: FrameDemo.java <p/>
 * <b>Project</b>: JavaSwing Demo <p/>
 * <b>Description: </b> Testing GUI Components<p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 11, 2016<p/>
 * updates:
 ****************************************************************************/

public class FrameDemo {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("FrameDemo");
        
        // specify behavior for when frame closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		// Automatically resizes window based on contents 
        // frame.pack(); 
        
        // specific size frame
        frame.setSize(420, 420);
        
        // show it
        frame.setVisible(true);

        // create empty label component and put them in the frame
        JLabel emptyLabel = new JLabel("My JLabel");
        emptyLabel.setPreferredSize(new Dimension(175, 300));
        frame.getContentPane().add(emptyLabel, BorderLayout.NORTH);
        
        // create button component and put it in the frame
        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
	            createAndShowGUI();
            }
        });
    }
}