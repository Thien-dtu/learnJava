package repository.Employee;

import java.text.ParseException;
import java.util.List;

import model.Employee;

/**
 * The Interface EmployeeRepository.
 */
public interface EmployeeRepository {
	
	/**
	 * Insert.
	 *
	 * @param employee the employee
	 * @throws ParseException the parse exception
	 */
	void insert(Employee employee) throws ParseException;
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Employee> findAll();

}
