package layer3;

import layer2.Emp;

public interface EmpRepository {
	Emp selectEmp(int id);
	void insertEmp(Emp eRef);
	void updateEmp(Emp eRef);
	void deleteAccount(int id);

}
