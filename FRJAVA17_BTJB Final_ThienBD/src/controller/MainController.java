package controller;

import java.util.List;
import java.util.Scanner;

import model.Employee;
import repository.Employee.EmployeeRepositoryImpl;
import service.Readtxt;

/**
 * @author ThienBD
 * The Class MainController.
 */
public class MainController {
	
	/** The scanner. */
	static Scanner scanner = new Scanner(System.in);
	
	/** The repository impl. */
	static EmployeeRepositoryImpl repositoryImpl = new EmployeeRepositoryImpl();
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * Description : Create by ThienBD
	 * Creator's date of birth : 2000/03/02
	 * Date create : 2022/01/24 , 10:29:13 AM
	 */
	public static void main(String[] args) {
		int choice = 0;
		while (true) {
			System.out.println("Pls Choose :");
			System.out.println("1. Add File");
			System.out.println("2. Show All :");
			try {
				System.out.print("Enter your choice: ");
				choice = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Enter the wrong function, re-enter: ");
			}
			switch (choice) {
			case 1:
				Readtxt.readAndWritedata("D:\\app_PC\\eclipse-workspace\\FRJAVA17_BTJB Final_ThienBD\\src\\data_sample_De1.txt");
				List<Employee> employees = repositoryImpl.findAll();
				System.out.println("Input success");
				break;
			case 2:
				List<Employee> employees2 = repositoryImpl.findAll();
				for(Employee e : employees2 ) {
					System.out.println(e.toString());
				}
			default:
				break;
			}
		}
	}
}
