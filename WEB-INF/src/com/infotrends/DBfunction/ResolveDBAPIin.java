package com.infotrends.DBfunction;

import org.json.JSONObject;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class ResolveDBAPIin {
	
	
	public Object ContainKeyAndGetString(JSONObject responseJsonObject, String key){
	
		
		if(responseJsonObject.has(key)){
			return responseJsonObject.getInt("count");
		}else{
			return null;
		}
		
	} 
	
	
	public void IVR_DONATE_TRAN(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String IVR_DONATE_TRAN = "IVR_DONATE_TRAN";
		
		Object data = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField data_varible = mySession.getVariableField(
						IProjectVariables.IVR__DONATE__TRAN,
						IProjectVariables.IVR__DONATE__TRAN_FIELD_COUNT);
		data_varible.setValue(data);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "count Response(TID:["+TID+"]"+IVR_DONATE_TRAN+"):" +data);
		
		
	}
	
	
	public void IVR_591939_DONATE_TRAN(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String IVR_591939_DONATE_TRAN = "IVR_591939_DONATE_TRAN";
		
		Object data = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField data_varible = mySession.getVariableField(
						IProjectVariables.IVR__DONATE__TRAN,
						IProjectVariables.IVR__DONATE__TRAN_FIELD_COUNT);
		data_varible.setValue(data);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "count Response(TID:["+TID+"]"+IVR_591939_DONATE_TRAN+"):" +data);
		
		
	}
	
	
	public void AIR_55135_MENU_TBL(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		String AIR_55135_MENU_TBL = "AIR_55135_MENU_TBL";
		
		Object count = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.AIR___5_5_1_3_5__MENU__TBL,
						IProjectVariables.AIR___5_5_1_3_5__MENU__TBL_FIELD_COUNT);
		count_varible.setValue(count);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "55135_MENU_TBL: count Response(TID:["+TID+"]"+AIR_55135_MENU_TBL+"):" +count);
		
		
	}
	
	
	public void AIR_380_MENU_TBL(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		String AIR_380_MENU_TBL = "AIR_380_MENU_TBL";
		
		Object data = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField data_varible = mySession.getVariableField(
						IProjectVariables.IVR__DONATE__TRAN,
						IProjectVariables.IVR__DONATE__TRAN_FIELD_COUNT);
		data_varible.setValue(data);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "count Response(TID:["+TID+"]"+AIR_380_MENU_TBL+"):" +data);
		
		
	}
	
	public void AIR_591939_MENU_TBL(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		String AIR_591939_MENU_TBL = "AIR_591939_MENU_TBL";
		
		Object count = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.AIR___5_9_1_9_3_9__MENU__TBL,
						IProjectVariables.AIR___5_9_1_9_3_9__MENU__TBL_FIELD_COUNT);
		count_varible.setValue(count);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "591939_MENU_TBL: count Response(TID:["+TID+"]"+AIR_591939_MENU_TBL+"):" +count);
		
		
	}
	
	public void AIR_591980_MENU_TBL(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String AIR_591980_MENU_TBL = "AIR_591980_MENU_TBL";
		
		Object count = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.AIR___5_9_1_9_8_0__MENU__TBL,
						IProjectVariables.AIR___5_9_1_9_8_0__MENU__TBL_FIELD_COUNT);
		count_varible.setValue(count);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "591980_MENU_TBL: count Response(TID:["+TID+"]"+AIR_591980_MENU_TBL+"):" +count);
		
		
	}
	
	public void AIR_591933_MENU_TBL(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		String AIR_591933_MENU_TBL = "AIR_591933_MENU_TBL";
		
		Object count = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.AIR___5_9_1_9_3_3__MENU__TBL,
						IProjectVariables.AIR___5_9_1_9_3_3__MENU__TBL_FIELD_COUNT);
		count_varible.setValue(count);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "591933_MENU_TBL: count Response(TID:["+TID+"]"+AIR_591933_MENU_TBL+"):" +count);
		
		
	}

	
	public void AIR_MENU_MASTER(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String AIR_MENU_MASTER = "AIR_MENU_MASTER";
		
		Object count = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.AIR__MENU__MASTER,
						IProjectVariables.AIR__MENU__MASTER_FIELD_COUNT);
		count_varible.setValue(count);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "MENU_MASTER: count Response(TID:["+TID+"]"+AIR_MENU_MASTER+"):" +count);
	}
	
	
	public void AIR_MENU_DETAIL(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String AIR_MENU_DETAIL = "AIR_MENU_DETAIL";
		
		Object count = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.AIR__MENU__DETAIL,
						IProjectVariables.AIR__MENU__DETAIL_FIELD_COUNT);
		count_varible.setValue(count);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "count Response(TID:["+TID+"]"+AIR_MENU_DETAIL+"):" + count);
	}
	
	
	public void TASK_380_TBL(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String TASK_380_TBL = "TASK_380_TBL";
		
		Object count = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.TASK___3_8_0__TBL,
						IProjectVariables.TASK___3_8_0__TBL_FIELD_COUNT);
		count_varible.setValue(count);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "task380_output: count Response(TID:["+TID+"]"+TASK_380_TBL+"):" + count);
	}
	
	public void AIR_591993_MENU_TBL(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String AIR_591993_MENU_TBL = "AIR_591993_MENU_TBL";
		
		Object count = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.AIR___5_9_1_9_9_3__MENU__TBL,
						IProjectVariables.AIR___5_9_1_9_9_3__MENU__TBL_FIELD_COUNT);
		count_varible.setValue(count);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "AIR_591993_MENU_TBL_output: count Response(TID:["+TID+"]"+AIR_591993_MENU_TBL+"):" + count);
	}

	public void IVR_5919_DONATE_TRAN(SCESession mySession, JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String IVR_5919_DONATE_TRAN = "IVR_5919_DONATE_TRAN";
		
		Object count = this.ContainKeyAndGetString(ResponseJsonObject, "count");	
		
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.IVR___5_9_1_9__DONATE__TRAN,
						IProjectVariables.IVR___5_9_1_9__DONATE__TRAN_FIELD_COUNT);
		count_varible.setValue(count);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "IVR_5919_DONATE_TRAN_output: count Response(TID:["+TID+"]"+IVR_5919_DONATE_TRAN+"):" + count);
	}

	
}
