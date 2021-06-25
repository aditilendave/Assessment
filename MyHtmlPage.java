package layer6; //PRESENTATION LAYER OF HTML CSS JAVA SCRIPT

import java.util.Scanner;

import layer2.Emp;
import layer5.EmpController;

public class MyHtmlPage {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = scan.nextInt();
		System.out.println("HTML searching for id "+id);
		EmpController accController = new EmpController();
		Emp acc = accController.findEmp(id);
		if(acc!=null) {
			System.out.println("== Emp Details ==");
			System.out.println("Emp Number  : "+acc.geEmpId());
			System.out.println("Emp Name    : "+acc.getEmpName());
			System.out.println("Emp Salary : "+acc.getEmpSalary());
		}
		else {
			System.out.println("Account not found "+id);
		}
	}
}
