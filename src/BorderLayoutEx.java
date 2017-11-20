import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("borderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//컨텐트팬에 BorderLayout 배치관리자 설정
		c.setLayout(new BorderLayout(5,7));
		
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		
		setSize(300,200);	//프레임 크기 설정
		setVisible(true); //프레임 화면에 출력
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
