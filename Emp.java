
package layer2;
public class Emp {
	private int id;
	private String name;
	private double salary;
	
	public Emp() {
		super();
		System.out.println("Emp ctor....");
	}
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int geEmpId() {
		return id;
	}
	public void setEmpId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return name;
	}
	public void setEmpName(String name) {
		this.name = name;
	}

	public double getEmpSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	public void setEmpSalary(double salary)
	{
		this.salary=salary;
	}

	
}