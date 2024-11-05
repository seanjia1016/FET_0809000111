package com.infortrends.APIfunction;

import org.json.JSONObject;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class GetCashSubscriberInfoByKey {

	public String ContainKeyAndGetString(JSONObject jsonObject, String key) {
		if (jsonObject.has(key)) {
			return jsonObject.getString(key);
		}
		return null;
	}

	
	public void AssignODvariable(SCESession mySession, JSONObject ResponseJsonObject) {
		
		
		String returnCode = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:returnHeader").getJSONObject("ns1:returnCode").getString("content");
		String legacyCode = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:returnHeader").getJSONObject("ns1:legacyCode").getString("content");
		String returnMesg = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:returnHeader").getJSONObject("ns1:returnMesg").getString("content");
		String processID = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:returnHeader").getJSONObject("ns1:processID").get("content").toString().trim();
		String processName = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:returnHeader").getJSONObject("ns1:processName").getString("content");

		String subscriberId = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:subscriberInfoResult").getJSONObject("ns1:subscriberInfo").get("ns1:subscriberId").toString().trim();

		String accountId = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:subscriberInfoResult").getJSONObject("ns1:subscriberInfo").get("ns1:accountId").toString().trim();
		String customerId = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:subscriberInfoResult").getJSONObject("ns1:subscriberInfo").get("ns1:customerId").toString().trim();
		String contractComponentId = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:subscriberInfoResult").getJSONObject("ns1:subscriberInfo").get("ns1:contractComponentId").toString().trim();
		String paymentCategory = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:subscriberInfoResult").getJSONObject("ns1:subscriberInfo").get("ns1:paymentCategory").toString().trim();
		String generationCode = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:subscriberInfoResult").getJSONObject("ns1:subscriberInfo").get("ns1:generationCode").toString().trim();
		String serviceProvider = ResponseJsonObject.getJSONObject("Data").getJSONObject("xml-fragment").getJSONObject("ns0:subscriberInfoResult").getJSONObject("ns1:subscriberInfo").get("ns1:serviceProvider").toString().trim();
			
		
//		String dataSource = ResponseJsonObject.getString("dataSource");
//		String msisdn = ResponseJsonObject.getString("msisdn");
//		String partyId = ResponseJsonObject.getString("partyId");
//		String accountId = ResponseJsonObject.getString("accountId");
//		String contractId = ResponseJsonObject.getString("contractId");	
//		String accountContractComponentId = ResponseJsonObject.getString("accountContractComponentId");
//		String accountPartyId = ResponseJsonObject.getString("accountPartyId");
//		String adminFldNmTpCd = ResponseJsonObject.getString("adminFldNmTpCd");	
//		String serviceProvider = ResponseJsonObject.getString("serviceProvider");
//		String generationCode = ResponseJsonObject.getString("generationCode");
//		String paymentCategory = ResponseJsonObject.getString("paymentCategory");
//		String subscriberType = ResponseJsonObject.getString("subscriberType");
//		String subscriberStatus = ResponseJsonObject.getString("subscriberStatus");
//		String ivrLang = ResponseJsonObject.getString("ivrLang");
//		String lastMsisdnUpdateDt = ResponseJsonObject.getString("lastMsisdnUpdateDt");
//		String initActiveDt = ResponseJsonObject.getString("initActiveDt");	
//		String updateDt = ResponseJsonObject.getString("updateDt");
//		String lastSubStDt = ResponseJsonObject.getString("lastSubStDt");
//		String lastSubStActivity = ResponseJsonObject.getString("lastSubStActivity");
//		String subStReason = ResponseJsonObject.getString("subStReason");
//		String subStReasonDesr = ResponseJsonObject.getString("subStReasonDesr");
			
		
		
		IVariableField returnCode_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_RETURN_CODE);

		returnCode_varible.setValue(returnCode);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "returnCode Response:" + returnCode);

		
		
		IVariableField accountId_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_ACCOUNT_ID);

		accountId_varible.setValue(accountId);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "## Getcache_output_accountId Response:" + accountId);
		
		
		IVariableField customerId_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_CUSTOMER_ID);

		customerId_varible.setValue(customerId);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "## Getcache_output_customerId Response:" + customerId);
		
		
		
		IVariableField legacyCode_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_LEGACY_CODE);

		legacyCode_varible.setValue(legacyCode);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "legacyCode Response:" + legacyCode);


		IVariableField returnMesg_varible = mySession.getVariableField(
						IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
						IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_RETURN_MESG);

		returnMesg_varible.setValue(returnMesg);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"returnMesg Response:" + returnMesg);

		

		IVariableField processID_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_PROCESS_ID);

		processID_varible.setValue(processID);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "processID Response:" + processID);
		
		
		
		IVariableField processName_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_PROCESS_NAME);

		processName_varible.setValue(processName);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "processName Response:" + processName);
		

		
		IVariableField subscriberId_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SUBSCRIBER_ID);

		subscriberId_varible.setValue(subscriberId);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "## subscriberId Response:" + subscriberId);

		
		
		
		IVariableField contractComponentId_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_CONTRACT_COMPONENT_ID);

		contractComponentId_varible.setValue(contractComponentId);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "contractComponentId Response:" + contractComponentId);

		
		
		IVariableField paymentCategory_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_PAYMENT_CATEGORY);

		paymentCategory_varible.setValue(paymentCategory);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "paymentCategory Response:" + paymentCategory);
		
		
		
		IVariableField generationCode_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_GENERATION_CODE);

		generationCode_varible.setValue(generationCode);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "generationCode Response:" + generationCode);
		
		
		IVariableField serviceProvider_varible = mySession.getVariableField(
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SERVICE_PROVIDER);

		serviceProvider_varible.setValue(serviceProvider);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "serviceProvider Response:" + serviceProvider);
		
		
