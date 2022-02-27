/*Account ThienBD
 *
 *@author DucThien
 *@date Jan 11, 2022
 *@version 1.0
 */

package repository.candidate;

import java.util.List;

import model.Candidate;

public interface CandidateRepository {
	List<Candidate> findAll();
	boolean themMoi(Candidate candidate);
	Candidate findByID(String id);
	boolean updateWithID(Candidate candidate);
	boolean deleteWithID(Candidate candidate);
}
