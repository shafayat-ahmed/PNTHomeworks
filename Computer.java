//Shafayat Ahmed
//HomeWork 2
/*Write a java program that should have a class

name called Computer. Write few static and non-
static methods and few static and non-static

variables on Computer class. Also create few
constructors on Computer class.Write another class
called TestComputer where you can create object
from Computer class.Now try to use those methods
from Computer class in TestComputer.*/

public class Computer {
	String studentName; 			//NonStatic Variable
	String model;       			//NonStatic Variable
	String OS;						//NonStatic Variable	
	int yearBuilt;					//NonStatic Variable
	int price;						//NonStatic Variable
	static String school="PNT"; 		//Static Variable
	static String batch="Fall"; 		//Static Variable
	
	

	Computer(){						//Default Constructor
		System.out.println("No other students has computer" +"\n");
	}
	Computer(String studentName, String model, String OS, int yearBuilt, int price){ //Parameterized Constructor
		this.studentName=studentName;
		this.model=model;
		this.OS=OS;
		this.yearBuilt=yearBuilt;
		this.price=price;
	}
	Computer(String studentName){ //Parameterized Constructor
		this.studentName=studentName;
		}
	
	
	void displayInformaiton() {			//NonStatic Method
		System.out.println("Studnet Name = "+studentName);
		System.out.println("Computer Type = "+model);
		System.out.println("Computer Operating System = "+OS);
		System.out.println("Computer Production Year = "+yearBuilt);
		System.out.println("Purchase Price = "+price);
		System.out.println("School Name = "+school);
		System.out.println("Batch Term = "+batch +"\n");
	}

	public static void shareComputer() {      //Static method
		System.out.println("Students who does not have computer will not be able to participate in the course");
	}
	
}

