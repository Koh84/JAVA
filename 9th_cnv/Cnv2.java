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

//Upper conversion
//Father f = son; /*upper conversion*/
//Father will use son's override method
//if son does not have this method override, it will use its own method
//also, Father can only use it's own methods unless if the above occured

//Down conversion
//Father f = new Father();
//Son son = (Son)f; //The father must be casted
//Son son = (Son)f; //This will cause ClassCastException because son has more method than father
//The only way this will be fixed is 
//Father f = new Son(); //Upper conversion follow by Down conversion
//equivalent to Son son = new Son();

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

	public void printInfo(){ System.out.println("This is Father"); }
};

class Son extends Father{
	public void printInfo(){ System.out.println("This is Son"); }
	public void playgame(){System.out.println("playGame ...");}
};

class Daughter extends Father{
	public void printInfo(){ System.out.println("This is Daughter"); }
};

public class Cnv2{
	public static void main(String args[]){
		Father f = new Son(); //Upper conversion follow by Down conversion
		Son son = (Son)f; //This will cause ClassCastException because son has more method than father
		//equivalent to Son son = new Son();

	}
}
