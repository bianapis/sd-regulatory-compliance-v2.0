package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceAnalysis
 */
public class CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceAnalysis   {
  private String regulatoryComplianceAssessmentInstanceAnalysisData = null;

  private String regulatoryComplianceAssessmentInstanceAnalysisReportType = null;

  private Object regulatoryComplianceAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return regulatoryComplianceAssessmentInstanceAnalysisData
  **/

  public String getRegulatoryComplianceAssessmentInstanceAnalysisData() {
    return regulatoryComplianceAssessmentInstanceAnalysisData;
  }

  public void setRegulatoryComplianceAssessmentInstanceAnalysisData(String regulatoryComplianceAssessmentInstanceAnalysisData) {
    this.regulatoryComplianceAssessmentInstanceAnalysisData = regulatoryComplianceAssessmentInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return regulatoryComplianceAssessmentInstanceAnalysisReport
  **/

  public Object getRegulatoryComplianceAssessmentInstanceAnalysisReport() {
    return regulatoryComplianceAssessmentInstanceAnalysisReport;
  }

  public void setRegulatoryComplianceAssessmentInstanceAnalysisReport(Object regulatoryComplianceAssessmentInstanceAnalysisReport) {
    this.regulatoryComplianceAssessmentInstanceAnalysisReport = regulatoryComplianceAssessmentInstanceAnalysisReport;
  }


}

