package com.vinicio.vagas.Modules.Candidate.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vinicio.vagas.Modules.Candidate.CandidateEntity;

import jakarta.validation.Valid;

@RequestMapping("/candidate")
@RestController
public class CandidateController {
    @PostMapping("/create")
   String create(@Valid @RequestBody CandidateEntity candidate){
    return "Candidato: " +candidate.getName() + " -- " +candidate.getEmail();
   }
}
