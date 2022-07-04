package com.bridgelabz.BankInfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BankInfoDTO
{
    @NotEmpty(message = "Bank name cannot be null")
    private String bankName;
    @NotEmpty(message = " Bank Account number cannot be null")
    private String bankAccountNumber;
    @NotEmpty(message = "IFSC Code cannot be null")
    private String ifscCode;
    @NotEmpty(message = "Branch name cannot be null")
    private String bankBranch;
    public long candidateId;

}
