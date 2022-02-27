package model;

/**
 * The Class OfficalEmp.
 */
public class OfficalEmp extends Employee {

	/** The level. */
	private int level;
	
	/** The Salary. */
	private int Salary;
	
	/**
	 * Gets the level.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:44:53 AM
	 *
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Sets the level.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:44:53 AM
	 *
	 * @param level the level
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * Gets the salary.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:44:53 AM
	 *
	 * @return the salary
	 */
	public int getSalary() {
		return Salary;
	}

	/**
	 * Sets the salary.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:44:53 AM
	 *
	 * @param salary the salary
	 */
	public void setSalary(int salary) {
		Salary = salary;
	}
	

	/**
	 * Instantiates a new offical emp.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:44:53 AM
	 */
	public OfficalEmp() {
	}

	
	
	/**
	 * Instantiates a new offical emp.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:44:53 AM
	 *
	 * @param empNo the emp no
	 * @param name the name
	 * @param date the date
	 * @param dateRegist the date regist
	 * @param phone the phone
	 * @param address the address
	 * @param contractType the contract type
	 * @param contractTerm the contract term
	 * @param salaryGross the salary gross
	 * @param pit the pit
	 * @param level the level
	 * @param salary the salary
	 */
	public OfficalEmp(String empNo, String name, String date, String dateRegist, String phone, String address,
			int contractType, int contractTerm, int salaryGross, int pit, int level, int salary) {
		super(empNo, name, date, dateRegist, phone, address, contractType, contractTerm, salaryGross, pit);
		this.level = level;
		this.Salary = salary;
	}	

	/**
	 * To string.
	 *
	 * @author ThienBD
	 * @return the string
	 */
	@Override
	public String toString() {
		return "OfficalEmp [ " + super.toString() + " level = " + level + ", Salary = " + Salary + " ]";
	}

	/**
	 * Clac gross.
	 */
	@Override
	public void clacGross() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Calc pit.
	 */
	@Override
	public void calcPit() {
		// TODO Auto-generated method stub
		
	}

}
