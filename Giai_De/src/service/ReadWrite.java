package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadWrite {

	private String path;

	private String line = "";

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void docFile(String path, String line, File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				String fields[] = line.split(",");
				System.out.println("Type: " + fields[0] + " BeneficiaryID: " + fields[1] + " Name: " + fields[2]
						+ " BirthDate: " + fields[3] + " Address: " + fields[4] + " Illness: " + fields[5]
						+ " SickDate: " + fields[6] + " DisasterType: " + fields[7] + " ImpactDate: " + fields[8]
						+ " TotalDamage" + fields[9] + " Income: " + fields[10] + " Dependant: " + fields[11]
						+ " BenefitDate: " + fields[12] + " Benefit: " + fields[13]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
