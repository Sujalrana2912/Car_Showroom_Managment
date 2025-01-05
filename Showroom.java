
import java.util.*;
public  class Showroom implements utility {
	
	String showroom_name;
	String showroom_address;
	String manager_name;
	int total_employees;
	int total_cars_in_stocks=0;
	
	@Override
	public void get_details()
	{
		System.out.println("Showroom name:  "+showroom_name);
		System.out.println("Showroom adress: "+showroom_address);
		System.out.println("Manager name:  "+ manager_name);
		System.out.println("Total Employees:  " + total_employees);
		System.out.println("Total cars in stocks:  "+total_cars_in_stocks);
	}

	@Override
	public void set_details() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("============================Enter Showrooom Details==========================");
		System.out.println();
		System.out.print("Showroom name: ");
		showroom_name=sc.nextLine();
		System.out.print("Showroom address: ");
		showroom_address=sc.nextLine();
		System.out.print("Manager name: ");
		manager_name=sc.nextLine();
		System.out.print("Total Employees: ");
		total_employees=sc.nextInt();
		System.out.print("Total cars in stocks : ");
		total_cars_in_stocks=sc.nextInt();
	}
	
	

}
