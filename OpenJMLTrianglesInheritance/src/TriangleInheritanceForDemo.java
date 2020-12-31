class TriangleInheritanceForDemo {

	public static void main(String[] args) {
		
		Equilateral eq = new Equilateral(-8);
		
		eq.printSides();
	}
	
}

class Triangle {
    static double Pi = 3.14156;
    double x,y,z,angle;
	
    /*@ invariant true; @*/
	/*@ requires x > 0 && y > 0 && angle > 0; @*/
	public Triangle(double x, double y, double angle) {
		this.x = x;
		this.y = y;
		this.angle = angle; 
		// Actual Formula : Math.sqrt(x*x + y*y - 2*x*y*Math.cos(angle));
		// Cos(60) = 0.5;
		int a = (int) (2*x*y*0.5);
		z = Math.sqrt(x*x + y*y - a);
	}
	
	/*@ requires z > 0; @*/
	void printSides() {
		System.out.println(getClass() + ": " + x + ", " + y + ", " + z);
	}
}

class Isosceles extends Triangle {
	
	// x and y are inherited from Triangle
	/*@ invariant x == y; @*/
	public Isosceles(double x, double angle) {
		super(x,x,angle);
	}

	void printSides() {
		System.out.println(getClass() + ": " + x + ", " + y + ", " + z);
	}
}

class Equilateral extends Isosceles {
	
	// Implicit invariant is x==y && y==z
	/*@ invariant y == z; @*/
	public Equilateral(double x) {
		super(x,Pi/3);
	}

}