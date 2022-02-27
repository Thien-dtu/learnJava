/*Account ThienBD
 *
 *@author DucThien
 *@date Jan 7, 2022
 *@version 1.0
 */

package model;

import java.util.Scanner;

import exception.MailException;

public class Intern extends Candidate {

	private String Majors;
	private String Semester;
	private String University_name;

	public Intern() {

	}

	public Intern(String candidateID, String fullName, String birthday, String phone, String email, int candidate_type,
			String certificatedID, String majors, String semester, String university_name) {
		super(candidateID, fullName, birthday, phone, email, candidate_type, certificatedID);
		Majors = majors;
		Semester = semester;
		University_name = university_name;
	}

	public String getMajors() {
		return Majors;
	}

	public void setMajors(String majors) {
		Majors = majors;
	}

	public String getSemester() {
		return Semester;
	}

	public void setSemester(String semester) {
		Semester = semester;
	}

	public String getUniversity_name() {
		return University_name;
	}

	public void setUniversity_name(String university_name) {
		University_name = university_name;
	}

	@Override
	public String toString() {
		return super.toString() + "Intern [Majors = " + Majors + ", Semester = " + Semester + ", University_name = "
				+ University_name + " ]";
	}

	@Override
	public void input(Candidate candidate) {
		try {
			Scanner sc = new Scanner(System.in);
			super.inputInfo(candidate);
			System.out.println("Hay nhap vao nganh hoc: ");
			((Intern) candidate).setMajors(sc.nextLine());
			System.out.println("Hay nhap vao ky hoc: ");
			((Intern) candidate).setSemester(sc.nextLine());
			System.out.println("Hay nhap vao ten truong: ");
			((Intern) candidate).setUniversity_name(sc.nextLine());
			((Intern) candidate).setCandidate_type(3);
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
			System.out.println("Moi ban chinh sua thong tin chi tiet ve doi tuong Intern: ");
			System.out.println("Nhan 1 de chinh sua nganh hoc ung vien Intern: ");
			System.out.println("Nhan 2 de chinh sua ky hoc cua ung vien Intern: ");
			System.out.println("Nhan 3 de chinh sua ten truong cua ung vien Intern: ");
			System.out.println("Nhan 0 de thoat trinh chinh sua danh cho ung vien Intern. ");
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
					System.out.println("Moi ban nhap vao nganh hoc: ");
					((Intern) candidate).setMajors(sc.nextLine());
					break;
				case 2:
					System.out.println("Moi ban nhap vao ky hoc: ");
					((Intern) candidate).setSemester(sc.nextLine());
					break;
				case 3:
					System.out.println("Moi ban nhap vap ten truong: ");
					((Intern) candidate).setUniversity_name(sc.nextLine());
					break;
				default:
					System.out.println("Ban da thoat khoi trinh chinh sua ung vien Intern !");
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
