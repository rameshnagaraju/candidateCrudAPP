package srcTech.com.mycrud.dao;

import srcTech.com.mycrud.model.Candidate;

import java.util.UUID;
import java.util.List;

public interface CandidateDao {

    int insertCandidate(UUID id, Candidate candidate);

    default int insertCandidate(Candidate candidate){
        UUID id = UUID.randomUUID();
        return insertCandidate(id,candidate);

    }

    List<Candidate> getAllCandidates();
}
