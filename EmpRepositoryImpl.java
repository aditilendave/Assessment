package layer3;
import layer2.Emp;
import layer2.Emp;
public class EmpRepositoryImpl implements EmpRepository {
Emp allEmp[]=new Emp[5];
public EmpRepositoryImpl() {
	allEmp[0]=new Emp(1,"aaa",5646);
	for(int i=1;i<5;i++)
	{
		allEmp[i]=new Emp();
	}
}
public Emp selectEmp(int id) {
	System.out.println("EmpRepositoryImpl...searching for account...."+id);
	Emp accObj = null;
	
	boolean found=false;
	int i=0;
	for(;i<allEmp.length;i++) {
		if(allEmp[i].geEmpId() == id) {
			accObj = allEmp[i];
			found=true;
			break;
		}
	}
	if(found==true)
		return accObj;
	else
		return null;

}
public void insertEmp(Emp eRef) {
}
{
	
}
public void updateEmp(Emp eRef) {
}
{
	
}
void deleteEmp(int id) {
}{
	
}
@Override
public void deleteAccount(int id) {
	// TODO Auto-generated method stub
	
}

	

}
