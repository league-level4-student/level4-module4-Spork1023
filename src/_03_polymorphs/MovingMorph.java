package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;

public class MovingMorph extends Polymorph {
	Point mouse;
	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, width, height);
	}
	public void update() {
		mouse = MouseInfo.getPointerInfo().getLocation();
		y = mouse.y;
		x = mouse.x;
		theta++;
	}

}
