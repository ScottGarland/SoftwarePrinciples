package ca.ScottGarland.SoftwarePrinciples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.awt.*;
import javax.swing.*;

public class StoreView {

	String name;
	ArrayList<Customer> customerList;
	Iterator<Customer> iter;
	JFrame frame = new JFrame("Assignment 2");
	
	public void printStoreDetails(Store store){
		System.out.println("Store: ");
		System.out.println("Name: " + store.getName());

		// Displaying the customer list
	    // Create an iterator for the list using iterator() method
		customerList = store.getCustomers();
		iter = customerList.iterator();

        // Displaying the values after iterating through the list
        System.out.println("\nThe Customer names are:");
        while (iter.hasNext()) { 
            System.out.println(iter.next().getName() + " "); 
        }

        //New line for formatting
        System.out.println();

        // Setting up the frame and the canvas for drawing the GUI
        Canvas can = new Sketch(customerList);
        can.setSize(500,500);
        frame.setSize(500,500);
        frame.add(can);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        can.repaint();
	}

	// Class for the GUI implementation
	public class Sketch extends Canvas {
		ArrayList<Customer> customers;
		Sketch(ArrayList<Customer> customers;) {
			this.customers = customers;
		}

		// this is for whenever the canvas is drawn for the GUI. Must override the paint method of the super class
		// JTextField in order to add desired functionality
		@Override
		public void paint(Graphics graphics) {
			int y = 150;
			super.paint(graphics);
			graphics.setColor(Color.WHITE);
			graphics.fillRect(0,0,500,500);
			graphics.setColor(Color.BLACK);
			graphics.setFont(new Font("Arial", Font.BOLD, 18));

			// for loop to draw the string to the GUI, incrementing the value of y after each iteration
			for (int i = 0; i < customers.size(); i++) {
				graphics.drawString("", 175, y);
				y += 25;
			}
		}
	}
}

