package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAssessmentUpdateInputModelRegulatoryComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentUpdateInputModel
 */
public class CRRegulatoryComplianceAssessmentUpdateInputModel   {
  private String regulatoryComplianceServicingSessionReference = null;

  private String regulatoryComplianceAssessmentInstanceReference = null;

  private CRRegulatoryComplianceAssessmentUpdateInputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord = null;

  private Object regulatoryComplianceAssessmentUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get regulatoryComplianceAssessmentInstanceRecord
   * @return regulatoryComplianceAssessmentInstanceRecord
  **/

  public CRRegulatoryComplianceAssessmentUpdateInputModelRegulatoryComplianceAssessmentInstanceRecord getRegulatoryComplianceAssessmentInstanceRecord() {
    return regulatoryComplianceAssessmentInstanceRecord;
  }

  public void setRegulatoryComplianceAssessmentInstanceRecord(CRRegulatoryComplianceAssessmentUpdateInputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord) {
    this.regulatoryComplianceAssessmentInstanceRecord = regulatoryComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return regulatoryComplianceAssessmentUpdateActionTaskRecord
  **/

  public Object getRegulatoryComplianceAssessmentUpdateActionTaskRecord() {
    return regulatoryComplianceAssessmentUpdateActionTaskRecord;
  }

  public void setRegulatoryComplianceAssessmentUpdateActionTaskRecord(Object regulatoryComplianceAssessmentUpdateActionTaskRecord) {
    this.regulatoryComplianceAssessmentUpdateActionTaskRecord = regulatoryComplianceAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

