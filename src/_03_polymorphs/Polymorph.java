package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	protected int movx;
    protected int x;
    protected int y;   
    protected int width = 50;
    protected int height = 50;

	public int getMovx() {
		return movx;
	}

	public void setMovx(int movx) {
		this.movx = movx;
	}

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
    	movx++;
    }
    
    public abstract void draw(Graphics g);
}
