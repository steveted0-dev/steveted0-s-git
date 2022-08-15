package main;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import javax.swing.*;

public class main extends JFrame{

	private static Component Component;
	private static JProgressBar progress;

	public static void main String{
		// TODO Auto-generated method stub
		Frame f = new Frame();
		
		f.setTitle("Frame Test");
		f.addWindowListener((WindowListener) new EventHandler());
		f.setSize(300,300);
		f.setVisible(true);
        f.setLayout(new FlowLayout());//배치관리자 설정
        JProgressBar progress = new JProgressBar();
        //최소값이 0,최대값이 100까지 표시
        //progress.setValue(0);//0부터 시작.시작 지점값을 
        //표시
        progress.setStringPainted(true);
        //true로 설정하면 현재 진행상황을 %로 표시함.
        try {
			f.add(progress);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//스윙 프레임윈도우에 프로그래스바
        //배치
        f.setSize(300,150);
        f.setVisible(true);
        progress_start();//progress_start()메서드를
        //호출
    }//생성자 정의
    
    public static void progress_start(){
        int i;
            for(i=51;i<=100;i++){
				progress.setValue(50);
                Thread.sleep(1);//밀리세컨드 단위로
                //지연시간을 설정.
            }
           catch(InterruptedException ie){
            ie.printStackTrace();
           }
        }
    }

	private static JProgressBar number(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
public class SwingTest04 {
    public static void main(String[] args) {
        new JFrameTest04();//생성자를 호출

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