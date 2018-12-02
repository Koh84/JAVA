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
//If a father class sets its method as private - son won't be able to access
//Son can only access public method
//also, if father class sets its method as public - son won't be able to override it to make the method private
//a Son class can use the same method name to the father class even if the father class set the method to private,
//however the two class defined has no relationship and is not inherited, it's the class own method

//an abstract keyword in front of a class means it wants to define an abstract method, this method when inheritted 
//by the son class, the son class must provide method to override it
//As soon as a class defined it contains abstract method, it means  that you can never create object of it
//i.e Father fat = new Father(), this will be wrong
//hence, the only way to access a class with abstract is to inherrit from it
//abstract can be use for template defining

//Difference between abstract class and interface class
//a son class can only extends from one abstract class
//however, a son class can extends from more than one interface class

abstract class Father{
	private int money; //make this private so that external user cannot access it directly, can only access via setAge
	public int getMoney()
	{
		return money;
	}

	public void setMoney(int money)
	{
		this.money = money;
	}

	public abstract void study();
};

class Son extends Father{
	public void study(){ System.out.println("Son study()");}
};

public class Ext6{
	public static void main(String args[]){
		Son son = new Son();
		son.study();
	}
}
