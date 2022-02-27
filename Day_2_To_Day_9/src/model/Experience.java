/*Account ThienBD
 *
 *@author DucThien
 *@date Jan 7, 2022
 *@version 1.0
 */

package model;

import java.util.Scanner;
import exception.MailException;

public class Experience extends Candidate {

	private int ExpInYear;
	private String ProSkill;

	public Experience() {

	}

	public Experience(String candidateID, String fullName, String birthday, String phone, String email,
			int candidate_type, String certificatedID, int expInYear, String proSkill) {
		super(candidateID, fullName, birthday, phone, email, candidate_type, certificatedID);
		this.ExpInYear = expInYear;
		this.ProSkill = proSkill;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	public String getProSkill() {
		return ProSkill;
	}

	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Experience [ExpInYear = " + ExpInYear + ", ProSkill = " + ProSkill + " ]";
	}

	/**
	 * Ham nhap cac gia tri chi tiet ve Experience
	 * 
	 * @author ThienBD
	 */
	@Override
	public void input(Candidate candidate) {
		try {
			Scanner sc = new Scanner(System.in);
			super.inputInfo(candidate);

			System.out.println("Moi ban nhap vao so nam kinh nghiem: ");
			((Experience) candidate).setExpInYear(Integer.parseInt(sc.nextLine()));
			System.out.println("Moi ban nhap vao ky nang cua minh: ");
			((Experience) candidate).setProSkill(sc.nextLine());
			((Experience) candidate).setCandidate_type(1);
			sc.close();
			Candidate_count ++;
			System.out.println("Ban da nhap vao "+Candidate.Candidate_count+ " Candidate");
		} catch (MailException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Ham cap nhat cac gia tri chi tiet ve Experience
	 * 
	 * @author ThienBD
	 */
	@Override
	public void update(Candidate candidate) {
		try {
			super.updateInfo(candidate);
			Scanner sc = new Scanner(System.in);
			System.out.println("Moi ban chinh sua thong tin chi tiet ve doi tuong Experience: ");
			System.out.println("Nhan 1 de chinh sua so nam kinh nghiem cua ung vien Experience: ");
			System.out.println("Nhan 2 de chinh sua ky nang cua ung vien Experience: ");
			System.out.println("Nhan 0 de thoat trinh chinh sua danh cho ung vien Experience. ");
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
					System.out.println("Moi ban nhap vao so nam kinh nghiem: ");
					((Experience) candidate).setExpInYear(Integer.parseInt(sc.nextLine()));
					break;
				case 2:
					System.out.println("Moi ban nhap vao ky nang: ");
					((Experience) candidate).setProSkill(sc.nextLine());
					break;
				default:
					System.out.println("Ban da thoat khoi trinh chinh sua ung vien Experience!");
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
