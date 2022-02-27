/*Account ThienBD
 *
 *@author DucThien
 *@date Jan 7, 2022
 *@version 1.0
 */

package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exception.MailException;

public class Fresher extends Candidate {

	private String Graduation_date;
	private String Education;
	private String Graduation_rank;

	public Fresher() {

	}

	public Fresher(String candidateID, String fullName, String birthday, String phone, String email, int candidate_type,
			String certificatedID, String graduation_date, String education, String graduation_rank) {
		super(candidateID, fullName, birthday, phone, email, candidate_type, certificatedID);
		Graduation_date = graduation_date;
		Education = education;
		Graduation_rank = graduation_rank;
	}

	public String getGraduation_date() {
		return Graduation_date;
	}

	public void setGraduation_date(String graduation_date) {
		Graduation_date = graduation_date;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}

	public String getGraduation_rank() {
		return Graduation_rank;
	}

	public void setGraduation_rank(String graduation_rank) {
		Graduation_rank = graduation_rank;
	}

	@Override
	public String toString() {
		return super.toString() + "Fresher [Graduation_date = " + Graduation_date + ", Education = " + Education
				+ ", Graduation_rank = " + Graduation_rank + " ]";
	}

	@Override
	public void input(Candidate candidate) {
		try {
			Scanner sc = new Scanner(System.in);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			LocalDateTime now = LocalDateTime.now();
			String test = dtf.format(now);
			String nam = test.substring(0, 4);
			int year = Integer.parseInt(nam);
			super.inputInfo(candidate);

			System.out.println("Moi ban nhap vao ngay tot nghiep o dinh dang yyyy-mm-dd: ");
			String dateTN = sc.nextLine();
			do {
				((Fresher) candidate).setGraduation_date(sc.nextLine());
				System.out.println("Ban da nhap ngay tot nghiep > nam hien tai");
			} while (Integer.parseInt(dateTN) > year);
			System.out.println("Moi ban nhap vao truong tot nghiep: ");
			((Fresher) candidate).setEducation(sc.nextLine());
			System.out.println("Moi ban nhap vao xep loai tot nghiep: ");
			((Fresher) candidate).setGraduation_rank(sc.nextLine());
			((Fresher) candidate).setCandidate_type(2);
			sc.close();
			Candidate_count++;
			System.out.println("Ban da nhap vao " + Candidate.Candidate_count + " Candidate");
		} catch (MailException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Candidate candidate) {
		try {
			super.updateInfo(candidate);
			Scanner sc = new Scanner(System.in);
			System.out.println("Moi ban chinh sua thong tin chi tiet ve doi tuong Fresher: ");
			System.out.println("Nhan 1 de chinh sua ngay tot nghiep cua ung vien Fresher: ");
			System.out.println("Nhan 2 de chinh sua truong tot nghiep cua ung vien Fresher: ");
			System.out.println("Nhan 3 de chinh sua xep loai tot nghiep cua ung vien Fresher: ");
			System.out.println("Nhan 0 de thoat trinh chinh sua danh cho ung vien Fresher. ");
			int key = 1;
			while (key != 0) {
				try {
					System.out.println("Nhap chuc nang ban muon su dung :");
					key = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Nhap sai chuc nang, nhap lai: ");
				}

				switch (key) {
				case 1:
					System.out.println("Moi ban nhap vao ngay tot nghiep: ");
					((Fresher) candidate).setGraduation_date(sc.nextLine());
					break;
				case 2:
					System.out.println("Moi ban nhap truong tot nghiep: ");
					((Fresher) candidate).setEducation(sc.nextLine());
					break;
				case 3:
					System.out.println("Moi ban nhap vao xep loai tot nghiep: ");
					((Fresher) candidate).setGraduation_rank(sc.nextLine());
					break;
				default:
					System.out.println("Ban da thoat khoi trinh chinh sua ung vien Fresher !");
				}
			}

			sc.close();
		} catch (Exception e) {

		}
	}

	@Override
	public void delete(Candidate candidate) {

	}

}
