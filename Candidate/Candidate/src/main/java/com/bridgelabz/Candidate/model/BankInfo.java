package com.bridgelabz.Candidate.model;


import com.bridgelabz.Candidate.dto.BankInfoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor

public @Data class BankInfo
{
    @Id
    @GeneratedValue
    private long id;
    private String bankName;
    private String bankAccountNumber;
    private String ifscCode;
    private String bankBranch;
    public long candidateId;

    public BankInfo() {
        super();
    }

    public BankInfo(BankInfoDTO bankInfoDto) {
        this.bankName = bankInfoDto.getBankName();
        this.bankAccountNumber = bankInfoDto.getBankAccountNumber();
        this.ifscCode = bankInfoDto.getIfscCode();
        this.bankBranch = bankInfoDto.getBankBranch();
        this.candidateId=bankInfoDto.getCandidateId();
    }
    public BankInfo(long id, BankInfoDTO bankInfoDto) {
        this.id = id;
        this.bankName = bankInfoDto.getBankName();
        this.bankAccountNumber = bankInfoDto.getBankAccountNumber();
        this.bankBranch = bankInfoDto.getBankBranch();
        this.ifscCode = bankInfoDto.getIfscCode();
        this.candidateId=bankInfoDto.getCandidateId();
    }
}
