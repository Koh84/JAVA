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
class Father{
	private int money; //make this private so that external user cannot access it directly, can only access via setAge
	public int getMoney()
	{
		return money;
	}

	public void setMoney(int money)
	{
		this.money = money;
	}

	//father setting private - son won't be able to access
	//private void printInfo(){ System.out.println("This is Father")};
	//father setting public - son will be able to access but can't make private
	public void printInfo(){ System.out.println("This is Father"); }

	private void printInfo2(){ System.out.println("This is Father2");}
};

class Son extends Father{
	//ok	
	public void printInfo(){ System.out.println("This is Son"); }
	//not okay as father set this to public, so son cannot set it private
	//private void printInfo(){ System.out.println("This is Son"); }

	//same name is ok although this is not overiding father's class printInfo2()
	public void printInfo2(){ System.out.println("This is Son2"); }
};

public class Ext5{
	public static void main(String args[]){
		Son son = new Son();
		son.setMoney(100);
		son.printInfo();
	}
}
