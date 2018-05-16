package arrays;

/*
System.out.println("");
*/

//****************************************************************
//Sales.java
//
//Reads in and stores sales for each of 5 salespeople. Displays
//sales entered by salesperson id and total sales for all salespeople.
//
//****************************************************************
import java.util.Scanner;
public class Sales
{
public static void main(String[] args)
{
	// Total Entries

Scanner scan = new Scanner(System.in);
System.out.println("Enter Number of Salespeople:");
int SALESPEOPLE = scan.nextInt();
int[] sales = new int[SALESPEOPLE];
int sum;




// Determines Values for the salesperson.
for (int i=0; i<sales.length; i++)
{
System.out.print("\nEnter sales for salesperson " + (i+1) + ": ");
sales[i] = scan.nextInt();
} // End of For Loop

// Prints values in this format: 
System.out.println("\nSalesperson Sales");
System.out.println("--------------------");
sum = 0;

int lo = 0, hi = 0, hiv = 0, lov= 0;

for (int i=0; i<sales.length; i++)
{
System.out.println(" " + (i+1) + ": " + sales[i]);
sum += sales[i];
if(i==0) {
	lo = sales[i];
	hi = sales[i];
}
else {
	if(sales[i] > hi) {
		hi = sales[i];
		hiv = i;
	}
	if(sales[i] < lo) {
		lo = sales[i];
		lov = i;
	}
}
} // End of For Loop

hiv +=1;
lov +=1;

System.out.println("\nTotal sales: " + sum);
double avg = (double)sum / (double)SALESPEOPLE;
System.out.println("\nAvgerage Sales: " + avg);
System.out.println("\nHighest Sale was from Salesperson #" + hiv + ", with a total of $" + hi + "!");
System.out.println("Lowest Sale was from Salesperson #" + lov + ", with a total of $" + lo + "!");
int in;
int exc = 0, nexc = 0;

System.out.println("\nEnter a value to check:");
in = scan.nextInt();
System.out.println("\nSalespeople and Values Exceeding Value: ");
for(int i=0;i<sales.length;i++) {
	if(sales[i] > in) {
		System.out.println("Salesperson #" + (i+1) + ": $" + sales[i]);
		exc++;
	}
	
}
System.out.println("\nThe number of salespeople who exceed the value is: " + exc);
System.out.println("\nSalespeople and Values that do NOT Exceed Value:");
for(int i=0;i<sales.length;i++) {
	if(sales[i] < in || sales[i]==in) {
		System.out.println("Salesperson #" + (i+1) + ": $" + sales[i]);
		nexc++;
	}
	
	
}
System.out.println("\nThe number of salespeople who do not exceed the value is: " + nexc);




} // End of Main
} // End of Class
