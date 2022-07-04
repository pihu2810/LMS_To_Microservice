package com.bridgelabz.BankInfo.service;


import com.bridgelabz.BankInfo.dto.BankInfoDTO;
import com.bridgelabz.BankInfo.model.BankInfo;
import java.util.List;

public interface IBankService {
    BankInfo addBankDetails(BankInfoDTO bankInfoDto);
    List<BankInfo> getAllBankDetails();
    BankInfo getById(long id);
    List<BankInfo> getByCandidateId(long id);
    BankInfo updateBankInfo(long id, BankInfoDTO bankInfoDto);
    void deleteById(long id);
}
