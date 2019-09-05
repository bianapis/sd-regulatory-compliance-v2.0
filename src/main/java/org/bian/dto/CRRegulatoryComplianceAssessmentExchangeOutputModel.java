package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentExchangeOutputModel
 */
public class CRRegulatoryComplianceAssessmentExchangeOutputModel   {
  private String regulatoryComplianceAssessmentExchangeActionTaskReference = null;

  private Object regulatoryComplianceAssessmentExchangeActionTaskRecord = null;

  private String regulatoryComplianceAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory Compliance Assessment instance exchange service call 
   * @return regulatoryComplianceAssessmentExchangeActionTaskReference
  **/

  public String getRegulatoryComplianceAssessmentExchangeActionTaskReference() {
    return regulatoryComplianceAssessmentExchangeActionTaskReference;
  }

  public void setRegulatoryComplianceAssessmentExchangeActionTaskReference(String regulatoryComplianceAssessmentExchangeActionTaskReference) {
    this.regulatoryComplianceAssessmentExchangeActionTaskReference = regulatoryComplianceAssessmentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return regulatoryComplianceAssessmentExchangeActionResponse
  **/

  public String getRegulatoryComplianceAssessmentExchangeActionResponse() {
    return regulatoryComplianceAssessmentExchangeActionResponse;
  }

  public void setRegulatoryComplianceAssessmentExchangeActionResponse(String regulatoryComplianceAssessmentExchangeActionResponse) {
    this.regulatoryComplianceAssessmentExchangeActionResponse = regulatoryComplianceAssessmentExchangeActionResponse;
  }


}

