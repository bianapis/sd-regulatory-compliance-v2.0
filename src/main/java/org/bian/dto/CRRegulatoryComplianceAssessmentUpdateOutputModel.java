package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAssessmentUpdateInputModelRegulatoryComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentUpdateOutputModel
 */
public class CRRegulatoryComplianceAssessmentUpdateOutputModel   {
  private CRRegulatoryComplianceAssessmentUpdateInputModelRegulatoryComplianceAssessmentInstanceRecord regulatoryComplianceAssessmentInstanceRecord = null;

  private String regulatoryComplianceAssessmentUpdateActionTaskReference = null;

  private Object regulatoryComplianceAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return regulatoryComplianceAssessmentUpdateActionTaskReference
  **/

  public String getRegulatoryComplianceAssessmentUpdateActionTaskReference() {
    return regulatoryComplianceAssessmentUpdateActionTaskReference;
  }

  public void setRegulatoryComplianceAssessmentUpdateActionTaskReference(String regulatoryComplianceAssessmentUpdateActionTaskReference) {
    this.regulatoryComplianceAssessmentUpdateActionTaskReference = regulatoryComplianceAssessmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

