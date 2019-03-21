class Exercise13_11 {
	public static void main(String[] args){
		Octagon o1 = new Octagon(5);
		System.out.println("Area is " + o1.getArea());
		System.out.println("Perimeter is " + o1.getPerimeter());
		
		Octagon o2 = (Octagon)(o1.clone());
		System.out.println("Compare o1 and o2 " + o1.compareTo(o2));
	}
}