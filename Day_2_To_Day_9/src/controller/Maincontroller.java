/*Account ThienBD
 *
 *@author DucThien
 *@date Jan 11, 2022
 *@version 1.0
 */

package controller;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;
import repository.candidate.CandidateRepository;
import repository.candidate.CandidateRepositoryImpl;

public class Maincontroller {
	static CandidateRepository repository = new CandidateRepositoryImpl();

	private static final Logger logger = LogManager.getLogger(Maincontroller.class);

	public static void main(String[] args) {

		logger.info("info");
		logger.warn("warn");
		logger.error("error");

		start();
	}

	public static void start() {
		Scanner sc = new Scanner(System.in);
		int key = 1;
		while ( key != 0) {
			System.out.println();
			System.out.println("Moi ban nhap chuc nang can dung: ");
			System.out.println("1. Nhap thong tin cua ung vien moi : ");
			System.out.println("2. Cap nhap thong tin cua ung vien da co trong he thong : ");
			System.out.println("3. Xoa thong tin cua ung vien da co trong he thong : ");
			System.out.println("4. Xem thong tin cua ung vien da co trong he thong : ");
			System.out.println("0. Thoat chuong trinh !");
			try {
				System.out.println("Nhap cac so tuong ung de su dung: ");
				key = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Moi ban nhap lai : ");
			} 
			switch (key) {
			case 1:
				nhap();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				for (Candidate candidate : repository.findAll()) {
					System.out.println(candidate.toString());
				}
				break;
            default: 
            	System.out.println("Ban chon chuc nang thoat!");
                System.exit(0);
			}
		}
		sc.close();
	}

	private static void delete() {
		Scanner sc = new Scanner(System.in);
		for (Candidate candidate : repository.findAll()) {
			System.out.println(candidate.toString());
		}

		String candidateID = null;
		Candidate candidate = null;
		do {
			try {
				System.out.print("Nhap ID cua ung vien ma ban muon xoa: ");
				candidateID = sc.nextLine();
				candidate = repository.findByID(candidateID);
				System.out.println(candidate.toString());
				start();
				if (!exitIDCandidate(candidateID)) {
					throw new Exception("Id khong co trong database");
				}
				repository.deleteWithID(candidate);
			} catch (Exception e) {
			}

		} while (!exitIDCandidate(candidateID));

//		System.out.println("Ban co muon xoa ung vien ma minh da chon khong ? Neu co nhan y, Khong nhan n");
//		String choice = sc.nextLine();
//		if(choice.equals("y")) {
////			repository.deleteWithID(candidate1);
//		} else {
//			System.out.println("Ban da chon khong xoa ung vien, thoat chuong trinh tai day! ");
//		}
		sc.close();

	}

	private static boolean exitIDCandidate(String candidateID) {
		for (Candidate candidate1 : repository.findAll()) {
			if (candidate1.getCandidateID().equals(candidateID)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Ham cap nhat cac gia tri ve Candidate
	 * 
	 * @author ThienBD
	 */
	private static void update() {
		Scanner sc = new Scanner(System.in);
		for (Candidate candidate : repository.findAll()) {
			System.out.println(candidate.toString());
		}
		System.out.print("Nhap ID cua ung vien ma ban muon update: ");
		String candidateID = sc.nextLine();
		Candidate candidate = repository.findByID(candidateID);
		System.out.println(candidate.toString());
		if (candidate != null) {
			if (candidate instanceof Intern) {
				candidate.update(candidate);
			}
			if (candidate instanceof Fresher) {
				candidate.update(candidate);
			}
			if (candidate instanceof Experience) {
				candidate.update(candidate);
			}
			System.out.println(candidate.toString());
			repository.updateWithID(candidate);
		}
		sc.close();
	}

	/**
	 * Ham nhap cac gia tri cua Candidate
	 * 
	 * @author ThienBD
	 */
	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap loai ung vien can thao tac: ");
		System.out.println("1. Experience: ");
		System.out.println("2. Fresher: ");
		System.out.println("3. Intern: ");
		System.out.println("Neu nhap ngoai 3 gia tri 1 , 2 , 3 thi ung dung se thoat. ");
		int key = Integer.parseInt(sc.nextLine());

		switch (key) {
		case 1:
			Candidate experience = new Experience();
			experience.input(experience);
			repository.themMoi(experience);
			break;
		case 2:
			Candidate fresher = new Fresher();
			fresher.input(fresher);
			repository.themMoi(fresher);
			break;
		case 3:
			Candidate inter = new Intern();
			inter.input(inter);
			repository.themMoi(inter);
			break;
		default:
			System.out.println("Ban da thoat !");
		}
		sc.close();
	}
}