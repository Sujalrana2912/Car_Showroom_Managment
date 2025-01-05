
import java.util.Scanner;
import java.util.UUID;
public class Employees extends Showroom implements utility {

	String emp_id;
	String emp_name;
	int emp_age;
	String emp_department;
	
	@Override
	public void get_details()
	{
		System.out.println("ID : "+ emp_id);
		System.out.println("Emloyee Name: "+ emp_name);
		System.out.println("Employess age:"+ emp_age);
		System.out.println("Department: "+emp_department);
	}
	
	
	@Override
	public void set_details()
	{
		Scanner sc=new Scanner(System.in);
		UUID uuid=UUID.randomUUID();
		emp_id=String.valueOf(uuid);
		System.out.println("================================== Enter Employess Details================");
		System.out.print("Employee name: ");
		emp_name=sc.nextLine();
		System.out.print("Employee age:");
		emp_age=sc.nextInt();
		System.out.print("Employee Department: ");
		emp_department=sc.nextLine();
		
	}

}
