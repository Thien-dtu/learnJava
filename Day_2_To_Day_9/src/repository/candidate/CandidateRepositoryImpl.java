/*Account ThienBD
 *
 *@author DucThien
 *@date Jan 11, 2022
 *@version 1.0
 */

package repository.candidate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;
import repository.DBConnection;

public class CandidateRepositoryImpl implements CandidateRepository {

	List<Candidate> candidatesList = new ArrayList<>();
	private DBConnection connectionDB = new DBConnection();

	private final String SHOW_ALL = "SELECT * FROM candidate";
	private final String FIND_BY_ID = "SELECT * FROM candidate where candidateID like ?";

	/**
	 * Hien thi tat ca danh sach candidate da luu vao trong Database
	 * 
	 * @author ThienBD
	 */
	@Override
	public List<Candidate> findAll() {
		Connection connection = null;
		Candidate candidate = null;
		List<Candidate> candidatelList = new ArrayList<Candidate>();
		connection = connectionDB.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement(SHOW_ALL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String candidateID = rs.getString("candidateID");
				String fullName = rs.getString("fullName");
				String birthday = rs.getString("birthday");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				String certificatedID = rs.getString("certificateID");
				int candidate_type = rs.getInt("candidate_type");
				if (candidate_type == 1) {
					int expInYear = rs.getInt("expInYear");
					String proSkill = rs.getString("proSkill");
					candidate = new Experience(candidateID, fullName, birthday, phone, email, candidate_type,
							certificatedID, expInYear, proSkill);
				} else if (candidate_type == 2) {
					String graduation_date = rs.getString("graduation_date");
					String graduation_rank = rs.getString("graduation_rank");
					String education = rs.getString("education");
					candidate = new Fresher(candidateID, fullName, birthday, phone, email, candidate_type,
							certificatedID, graduation_date, education, graduation_rank);
				} else if (candidate_type == 3) {
					String majors = rs.getString("majors");
					String semester = rs.getString("semester");
					String university_name = rs.getString("university_name");
					candidate = new Intern(candidateID, fullName, birthday, phone, email, candidate_type,
							certificatedID, majors, semester, university_name);
				}
				candidatelList.add(candidate);
			}
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return candidatelList;
	}

	/**
	 * Them moi mot candidate vao Database
	 * 
	 * @author ThienBD
	 */
	@Override
	public boolean themMoi(Candidate candidate) {
		Connection connection = null;
		connection = connectionDB.getConnection();
		boolean check = false;
		try {
			PreparedStatement stmt = connection.prepareStatement(SHOW_ALL, ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery();
			rs = stmt.executeQuery();
			rs.moveToInsertRow();
			rs.updateString("candidateID", candidate.getCandidateID());
			rs.updateString("fullName", candidate.getFullName());
			rs.updateString("birthday", candidate.getBirthday());
			rs.updateString("phone", candidate.getPhone());
			rs.updateString("email", candidate.getEmail());
			rs.updateInt("candidate_type", candidate.getCandidate_type());
			rs.updateString("certificateID", candidate.getCertificatedID());
			if (candidate instanceof Fresher) {
				rs.updateString("graduation_date", ((Fresher) candidate).getGraduation_date());
				rs.updateString("graduation_rank", ((Fresher) candidate).getGraduation_rank());
				rs.updateString("Education", ((Fresher) candidate).getEducation());
			}
			if (candidate instanceof Intern) {

				rs.updateString("majors", ((Intern) candidate).getMajors());
				rs.updateString("semester", ((Intern) candidate).getSemester());
				rs.updateString("university_name", ((Intern) candidate).getUniversity_name());
			}
			if (candidate instanceof Experience) {
				rs.updateInt("expInYear", ((Experience) candidate).getExpInYear());
				rs.updateString("proSkill", ((Experience) candidate).getProSkill());
			}
			rs.insertRow();
			check = true;
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			check = false;
		}
		return check;
	}

	/**
	 * Tim kiem mot candidate voi ID cua candidate
	 * 
	 * @author ThienBD
	 */
	@Override
	public Candidate findByID(String id) {
		Connection connection = null;
		Candidate candidate = null;
		connection = connectionDB.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement(FIND_BY_ID);
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String CandidateID = rs.getString("candidateID");
				String FullName = rs.getString("fullName");
				String Birthday = String.valueOf(rs.getDate("birthDay"));
				String Phone = rs.getString("phone");
				String Email = rs.getString("email");
				int Candidate_type = rs.getInt("candidate_type");
				String CertificatedID = rs.getString("certificateID");
				if (Candidate_type == 1) {
					int ExpInYear = rs.getInt("expInYear");
					String ProSkill = rs.getString("proSkill");
					candidate = new Experience(CandidateID, FullName, Birthday, Phone, Email, Candidate_type,
							CertificatedID, ExpInYear, ProSkill);
				}
				if (Candidate_type == 2) {
					String Graduation_date = rs.getString("graduation_date");
					String Graduation_rank = rs.getString("graduation_rank");
					String Education = rs.getString("Education");
					candidate = new Fresher(CandidateID, FullName, Birthday, Phone, Email, Candidate_type,
							CertificatedID, Graduation_date, Graduation_rank, Education);
				}
				if (Candidate_type == 3) {
					String Majors = rs.getString("majors");
					String Semester = rs.getString("semester");
					String University_name = rs.getString("university_name");
					candidate = new Intern(CandidateID, FullName, Birthday, Phone, Email, Candidate_type,
							CertificatedID, Majors, Semester, University_name);
				}
			}
			connection.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return candidate;
	}

