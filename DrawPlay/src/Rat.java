import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rat {
	private static final int BODY_LENGTH = 75;
	private static final int BODY_HEIGHT = 40;
	private static final int TAIL_LENGTH = 60;
	public void draw(Graphics g, int mouseX, int mouseY)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.black);
		g2.fillOval(mouseX, mouseY, BODY_LENGTH, BODY_HEIGHT);
		int x = mouseX + BODY_LENGTH;
		int y = mouseY + BODY_HEIGHT/2;
		int x2 = x + TAIL_LENGTH;
		g2.drawLine(x, y, x2, y);
		// text appears below mouse body, +10 places below 
		// so it doesn't overlap the drawing
	}
}