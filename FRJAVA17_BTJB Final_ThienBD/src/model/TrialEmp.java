package model;

/**
 * The Class TrialEmp.
 */
public class TrialEmp extends Employee {

	/** The Salary per day. */
	private int SalaryPerDay;
	
	/** The Man day. */
	private int ManDay;

	/**
	 * Gets the salary per day.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:45:15 AM
	 *
	 * @return the salary per day
	 */
	public int getSalaryPerDay() {
		return SalaryPerDay;
	}

	/**
	 * Sets the salary per day.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:45:15 AM
	 *
	 * @param salaryPerDay the salary per day
	 */
	public void setSalaryPerDay(int salaryPerDay) {
		SalaryPerDay = salaryPerDay;
	}

	/**
	 * Gets the man day.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:45:15 AM
	 *
	 * @return the man day
	 */
	public int getManDay() {
		return ManDay;
	}

	/**
	 * Sets the man day.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:45:15 AM
	 *
	 * @param manDay the man day
	 */
	public void setManDay(int manDay) {
		ManDay = manDay;
	}

	/**
	 * Instantiates a new trial emp.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:45:15 AM
	 */
	public TrialEmp() {
	}

	/**
	 * Instantiates a new trial emp.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:45:15 AM
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
	 * @param salaryPerDay the salary per day
	 * @param manDay the man day
	 */
	public TrialEmp(String empNo, String name, String date, String dateRegist, String phone, String address,
			int contractType, int contractTerm, int salaryGross, int pit, int salaryPerDay, int manDay) {
		super(empNo, name, date, dateRegist, phone, address, contractType, contractTerm, salaryGross, pit);
		SalaryPerDay = salaryPerDay;
		ManDay = manDay;
	}

	/**
	 * To string.
	 *
	 * @author ThienBD
	 * @return the string
	 */
	@Override
	public String toString() {
		return "TrialEmp [ " + super.toString() + " SalaryPerDay = " + SalaryPerDay + ", ManDay = " + ManDay + " ]";
	}

	/**
	 * Clac gross.
	 */
	@Override
	public void clacGross() {
		int gross = 0;
		gross = SalaryPerDay * ManDay;
//		return goss;
	}

	/**
	 * Calc pit.
	 */
	@Override
	public void calcPit() {
		// TODO Auto-generated method stub

	}

}
