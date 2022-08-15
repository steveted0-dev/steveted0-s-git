package main;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		
		f.setTitle("Frame Test");
		f.addWindowListener((WindowListener) new EventHandler());
		f.setSize(300,300);
		f.setVisible(true);

	}

}
class EventHandler extends WindowAdapter {

	 @Override
	 public void windowClosing(WindowEvent we) {
	  we.getWindow().setVisible(false);
	  we.getWindow().dispose();
	  System.exit(0);
	 }

	} 