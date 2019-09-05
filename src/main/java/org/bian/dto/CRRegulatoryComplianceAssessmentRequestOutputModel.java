package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAssessmentRequestOutputModelRegulatoryComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentRequestOutputModel
 */
public class CRRegulatoryComplianceAssessmentRequestOutputModel   {
  private CRRegulatoryComplianceAssessmentRequestOutputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord = null;

  private String regulatoryComplianceAssessmentRequestActionTaskReference = null;

  private Object regulatoryComplianceAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get regulatoryComplianceAssessmentInstanceRecord
   * @return regulatoryComplianceAssessmentInstanceRecord
  **/

  public CRRegulatoryComplianceAssessmentRequestOutputModelRegulatoryComplianceAssessmentInstanceRecord getRegulatoryComplianceAssessmentInstanceRecord() {
    return regulatoryComplianceAssessmentInstanceRecord;
  }

  public void setRegulatoryComplianceAssessmentInstanceRecord(CRRegulatoryComplianceAssessmentRequestOutputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord) {
    this.regulatoryComplianceAssessmentInstanceRecord = regulatoryComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory Compliance Assessment instance request service call 
   * @return regulatoryComplianceAssessmentRequestActionTaskReference
  **/

  public String getRegulatoryComplianceAssessmentRequestActionTaskReference() {
    return regulatoryComplianceAssessmentRequestActionTaskReference;
  }

  public void setRegulatoryComplianceAssessmentRequestActionTaskReference(String regulatoryComplianceAssessmentRequestActionTaskReference) {
    this.regulatoryComplianceAssessmentRequestActionTaskReference = regulatoryComplianceAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return regulatoryComplianceAssessmentRequestActionTaskRecord
  **/

  public Object getRegulatoryComplianceAssessmentRequestActionTaskRecord() {
    return regulatoryComplianceAssessmentRequestActionTaskRecord;
  }

  public void setRegulatoryComplianceAssessmentRequestActionTaskRecord(Object regulatoryComplianceAssessmentRequestActionTaskRecord) {
    this.regulatoryComplianceAssessmentRequestActionTaskRecord = regulatoryComplianceAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

