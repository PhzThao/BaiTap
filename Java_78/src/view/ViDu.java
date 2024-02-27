package view;
import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		//Gan ten
		jf.setTitle("AWT Test");
		//Gan kich co
		jf.setSize(400, 250);
		
		//Gan vi tri hien thi
		jf.setLocation(350, 150);		
		
		//Thoat ra khoi chuong trinh khi dong cua so
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Cho phep hien thi 
		jf.setVisible(true);
	}

}
