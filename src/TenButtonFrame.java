import java.awt.*;
import javax.swing.*;

public class TenButtonFrame extends JFrame {
	public TenButtonFrame() {
		super("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		//for문을 이용 10개생성 
		JButton [] btn = new JButton [10];
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA};
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);	
			c.add(btn[i]);
			}
		setSize(500,200);//프레임 크기설정
		setVisible(true);//화면에 프레임 출력
	}
	public static void main(String[] args) {
		new TenButtonFrame();
	}
}
