package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAssessmentEvaluateInputModelRegulatoryComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentEvaluateInputModel
 */
public class CRRegulatoryComplianceAssessmentEvaluateInputModel   {
  private String regulatoryComplianceServicingSessionReference = null;

  private Object regulatoryComplianceAssessmentEvaluateActionRecord = null;

  private String regulatoryComplianceAssessmentInstanceStatus = null;

  private CRRegulatoryComplianceAssessmentEvaluateInputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return regulatoryComplianceServicingSessionReference
  **/

  public String getRegulatoryComplianceServicingSessionReference() {
    return regulatoryComplianceServicingSessionReference;
  }

  public void setRegulatoryComplianceServicingSessionReference(String regulatoryComplianceServicingSessionReference) {
    this.regulatoryComplianceServicingSessionReference = regulatoryComplianceServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return regulatoryComplianceAssessmentEvaluateActionRecord
  **/

  public Object getRegulatoryComplianceAssessmentEvaluateActionRecord() {
    return regulatoryComplianceAssessmentEvaluateActionRecord;
  }

  public void setRegulatoryComplianceAssessmentEvaluateActionRecord(Object regulatoryComplianceAssessmentEvaluateActionRecord) {
    this.regulatoryComplianceAssessmentEvaluateActionRecord = regulatoryComplianceAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Regulatory Compliance Assessment instance (e.g. initialised, pending, active) 
   * @return regulatoryComplianceAssessmentInstanceStatus
  **/

  public String getRegulatoryComplianceAssessmentInstanceStatus() {
    return regulatoryComplianceAssessmentInstanceStatus;
  }

  public void setRegulatoryComplianceAssessmentInstanceStatus(String regulatoryComplianceAssessmentInstanceStatus) {
    this.regulatoryComplianceAssessmentInstanceStatus = regulatoryComplianceAssessmentInstanceStatus;
  }


  /**
   * Get regulatoryComplianceAssessmentInstanceRecord
   * @return regulatoryComplianceAssessmentInstanceRecord
  **/

  public CRRegulatoryComplianceAssessmentEvaluateInputModelRegulatoryComplianceAssessmentInstanceRecord getRegulatoryComplianceAssessmentInstanceRecord() {
    return regulatoryComplianceAssessmentInstanceRecord;
  }

  public void setRegulatoryComplianceAssessmentInstanceRecord(CRRegulatoryComplianceAssessmentEvaluateInputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord) {
    this.regulatoryComplianceAssessmentInstanceRecord = regulatoryComplianceAssessmentInstanceRecord;
  }


}

