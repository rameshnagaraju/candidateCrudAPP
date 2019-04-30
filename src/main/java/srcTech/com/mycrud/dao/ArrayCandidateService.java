package srcTech.com.mycrud.dao;

import org.springframework.stereotype.Repository;
import srcTech.com.mycrud.model.Candidate;

import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

@Repository("ArrayDao")
public class ArrayCandidateService implements CandidateDao {

    private static List<Candidate> DB = new ArrayList<>();
    @Override
    public int insertCandidate(UUID uuid, Candidate candidate) {
        DB.add( new Candidate(uuid,candidate.getName()));
        return 1;
    }

    public List<Candidate> getAllCandidates(){
        return DB;
    }

}