	/**
	 * Cap nhat mot candidate voi ID cua candidate
	 * 
	 * @author ThienBD
	 */
	@Override
	public boolean updateWithID(Candidate candidate) {
		Connection connection = null;
		connection = connectionDB.getConnection();
		PreparedStatement stmt;
		boolean check = false;
		try {
			stmt = connection.prepareStatement(FIND_BY_ID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			stmt.setString(1, candidate.getCandidateID());
			ResultSet rs = stmt.executeQuery();
			rs.absolute(1);
			rs.updateString("candidateID", candidate.getCandidateID());
			rs.updateString("fullName", candidate.getFullName());
			rs.updateString("birthday", candidate.getBirthday());
			rs.updateString("phone", candidate.getPhone());
			rs.updateString("email", candidate.getEmail());
			rs.updateInt("candidate_type", candidate.getCandidate_type());
			rs.updateString("certificateID", candidate.getCertificatedID());
			if (candidate.getCandidate_type() == 2) {
				rs.updateString("graduation_date", ((Fresher) candidate).getGraduation_date());
				rs.updateString("graduation_rank", ((Fresher) candidate).getGraduation_rank());
				rs.updateString("Education", ((Fresher) candidate).getEducation());
			}
			if (candidate.getCandidate_type() == 3) {

				rs.updateString("majors", ((Intern) candidate).getMajors());
				rs.updateString("semester", ((Intern) candidate).getSemester());
				rs.updateString("university_name", ((Intern) candidate).getUniversity_name());
			}
			if (candidate.getCandidate_type() == 1) {
				rs.updateInt("expInYear", ((Experience) candidate).getExpInYear());
				rs.updateString("proSkill", ((Experience) candidate).getProSkill());
			}
			rs.updateRow();
			check = true;
			stmt.close();
			connection.close();
		} catch (Exception e) {
		}
		return check;
	}

	/**
	 * Xoa mot candidate voi ID cua candidate
	 * 
	 * @author ThienBD
	 */
	@Override
	public boolean deleteWithID(Candidate candidate) {
		Connection connection = null;
		connection = connectionDB.getConnection();
		PreparedStatement stmt;
		boolean check = false;
		try {
			stmt = connection.prepareStatement(FIND_BY_ID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			stmt.setString(1, candidate.getCandidateID());
			ResultSet rs = stmt.executeQuery();
			rs.absolute(1);
			rs.deleteRow();
			check = true;
			stmt.close();
			connection.close();
		} catch (Exception e) {
		}
		return check;
	}
}