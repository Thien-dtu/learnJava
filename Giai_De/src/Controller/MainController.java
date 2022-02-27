package Controller;

import java.io.File;
import java.util.Scanner;

import repository.Beneficiary.BeneficiaryRepository;
import repository.Beneficiary.BeneficiaryRepositoryImpl;
import service.ReadWrite;

public class MainController {
	static BeneficiaryRepository repository = new BeneficiaryRepositoryImpl();
	public static void main(String[] args) {
//		ReadWrite rw = new ReadWrite();
//		Scanner sc = new Scanner(System.in);
//		String path1 = "./scr/templateData1.csv";
//		String line ="";
//		File file = new File(path1);
////		System.out.println("Moi ban nhap vao duong dan can lay thong tin : ");
////		path = sc.nextLine();
//		rw.setPath(path1);
//		rw.docFile(path1, line, file);
		 repository.themMoiTuCSV();
	}
}
