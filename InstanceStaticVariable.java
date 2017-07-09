
public class InstanceStaticVariable {
	// A variable that is created inside the class 
	//but outside the method, is known as instance variable. 
	int instanceField;
	//Class variables also known as static variables are declared with the 
	//static keyword in a class, but outside a method, constructor or a block. 
	static String staticField;

	public static void main(String[] args) {
		
		InstanceStaticVariable obj = new InstanceStaticVariable();
		//Instance variable can only be accessed by Object of the class only 
		//as below.
		System.out.println("Instance Variable : " + obj.instanceField);
		/*
		 * Static field can be accessed in two way.
		 * 1- Via Object of the class
		 * 2- Via CLASS name
		*/

		System.out.println("Static / Class Variable : " + obj.staticField);
		System.out.println("Static / Class Variable : " + InstanceStaticVariable.staticField);
		System.out.println("Instance Variable : " + new InstanceStaticVariable().instanceField);
		
	}

}
