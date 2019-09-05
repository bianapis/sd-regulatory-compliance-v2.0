package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceReportRecord
 */
public class CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceReportRecord   {
  private String regulatoryComplianceAssessmentInstanceReportData = null;

  private String regulatoryComplianceAssessmentInstanceReportType = null;

  private Object regulatoryComplianceAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return regulatoryComplianceAssessmentInstanceReportData
  **/

  public String getRegulatoryComplianceAssessmentInstanceReportData() {
    return regulatoryComplianceAssessmentInstanceReportData;
  }

  public void setRegulatoryComplianceAssessmentInstanceReportData(String regulatoryComplianceAssessmentInstanceReportData) {
    this.regulatoryComplianceAssessmentInstanceReportData = regulatoryComplianceAssessmentInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return regulatoryComplianceAssessmentInstanceReport
  **/

  public Object getRegulatoryComplianceAssessmentInstanceReport() {
    return regulatoryComplianceAssessmentInstanceReport;
  }

  public void setRegulatoryComplianceAssessmentInstanceReport(Object regulatoryComplianceAssessmentInstanceReport) {
    this.regulatoryComplianceAssessmentInstanceReport = regulatoryComplianceAssessmentInstanceReport;
  }


}

