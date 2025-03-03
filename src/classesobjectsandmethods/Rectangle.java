package classesobjectsandmethods;

public class Rectangle {
	int width,height;
	double area;
	
	public Rectangle(int width) {
		height = width*2;
	}
	
	public double calculateArea() {
		area = width*height;
		return area;
	}

}
