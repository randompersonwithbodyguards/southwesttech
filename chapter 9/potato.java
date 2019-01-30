class potato {
	public static void main(String[] args) {
		//ob instance var
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Width of rect1: " + rect1.width);
		System.out.println("Height of rect1: " + rect1.height);
		System.out.println("Area of rect1: " + rect1.getArea());
		System.out.println("Perimeter of rect1: " + rect1.getPerimeter());

		System.out.println("Width of rect2: " + rect2.width);
		System.out.println("Height of rect2: " + rect2.height);
		System.out.println("Area of rect2: " + rect2.getArea());
		System.out.println("Perimeter of rect2: " + rect2.getPerimeter());

	}
}