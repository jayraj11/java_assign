/*
2) Assign and print the roll number, phone number and address 
of two students having names "Sam" and "John" respectively by 
creating two objects of class 'Student'.
*/

class Student{
	//decalare variable
	String name;
	int roll_no;
	long phone_no;
	String add;
	
	//constructor
	Student(String name, int roll_no, long phone_no, String add){
		this.name = name;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.add = add;
	}
	
	void display(){
		System.out.println("name od student is " +name+ 
		" studenr roll no is " +roll_no+ " phone no is " 
		+phone_no+ " address is "+add);
	}
	
}

class Demo2{
	public static void main(String[] args){
		Student s1 = new Student("Sam", 1, 832977, "nashik");
		Student s2 = new Student("John", 2, 814942, "mumbai");
		
		s1.display();
		s2.display();
	}
}
