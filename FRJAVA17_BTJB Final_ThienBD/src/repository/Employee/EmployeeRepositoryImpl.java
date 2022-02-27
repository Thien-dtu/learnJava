package repository.Employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;
import model.OfficalEmp;
import model.TrialEmp;
import repository.DBConnection;

/**
 * @author ThienBD
 * The Class EmployeeRepositoryImpl.
 */
public class EmployeeRepositoryImpl implements EmployeeRepository {

	/** The Constant SELECT_ALL. */
	private static final String SELECT_ALL = "Select * from Employee";
	
	/** The db connection. */
	DBConnection dbConnection = new DBConnection();

	/**
	 * Find all.
	 *
	 * @author ThienBD
	 * @return the list
	 */
	@Override
	public List<Employee> findAll() {
		List<Employee> emplList = new ArrayList<>();
		Employee employee = null;
		Connection conn = null;
		conn = DBConnection.getConnection();
		try {
			PreparedStatement stmt = conn.prepareStatement(SELECT_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String EmpNo = rs.getString("EmpNo");
				String Name = rs.getString("Full_Name");
				String Date = String.valueOf(rs.getDate("Birth_Date"));
				String DateRegist = String.valueOf(rs.getDate("Date_Regist"));
				String Phone = rs.getString("Phone");
				String Address = rs.getString("Address");
				int ContractType = rs.getInt("Contract_Type");
				int ContractTerm = rs.getInt("Contract_Term");
				int SalaryGross = rs.getInt("Salary_Gross");
				int Pit = rs.getInt("Pit");
				if (ContractType == 1) {
					int SalaryPerDay = rs.getInt("Salary_Per_Day");
					int ManDay = rs.getInt("Man_Day");
					employee = new TrialEmp(EmpNo, Name, Date, DateRegist, Phone, Address, ContractType, ContractTerm,
							SalaryGross, Pit, SalaryPerDay, ManDay);
				} else {
					int Level = rs.getInt("Level");
					int Salary = rs.getInt("Salary");
					employee = new OfficalEmp(EmpNo, Name, Date, DateRegist, Phone, Address, ContractType, ContractTerm,
							SalaryGross, Pit, Level, Salary);

				}
				emplList.add(employee);
			}
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return emplList;
	}

	/**
	 * Insert.
	 *
	 * @author ThienBD
	 * @param employee the employee
	 * @throws ParseException the parse exception
	 */
	@Override
	public void insert(Employee employee) throws ParseException {
		Connection con = null;
		con = DBConnection.getConnection();
		PreparedStatement statement = null;
		try {
			statement = con.prepareStatement(SELECT_ALL, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery();
			if (employee instanceof OfficalEmp) {
				rs.moveToInsertRow();
				insertEmpl(employee, rs);
				rs.updateInt("Level", ((OfficalEmp) employee).getLevel());
				rs.updateInt("Salary", ((OfficalEmp) employee).getSalary());
				rs.insertRow();
			} else if (employee instanceof TrialEmp) {
				rs.moveToInsertRow();
				insertEmpl(employee, rs);
				rs.updateInt("Salary_Per_Day", ((TrialEmp) employee).getSalaryPerDay());
				rs.updateInt("Man_Day", ((TrialEmp) employee).getManDay());
				rs.insertRow();
			}
			statement.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Insert empl.
	 *
	 * @author ThienBD
	 * @param employee the employee
	 * @param rs the rs
	 * @throws SQLException the SQL exception
	 */
	private void insertEmpl(Employee employee, ResultSet rs) throws SQLException {
		System.out.println("================**");
		System.out.println(employee.getEmpNo());
		rs.updateString("EmpNo", employee.getEmpNo());
		rs.updateString("Full_Name", employee.getName());
		rs.updateDate("Birth_Date", Date.valueOf(employee.getDate()));
		rs.updateDate("Date_regist", Date.valueOf(employee.getDateRegist()));
		rs.updateString("Phone", employee.getPhone());
		rs.updateString("Address", employee.getAddress());
		rs.updateInt("Contract_Type", employee.getContractType());
		rs.updateInt("Contract_Term", employee.getContractTerm());
		rs.updateInt("Salary_Gross", employee.getSalaryGross());
	}

}
