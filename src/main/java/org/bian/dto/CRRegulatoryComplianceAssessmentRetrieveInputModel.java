package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceAnalysis;
import org.bian.dto.CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentRetrieveInputModel
 */
public class CRRegulatoryComplianceAssessmentRetrieveInputModel   {
  private Object regulatoryComplianceAssessmentRetrieveActionTaskRecord = null;

  private String regulatoryComplianceAssessmentRetrieveActionRequest = null;

  private CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceReportRecord regulatoryComplianceAssessmentInstanceReportRecord = null;

  private CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceAnalysis regulatoryComplianceAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return regulatoryComplianceAssessmentRetrieveActionTaskRecord
  **/

  public Object getRegulatoryComplianceAssessmentRetrieveActionTaskRecord() {
    return regulatoryComplianceAssessmentRetrieveActionTaskRecord;
  }

  public void setRegulatoryComplianceAssessmentRetrieveActionTaskRecord(Object regulatoryComplianceAssessmentRetrieveActionTaskRecord) {
    this.regulatoryComplianceAssessmentRetrieveActionTaskRecord = regulatoryComplianceAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return regulatoryComplianceAssessmentRetrieveActionRequest
  **/

  public String getRegulatoryComplianceAssessmentRetrieveActionRequest() {
    return regulatoryComplianceAssessmentRetrieveActionRequest;
  }

  public void setRegulatoryComplianceAssessmentRetrieveActionRequest(String regulatoryComplianceAssessmentRetrieveActionRequest) {
    this.regulatoryComplianceAssessmentRetrieveActionRequest = regulatoryComplianceAssessmentRetrieveActionRequest;
  }


  /**
   * Get regulatoryComplianceAssessmentInstanceReportRecord
   * @return regulatoryComplianceAssessmentInstanceReportRecord
  **/

  public CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceReportRecord getRegulatoryComplianceAssessmentInstanceReportRecord() {
    return regulatoryComplianceAssessmentInstanceReportRecord;
  }

  public void setRegulatoryComplianceAssessmentInstanceReportRecord(CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceReportRecord regulatoryComplianceAssessmentInstanceReportRecord) {
    this.regulatoryComplianceAssessmentInstanceReportRecord = regulatoryComplianceAssessmentInstanceReportRecord;
  }


  /**
   * Get regulatoryComplianceAssessmentInstanceAnalysis
   * @return regulatoryComplianceAssessmentInstanceAnalysis
  **/

  public CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceAnalysis getRegulatoryComplianceAssessmentInstanceAnalysis() {
    return regulatoryComplianceAssessmentInstanceAnalysis;
  }

  public void setRegulatoryComplianceAssessmentInstanceAnalysis(CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceAnalysis regulatoryComplianceAssessmentInstanceAnalysis) {
    this.regulatoryComplianceAssessmentInstanceAnalysis = regulatoryComplianceAssessmentInstanceAnalysis;
  }


}

