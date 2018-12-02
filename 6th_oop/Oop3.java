class Person{
	String name;
	int age;

	String getName(){
		return "Guangdong " + name;
	}

	//constructor
	public Person()
	{
		name = "null";
		age = 0;
	}

	//constructor
	public Person(String name)
	{
		//name = name; //this will give error, both pointing to the name in this constructor
		this.name = name; //this is good, "this." will means the current object's name or class's name.
	}
	
	//constructor
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	
};

//Only 1 class with public in a file
public class Oop3{

	public static void main(String args[]){
		Person p1 = new Person("Zhangshan");
		Person p2 = new Person("Lishi");
		Person p3 = new Person();
		Person p4 = new Person("Wangwu", 6);

		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println(p4.getName());

	}
}
