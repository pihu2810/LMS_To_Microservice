package com.bridgelabz.Candidate.dto;

import com.bridgelabz.Candidate.model.Candidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data class CombinedResponseDTO {
    private Object candidate;
    private Object qualificationInfoList;
    private Object bankInfoList;
}
