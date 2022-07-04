package com.bridgelabz.Candidate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
public @Data class BankInfoDTO
{
    @NotBlank(message = "Enter your bankName")
    private String bankName;
    @NotBlank(message = "Enter your bank Account.no")
    private String bankAccountNumber;
    @NotBlank(message = "Enter ifscCode of the bank")
    private String ifscCode;
    @NotBlank(message = "Enter your bank branch name")
    private String bankBranch;
    public long candidateId;
}
