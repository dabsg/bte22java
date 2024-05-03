package egengrafik.bollar;

import java.awt.Color;

public class Boll {

	  int r;
	 Color c;
	 int vx;
	 int vy;
	 int x;
	 int y;
	
	public Boll(int r, Color c, int vx , int vy , int x, int y) {
		
		this.r=r;
		this.c=c;
		this.vx=vx;
		this.vy=vy;
		this.x=x;
		this.y=y;
			
	}
	public void move() {
		
		this.x= this.x+vx;
		this.y=this.y+vy;
		
		if((this.y>(400 - this.r*2)) || (this.y<0) ) {
			
			this.vy=this.vy*-1;
		}
		
		if((this.x>(400 - this.r*2)) || (this.x<0) ) {
			
			this.vx=this.vx*-1;
		}
		
	}
}
