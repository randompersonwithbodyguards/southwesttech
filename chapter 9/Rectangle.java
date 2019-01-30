/*
austin smith 
jan 16 2019
rectangle object class

UML Diagram
-----------------------
+width: double
+height: double
-----------------------
+Rectangle()
+Rectangle(width: double, height: double)
+getArea(): double
+getPerimeter: double
-----------------------
*/

class Rectangle {
	double width = 1;
	double height = 1;
	
	
	public Rectangle(){
		
	}
	
	public Rectangle(double width, double h){
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		double area = this.width * this.height;
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = this.width + this.width + this.height + this.height;
		return perimeter;
	}
	
}