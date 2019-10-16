package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Polymorph {
    protected int x;
    protected int y;   
    protected int width = 50;
    protected int height = 50;
    int theta = 0;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
    
    Polymorph(int x, int y){
   	 setX(x);
   	 setY(y);
    }
    
    public void update(){
    	
    }
    
    public abstract void draw(Graphics g);
}
