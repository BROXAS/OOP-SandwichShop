package edu.albany.SandwichShop;
import java.util.Scanner;
import java.util.InputMismatchException;

class Customer{
	
       int choice = 0;
	   
	   //Objects
	   Cashier cash_obj = new Cashier();
	   SandwichMaker sand_obj = new SandwichMaker();
	   
	   Scanner cust_sc   =   new Scanner(System.in);
	   
	   //Allows customer to order
	   public void order() {
	       while(true){
	    	   	   System.out.println("Menu Options:");
	           System.out.println("1. Add sandwich(es) to cart");
	           System.out.println("2. Delete sandwich(es) from cart");
	           System.out.println("3. Purchase sandwiches");
	           System.out.println("4. Exit store");
	           System.out.println("Enter a number option:");
	           try{
	               choice = cust_sc.nextInt();
	           }catch(InputMismatchException e){
	               System.out.println("Not correct format, good day");
	               break;
	           }
	           switch(choice){
	               case 1:
	                   sand_obj.addSandwich();
	                   break;
	               case 2:
	                   sand_obj.remSandwich();
	                   break;
	               case 3:
	                   sand_obj.purchase(sand_obj.quantity);
	                   break;
	               case 4:
	            	   	   cash_obj.goodbye();
	                   System.exit(0);
	                   break;
	               default:
	                   System.out.println("Not an option, try again");                                  
	           }
	       }
	   }
	   
	}
