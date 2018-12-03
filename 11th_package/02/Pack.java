//"package" keyword is used to define where a class need to be store after being compiled 
//compile using javac -d . Pack.java
//explain above, create the folders in current path
//execute using java a.b.c.d.Pack 

//"import" keyword is used to define what class and where I should import it from

//javac -d . lisi/Math.jav
//javac -d . zhangshan/Math.java 
//javac -d . Pack.java 
import a.b.c.d1.*;
import a.b.c.d2.*;

public class Pack{

	public static void main(String args[]){
		//add
		System.out.println(a.b.c.d1.Math.add(1,2));
		System.out.println(a.b.c.d2.Math.add(1,2));
		//sub
		System.out.println(a.b.c.d2.Math.sub(1,2));
		a.b.c.d2.Print.PrintInfo();
		Print.PrintInfo();
	}
}
