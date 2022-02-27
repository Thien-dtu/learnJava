import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSample {
//	public static void main(String[] args) {
//
//		String path = "./src/templateData1.csv";
//		File file = new File(path);
//		String line = "";
//		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			while ((line = br.readLine()) != null && !line.isEmpty()) {
//				String fields[] = line.split(",");
//				System.out.println("Type: " + fields[0] + " BeneficiaryID: " + fields[1] + " Name: " + fields[2]
//						+ " BirthDate: " + fields[3] + " Address: " + fields[4] + " Illness: " + fields[5]
//						+ " SickDate: " + fields[6] + " DisasterType: " + fields[7] + " ImpactDate: " + fields[8]
//						+ " TotalDamage" + fields[9] + " Income: " + fields[10] + " Dependant: " + fields[11]
//						+ " BenefitDate: " + fields[12] + " Benefit: " + fields[13]);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	public static void main(String[] args) {
//		String s1= new String("ABCD1234"), s2 = new String("1234EF");
//		String s3=s1.substring(4,8), s4 = s2.substring(0,4);
//		System.out.println((s3==s4)+"" + (s3 +s4).equals(s4 + s3));}
		String s1="A", s2 ="B", s3 = "C";
		s2.trim(); s3.concat("D");
		System.out.print(s1+s2 + s3);
	}
}
