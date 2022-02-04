package presentation;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import static javax.swing.text.StyleConstants.Italic;

@SuppressWarnings("serial")
public class PresentationText extends JPanel {
	
	int a=40, d=300, g=400;
	
	public void paint(Graphics gp) {
		super.paint(gp);
		
		Graphics2D g2d = (Graphics2D) gp;
		g2d.setColor(Color.ORANGE);
		g2d.setFont(new Font("BOLD", BOLD, 35));
		
		g2d.drawString("UNIVERSITY", a, 150);
		g2d.drawString("OF", d, 250);
		g2d.drawString("CALABAR", g, 300);
		
		try {
			Thread.sleep(300);
			if(a<190 && d>150 && g>250)
			{
				a+=5; d-=5; g-=5;
			}
			else
			{
				a=190; d=150; g=250;
			}
		}
		catch (Exception e) {
			
		}
		
		repaint();
	}
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(500, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(new PresentationText());
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	
}
