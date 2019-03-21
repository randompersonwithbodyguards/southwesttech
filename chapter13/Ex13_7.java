class Ex13_7 {
	public static void main(String[] args) {
		AbstractGeometricObject[] listOfSquares = {new Square(8.5), new Square(4.1), new Square(6.0), new Square(1.3), new Square(10.12)};
		for(int i = 0; i < 5; i++){
			System.out.println("the area of square " + i + " : " + listOfSquares[i].getArea());
			
			((Square)listOfSquares[i]).howToColor();
		}
	}
}