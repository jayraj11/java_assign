/*
Create a class named 'Student' with String variable 'name' and 
integer variable 'roll_no'. Assign the value of roll_no as '2' and 
that of name as "John" by creating an object of the class Student.
*/

class Student{
	//initialise variable
	String name;
	int roll_no;
	
	//constrctor
	Student(String name, int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}
	
	void display(){
		System.out.println("student name is " +name+ " and roll no is " +roll_no);
	}
}

class Demo1{
	public static void main(String[] args){
		Student s1 = new Student("John", 2);
		s1.display();
		
	}
}