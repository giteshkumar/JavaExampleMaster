import java.util.Scanner;

public class LaptopInventory {

	private static int laptopCount=100;
	
	public static void main(String[] args) {
		
		boolean anyNewEmployee=true;
		Scanner sc=new Scanner(System.in);
		
		String firstname,lastname,email,mobileNo,dept,addr;
		int age=0;
		
		while(anyNewEmployee) {
			
			System.out.println("Enter employee first name:");
			firstname = sc.nextLine();
			
			System.out.println("Enter employee last name:");
			lastname = sc.nextLine();
			
			System.out.println("Enter employee email id:");
			email = sc.nextLine();
			
			System.out.println("Enter employee mobileNo:");
			mobileNo = sc.nextLine();
			
			System.out.println("Enter employee dept:");
			dept = sc.nextLine();
			
			System.out.println("Enter employee address(optional):");
			addr = sc.nextLine();
			if(addr==null || addr.length()==0){
				System.out.println("address is not collected");
			}
			
			System.out.println("Enter employee age (optional):");
			try {
				String temp=sc.nextLine();
				age = Integer.parseInt(temp);
			}catch(Exception e) {
				System.out.println("age is not collected");
			}
			
			Employee e=new AssignLaptopService().assignLaptopToEmployee(laptopCount,new Employee(firstname,lastname,email,mobileNo,dept));
			
			if(e!=null)	{
				if(age!=0) {
					e.setAge(age);
				}
				
				if(addr!=null && addr.length()>0){
					e.setAddress(addr);
				}
				
				laptopCount-- ;
				System.out.println(e.toString());
				System.out.println("Available laptop count:"+laptopCount);
			}
			if(laptopCount==0) anyNewEmployee=false;
			
			
			System.out.println("Do you want to proceed: (Y for yes, N for no)");
			String choice=sc.nextLine();
			if(choice.startsWith("N")) anyNewEmployee = false;
			else if (choice.startsWith("Y")) anyNewEmployee = true;
			else {
				System.out.println("wrong choice, exiting execution");
				anyNewEmployee = false;
			}
			
		}
		sc.close();
	}
}