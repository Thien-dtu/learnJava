package model;

/**
 * The Class Disaster.
 */
public class Disaster extends Beneficiary {

	/** The Disaster type. */
	private String DisasterType;
	
	/** The Impact date. */
	private String ImpactDate;
	
	/** The Total damage. */
	private String TotalDamage;

	/**
	 * Gets the disaster type.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:40:48 PM
	 *
	 * @return the disaster type
	 */
	public String getDisasterType() {
		return DisasterType;
	}

	/**
	 * Sets the disaster type.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:40:48 PM
	 *
	 * @param disasterType the disaster type
	 */
	public void setDisasterType(String disasterType) {
		DisasterType = disasterType;
	}

	/**
	 * Gets the impact date.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:40:48 PM
	 *
	 * @return the impact date
	 */
	public String getImpactDate() {
		return ImpactDate;
	}

	/**
	 * Sets the impact date.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:40:48 PM
	 *
	 * @param impactDate the impact date
	 */
	public void setImpactDate(String impactDate) {
		ImpactDate = impactDate;
	}

	/**
	 * Gets the total damage.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:40:48 PM
	 *
	 * @return the total damage
	 */
	public String getTotalDamage() {
		return TotalDamage;
	}

	/**
	 * Sets the total damage.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:40:48 PM
	 *
	 * @param totalDamage the total damage
	 */
	public void setTotalDamage(String totalDamage) {
		TotalDamage = totalDamage;
	}

	/**
	 * Instantiates a new disaster.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:40:48 PM
	 */
	public Disaster() {

	}

	/**
	 * Instantiates a new disaster.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:40:48 PM
	 *
	 * @param beneficiaryID the beneficiary ID
	 * @param name the name
	 * @param birthDate the birth date
	 * @param address the address
	 * @param phone the phone
	 * @param benefitDate the benefit date
	 * @param benefit the benefit
	 * @param disasterType the disaster type
	 * @param impactDate the impact date
	 * @param totalDamage the total damage
	 */
	public Disaster(String beneficiaryID, String name, String birthDate, String address, String phone,
			String benefitDate, String benefit, int type, String disasterType, String impactDate, String totalDamage) {
		super(beneficiaryID, name, birthDate, address, phone, benefitDate, benefit, type);
		DisasterType = disasterType;
		ImpactDate = impactDate;
		TotalDamage = totalDamage;
	}

	/**
	 * To string.
	 *
	 * Instantiates a new disaster.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:40:48 PM
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Disaster [ " + super.toString() + "DisasterType = " + DisasterType + ", ImpactDate = " + ImpactDate
				+ ", TotalDamage = " + TotalDamage + " ]";
	}

}
