//Inheritance using keyword "extends"
//it allows another class to inherit from another class
//the main point is to allow code to be reused
//also "extends" means you have to add extra methods or variables on top of the existing class
//It also support method overrides
//If a class does not defined a constructor, JAVA VM will define an empty constructor for the class
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
		this.school = school;
	}

	//override
	public void printInfo(){
		System.out.println("School = " + this.school + " Age = " + this.getAge());
	}
};

public class Ext3{

	public static void main(String args[]){
		Student stu = new Student("ABC");
		stu.setAge(10);
		System.out.println(stu.getSchool());
		System.out.println(stu.getAge());
		stu.printInfo();
	}
}
