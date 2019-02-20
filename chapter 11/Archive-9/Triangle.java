/*
ausitn smith
2/8/19
--------------------------------------------------
				GeometricObject
--------------------------------------------------
- color: String
- filled: boolean
- dateCreated: java.util.Date
--------------------------------------------------
+ GeometricObject()
+ GeometricObject(color: String, filled: boolean)
+ getColor(): String
+ setColor(color: String): void
+ isFilled(): boolean
+ setFilled(filled: boolean): void
+ getDateCreated(): java.util.Date
+ toString(): String
--------------------------------------------------

--------------------------------------------------
				Trangel extends GeometricObject
--------------------------------------------------
- side1: double
-side2: double
-side3: double
--------------------------------------------------
+ triangle()
+ triangle(side1, side2, side3) 
+ getSide1() : DOUBLE
+ getSide2() : double
+getSide3() : double
+ getArea() double
+getPerimeter()
+toString()
--------------------------------------------------
*/

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		super();
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	public Triangle(double s1, double s2, double s3) {
		super();
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1(){
		return this.side1;
	}
	
	public double getSide2(){
			return this.side2;
		}

	public double getSide3(){
			return this.side3;
		}

	public double getArea(){
		double s = (this.side1 + this.side2 + this.side3) / 2;
		double area = Math.sqrt(s * (s - this.side1) *(s - this.side2) * (s - this.side3));
		return area;
	}
	
	public double getPerimeter(){
		return this.side1 + this.side2 + this.side3;
	}
	
	public String toString(){
		return "Triangle:\n side1 = " + this.side1 + "\nside2 = " + this.side2 + "\nside3 = " + this.side3 + "\narea =" + this.getArea() + "\nperimeter: " + this.getPerimeter() + "\n" + super.toString();
	}
}