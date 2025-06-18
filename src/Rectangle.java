
public class Rectangle {
	//Instance Variables: this is what all Rectangle Objects will have
	int length;
	int width;
	
	
	//Constructor Method to initialize instance variables
	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	//Instance Method to compute and return the area
	public int getArea(){
		return length * width;
	}

}
