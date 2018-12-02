//Inheritance using keyword "extends"
//it allows another class to inherit from another class
//the main point is to allow code to be reused
//also "extends" means you have to add extra functions or variables on top of the existing class

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
};

class Student extends Person{
};

public class Ext{

	public static void main(String args[]){
		Student stu = new Student();
		stu.setAge(10);
		System.out.println(stu.getAge());
	}
}
