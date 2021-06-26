
class Employee 
{
	private int id;
	private String name;
	private double salary; 
   Employee() { 
	//	System.out.println("Employeet ctor....");
	}

	Employee(int eid, String ename, double esalary) {
    	//System.out.println("Employee(int,String,double) ctor...");
    	id=eid;
    	name=ename;
    	salary=esalary;
    }
	    void showEmployee() { 
    	System.out.println("->Employee id  : "+id);
    	System.out.println("->Employee name  : "+name);
    	System.out.println("->Employee salary : "+salary);
    	System.out.println("----------------------------------");
    }
    public double getEmployeeSalary(String tn) {
    	System.out.println(tn+" get Employee Salary....");
    	return salary;
    }
    private void setSalary(double amount, String tn) {
    	System.out.println(tn+" set Salary....");
    	salary = amount;
    }
    public synchronized void add(double amountToAdd, String tn) {
    	//System.out.println(tn+" started Adding...."+amountToAdd);
		double currentSalary = getEmployeeSalary(tn); 
		double newSalary = currentSalary + amountToAdd;
    //	System.out.println(tn+" Add() invoked....");
    	setSalary(newSalary, tn);
    	System.out.println(tn+" adding...."+amountToAdd);
    }
}

public class SyncTest {
	public static void main(String[] args) {
		System.out.println("->Begin of main");
		Employee e= new Employee(101,"aditi",50000);
		e.showEmployee();
		
		Teller t1 = new Teller("\tSayali",e,5000);
		Teller t2 = new Teller("\tpriya",e,7000);
		Teller t3 = new Teller("\t\triya",e,8000);
	//	System.out.println("->Starting the threads...");
		t1.start(); 
		t2.start();
		t3.start();
		//System.out.println("->Started the threads...");
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e1) {
		//	System.out.println("Some problem : "+e1);
		}
		
		System.out.println("->After all transactions....lets check the salary...");
		e.showEmployee();
		System.out.println("->End of main");
	}
}

class Teller extends Thread //1
{
	String tellerName;
	Employee empRef;
	double amountToAdd;
	
	Teller(String tn, Employee x, double sal) {
		tellerName = tn;
		empRef = x;
		amountToAdd=sal;
	}
	//2 
	public void run() {
			empRef.add(amountToAdd,tellerName);
	}
}




