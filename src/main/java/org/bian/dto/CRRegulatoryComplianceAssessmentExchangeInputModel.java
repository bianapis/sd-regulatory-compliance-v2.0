package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAssessmentExchangeInputModelRegulatoryComplianceAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentExchangeInputModel
 */
public class CRRegulatoryComplianceAssessmentExchangeInputModel   {
  private String regulatoryComplianceServicingSessionReference = null;

  private String regulatoryComplianceAssessmentInstanceReference = null;

  private Object regulatoryComplianceAssessmentExchangeActionTaskRecord = null;

  private CRRegulatoryComplianceAssessmentExchangeInputModelRegulatoryComplianceAssessmentExchangeActionRequest regulatoryComplianceAssessmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return regulatoryComplianceAssessmentExchangeActionTaskRecord
  **/

  public Object getRegulatoryComplianceAssessmentExchangeActionTaskRecord() {
    return regulatoryComplianceAssessmentExchangeActionTaskRecord;
  }

  public void setRegulatoryComplianceAssessmentExchangeActionTaskRecord(Object regulatoryComplianceAssessmentExchangeActionTaskRecord) {
    this.regulatoryComplianceAssessmentExchangeActionTaskRecord = regulatoryComplianceAssessmentExchangeActionTaskRecord;
  }


  /**
   * Get regulatoryComplianceAssessmentExchangeActionRequest
   * @return regulatoryComplianceAssessmentExchangeActionRequest
  **/

  public CRRegulatoryComplianceAssessmentExchangeInputModelRegulatoryComplianceAssessmentExchangeActionRequest getRegulatoryComplianceAssessmentExchangeActionRequest() {
    return regulatoryComplianceAssessmentExchangeActionRequest;
  }

  public void setRegulatoryComplianceAssessmentExchangeActionRequest(CRRegulatoryComplianceAssessmentExchangeInputModelRegulatoryComplianceAssessmentExchangeActionRequest regulatoryComplianceAssessmentExchangeActionRequest) {
    this.regulatoryComplianceAssessmentExchangeActionRequest = regulatoryComplianceAssessmentExchangeActionRequest;
  }


}

