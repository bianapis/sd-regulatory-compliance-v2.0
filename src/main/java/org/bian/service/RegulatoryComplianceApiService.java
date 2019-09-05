/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface RegulatoryComplianceApiService {

	SDRegulatoryComplianceActivateOutputModel activate(SDRegulatoryComplianceActivateInputModel request);
	
	SDRegulatoryComplianceConfigureOutputModel configure(String sdReferenceId, SDRegulatoryComplianceConfigureInputModel request);
	
	CRRegulatoryComplianceAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRRegulatoryComplianceAssessmentEvaluateInputModel request);
	
	CRRegulatoryComplianceAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAssessmentExchangeInputModel request);
	
	SDRegulatoryComplianceFeedbackOutputModel feedback(String sdReferenceId, SDRegulatoryComplianceFeedbackInputModel request);
	
	CRRegulatoryComplianceAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAssessmentRequestInputModel request);
	
	CRRegulatoryComplianceAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDRegulatoryComplianceRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRRegulatoryComplianceAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAssessmentUpdateInputModel request);
	
}
