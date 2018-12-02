//Inheritance using keyword "extends"
//it allows another class to inherit from another class
//the main point is to allow code to be reused
//also "extends" means you have to add extra methods or variables on top of the existing class
//It also support method overrides
//If a class does not defined a constructor, JAVA VM will define an empty constructor for the class
//A son class will always initialise father class when it's first created
//the son class will call super() constructor from Person class
//super() means the constructor without any variables
//however, you can also force the son class to use not the super() constructor from father class
//this can be done by defining the super(5) with variables
//final keyword
//final on class means this class cannot have son class
//final on method means this method cannot be overrides
//final on variable means this variable is a constant
//A son class cannot access private variables or private method in father class
//but father class can provide a get set method so the son can access the private variable or method

class Person{
	private int age; //make this private so that external user cannot access it directly, can only access via setAge

	public void setAge(int age)
	{	
		if(age < 0 || age > 200)
			age = 0;
		else
			 this.age = age;	
	}	

	public int getAge()
	{
		return this.age;
	}

	public void printInfo(){
		System.out.println("Age = " + this.age);
	}

	public Person(){
		System.out.println("Person()");
	}

	public Person(int age)
	{
		System.out.println("Person(int age)");
		this.age = age;
	}
};

class Student extends Person{
	private String school;

	public void setSchool(String school)
	{	
		this.school = school;
	}	

	public String getSchool()
	{	
		return school;
	}

	public Student(String school){
		//will call super() constructor from Person class
		//super() means the constructor without any variables
		//super();
		super(5);
		System.out.println("Student(String school)");
		this.school = school;
	}

	//override
	public void printInfo(){
		System.out.println("School = " + this.school + " Age = " + this.getAge());
	}
};

public class Ext4{

	public static void main(String args[]){
		Student stu = new Student("ABC");
		//stu.setAge(10);
		System.out.println(stu.getSchool());
		System.out.println(stu.getAge());
		stu.printInfo();
	}
}
