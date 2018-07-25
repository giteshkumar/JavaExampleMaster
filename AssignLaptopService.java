
public class AssignLaptopService {

	
	Employee assignLaptopToEmployee(int currentCount,Employee e ) {
		
		if(currentCount>0) {
			
			switch(e.getDept()) {
				case "X": 
					e.setLaptopType("Dell");
					break;
				case "Y":
					e.setLaptopType("Lenovo");
					break;
				case "Z"	:
					e.setLaptopType("Apple");
					break;
				default :
					System.out.println("Wrong DEPT...This will not be considered...Please re-enter");
					return null;
			}
			return e;
		}
		else {
			
			return null;
		}
		
		
	}
	
}
