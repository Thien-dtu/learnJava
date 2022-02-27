package model;

/**
 * The Class Indigent.
 */
public class Indigent extends Beneficiary {

	/** The Income. */
	private String Income;
	
	/** The Dependant. */
	private String Dependant;

	/**
	 * Gets the income.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:42:01 PM
	 *
	 * @return the income
	 */
	public String getIncome() {
		return Income;
	}

	/**
	 * Sets the income.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:42:01 PM
	 *
	 * @param income the income
	 */
	public void setIncome(String income) {
		Income = income;
	}

	/**
	 * Gets the dependant.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:42:01 PM
	 *
	 * @return the dependant
	 */
	public String getDependant() {
		return Dependant;
	}

	/**
	 * Sets the dependant.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:42:01 PM
	 *
	 * @param dependant the dependant
	 */
	public void setDependant(String dependant) {
		Dependant = dependant;
	}

	/**
	 * Instantiates a new indigent.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:42:01 PM
	 */
	public Indigent() {

	}

	/**
	 * Instantiates a new indigent.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:42:01 PM
	 *
	 * @param beneficiaryID the beneficiary ID
	 * @param name the name
	 * @param birthDate the birth date
	 * @param address the address
	 * @param phone the phone
	 * @param benefitDate the benefit date
	 * @param benefit the benefit
	 * @param income the income
	 * @param dependant the dependant
	 */
	public Indigent(String beneficiaryID, String name, String birthDate, String address, String phone,
			String benefitDate, String benefit, int type, String income, String dependant) {
		super(beneficiaryID, name, birthDate, address, phone, benefitDate, benefit, type);
		Income = income;
		Dependant = dependant;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Indigent [ " + super.toString() + "Income = " + Income + ", Dependant = " + Dependant + " ]";
	}

}
