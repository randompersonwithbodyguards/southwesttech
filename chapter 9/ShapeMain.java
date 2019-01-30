class Untitled {
	public static void main(String[] args) {
		
		Shape regularPolygon = new Shape();
		Shape regularPolygon2= new Shape(6,4);
		Shape regularPolygon3= new Shape(10, 4, 5.6, 7.8);
		
		System.out.println("Perimiter of 1: " + regularPolygon.getPerimeter());
		
		System.out.println("Perimiter of 2: " + regularPolygon2.getPerimeter());
		
		System.out.println("Perimiter of 3: " + regularPolygon3.getPerimeter());
		
		System.out.println("Area of 1: " + regularPolygon.getArea());
		
		System.out.println("Area of 2: " + regularPolygon2.getArea());
		
		System.out.println("Area of 3: " + regularPolygon3.getArea());
	}
}