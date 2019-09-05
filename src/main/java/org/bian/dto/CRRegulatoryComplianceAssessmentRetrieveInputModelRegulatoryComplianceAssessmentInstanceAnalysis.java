package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceAnalysis
 */
public class CRRegulatoryComplianceAssessmentRetrieveInputModelRegulatoryComplianceAssessmentInstanceAnalysis   {
  private String regulatoryComplianceAssessmentInstanceAnalysisReference = null;

  private String regulatoryComplianceAssessmentInstanceAnalysisReportType = null;

  private String regulatoryComplianceAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return regulatoryComplianceAssessmentInstanceAnalysisReference
  **/

  public String getRegulatoryComplianceAssessmentInstanceAnalysisReference() {
    return regulatoryComplianceAssessmentInstanceAnalysisReference;
  }

  public void setRegulatoryComplianceAssessmentInstanceAnalysisReference(String regulatoryComplianceAssessmentInstanceAnalysisReference) {
    this.regulatoryComplianceAssessmentInstanceAnalysisReference = regulatoryComplianceAssessmentInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return regulatoryComplianceAssessmentInstanceAnalysisReportType
  **/

  public String getRegulatoryComplianceAssessmentInstanceAnalysisReportType() {
    return regulatoryComplianceAssessmentInstanceAnalysisReportType;
  }

  public void setRegulatoryComplianceAssessmentInstanceAnalysisReportType(String regulatoryComplianceAssessmentInstanceAnalysisReportType) {
    this.regulatoryComplianceAssessmentInstanceAnalysisReportType = regulatoryComplianceAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return regulatoryComplianceAssessmentInstanceAnalysisParameters
  **/

  public String getRegulatoryComplianceAssessmentInstanceAnalysisParameters() {
    return regulatoryComplianceAssessmentInstanceAnalysisParameters;
  }

  public void setRegulatoryComplianceAssessmentInstanceAnalysisParameters(String regulatoryComplianceAssessmentInstanceAnalysisParameters) {
    this.regulatoryComplianceAssessmentInstanceAnalysisParameters = regulatoryComplianceAssessmentInstanceAnalysisParameters;
  }


}

