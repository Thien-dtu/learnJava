package repository.Beneficiary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import repository.DBConnection;

public class BeneficiaryRepositoryImpl implements BeneficiaryRepository {
	
	private DBConnection connectionDB = new DBConnection();

	private final String SHOW_ALL = "SELECT * FROM Beneficiary";

	@Override
	public boolean themMoiTuCSV() {
		String path = "D:\\app_PC\\eclipse-workspace\\Giai_De\\src\\templateData1.csv";
		int batchSize = 20;
		Connection connection = null;
		connection = connectionDB.getConnection();
		boolean check = false;
		try {
			PreparedStatement stmt = connection.prepareStatement(SHOW_ALL, ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery();
			rs = stmt.executeQuery();
			rs.moveToInsertRow();
			BufferedReader br = new BufferedReader(new FileReader(path));
            String lineText = null;
            br.readLine();
            
            while ((lineText = br.readLine()) != null) {
                String[] data = lineText.split(",");
                String Type = data[0];
                String BeneficiaryID = data[1];
                String Full_Name = data[2];
                String Birth_Date = data[3];
                String Address = data[4];
                String Phone = data[5];
                String Illness = data[6];
                String Sick_Date = data[7];
                String Disaster_Type = data[8];
                String Impact_Date = data[9];
                String TotalDamage = data[10];
                String Income = data[11];
                String Dependant = data[12];
                String Benefit_Date = data[13];
                String Benefit = data[14];
 
                rs.updateString("Type", String.valueOf(Type));
                rs.updateString("BeneficiaryID", BeneficiaryID);
                rs.updateString("Full_Name", Full_Name);
                rs.updateString("Birth_Date", Birth_Date);
                rs.updateString("Address", Address);
                rs.updateString("Phone", Phone);
                rs.updateString("Illness", Illness);
                rs.updateString("Sick_Date", Sick_Date);
                rs.updateString("Disaster_Type", Disaster_Type);
                rs.updateString("Impact_Date", Impact_Date);
                rs.updateString("TotalDamage", TotalDamage);
                rs.updateString("Income", Income);
                rs.updateString("Dependant", String.valueOf(Dependant));
                rs.updateString("Benefit_Date", Benefit_Date);
                rs.updateString("Benefit", Benefit);
 
                rs.insertRow();
                }
            check = true;
			stmt.close();
			connection.close();
			
            } catch (Exception e) {
            	System.err.println(e.getMessage());
    			check = false;
            }
		return check;
	}

}
