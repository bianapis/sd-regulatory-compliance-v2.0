package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceReportRecord
 */
public class CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceReportRecord   {
  private String regulatoryComplianceAssessmentInstanceReportReference = null;

  private String regulatoryComplianceAssessmentInstanceReportType = null;

  private String regulatoryComplianceAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return regulatoryComplianceAssessmentInstanceReportReference
  **/

  public String getRegulatoryComplianceAssessmentInstanceReportReference() {
    return regulatoryComplianceAssessmentInstanceReportReference;
  }

  public void setRegulatoryComplianceAssessmentInstanceReportReference(String regulatoryComplianceAssessmentInstanceReportReference) {
    this.regulatoryComplianceAssessmentInstanceReportReference = regulatoryComplianceAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return regulatoryComplianceAssessmentInstanceReportType
  **/

  public String getRegulatoryComplianceAssessmentInstanceReportType() {
    return regulatoryComplianceAssessmentInstanceReportType;
  }

  public void setRegulatoryComplianceAssessmentInstanceReportType(String regulatoryComplianceAssessmentInstanceReportType) {
    this.regulatoryComplianceAssessmentInstanceReportType = regulatoryComplianceAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return regulatoryComplianceAssessmentInstanceReportParameters
  **/

  public String getRegulatoryComplianceAssessmentInstanceReportParameters() {
    return regulatoryComplianceAssessmentInstanceReportParameters;
  }

  public void setRegulatoryComplianceAssessmentInstanceReportParameters(String regulatoryComplianceAssessmentInstanceReportParameters) {
    this.regulatoryComplianceAssessmentInstanceReportParameters = regulatoryComplianceAssessmentInstanceReportParameters;
  }


}

