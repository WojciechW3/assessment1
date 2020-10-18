package assessment1;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Assessment1 {
	public void start() {
		shape5(); /* Change this to the name of the question you want to test. */
	}
	
	/****************************************************
	 * Write your program code for each question below. *
	 ****************************************************/
	
	public void task1() {
		System.out.println("Enter an amount in zloty");
		Scanner s = new Scanner(System.in);
		float zloty = Float.parseFloat(s.nextLine());
		System.out.println(zloty + " in zloty is equal to " + zloty*0.202 + " pounds.");
		
	}

	public void task2() {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int i = n;
		int x = 0;
		while (i != 0) {
			if (n % i == 0) {
				System.out.println(i);
				x = x+1;
				
			}
			i = i - 1;
			
		}
		if (x == 2) {
			System.out.println("The number is a prime");
			
		}
		if (x > 2) {
			System.out.println("The number has " + x + " factors");
		}
		
	}

	public void task3() {
		Scanner input = new Scanner (System.in);
		System.out.println("What is your name? ");
		String name = input.nextLine();
		
		
		int length = name.length( );
		System.out.println("number of letters: " + length);
		name = name.toLowerCase();
		
		int vowels = 0;
		for(int x = 0; x < name.length(); ++x)
		{
			char x1 = name.charAt(x);
			if(x1 == 'a' || x1 == 'e' || x1 == 'i'
					|| x1 == 'o' || x1 == 'u') {
				++vowels;
			}
		}




		System.out.println("Vowels: " + vowels);
		String output = name.substring(0, 1).toUpperCase() + name.substring(1);
		System.out.println(output);
	}
	
	public void shape1() {
		
		int x = 200;
		int y = 200;
		for (int i = 1; i<=75; i = i+1) {
			plot(x,y+i);
			plot(x,y-i);
			plot(x+i,y);
			plot(x-i,y);
			plot(x+i,y+i);
			plot(x+i,y-i);
			plot(x-i,y+i);
			plot(x-i,y-i);
			plot(x,y);
		
			
		}
		
				
		
	}

	public void shape2() {
		int y = 150;
		int x = 75;
		for (int i = 1; i<=150; i = i+1) {
			plot(x+i,y);
			plot(x+i,y+60);
			plot(x+i,y+120);
		}
		for (int z = 1; z<= 60; z = z+1) {
			plot (x+150, y+z);
			plot (x, y+60+z);
		}
			
	}

	public void shape3() {
		int e = -1;
		int x = 1;
		int y = 150;
		for(int i = 1; i<=400; i = i+1) {
			for (int z= 1; z<= 20; z= z+1 ) {
				plot(x, y);
				x = x+1;
				y = y+e;
			}
			e = e*(-1);
		}
		
		
		
		
	}

	public void shape4() {
		for (int i = 20; i <= 350; i = i+20) {
			int x = 200 + i;
			int y = 200 - i;
			
			for (int z = 1; z <= 2*i; z = z+1) {
				plot(x, y+z);
				plot(x-(2*i), y+z);
			}
			for (int r = 1; r <= 2*i; r = r+1) {
				plot(x-r, y);
				plot(x-r, y+(2*i));

			}
		}
		
		
	}

	public void shape5() {
		
		
		double r = 1;
		for (double angle = 0; angle <= 720; angle = angle+0.01){
			
			double x = Math.cos(angle)*r;
			double y = Math.sin(angle)*r;
			plot((int)x+150, (int)y+150);
			r = r+(angle/100);
			
		}
		
		
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
