//Geonhee Ko
package vendingMachine;

import java.util.Scanner;

public class VendingMachine {
static double total;
static double change;
static Scanner keyboard = new Scanner(System.in);

public static void main(String[] args){
	billsncoins();
	selectproduct();
	calculateChange();
	
}

public static double billsncoins(){
	System.out.println("Please insert only $1 bills, $5 bills, Quarters, "
			+ "Dimes, Nickels, or Pennies. \n Enter 0 when finished.");
	
	boolean loop =true;
	while(loop)
	{
	 double money=keyboard.nextDouble();
	 if(money ==1)
		 total+=1;
	 else if(money==5)
		 total+=5;
	 else if(money==.25)
		 total+=.25;
	 else if(money==.1)
		 total+=.1;
	 else if(money==.05)
		 total+=.05;
	 else if(money==.01)
		 total+=.01;
	 else if(money==0)
		 loop=false;
	 else 
		 System.out.println("Please insert only $1 bills, $5 bills, Quarters, "
					+ "Dimes, Nickels, or Pennies. \n Enter 0 when finished.");
	}
	return total;
}
	
public static void selectproduct(){
	
	double a = 1.25;
	double b = 2;
	double c = 2.25;
	double d = 2.99;
	double e = 4.99;
	boolean loop =true;
	
	 System.out.println("Your total is $"+total);
	 System.out.println("Please enter the number of the product. Enter 0 when finished.\n "
	 		+ "1 for Coke - $1.25 \n 2 for Sprite - $2.00 \n 3 for Diet Coke - $2.25 \n 4 for Mountain Dew - "
	 		+ "$2.99 \n 5 for Miller Lite - $4.99 \n ");
	 while(loop && total>0)
	 {
		 double product=keyboard.nextDouble();
		 
	 if(product>=0 && product<6){
			 
	 if (product==1 && total >=a)
	total -=a;
	 else if (product==2 && total >=b)
		 total -=b;
	 else if (product==3 && total >=c)
		 total -=c;
	 else if (product==4 && total >=d)
		 total -=d;
	 else if (product==5 && total >=e)
		 total -=e;
	 else if(product ==0)
		 loop=false;
	 else{
		 System.out.println("Insufficient funds");
		 loop=false;
		 }
	 }
		 else 
			 System.out.println("Please enter the number of the product. Enter 0 when finished.\n "
				 		+ "1 for Coke - $1.25 \n 2 for Sprite - $2.00 \n 3 for Diet Coke - $2.25 \n 4 for Mountain Dew - "
				 		+ "$2.99 \n 5 for Miller Lite - $4.99 \n ");
	 }
	 total = Math.round(total * 100.0) / 100.0;
	 
	System.out.println("Thank you. Your change is $"+total);
	
}

public static void calculateChange()
{
	
	int change=(int)(total *100);
	int quarters;
	int dimes;
	int nickels;
	int pennies;
	
	quarters = (int)(change/25);
	change = change%25;
	dimes = (int)(change/10);
	change = change%10;
	nickels = (int)(change/5);
	change = change%5;
	pennies = (int)change;
	System.out.println("Your change is in \n" + quarters +" Quarters, \n" + 
	dimes +" Dimes, \n"+ nickels +" Nickels, \n" + pennies+" Pennies.");
}

}



