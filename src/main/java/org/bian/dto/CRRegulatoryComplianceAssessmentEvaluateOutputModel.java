package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAssessmentEvaluateOutputModelRegulatoryComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentEvaluateOutputModel
 */
public class CRRegulatoryComplianceAssessmentEvaluateOutputModel   {
  private String regulatoryComplianceAssessmentInstanceReference = null;

  private String regulatoryComplianceAssessmentEvaluateActionReference = null;

  private Object regulatoryComplianceAssessmentEvaluateActionRecord = null;

  private String regulatoryComplianceAssessmentInstanceStatus = null;

  private CRRegulatoryComplianceAssessmentEvaluateOutputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Regulatory Compliance Assessment instance 
   * @return regulatoryComplianceAssessmentInstanceReference
  **/

  public String getRegulatoryComplianceAssessmentInstanceReference() {
    return regulatoryComplianceAssessmentInstanceReference;
  }

  public void setRegulatoryComplianceAssessmentInstanceReference(String regulatoryComplianceAssessmentInstanceReference) {
    this.regulatoryComplianceAssessmentInstanceReference = regulatoryComplianceAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return regulatoryComplianceAssessmentEvaluateActionReference
  **/

  public String getRegulatoryComplianceAssessmentEvaluateActionReference() {
    return regulatoryComplianceAssessmentEvaluateActionReference;
  }

  public void setRegulatoryComplianceAssessmentEvaluateActionReference(String regulatoryComplianceAssessmentEvaluateActionReference) {
    this.regulatoryComplianceAssessmentEvaluateActionReference = regulatoryComplianceAssessmentEvaluateActionReference;
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

  public CRRegulatoryComplianceAssessmentEvaluateOutputModelRegulatoryComplianceAssessmentInstanceRecord getRegulatoryComplianceAssessmentInstanceRecord() {
    return regulatoryComplianceAssessmentInstanceRecord;
  }

  public void setRegulatoryComplianceAssessmentInstanceRecord(CRRegulatoryComplianceAssessmentEvaluateOutputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord) {
    this.regulatoryComplianceAssessmentInstanceRecord = regulatoryComplianceAssessmentInstanceRecord;
  }


}

