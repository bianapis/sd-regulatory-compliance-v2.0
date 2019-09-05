package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceRecord
 */
public class CRRegulatoryComplianceAssessmentRetrieveOutputModelRegulatoryComplianceAssessmentInstanceRecord   {
  private String regulatoryAssessmentType = null;

  private String businessUnitReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String regulatoryAuthorityReference = null;

  private String regulationReference = null;

  private String regulationDefinition = null;

  private String regulationComplianceandReportingRequirements = null;

  private String regulationAccountability = null;

  private String regulationPenalties = null;

  private String regulationGuideline = null;

  private String documentReference = null;

  private String regulatoryAssessmentWorkProducts = null;

  private String regulatoryAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type and make-up of regulatory tests referenced in the assessment 
   * @return regulatoryAssessmentType
  **/

  public String getRegulatoryAssessmentType() {
    return regulatoryAssessmentType;
  }

  public void setRegulatoryAssessmentType(String regulatoryAssessmentType) {
    this.regulatoryAssessmentType = regulatoryAssessmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The business function or unit assessed for compliance if appropriate 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The associated product/service being assessed if appropriate 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer assessed if appropriate 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Indication of the authority pertaining to the applied regulation 
   * @return regulatoryAuthorityReference
  **/

  public String getRegulatoryAuthorityReference() {
    return regulatoryAuthorityReference;
  }

  public void setRegulatoryAuthorityReference(String regulatoryAuthorityReference) {
    this.regulatoryAuthorityReference = regulatoryAuthorityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the specific regulation 
   * @return regulationReference
  **/

  public String getRegulationReference() {
    return regulationReference;
  }

  public void setRegulationReference(String regulationReference) {
    this.regulationReference = regulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A definition of the goals/required actions addressed by the regulation 
   * @return regulationDefinition
  **/

  public String getRegulationDefinition() {
    return regulationDefinition;
  }

  public void setRegulationDefinition(String regulationDefinition) {
    this.regulationDefinition = regulationDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the measurements and reporting required to demonstrate compliance 
   * @return regulationComplianceandReportingRequirements
  **/

  public String getRegulationComplianceandReportingRequirements() {
    return regulationComplianceandReportingRequirements;
  }

  public void setRegulationComplianceandReportingRequirements(String regulationComplianceandReportingRequirements) {
    this.regulationComplianceandReportingRequirements = regulationComplianceandReportingRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Explanation of the business context, responsibility and accountability for compliance 
   * @return regulationAccountability
  **/

  public String getRegulationAccountability() {
    return regulationAccountability;
  }

  public void setRegulationAccountability(String regulationAccountability) {
    this.regulationAccountability = regulationAccountability;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outline of the possible implications of non-compliance 
   * @return regulationPenalties
  **/

  public String getRegulationPenalties() {
    return regulationPenalties;
  }

  public void setRegulationPenalties(String regulationPenalties) {
    this.regulationPenalties = regulationPenalties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines and requirements for compliance 
   * @return regulationGuideline
  **/

  public String getRegulationGuideline() {
    return regulationGuideline;
  }

  public void setRegulationGuideline(String regulationGuideline) {
    this.regulationGuideline = regulationGuideline;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any documentation classified/archived as appropriate 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the assessment 
   * @return regulatoryAssessmentWorkProducts
  **/

  public String getRegulatoryAssessmentWorkProducts() {
    return regulatoryAssessmentWorkProducts;
  }

  public void setRegulatoryAssessmentWorkProducts(String regulatoryAssessmentWorkProducts) {
    this.regulatoryAssessmentWorkProducts = regulatoryAssessmentWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outcome/result of the assessment, can include remedial actions 
   * @return regulatoryAssessmentResult
  **/

  public String getRegulatoryAssessmentResult() {
    return regulatoryAssessmentResult;
  }

  public void setRegulatoryAssessmentResult(String regulatoryAssessmentResult) {
    this.regulatoryAssessmentResult = regulatoryAssessmentResult;
  }


}

