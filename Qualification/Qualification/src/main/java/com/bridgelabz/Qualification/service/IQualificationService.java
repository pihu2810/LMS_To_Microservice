package com.bridgelabz.Qualification.service;



import com.bridgelabz.Qualification.dto.QualificationDto;
import com.bridgelabz.Qualification.model.QualificationInfo;

import java.util.List;

public interface IQualificationService {

    QualificationInfo addQualificationData(QualificationDto qualificationDto);

    List<QualificationInfo> getAllQualificationData();

    QualificationInfo getById(long id);

    List<QualificationInfo> getByCAndidateId(long id);

    QualificationInfo updateQualificationById(long id, QualificationDto qualificationDto);
    void deleteById(long id);
}