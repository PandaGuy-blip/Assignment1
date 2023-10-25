import java.util.Scanner;

/***
 * Johnson Seto
 * 20116600
 * COMP503/10
 * Programming Assignment Part A 
 * 
 * ShopApp
 * Final class and continuation of Product and OnlineShop 
 */

public class ShopApp {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		OnlineShop onlineshop = new OnlineShop(5);
		onlineshop.add(new Product("Nintendo  Switch", "Nintendo ", 548, 'A', 4.465347, 101));
		onlineshop.add(new Product("A4 Book", "Collins", 2.80, 'B', 3.1, 5));
		onlineshop.add(new Product("Teddy Bear", "Toy Inc", 5.34, 'C', 1.8, 15));
		onlineshop.add(new Product("Speaker", "Sound Express", 99.99, 'B', 3.7, 28));
		onlineshop.add(new Product("Ninja Blender", "Kitchen Works", 50.99, 'B', 0.0, 0));
		
		//A = Display
		//B = Rate Products
		//C Terminate 
		int exit_char = 0;
	
		while (exit_char < 1) {
			System.out.println("A. Display inventory \r\n"
					+ "B. Rate Product \r\n"
					+ "C. Exit ");
			char user_char = keyboard.next().charAt(0);
			
			if(user_char == 'A') {
				System.out.println(onlineshop.toString());
			//First IF FOR A
			}
			if(user_char == 'B') {
				System.out.println("Which Product do you want to rate? 1-5");
				int num = keyboard.nextInt();
			//Repeat until valid input
				while(num < 1 || num > 5) 
				{
					System.out.println("Between 1-5");
					num = keyboard.nextInt();
				}
			//
				System.out.println(onlineshop.getProduct(num));
				
				System.out.println("What would you rate this?");
				double rate = keyboard.nextInt();
			//Repeat until valid input
				while(rate < 0.0 || num > 5.0) 
				{
					System.out.println("Between 0-5");
					rate = keyboard.nextDouble();
				}
			//
				onlineshop.getProduct(num).rateReliability(rate);
				System.out.println(onlineshop.toString());

			//Second IF FOR B
			}
			if(user_char == 'C')
			{
				exit_char ++;
			//Third IF FOR C AND STOPS PROGRAM
			}
	//While }
		}
		System.out.println("That's the end folks!");
		
	keyboard.close();
//Main }
	}
	
//Last }
}
