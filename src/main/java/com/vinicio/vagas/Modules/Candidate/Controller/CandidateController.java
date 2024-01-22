package com.vinicio.vagas.Modules.Candidate.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vinicio.vagas.Modules.Candidate.CandidateEntity;

@RequestMapping("/candidate")
@RestController
public class CandidateController {
    @PostMapping("/create")
   String create(@RequestBody CandidateEntity candidate){
    return "Candidato: " +candidate.getName() + " -- " +candidate.getEmail();
   }
}
