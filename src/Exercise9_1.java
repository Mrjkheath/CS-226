
public class Exercise9_1 {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The width of the rectangle is " + rectangle1.width);
		System.out.println("The height of the rectangle is " + rectangle1.height);
		System.out.println("The Area of the rectangle is " + rectangle1.getArea());
		System.out.println("The Perimeter of the rectangle is " + rectangle1.getPerimeter());
		
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The Width of the rectangle is " + rectangle2.width);
		System.out.println("The Height of the rectangle is " + rectangle2.height);
		System.out.println("The Area of the rectangle is " + rectangle2.getArea());
		System.out.println("The Perimeter of the rectangle is " + rectangle2.getPerimeter());
		
		Rectangle rectangle3 = new Rectangle();
		System.out.println("The Width of the rectangle is " + rectangle3.width);
		System.out.println("The Height of the rectangle is " + rectangle3.height);
		System.out.println("The Area of the rectangle is " + rectangle3.getArea());
		System.out.println("The Perimeter of the rectangle is " + rectangle3.getPerimeter());
	}

}

class Rectangle {

	double width = 1;

	double height = 1;

	Rectangle() {

	}

	Rectangle(double newWidth, double newHeight) {

		width = newWidth;

		height = newHeight;

	}

	double getArea() {

		return width * height;
	}

	double getPerimeter() {

		return (width * 2) + (height * 2);
	}

}
