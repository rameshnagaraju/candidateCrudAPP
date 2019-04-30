package srcTech.com.mycrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import srcTech.com.mycrud.dao.CandidateDao;
import srcTech.com.mycrud.model.Candidate;

import java.util.List;

@Service
public class CandidateService {

    private final CandidateDao candidateDao;

    @Autowired
    public CandidateService(@Qualifier("ArrayDao") CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    public int addCandidate(Candidate candidate){
       return candidateDao.insertCandidate(candidate);
    }

    public List<Candidate> getAllCandidates(){
        return candidateDao.getAllCandidates();
    }
}
