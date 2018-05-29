package edu.albany.SandwichShop;

class Cashier{
	
	   //Variables needed for function
	   int sandPrice = 5;
       int totalSandPrice = 0;
	   
	   //Greeting message
	   public void hello() {
		   System.out.println("Hello, welcome to the Sandwich Shack!");
	   }
	   
	   //Goodbye message
	   public void goodbye() {
		   System.out.println("Come again soon!");
	   }
	   
	   //Total prices
	   public void getPrice(int quantity){
	       totalSandPrice = quantity * sandPrice;
	       System.out.println("Sandwiches purchased: " + quantity);
	       System.out.println("Total: $" + totalSandPrice);
	       System.out.println("");
	   } 

	}
