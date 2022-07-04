package com.bridgelabz.Candidate.service;

import com.bridgelabz.Candidate.dto.CandidateDTO;
import com.bridgelabz.Candidate.dto.CombinedResponseDTO;
import com.bridgelabz.Candidate.model.Candidate;

import java.util.List;

public interface ICandidateService
{
    Object insertCandidate(CandidateDTO candidateDTO);

    List<CombinedResponseDTO> getAll();

    CombinedResponseDTO getByIdAllBQ(long id);
    Candidate getById(long candidateId);

    CombinedResponseDTO getByToken(String token);

    Candidate updateRecordByToken(String token, CandidateDTO candidateDTO);

    List<Candidate> hiredCondidate(String status);
    long count1(String status);

    long count();

    Candidate jobOfferMail(String token);

    Candidate jobOfferMail(long id);

    Candidate updateRecordById(long id, CandidateDTO candidateDTO);

    void deletebyId(long id);

    void deleteByToken(String token);
}
