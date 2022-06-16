package Question2;

import java.util.Comparator;

public class SalarySortComp implements Comparator<Employee >{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary()>e2.getSalary()) {
			return +1;
		}
		return -1;
	}

}
