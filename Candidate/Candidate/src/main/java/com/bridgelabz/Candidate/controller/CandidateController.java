package com.bridgelabz.Candidate.controller;

import com.bridgelabz.Candidate.dto.CandidateDTO;
import com.bridgelabz.Candidate.dto.CombinedResponseDTO;
import com.bridgelabz.Candidate.dto.ResponseDTO;
import com.bridgelabz.Candidate.model.Candidate;
import com.bridgelabz.Candidate.repository.CandidateRepository;
import com.bridgelabz.Candidate.service.ICandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/candidateDetails")

public class CandidateController {
    @Autowired
    private ICandidateService iCandidateService;
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private RestTemplate restTemplate;

    /**
     * @param candidateDTO
     * @return Ability to Add candidate
     */
    @PostMapping("/addCandidate")
    public ResponseEntity<ResponseDTO> createUser(@Valid @RequestBody CandidateDTO candidateDTO) {
        Object candidate = iCandidateService.insertCandidate(candidateDTO);
        ResponseDTO response = new ResponseDTO(" Candidate Added Successfully !!!", candidate);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * @param getAll
     * @return Ability to gel All candidate details
     */
    @GetMapping(value = "/getAll")
    public ResponseEntity<String> getAll() {
        List<CombinedResponseDTO> listOfUsers = iCandidateService.getAll();
        ResponseDTO dto = new ResponseDTO("Candidate retrieved successfully (:", listOfUsers);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

    /**
     * @param candidateId
     * @return Ability to get candidate by Id
     */

    @GetMapping("/get/{candidateId}")
    ResponseEntity<ResponseDTO> getById(@PathVariable long candidateId) {
        Candidate candidate = iCandidateService.getById(candidateId);
        ResponseDTO response = new ResponseDTO("Candidate Id found", candidate);
        return new ResponseEntity(response, HttpStatus.OK);
    }


    @GetMapping("/getAllDetailsOfCandidateById/{candidateId}")
    ResponseEntity<CombinedResponseDTO> getByCandidateId(@PathVariable long candidateId) {
        CombinedResponseDTO combinedResponseDTO = iCandidateService.getByIdAllBQ(candidateId);
        return new ResponseEntity(combinedResponseDTO, HttpStatus.OK);
    }

    /**
     * @param token
     * @return Ability to get candidate details by token
     */

    @GetMapping(value = "/getByToken/{token}")
    public ResponseEntity<CombinedResponseDTO> getBookDataById(@PathVariable String token) {
        CombinedResponseDTO candidate = iCandidateService.getByToken(token);
        ResponseDTO dto = new ResponseDTO("Data retrieved successfully by id (:", candidate);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

    /**
     * @param token
     * @param candidateDTO
     * @return Ability to update candidate details by token
     */
    @PutMapping("/updateCandidateByToken/{token}")
    public ResponseEntity<String> updateRecordByToken(@PathVariable String token, @Valid @RequestBody CandidateDTO candidateDTO) {
        Candidate updateRecord = iCandidateService.updateRecordByToken(token, candidateDTO);
        ResponseDTO dto = new ResponseDTO(" Candidate Record updated successfully by Id", updateRecord);
        return new ResponseEntity(dto, HttpStatus.ACCEPTED);
    }

    /**
     * @param Id
     * @param candidateDTO
     * @return Ability to update candidate details by Id
     */
    @PutMapping("/updateCandidateById/{id}")
    public ResponseEntity<String> updateRecordById(@PathVariable long id, @Valid @RequestBody CandidateDTO candidateDTO) {
        Candidate updateRecord = iCandidateService.updateRecordById(id, candidateDTO);
        ResponseDTO dto = new ResponseDTO(" Candidate Record updated successfully by Id", updateRecord);
        return new ResponseEntity(dto, HttpStatus.ACCEPTED);
    }

    /**
     * @param status
     * @return Ability to get candidate details by candidate status
     */
    @GetMapping("/getBy/{status}")
    public ResponseEntity<ResponseDTO> getHiredCandidatesNotHiredCandidates(@PathVariable String status) {
        List candidate = iCandidateService.hiredCondidate(status);
        ResponseDTO response = new ResponseDTO("Requested HiredCandidate or Not HiredCandidate : ", candidate);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }

    /**
     * @param status
     * @return Ability to count how many are hired and how many are not hired
     */
    @GetMapping("/count/{status}")
    public ResponseEntity<ResponseDTO> getCount1(@PathVariable String status) {
        long hiredCandidate = iCandidateService.count1(status);
        ResponseDTO response = new ResponseDTO("Candidates Count", hiredCandidate);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * @param count
     * @return Ability to count how many candidate are there
     */

    @GetMapping("/count")
    public ResponseEntity<ResponseDTO> getCount() {
        long hiredCandidate = iCandidateService.count();
        ResponseDTO response = new ResponseDTO("Candidates Count", hiredCandidate);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * @param token
     * @return Ability to send message regarding offer letter and shortlist by token
     */
    @PostMapping("/jobofferByToken/{token}")
    public ResponseEntity<ResponseDTO> sendOffer(@PathVariable String token) {
        Candidate hiredCandidate = iCandidateService.jobOfferMail(token);
        ResponseDTO response = new ResponseDTO("Email sent successfully", hiredCandidate);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * @param id
     * @return Ability to send message regarding offer letter and shortlist by token
     */
    @PostMapping("/jobofferById/{id}")
    public ResponseEntity<ResponseDTO> sendOffer(@PathVariable long id) {
        Candidate hiredCandidate = iCandidateService.jobOfferMail(id);
        ResponseDTO response = new ResponseDTO("Email sent successfully", hiredCandidate);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * @param Id
     * @param delete
     * @return Ability to delete candidate details by Id
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteById(@PathVariable long id) {
        iCandidateService.deletebyId(id);
        ResponseDTO responseDTO = new ResponseDTO("candidate data deleted successfully", id);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }

    /**
     * @param Id
     * @param delete
     * @return Ability to delete candidate details by token
     */


    @DeleteMapping("/deleteBy/{token}")
    public ResponseEntity<ResponseDTO> deleteByToken(@PathVariable String token) {
        iCandidateService.deleteByToken(token);
        ResponseDTO responseDTO = new ResponseDTO("candidate data deleted successfully", token);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }
}