package view;

import javax.swing.JFrame;

public class MyWindown extends JFrame {
	public MyWindown() {
		
	}
	public void showIT() {
		this.setVisible(true);
	}
	public void showIT(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	public void showIT(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindown m1 = new MyWindown();
		m1.showIT();
	}

}
