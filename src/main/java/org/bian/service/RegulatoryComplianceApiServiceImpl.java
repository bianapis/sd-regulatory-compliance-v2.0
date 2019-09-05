/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class RegulatoryComplianceApiServiceImpl implements RegulatoryComplianceApiService {

	public SDRegulatoryComplianceActivateOutputModel activate(SDRegulatoryComplianceActivateInputModel request){
		return JsonReader.read("activate-SDRegulatoryComplianceActivateOutputModel.json",new TypeReference<SDRegulatoryComplianceActivateOutputModel>(){});
	}
	
	public SDRegulatoryComplianceConfigureOutputModel configure(String sdReferenceId, SDRegulatoryComplianceConfigureInputModel request){
		return JsonReader.read("configure-SDRegulatoryComplianceConfigureOutputModel.json",new TypeReference<SDRegulatoryComplianceConfigureOutputModel>(){});
	}
	
	public CRRegulatoryComplianceAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRRegulatoryComplianceAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRRegulatoryComplianceAssessmentEvaluateOutputModel.json",new TypeReference<CRRegulatoryComplianceAssessmentEvaluateOutputModel>(){});
	}
	
	public CRRegulatoryComplianceAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRRegulatoryComplianceAssessmentExchangeOutputModel.json",new TypeReference<CRRegulatoryComplianceAssessmentExchangeOutputModel>(){});
	}
	
	public SDRegulatoryComplianceFeedbackOutputModel feedback(String sdReferenceId, SDRegulatoryComplianceFeedbackInputModel request){
		return JsonReader.read("feedback-SDRegulatoryComplianceFeedbackOutputModel.json",new TypeReference<SDRegulatoryComplianceFeedbackOutputModel>(){});
	}
	
	public CRRegulatoryComplianceAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAssessmentRequestInputModel request){
		return JsonReader.read("request-CRRegulatoryComplianceAssessmentRequestOutputModel.json",new TypeReference<CRRegulatoryComplianceAssessmentRequestOutputModel>(){});
	}
	
	public CRRegulatoryComplianceAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRRegulatoryComplianceAssessmentRetrieveOutputModel.json",new TypeReference<CRRegulatoryComplianceAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDRegulatoryComplianceRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDRegulatoryComplianceRetrieveOutputModel.json",new TypeReference<SDRegulatoryComplianceRetrieveOutputModel>(){});
	}
	
	public CRRegulatoryComplianceAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRRegulatoryComplianceAssessmentUpdateOutputModel.json",new TypeReference<CRRegulatoryComplianceAssessmentUpdateOutputModel>(){});
	}
	
}
