package com.bridgelabz.Qualification.repository;

import com.bridgelabz.Qualification.model.QualificationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QualificationRepository extends JpaRepository<QualificationInfo, Long> {

    List<QualificationInfo> findByCandidateId(long id);
}
