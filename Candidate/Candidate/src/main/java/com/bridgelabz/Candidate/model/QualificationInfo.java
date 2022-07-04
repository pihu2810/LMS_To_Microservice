package com.bridgelabz.Candidate.model;



import com.bridgelabz.Candidate.dto.QualificationDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QualificationInfo {

    @Id
    @GeneratedValue
    private long id;
    private String collageName;
    private String degree;
    private String percentage;
    private String yearOfPassing;
    private String course;
    private String document;
    public long candidateId;


    public QualificationInfo(QualificationDto qualificationDto) {
        this.collageName = qualificationDto.getCollageName();
        this.degree = qualificationDto.getDegree();
        this.percentage = qualificationDto.getPercentage();
        this.yearOfPassing = qualificationDto.getYearOfPassing();
        this.course = qualificationDto.getCourse();
        this.document=qualificationDto.getDocument();
        this.candidateId=qualificationDto.getCandidateId();
    }
    public QualificationInfo(long id, QualificationDto qualificationDto) {
        this.id=id;
        this.collageName = qualificationDto.getCollageName();
        this.degree = qualificationDto.getDegree();
        this.percentage = qualificationDto.getPercentage();
        this.yearOfPassing = qualificationDto.getYearOfPassing();
        this.course = qualificationDto.getCourse();
        this.document = qualificationDto.getDocument();
        this.candidateId=qualificationDto.getCandidateId();
    }
}
