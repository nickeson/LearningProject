package com.nickeson.learning;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class TransparentPanel extends JFrame
{
// declare instance vars p1 and p2 of type JPanel
JPanel p1,p2;

	// constructor calls createAndShowGUI()
    public TransparentPanel()
    {
        createAndShowGUI();
    }
   
    public void createAndShowGUI()
    {
        // Set JFrame title and default close operation
        setTitle("Transparent Panel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // Set a background for JFrame
        setContentPane(new JLabel(new ImageIcon("/home/nickeson/Documents/logo.png")));
       
        // Set a layout (in this example, FlowLayout)
        setLayout(new FlowLayout());
       
        // Create a JPanel
        p1 = new JPanel();
       
        // Set the background color with 125 as alpha value
        // This is less transparent
        p1.setBackground(new Color(25,75,200,125));
       
        // Create another JPanel
        p2 = new JPanel();
       
        // This is more transparent than the previous
        // one
        p2.setBackground(new Color(200,60,222,85));
       
        // Set some size to the panels
        p1.setPreferredSize(new Dimension(250,150));
        p2.setPreferredSize(new Dimension(250,150));
       
        // Add the panels to the JFrame
        add(p1);
        add(p2);
       
        // Set the size of the JFrame and
        // make it visible
        setSize(600,400);
        setVisible(true);
    }
   
    public static void main(String args[])
    {
        // Run in the EDT
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                new TransparentPanel();
            }
        });
    }
}