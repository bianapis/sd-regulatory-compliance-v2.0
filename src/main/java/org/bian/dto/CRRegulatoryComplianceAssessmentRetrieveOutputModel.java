package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceAnalysis;
import org.bian.dto.CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceRecord;
import org.bian.dto.CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentRetrieveOutputModel
 */
public class CRRegulatoryComplianceAssessmentRetrieveOutputModel   {
  private CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord = null;

  private String regulatoryComplianceAssessmentRetrieveActionTaskReference = null;

  private Object regulatoryComplianceAssessmentRetrieveActionTaskRecord = null;

  private String regulatoryComplianceAssessmentRetrieveActionResponse = null;

  private CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceReportRecord regulatoryComplianceAssessmentInstanceReportRecord = null;

  private CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceAnalysis regulatoryComplianceAssessmentInstanceAnalysis = null;


  /**
   * Get regulatoryComplianceAssessmentInstanceRecord
   * @return regulatoryComplianceAssessmentInstanceRecord
  **/

  public CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceRecord getRegulatoryComplianceAssessmentInstanceRecord() {
    return regulatoryComplianceAssessmentInstanceRecord;
  }

  public void setRegulatoryComplianceAssessmentInstanceRecord(CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord) {
    this.regulatoryComplianceAssessmentInstanceRecord = regulatoryComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory Compliance Assessment instance retrieve service call 
   * @return regulatoryComplianceAssessmentRetrieveActionTaskReference
  **/

  public String getRegulatoryComplianceAssessmentRetrieveActionTaskReference() {
    return regulatoryComplianceAssessmentRetrieveActionTaskReference;
  }

  public void setRegulatoryComplianceAssessmentRetrieveActionTaskReference(String regulatoryComplianceAssessmentRetrieveActionTaskReference) {
    this.regulatoryComplianceAssessmentRetrieveActionTaskReference = regulatoryComplianceAssessmentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return regulatoryComplianceAssessmentRetrieveActionResponse
  **/

  public String getRegulatoryComplianceAssessmentRetrieveActionResponse() {
    return regulatoryComplianceAssessmentRetrieveActionResponse;
  }

  public void setRegulatoryComplianceAssessmentRetrieveActionResponse(String regulatoryComplianceAssessmentRetrieveActionResponse) {
    this.regulatoryComplianceAssessmentRetrieveActionResponse = regulatoryComplianceAssessmentRetrieveActionResponse;
  }


  /**
   * Get regulatoryComplianceAssessmentInstanceReportRecord
   * @return regulatoryComplianceAssessmentInstanceReportRecord
  **/

  public CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceReportRecord getRegulatoryComplianceAssessmentInstanceReportRecord() {
    return regulatoryComplianceAssessmentInstanceReportRecord;
  }

  public void setRegulatoryComplianceAssessmentInstanceReportRecord(CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceReportRecord regulatoryComplianceAssessmentInstanceReportRecord) {
    this.regulatoryComplianceAssessmentInstanceReportRecord = regulatoryComplianceAssessmentInstanceReportRecord;
  }


  /**
   * Get regulatoryComplianceAssessmentInstanceAnalysis
   * @return regulatoryComplianceAssessmentInstanceAnalysis
  **/

  public CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceAnalysis getRegulatoryComplianceAssessmentInstanceAnalysis() {
    return regulatoryComplianceAssessmentInstanceAnalysis;
  }

  public void setRegulatoryComplianceAssessmentInstanceAnalysis(CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceAnalysis regulatoryComplianceAssessmentInstanceAnalysis) {
    this.regulatoryComplianceAssessmentInstanceAnalysis = regulatoryComplianceAssessmentInstanceAnalysis;
  }


}

