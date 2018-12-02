//Encapsulation stops user from accessing variable of class i.e age directly.
//It can be achieved by using public int setAge(int age) and getAge(), 
//age must be defined with private
//private - can only be access in class
//default - can only be accessed in the same package name
//protected - can be access in package and other son classes
//public - everyone can use in this file
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

public class Enc{

	public static void main(String args[]){
		Person per = new Person();
		per.setAge(-1);

		System.out.println(per.getAge());
	}
}
