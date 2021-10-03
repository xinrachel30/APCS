/* 
Xinqing Lin
APCS
HW08 -- Greeting 3 People
2021-9-30
*/

public class Greet {
	public static void main(String[] args){
		System.out.println("No hablo queso");
		greet("Horse");
		greet("Duck");
		greet("Friend");
	}
	
	public static void greet(String x){
		System.out.println("Good morning, " + x + ". How are you?");
}
}
/*
DISCOVERIES: The "public static" before "void greet" is necessary for the method to work. Also, you need to put a variable name after String to be able to use the parameter. 
UNRESOLVED QUESTIONS: How do you get just one greeting as the output? Would you need to randomize the three names?
*/
