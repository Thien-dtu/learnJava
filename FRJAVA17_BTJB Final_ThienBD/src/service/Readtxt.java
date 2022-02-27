package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.DataFormatException;

import exception.DateInvalidException;
import model.Employee;
import model.OfficalEmp;
import model.TrialEmp;
import repository.Employee.EmployeeRepositoryImpl;

/**
 * The Class Readtxt.
 */
public class Readtxt {
	
	/**
	 * Read and writedata.
	 * @author ThienBD
	 * @param filePath the file path
	 */
	public static void readAndWritedata(String filePath) {
		String EmpNo;
		String Name;
		String Date;
		String DateRegist;
		String Phone;
		String Address;
		int ContractType;
		int ContractTerm;
		int SalaryGross = 0;
		int Pit = 0;
		int level;
		int Salary;
		int SalaryPerDay;
		int ManDay;
		BufferedReader br = null;
		EmployeeRepositoryImpl repositoryImpl = new EmployeeRepositoryImpl();
		Employee employee;
		Path path = Paths.get(filePath);
		if (!Files.exists(path)) {
			try {
				Writer writer = new FileWriter(filePath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		try {
			System.out.println("Reading");
			String line;
			br = new BufferedReader(new FileReader(filePath));
			while ((line = br.readLine()) != null) {
				String[] splitData = line.split(",");
				try {
					employee = null;
					EmpNo = splitData[0];
					Name = splitData[1];
					Date = FormatDate.formatDate(splitData[2]);
					Validate.inputDate(Date);
					DateRegist = FormatDate.formatDate(splitData[3]);
					Validate.inputDateRegist(DateRegist);
					Phone = splitData[4];
					Address = splitData[5];
					ContractType = Integer.parseInt(splitData[6]);
					ContractTerm = Integer.parseInt(splitData[7]);
					if (ContractType == 1) {
						SalaryPerDay = Integer.parseInt(splitData[8]);
						ManDay = Integer.parseInt(splitData[9]);
						employee = new TrialEmp( EmpNo,  Name,  Date,  DateRegist,  Phone,  Address,
								 ContractType,  ContractTerm,  SalaryGross,  Pit,  SalaryPerDay,  ManDay);
					} else {
						level = Integer.parseInt(splitData[8]);
						Salary = Integer.parseInt(splitData[9]);
						employee = new OfficalEmp(EmpNo,  Name,  Date,  DateRegist,  Phone,  Address,
								 ContractType,  ContractTerm,  SalaryGross,  Pit, level, Salary);
					}
					repositoryImpl.insert(employee);
				} catch (DateInvalidException e) {
					System.out.println(e.getMessage());
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}