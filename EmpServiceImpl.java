package layer4; //ACTUAL BUSINESS OF THE BANK - THE SERVICES 

import layer2.Emp;
import layer3.EmpRepositoryImpl;

public class EmpServiceImpl implements EmpService {

	EmpRepositoryImpl accRepo = new EmpRepositoryImpl();
	
	@Override
	public Emp findEmpService(int id) {
		System.out.println("EmpServiceImpl...searching for emp...."+id);
		Emp accTemp = accRepo.selectEmp(id);
		return accTemp;
	}

	@Override
	public void createEmpService(Emp acc) {
		// TODO Auto-generated method stub

	}

	public void modifyEmpService(Emp acc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeEmpService(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void EmpService(Emp e) {
		// TODO Auto-generated method stub
		
	}
	
}
