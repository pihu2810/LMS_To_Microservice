package com.bridgelabz.Qualification.model;


import com.bridgelabz.Qualification.dto.QualificationDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "qualification_info")
public class QualificationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String collageName;
    private String degree;
    private String percentage;
    private String yearOfPassing;
    private String course;
    private String document;
    public long candidateId;

    public QualificationInfo(QualificationDto qualificationDto) {
        super();
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
