

// TODO: Auto-generated Javadoc
/**
 * The Class NguoiNhanHoTro.
 */
public abstract class Beneficiary {

	/** The Beneficiary ID. */
	private String BeneficiaryID;
	
	/** The Name. */
	private String Name;
	
	/** The Birth date. */
	private String BirthDate;
	
	/** The Address. */
	private String Address;
	
	/** The Phone. */
	private String Phone;
	
	/** The Benefit date. */
	private String BenefitDate;
	
	/** The Benefit. */
	private String Benefit;
	
	/** The Type. */
	private int Type;

	/**
	 * Gets the beneficiary ID.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:34:25 PM
	 *
	 * @return the beneficiary ID
	 */
	public String getBeneficiaryID() {
		return BeneficiaryID;
	}
	
	/**
	 * Sets the beneficiary ID.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:25 PM
	 *
	 * @param beneficiaryID the beneficiary ID
	 */
	public void setBeneficiaryID(String beneficiaryID) {
		BeneficiaryID = beneficiaryID;
	}

	/**
	 * Gets the name.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:34:25 PM
	 *
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * Sets the name.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:25 PM
	 *
	 * @param name the name
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * Gets the birth date.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:34:25 PM
	 *
	 * @return the birth date
	 */
	public String getBirthDate() {
		return BirthDate;
	}

	/**
	 * Sets the birth date.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:25 PM
	 *
	 * @param birthDate the birth date
	 */
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	/**
	 * Gets the address.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:34:25 PM
	 *
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * Sets the address.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:25 PM
	 *
	 * @param address the address
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/**
	 * Gets the phone.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:34:25 PM
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return Phone;
	}

	/**
	 * Sets the phone.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:25 PM
	 *
	 * @param phone the phone
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}

	/**
	 * Gets the benefit date.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:34:25 PM
	 *
	 * @return the benefit date
	 */
	public String getBenefitDate() {
		return BenefitDate;
	}

	/**
	 * Sets the benefit date.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:25 PM
	 *
	 * @param benefitDate the benefit date
	 */
	public void setBenefitDate(String benefitDate) {
		BenefitDate = benefitDate;
	}

	/**
	 * Gets the benefit.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  10:34:25 PM
	 *
	 * @return the benefit
	 */
	public String getBenefit() {
		return Benefit;
	}

	/**
	 * Sets the benefit.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:25 PM
	 *
	 * @param benefit the benefit
	 */
	public void setBenefit(String benefit) {
		Benefit = benefit;
	}

	/**
	 * Gets the type.
	 * 
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 ,  6:28:39 PM
	 *
	 * @return the type
	 */
	public int getType() {
		return Type;
	}

	public void setType(int type) {
		Type = type;
	}

	/**
	 * Instantiates a new nguoi nhan ho tro.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:25 PM
	 */
	public Beneficiary() {

	}

	/**
	 * Instantiates a new nguoi nhan ho tro.
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:34:25 PM
	 *
	 * @param beneficiaryID the beneficiary ID
	 * @param name the name
	 * @param birthDate the birth date
	 * @param address the address
	 * @param phone the phone
	 * @param benefitDate the benefit date
	 * @param benefit the benefit
	 */
	public Beneficiary(String beneficiaryID, String name, String birthDate, String address, String phone,
			String benefitDate, String benefit, int type) {
		this.BeneficiaryID = beneficiaryID;
		this.Name = name;
		this.BirthDate = birthDate;
		this.Address = address;
		this.Phone = phone;
		this.BenefitDate = benefitDate;
		this.Benefit = benefit;
		this.Type = type;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Beneficiary [BeneficiaryID=" + BeneficiaryID + ", Name=" + Name + ", BirthDate=" + BirthDate
				+ ", Address=" + Address + ", Phone=" + Phone + ", BenefitDate=" + BenefitDate + ", Benefit=" + Benefit
				+ ", Type=" + Type + "]";
	}


}
