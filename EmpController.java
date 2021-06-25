package layer5; // THIS IS YOUR MIDDLE LEVEL SERVER TO TAKING INPUT FROM HTML / ANGULAR / REACT PAGES

import layer2.Emp;
import layer4.EmpServiceImpl;

public class EmpController {

	EmpServiceImpl accService = new EmpServiceImpl();
	
		public Emp findEmp(int id) {
			System.out.println("Controller is searching for id : "+id);
			Emp acc = accService.findEmpService(id);
			return acc;
		}

}