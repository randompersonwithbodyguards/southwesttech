/* austin smith
1-29-19

shapeThing
---------------------
-n: int
-side: double
-x: double
-y: double
---------------------
shape()
shape(n, side)
shape(n, side, x, y)
getter and setter for all
getPerimiter()
getArea()


*/
import java.lang.Math;
class Shape {
	//number of sides
	private int n;
	
	//side length 
	private double side;
	
	private double x;
	private double y;
	
	public Shape(){
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}
	
	public Shape(int n, double side){
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	
	public Shape(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public int getN(){
		return this.n;
	}
	
	public double getSide(){
		return this.side;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public void setN(int newN){
		this.n = newN;
	}
	
	public void setSide(int newSide){
		this.side = newSide;
	}

	public void setX(int newX){
		this.x = newX;
	}
	
	public void setY(int newY){
		this.y = newY;
	}
	
	public double getPerimeter(){
		return this.n * this.side;
	}
	
	public double getArea(){
		double area = (this.n * Math.sqrt(this.side))/(4 * Math.tan((Math.PI/ this.n)));
		return area;
	}

		
}