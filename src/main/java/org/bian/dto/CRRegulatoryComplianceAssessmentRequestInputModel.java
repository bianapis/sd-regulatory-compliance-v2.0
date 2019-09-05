package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAssessmentRequestInputModelRegulatoryComplianceAssessmentInstanceRecord;
import org.bian.dto.CRRegulatoryComplianceAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentRequestInputModel
 */
public class CRRegulatoryComplianceAssessmentRequestInputModel   {
  private String regulatoryComplianceServicingSessionReference = null;

  private String regulatoryComplianceAssessmentInstanceReference = null;

  private CRRegulatoryComplianceAssessmentRequestInputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord = null;

  private Object regulatoryComplianceAssessmentRequestActionTaskRecord = null;

  private CRRegulatoryComplianceAssessmentRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRRegulatoryComplianceAssessmentRequestInputModelRegulatoryComplianceAssessmentInstanceRecord getRegulatoryComplianceAssessmentInstanceRecord() {
    return regulatoryComplianceAssessmentInstanceRecord;
  }

  public void setRegulatoryComplianceAssessmentInstanceRecord(CRRegulatoryComplianceAssessmentRequestInputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord) {
    this.regulatoryComplianceAssessmentInstanceRecord = regulatoryComplianceAssessmentInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRRegulatoryComplianceAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRRegulatoryComplianceAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

