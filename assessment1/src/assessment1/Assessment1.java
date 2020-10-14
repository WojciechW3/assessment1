package assessment1;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Assessment1 {
	public void start() {
		task1(); /* Change this to the name of the question you want to test. */
	}
	
	/****************************************************
	 * Write your program code for each question below. *
	 ****************************************************/
	
	public void task1() {
	}

	public void task2() {
	}

	public void task3() {
	}
	
	public void shape1() {
		plot(200, 200); /* This is an example of how to use the plot command to draw a single pixel. */
	}

	public void shape2() {
		
	}

	public void shape3() {
		
	}

	public void shape4() {
		
	}

	public void shape5() {
		
	}

	/***************************************************
	 * Please do not change any code below this point. *
	 ***************************************************/

	private final int WIDTH = 400;
	private final int HEIGHT = 400;
	private final JPanel screen;
	private final BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	
	public static void main(String[] args) {
		new Assessment1().start();
	}
	
	public Assessment1() {
		JFrame frame = new JFrame("Java Test 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen = new JPanel() {
			private static final long serialVersionUID = 1L;
			public void paintComponent(Graphics g) { g.drawImage(image, 0, 0, null); }
		};
		screen.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.getContentPane().add(screen);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void plot(int x, int y) {
		if (x >= 0 && y >= 0 && x < WIDTH && y < HEIGHT) image.setRGB(x, y, 0xffffff);
		screen.repaint();
	}
}
