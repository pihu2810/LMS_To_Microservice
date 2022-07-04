package com.bridgelabz.Candidate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDTO
{

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Firstname Invalid ")
    @NotEmpty(message = "First name cannot be null")
    private String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Lastname Invalid ")
    @NotEmpty(message = "Last name cannot be null")
    private String lastName;
    @NotEmpty(message = "Status name cannot be null")
    private String status;
    @Email
    @NotEmpty(message = "Email name cannot be null")
    private String email;
    @NotEmpty(message = "Phonenumber name cannot be null")
    private  String phonenumber;
    @NotEmpty(message = "City name cannot be null")
    private String city;

}
