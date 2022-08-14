package main;
import java.awt.*;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		
		f.setTitle("Frame Test");
			
		f.setSize(300,300);
		f.setVisible(true);
	}

}
public class WindowEventEx extends Frame implements WindowListener{
    public WindowEventEx(){
	super("windowEvent 테스트");
		
	add(exit);
	setBounds(300,300,200,200);
	setVisible(true);
		
	addWindowListener(this);
		
    }
	
    public static void main(String[] args) {
	new WindowEventEx();
    }

    @Override
    public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
		
    }

    @Override
    public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
    }

    @Override
    public void windowClosing(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.exit(0); //프로그램 종료
    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
		
    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
		
    }

    @Override
     public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
		
    }

    @Override
    public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
		
    }
}