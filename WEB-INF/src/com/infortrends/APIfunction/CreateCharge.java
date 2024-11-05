package com.infortrends.APIfunction;

import org.json.JSONObject;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class CreateCharge {

	public String ContainKeyAndGetString(JSONObject jsonObject, String key) {
		if (jsonObject.has(key)) {
			return jsonObject.getString(key);
		}
		return null;
	}

	
	public void AssignODvariable(SCESession mySession, JSONObject ResponseJsonObject) {

		
		String returnCode = ContainKeyAndGetString(ResponseJsonObject,"returnCode");
		String returnMesg = ContainKeyAndGetString(ResponseJsonObject,"returnMesg");
		String legacyCode = ContainKeyAndGetString(ResponseJsonObject,"legacyCode");
		String processID = ContainKeyAndGetString(ResponseJsonObject,"processID");
		String processName = ContainKeyAndGetString(ResponseJsonObject,"processName");
		String status = ContainKeyAndGetString(ResponseJsonObject,"status");
		
		
		IVariableField returnCode_varible = mySession.getVariableField(
				IProjectVariables.CREATE_CHARGE__OUTPUT,
				IProjectVariables.CREATE_CHARGE__OUTPUT_FIELD_RETURN_CODE);

		returnCode_varible.setValue(returnCode);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "createCharge_returnCode Response:" + returnCode);

		
		
		IVariableField status_varible = mySession.getVariableField(
				IProjectVariables.CREATE_CHARGE__OUTPUT,
				IProjectVariables.CREATE_CHARGE__OUTPUT_FIELD_STATUS);

		status_varible.setValue(status);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "createCharge_status Response:" + status);
		
	
		
		IVariableField legacyCode_varible = mySession.getVariableField(
				IProjectVariables.CREATE_CHARGE__OUTPUT,
				IProjectVariables.CREATE_CHARGE__OUTPUT_FIELD_LEGACY_CODE);

		legacyCode_varible.setValue(legacyCode);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "createCharge_legacyCode Response:" + legacyCode);


		IVariableField returnMesg_varible = mySession.getVariableField(
						IProjectVariables.CREATE_CHARGE__OUTPUT,
						IProjectVariables.CREATE_CHARGE__OUTPUT_FIELD_RETURN_MESG);

		returnMesg_varible.setValue(returnMesg);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO,"createCharge_returnMesg Response:" + returnMesg);

		

		IVariableField processID_varible = mySession.getVariableField(
				IProjectVariables.CREATE_CHARGE__OUTPUT,
				IProjectVariables.CREATE_CHARGE__OUTPUT_FIELD_PROCESS_ID);

		processID_varible.setValue(processID);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "createCharge_processID Response:" + processID);
		
		
		
		IVariableField processName_varible = mySession.getVariableField(
				IProjectVariables.CREATE_CHARGE__OUTPUT,
				IProjectVariables.CREATE_CHARGE__OUTPUT_FIELD_PROCESS_NAME);

		processName_varible.setValue(processName);

		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "createCharge_processName Response:" + processName);

		
//		IVariableField reserved1_varible = mySession.getVariableField(
//				IProjectVariables.CREATE_CHARGE__OUTPUT,
//				IProjectVariables.CREATE_CHARGE__OUTPUT_FIELD_RESERVED_1);
//
//		reserved1_varible.setValue(reserved1);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "reserved1 Response:" + reserved1);

		
	
//		IVariableField reserved2_varible = mySession.getVariableField(
//				IProjectVariables.CREATE_CHARGE__OUTPUT,
//				IProjectVariables.CREATE_CHARGE__OUTPUT_FIELD_RESERVED_2);
//
//		reserved2_varible.setValue(reserved2);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "reserved2 Response:" + reserved2);
		
		
		
//		IVariableField reserved3_varible = mySession.getVariableField(
//				IProjectVariables.CREATE_CHARGE__OUTPUT,
//				IProjectVariables.CREATE_CHARGE__OUTPUT_FIELD_RESERVED_3);
//
//		reserved3_varible.setValue(reserved3);
//
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "reserved3 Response:" + reserved3);
		
	}
			
}
