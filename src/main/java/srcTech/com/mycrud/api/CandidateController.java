package srcTech.com.mycrud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import srcTech.com.mycrud.model.Candidate;
import srcTech.com.mycrud.service.CandidateService;

import java.util.List;

@RequestMapping("/api/v1/candidate")
@RestController
public class CandidateController {


    private final CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping
    public void addCandidate(@RequestBody Candidate candidate){
        this.candidateService.addCandidate(candidate);
    }

    @GetMapping
    public List<Candidate> getAllCandidates(){
        return this.candidateService.getAllCandidates();
    }
}
