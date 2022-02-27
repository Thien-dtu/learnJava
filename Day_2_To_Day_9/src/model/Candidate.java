/*Account ThienBD
 *
 *@author DucThien
 *@date Jan 7, 2022
 *@version 1.0
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.BirthdayException;
import exception.MailException;
import service.ValidateData;

public abstract class Candidate {
	private Scanner sc = new Scanner(System.in);
	private static List<Candidate> candidateList = new ArrayList<>();
	protected static int Candidate_count;

	private String CandidateID;
	private String FullName;
	private String Birthday;
	private String Phone;
	private String Email;
	private int Candidate_type;
	private String CertificatedID;

	public Candidate() {
	}

	public Candidate(String candidateID, String fullName, String birthday, String phone, String email,
			int candidate_type, String certificatedID) {
		this.CandidateID = candidateID;
		this.FullName = fullName;
		this.Birthday = birthday;
		this.Phone = phone;
		this.Email = email;
		this.Candidate_type = candidate_type;
		this.CertificatedID = certificatedID;
	}

	public String getCandidateID() {
		return CandidateID;
	}

	public void setCandidateID(String i) {
		CandidateID = i;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getCandidate_type() {
		return Candidate_type;
	}

	public void setCandidate_type(int candidate_type) {
		Candidate_type = candidate_type;
	}

	public int getCandidate_count() {
		return Candidate_count;
	}

	public void setCandidate_count(int candidate_count) {
		Candidate_count = candidate_count;
	}

	public String getCertificatedID() {
		return CertificatedID;
	}

	public void setCertificatedID(String certificatedID) {
		CertificatedID = certificatedID;
	}

	@Override
	public String toString() {
		return "Candidate [CandidateID = " + CandidateID + ", FullName = " + FullName + ", Birthday = " + Birthday
				+ ", Phone = " + Phone + ", Email = " + Email + ", Candidate_type = " + Candidate_type
				+ ", CertificatedID = " + CertificatedID + "]";
	}

	public abstract void input(Candidate candidate);

	public Candidate isCandidate(String candidateCode) {
		for (Candidate candidate : candidateList) {
			if (candidate.getCandidateID().equals(candidateCode)) {
				return candidate;
			}
		}
		return null;
	}

	/**
	 * Tao ra ham nhap cho cac candidate
	 * 
	 * @author ThienBD
	 * @version 1.0
	 */
	public void inputInfo(Candidate candidate) throws MailException {
		
		ValidateData validateData = new ValidateData();
		System.out.println("Nhap thong tin cua ung vien");

		System.out.print("Nhap ID ung vien: ");
		candidate.setCandidateID(sc.nextLine());

		System.out.print("Nhap ho va ten cua ung vien: ");
		candidate.setFullName(sc.nextLine());

		String birthday = "";

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		String test = dtf.format(now);
		String nam = test.substring(0, 4);
		int year = Integer.parseInt(nam);

		do {
			try {
				System.out.print("Nhap ngay sinh cua ung vien o dinh dang yyyy-mm-dd: ");
				birthday = sc.nextLine();
				if (birthday.equals("")) {
					throw new BirthdayException(
							"Khong duoc de trong ngay sinh, moi ban nhap vao ngay sinh o dinh dang yyyy/mm/dd");
				}
				if ((Integer.parseInt(birthday.substring(0, 4)) < 1900)) {
					throw new BirthdayException("Ban khong duoc nhap nam duoi 1900");
				}
				if ((Integer.parseInt(birthday.substring(0, 4)) >= year)) {
					throw new BirthdayException("Ban da nam sinh lon hon hoac bang nam hien tai");
				}
				if (!validateData.validateDate(birthday)) {
					throw new BirthdayException("Ban da nhap sai dinh dang cua ngay sinh");
				}
			} catch (BirthdayException e) {
				System.err.println(e.getMessage());
			} catch (Exception e) {
				System.err.println("The system has encountered an unexpected problem, sincerely sorry !!!");
			}
		} while (!validateData.validateDate(birthday));

		candidate.setBirthday(birthday);

		System.out.print("Nhap so dien thoai cua ung vien: ");
		candidate.setPhone(sc.nextLine());

		String email = "";
		do {
			try {
				System.out.print("Nhap email cua ung vien: ");
				email = sc.nextLine();
				if (email.isEmpty()) {
					throw new MailException("Email khong duoc de trong. ");
				} else if (!validateData.validateEmail(email)) {
					throw new MailException("Emai khong dung dinh dang. ");
				}
			} catch (MailException e) {
				System.err.println(e.getMessage());
			} catch (Exception e) {
				System.err.println("The system has encountered an unexpected problem, sincerely sorry !!! ");
			}
		} while (!validateData.validateEmail(email));

		candidate.setEmail(email);

		System.out.print("Nhap ID chung chi cua ban: ");
		candidate.setCertificatedID(sc.nextLine());

		candidateList.add(candidate);
		System.out.println(candidateList);
	}

	/**
	 * Tao ra ham update cho cac candidate
	 * 
	 * @author ThienBD
	 * @version 1.0
	 */
	public abstract void update(Candidate candidate);

	public void updateInfo(Candidate candidate) {
		ValidateData validateData = new ValidateData();
		if (candidate != null) {
			int choice = 1;
			while (choice != 0) {
				try {
					System.out.println("Chon chuc nang ban can dung: ");
					System.out.println("1. Ho va ten:  ");
					System.out.println("2. Ngay sinh: ");
					System.out.println("3. Dien thoai: ");
					System.out.println("4. Email: ");
					System.out.println("5. Loai ung vien: ");
					System.out.println("6. Ma chung chi: ");
					System.out.println("7. Chinh sua chi tiet ung vien: ");
					System.out.println("0. De thoat chinh sua chung !");
					choice = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Nhap sai chuc nang, nhap lai: ");
				}
				switch (choice) {
				case 1:
					System.out.println("Moi nhap ho va ten : ");
					String fullName = sc.nextLine();
					candidate.setFullName(fullName);
					System.out.println(toString());
					break;
				case 2:
					System.out.println("Moi nhap ngay sinh : ");
					String birthday = sc.nextLine();
					while (!validateData.validateDate(birthday)) {
						System.out.println("Nhap ngay sinh : ");
						birthday = sc.nextLine();
					}
					candidate.setBirthday(birthday);
					toString();
					break;
				case 3:
					System.out.println("Moi nhap vao so dien thoai : ");
					String phone = sc.nextLine();
					candidate.setPhone(phone);
					toString();
					break;
				case 4:
					System.out.println("Moi nhap email : ");
					String email = sc.nextLine();
					candidate.setEmail(email);
					toString();
					break;
				case 5:
					System.out.println("Moi nhap loai ung vien : ");
					int candidateType = Integer.parseInt(sc.nextLine());
					candidate.setCandidate_type(candidateType);
					toString();
					break;
				case 6:
					System.out.println("Moi nhap ID chung chi cua ung vien : ");
					String certificateID = sc.nextLine();
					candidate.setCertificatedID(certificateID);
					toString();
					break;
				case 7:
					System.out.println("Ban da chuyen sang trinh chinh sua chi tiet ung vien!");
					return;
				default:
					System.out.println("Ban da thoat!");
				}
			}
		}
	}

	public abstract void delete(Candidate candidate);

	public void deleteInfo(Candidate candidate) {

	}
}
