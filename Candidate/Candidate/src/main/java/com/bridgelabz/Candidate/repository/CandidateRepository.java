package com.bridgelabz.Candidate.repository;

import com.bridgelabz.Candidate.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long>
{
    List<Candidate> findCandidateByStatus(String status);

    long countByStatusEquals(String status);
}
