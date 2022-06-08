/*
Write a program to print the area and perimeter of a triangle 
having sides of 3, 4 and 5 units by creating a class named 
'Triangle' without any parameter in its constructor.
*/

class Triangle{
	//declare a varible
	int a=3;
	int b=4;
	int c=5;
	
	void Triangle(){
		double s = (a+b+c)/2.0;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area of a triangle is: "+area);
		int t = 0;
		int p = a+b+c;
		System.out.println("perimeter of triangle is: " +p);
	}
}

class Demo3{
	public static void main(String[] args){
		Triangle t = new Triangle();
		t.Triangle();
	}
}