/*
* Repetition1.java
* @author Enda
* 21/10/2024
*/

public class Repetition1{
	public static void main(String args []){
		// For loop
		System.out.println("For Loop.....");
		for(int i = 51; i < 151; i++){
			System.out.println(i - 50);
		} // for

		// While loop
		System.out.println("While Loop.....");
		int i = 1;
		while(i <= 100){
			System.out.println(i);
			i = i + 1;
		} // while

		// Do/While loop
		System.out.println("Do/While Loop.....");
		int j = 1;
		do{
			System.out.println(j);
			j++;
		}while(j <= 100);

	} // main
} // class