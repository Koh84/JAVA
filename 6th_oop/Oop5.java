class Person{
	static int count; //static indicate count belong to this class, everyone can share it

	String name;
	int age;

	String getName(){
		return "Guangdong " + name;
	}

	//static block only runs once
	static {
		System.out.println("static block");
	}

	//constructor block - it allow us to increment count without having to be in the constructor body
	{
		System.out.println("constructor block");
		count++;
	}

	//constructor
	public Person()
	{	
		System.out.println("constructor method: Person 1");
		name = "null";
		age = 0;
	}

	//constructor
	public Person(String name)
	{
		System.out.println("constructor method: Person 2");
		//name = name; //this will give error, both pointing to the name in this constructor
		this.name = name; //this is good, "this." will means the current object's name or class's name.
	}
	
	//constructor
	public Person(String name, int age)
	{
		System.out.println("constructor method: Person 3");
		this.name = name;
		this.age = age;
	}

	//static will expose this method to other class in this file and you can directly use it. 
	static void printPerson(){
		System.out.println("This is a class of Person");	
	}	
};

//Only 1 class with public in a file
public class Oop5{

	//static mean this main() method belong to class method,so you don't have to create object of main before using
	public static void main(String args[]){
		Person p1 = new Person("Zhangshan");
		Person p2 = new Person("Lishi");
		Person p3 = new Person();
		Person p4 = new Person("Wangwu", 6);

		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println(p4.getName());

		Person.printPerson();
		System.out.println(Person.count);

	}
}
