package com.infotrends.DBfunction;

import org.json.JSONObject;

import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class ResolveDB_Update_API {

	
public Object ContainKeyAndGetString(JSONObject responseJsonObject, String key){
	
		
		if(responseJsonObject.has(key)){
			
			return responseJsonObject.getInt("count");
		}else{
			return null;
		}
		
	} 


public void AIR_MENU_MASTER(SCESession mySession,JSONObject ResponseJsonObject) {

	Object data = this.ContainKeyAndGetString(ResponseJsonObject,"count");
	
	IVariableField data_varible = mySession.getVariableField(
					IProjectVariables.AIR__MENU__MASTER,
					IProjectVariables.AIR__MENU__MASTER_FIELD_COUNT);
	
	data_varible.setValue(data);
	
	mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "count Response:" +data);
	
	}


public void AIR_MENU_DETAIL(SCESession mySession,JSONObject ResponseJsonObject) {

	Object data = this.ContainKeyAndGetString(ResponseJsonObject,"count");
	
	IVariableField data_varible = mySession.getVariableField(
					IProjectVariables.AIR__MENU__DETAIL,
					IProjectVariables.AIR__MENU__DETAIL_FIELD_COUNT);
	
	data_varible.setValue(data);
	
	mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "count Response:" +data);
	
	}


public void FE_API_LOG_TBL(SCESession mySession,JSONObject ResponseJsonObject) {

	Object data = this.ContainKeyAndGetString(ResponseJsonObject,"count");
	
	IVariableField data_varible = mySession.getVariableField(
					IProjectVariables.FE__API__LOG__TBL,
					IProjectVariables.FE__API__LOG__TBL_FIELD_COUNT);
	
	data_varible.setValue(data);
	
	mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "count Response:" +data);
	
	}


}
