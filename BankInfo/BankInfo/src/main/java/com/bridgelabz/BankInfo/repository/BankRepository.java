package com.bridgelabz.BankInfo.repository;

import com.bridgelabz.BankInfo.model.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<BankInfo, Long>
{
    List<BankInfo> findByCandidateId(long id);
}
