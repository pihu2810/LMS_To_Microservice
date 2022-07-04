package com.bridgelabz.Candidate.model;


import com.bridgelabz.Candidate.dto.CandidateDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "candidate_db")
@NoArgsConstructor
public class Candidate
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String status;
    private String email;
    private  String phonenumber;
    private String city;


    public Candidate(CandidateDTO dto) {
        super();
        this.firstName = dto.getFirstName();
        this.lastName = dto.getLastName();
        this.status = dto.getStatus();
        this.email = dto.getEmail();
        this.phonenumber = dto.getPhonenumber();
        this.city = dto.getCity();

    }


    public Candidate(long id, CandidateDTO hiredCandidateDto)
    {
        this.id = id;
        this.firstName = hiredCandidateDto.getFirstName();
        this.lastName = hiredCandidateDto.getLastName();
        this.status = hiredCandidateDto.getStatus();
        this.email = hiredCandidateDto.getEmail();
        this.phonenumber = hiredCandidateDto.getPhonenumber();
        this.city = hiredCandidateDto.getCity();

    }
}
