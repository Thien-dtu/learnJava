

/**
 * The Class Disease.
 */
public class Disease extends Beneficiary {

	/** The Illness. */
	private String Illness;
	
	/** The Sick date. */
	private String SickDate;

	/**
	 * Tao Getter và Setter.
	 *
	 * @author ThienBD
	 * @version 1.0
	 * @return the illness
	 */
	public String getIllness() {
		return Illness;
	}

	/**
	 * Sets the illness.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:52 PM
	 *
	 * @param illness the illness
	 */
	public void setIllness(String illness) {
		Illness = illness;
	}

	/**
	 * Gets the sick date.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:34:52 PM
	 *
	 * @return the sick date
	 */
	public String getSickDate() {
		return SickDate;
	}

	/**
	 * Sets the sick date.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:52 PM
	 *
	 * @param sickDate the sick date
	 */
	public void setSickDate(String sickDate) {
		SickDate = sickDate;
	}

	
	/**
	 * Instantiates a new disease.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:38:41 PM
	 */
	public Disease() {

	}
	
	

	/**
	 * Instantiates a new disease.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:36:09 PM
	 *
	 * @param beneficiaryID the beneficiary ID
	 * @param name the name
	 * @param birthDate the birth date
	 * @param address the address
	 * @param phone the phone
	 * @param benefitDate the benefit date
	 * @param benefit the benefit
	 * @param illness the illness
	 * @param sickDate the sick date
	 */
	public Disease(String beneficiaryID, String name, String birthDate, String address, String phone,
			String benefitDate, String benefit, int type, String illness, String sickDate) {
		super(beneficiaryID, name, birthDate, address, phone, benefitDate, benefit, type);
		Illness = illness;
		SickDate = sickDate;
	}

	/**
	 * To string.
	 * 
	 * Instantiates a new disease.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:36:09 PM
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Disease [ " + super.toString() + "Illness = " + Illness + ", SickDate = " + SickDate + "]";
	}

}
