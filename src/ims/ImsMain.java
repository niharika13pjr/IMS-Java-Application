package ims;
import java.util.*;
import java.util.Scanner;

public class ImsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Inventory Management System : ");
		int choice=0;
		do
		{
System.out.println("Please enter the digit of your choice:");
System.out.println("1.Pick Up");
System.out.println("2.Restore");
System.out.println("3.Exit");
/*
 Currently in the database the repository has 6 apples,5 Sweet lime,4 Oranges,6 Strawberry,7 Blue Berry,2 Mango
 */
Scanner in = new Scanner(System.in);
choice = Integer.parseInt(in.nextLine());


switch(choice)
{
case 1: 
	System.out.println("Enter the product name: ");
	String product_name=in.nextLine();
	System.out.println("Enter how many products you want to pick :");
	int product_count=Integer.parseInt(in.nextLine());
	//System.out.println("Enter the room: ");
	//String room=in.nextLine();
	PickingResult pick=new PickingResult();
	Database2 db=new Database2();
	pick=db.pickProduct(product_name, product_count);
	System.out.println(pick.getmessage());
	System.out.println("Total amount: "+pick.numberofitems());
	break;
	
case 2:
	System.out.println("Enter the product name: ");
	String productname=in.nextLine();
	System.out.println("Enter how many products you want to restock :");
	int productcount=Integer.parseInt(in.nextLine());
	//System.out.println("Enter the room: ");
	//String rooms=in.nextLine();
	RestockingResult res=new RestockingResult();
	Database2 db1=new Database2();
	res=db1.restockProduct(productname, productcount);
	System.out.println(res.getmessage());
	System.out.println("Total amount: "+res.numberofitems());
	break;
	
case 3:
	System.out.println("Exit system");
	break;
	
	default:
		System.out.println("Wrong input");
		break;
}
	
	}while(choice<3);
	}
	}
