package com.bridgelabz.BankInfo.controller;

import com.bridgelabz.BankInfo.dto.BankInfoDTO;
import com.bridgelabz.BankInfo.dto.ResponseDTO;
import com.bridgelabz.BankInfo.model.BankInfo;
import com.bridgelabz.BankInfo.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bankInfo")
public class BankController {
    @Autowired
    private IBankService iBankService;

    /**
     * @param bankInfo(addBankDetails)
     * @return Ability to add bank details
     */
    @PostMapping("/addBankDetails")
    public ResponseEntity<ResponseDTO> insertBankDetails(@Valid @RequestBody BankInfoDTO bankInfoDto) {
        BankInfo bankInfo = iBankService.addBankDetails(bankInfoDto);
        ResponseDTO response = new ResponseDTO(" BankDetails Added Successfully !!!", bankInfo);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * @param getAllBankDetails
     * @return Ability to get all Bank Details
     */
    @GetMapping(value = "/getAllBankDetails")
    public ResponseEntity<String> getAll() {
        List<BankInfo> listOfBankDetails = iBankService.getAllBankDetails();
        ResponseDTO dto = new ResponseDTO("BankDetails retrieved successfully (:", listOfBankDetails);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

    /**
     * @param bankID
     * @return Ability to get bank Details by Id
     */
    @GetMapping("/get/{bankID}")
    ResponseEntity<ResponseDTO> getById(@PathVariable long bankID) {
        BankInfo bankInfo = iBankService.getById(bankID);
        ResponseDTO response = new ResponseDTO("Candidate Id found", bankInfo);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping("/getByBankId/{bankId}")
    ResponseEntity<String> getByCandidate(@PathVariable long bankId) {
        List<BankInfo> bankInfoList = iBankService.getByCandidateId(bankId);
        ResponseDTO dto = new ResponseDTO("Candidate Bankifo retrieved successfully (:", bankInfoList);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

    /**
     * @param id
     * @param bankInfoDto
     * @return Ability to update bank Details by Id
     */
    @PutMapping("/updateBy/{id}")
    public ResponseEntity<String> updateRecordById(@PathVariable long id, @Valid @RequestBody BankInfoDTO bankInfoDto) {
        BankInfo updateRecord = iBankService.updateBankInfo(id, bankInfoDto);
        ResponseDTO dto = new ResponseDTO(" Bankdetails Record updated successfully by Id", updateRecord);
        return new ResponseEntity(dto, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteById(@PathVariable long id) {
        iBankService.deleteById(id);
        ResponseDTO responseDTO = new ResponseDTO("candidate data deleted successfully", id);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }
}