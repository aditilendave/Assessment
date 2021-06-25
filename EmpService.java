package layer4;

import layer2.Emp;

public interface EmpService {
	Emp findEmpService(int eid);
	void createEmpService(Emp e); //ctrl+shift+M
	void EmpService(Emp e);
	void removeEmpService(int eid);
	
}
