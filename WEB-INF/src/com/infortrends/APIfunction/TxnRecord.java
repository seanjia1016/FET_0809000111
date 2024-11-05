package com.infortrends.APIfunction;

import org.json.JSONObject;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class TxnRecord {

	public String ContainKeyAndGetJSON(JSONObject jsonObject, String key) {
		// check key
		if (jsonObject.has(key)) {
			Object val = jsonObject.get(key);
			// check json type

			if (val instanceof Integer) {
				return String.valueOf(val);
			} else {
				return val.toString();
			}
		}
		return null;
	}

	public JSONObject ContainKeyAndGetObject(JSONObject jsonObject, String key) {

		if (jsonObject.has(key)) {

			Object val = jsonObject.get(key);
			if (val instanceof JSONObject) {
				return jsonObject.getJSONObject(key);
			} else {

				return jsonObject;
			}
		}
		return jsonObject;
	}

	public void function(SCESession mySession, JSONObject ResponseJsonObject) {

		String Exception = null;

		IVariable variable = mySession.getVariable(IProjectVariables.PROPERTIES);
		IComplexVariable complexVariable = variable.getComplexVariable();
		
		String testMode = complexVariable.getField(
				IProjectVariables.PROPERTIES_FIELD_TEST__MODE).getStringValue();
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"CIE_TX_Record_Output ResponseJsonObject Response:" + ResponseJsonObject);
		
		
			if (ResponseJsonObject instanceof JSONObject) {
				if (ResponseJsonObject.has("Exception")) {

					Exception = this.ContainKeyAndGetJSON(ResponseJsonObject,"Exception");

				}
				if (!ResponseJsonObject.has("Data")) {

					mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"CIE_TX_Record_Output Exception Response:" + Exception);
					IVariableField Exception_varible = mySession.getVariableField(
									IProjectVariables.CREATE_TXN_RECORD__OUTPUT,
									IProjectVariables.CREATE_TXN_RECORD__OUTPUT_FIELD_EXCEPTION);
					Exception_varible.setValue(Exception);

				} else {
					JSONObject data = this.ContainKeyAndGetObject(ResponseJsonObject, "Data");
					JSONObject fragment = this.ContainKeyAndGetObject(data,"xml-fragment");
					
					
//					if (fragment.has("ns0:txnId")) {
//						String txnId = this.ContainKeyAndGetJSON(fragment, "ns0:txnId");
//						IVariableField returnCode_varible = mySession
//								.getVariableField(
//										IProjectVariables.CREATE_TXN__OUTPUT,
//										IProjectVariables.CREATE_TXN__OUTPUT_FIELD_TXN_ID);
//						returnCode_varible.setValue(txnId);
//						mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,
//								"txnId Response:" + txnId);
//						
//					}
					
					if (fragment.has("ns0:returnHeader")) {
						JSONObject returnHeader = this.ContainKeyAndGetObject(fragment, "ns0:returnHeader");
						this.assignJsonval(mySession, returnHeader);
					} else {

					}

				}
			}

	}

	public void assignJsonval(SCESession mySession, JSONObject returnHeaderval) {

		JSONObject returnCode = this.ContainKeyAndGetObject(returnHeaderval,"ns1:returnCode");
		String returnCodeval = this.ContainKeyAndGetJSON(returnCode, "content");
		
		IVariableField returnCode_varible = mySession.getVariableField(
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT,
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT_FIELD_RETURN_CODE);
		returnCode_varible.setValue(returnCodeval);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"CIE_TX_Record_Output returnCodeval Response:" + returnCodeval);

		JSONObject legacyCode = this.ContainKeyAndGetObject(returnHeaderval,"ns1:legacyCode");
		String legacyCodeval = this.ContainKeyAndGetJSON(legacyCode, "content");

		IVariableField legacyCode_varible = mySession.getVariableField(
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT,
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT_FIELD_LEGACY_CODE);
		legacyCode_varible.setValue(legacyCodeval);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"CIE_TX_Record_Output legacyCodeval Response:" + legacyCodeval);

		JSONObject processID = this.ContainKeyAndGetObject(returnHeaderval,"ns1:processID");
		String processIDval = this.ContainKeyAndGetJSON(processID,"ns1:processID");
		
		IVariableField processID_varible = mySession.getVariableField(
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT,
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT_FIELD_PROCESS_ID);
		processID_varible.setValue(processIDval);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"CIE_TX_Record_Output processIDval Response:" + processIDval);

		JSONObject processName = this.ContainKeyAndGetObject(returnHeaderval,"ns1:processName");
		String processNameval = this.ContainKeyAndGetJSON(processName,"ns1:processName");
		
		IVariableField processName_varible = mySession.getVariableField(
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT,
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT_FIELD_PROCESS_NAME);
		processName_varible.setValue(processNameval);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"CIE_TX_Record_Output processNameval Response:" + processNameval);

		JSONObject returnMesg = this.ContainKeyAndGetObject(returnHeaderval,"ns1:returnMesg");
		String returnMesgval = this.ContainKeyAndGetJSON(returnMesg,"ns1:returnMesg");
		
		IVariableField returnMesg_varible = mySession.getVariableField(
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT,
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT_FIELD_RETURN_MESG);
		returnMesg_varible.setValue(returnMesgval);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"CIE_TX_Record_Output returnMesgval Response:" + returnMesgval);

	}


}