//		IVariableField dataSource_varible = mySession.getVariableField(
//		IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//		IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_DATA_SOURCE);
//
//dataSource_varible.setValue(dataSource);
//
//mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "dataSource Response:" + dataSource);
		
		
		
//		IVariableField msisdn_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_MSISDN);
//
//		msisdn_varible.setValue(msisdn);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "msisdn Response:" + msisdn);
//
//		
//		
//		IVariableField partyId_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_PARTY_ID);
//
//		partyId_varible.setValue(partyId);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "partyId Response:" + partyId);
//
//		
//		
//		IVariableField accountId_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_ACCOUNT_ID);
//
//		accountId_varible.setValue(accountId);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "accountId Response:" + accountId);
//
//		
//		
//		IVariableField contractId_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_CONTRACT_ID);
//
//		contractId_varible.setValue(contractId);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "contractId Response:" + contractId);
//
//		
//		
//		IVariableField accountContractComponentId_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_ACCOUNT_CONTRACT_COMPONENT_ID);
//
//		accountContractComponentId_varible.setValue(accountContractComponentId);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "accountContractComponentId Response:" + accountContractComponentId);
//
//		
//		
//		IVariableField accountPartyId_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_ACCOUNT_PARTY_ID);
//
//		accountPartyId_varible.setValue(accountPartyId);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "accountPartyId Response:" + accountPartyId);
//
//		
//		
//		IVariableField adminFldNmTpCd_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_ADMIN_FLD_NM_TP_CD);
//
//		adminFldNmTpCd_varible.setValue(adminFldNmTpCd);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "adminFldNmTpCd Response:" + adminFldNmTpCd);
//
//		
//		
//		IVariableField serviceProvider_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SERVICE_PROVIDER);
//
//		serviceProvider_varible.setValue(serviceProvider);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "serviceProvider Response:" + serviceProvider);
//
//		
//		
//		IVariableField generationCode_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_GENERATION_CODE);
//
//		generationCode_varible.setValue(generationCode);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "generationCode Response:" + generationCode);
//
//		
//		IVariableField paymentCategory_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_PAYMENT_CATEGORY);
//
//		paymentCategory_varible.setValue(paymentCategory);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "paymentCategory Response:" + paymentCategory);
//
//		
//		IVariableField subscriberType_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SUBSCRIBER_TYPE);
//
//		subscriberType_varible.setValue(subscriberType);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "subscriberType Response:" + subscriberType);
//		
//		
//		IVariableField subscriberStatus_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SUBSCRIBER_STATUS);
//
//		subscriberStatus_varible.setValue(subscriberStatus);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "subscriberStatus Response:" + subscriberStatus);
//		
//		
//		IVariableField ivrLang_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_IVR_LANG);
//
//		ivrLang_varible.setValue(ivrLang);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "ivrLang Response:" + ivrLang);
//		
//		
//		IVariableField lastMsisdnUpdateDt_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_LAST_MSISDN_UPDATE_DT);
//
//		lastMsisdnUpdateDt_varible.setValue(lastMsisdnUpdateDt);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "lastMsisdnUpdateDt Response:" + lastMsisdnUpdateDt);
//		
//		
//		IVariableField initActiveDt_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_INIT_ACTIVE_DT);
//
//		initActiveDt_varible.setValue(initActiveDt);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "initActiveDt Response:" + initActiveDt);
//		
//		
//		
//		IVariableField updateDt_varible = mySession.getVariableField(
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
//				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_UPDATE_DT);
//
//		updateDt_varible.setValue(updateDt);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "updateDt Response:" + updateDt);
		
	
	}
			
}
