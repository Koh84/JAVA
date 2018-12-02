//static variable in class indicate count belong to this class, everyone can share it by calling ClassName.variableName

//static block only runs once that is during a class being initialised
static {
	System.out.println("static block");
}

//constructor block - it allow us to increment count without having to be in the constructor body
//It runs everytime an object being initialised
{
	System.out.println("constructor block");
	count++;
}

//Only 1 class with "public" keyword in a .java file is allowed

//static method means this method belong to the class, so you don't have to create an object of the class before using
//This also mean, the JAVA virtual machine don't have to create an object to run a main method. As follow,
//public static void main(String args[]){}
	
