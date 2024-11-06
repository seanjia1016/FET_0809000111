package com.infotrends.DBfunction;

import org.json.JSONObject;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class ResolveDBAPI {
	
	
	public Object ContainKeyAndGetObject(JSONObject jsonObject, String key){

		String toLowercaseKey = key.toLowerCase();
		if(jsonObject.has(toLowercaseKey)){
			
			Object val = jsonObject.get(toLowercaseKey);
			
			if(val instanceof Integer){
				return String.valueOf(val);
			}else{
				return  val.toString();
			}
			
		}
		return null;		
	
	}

	
	public void IVR_OPERATION_CTRL(SCESession mySession,JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String IVR_OPERATION_CTRL="IVR_OPERATION_CTRL";
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "@@SystemCheck ResponseJsonObject Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +ResponseJsonObject);

		
		JSONObject jsonObject = ResponseJsonObject.getJSONArray("data").getJSONObject(0);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "@@operationCtrl jsonObject Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +jsonObject);
		
		
		String  OPERATION_CTRL_NO = (String) this.ContainKeyAndGetObject(jsonObject, "OPERATION_CTRL_NO");
		IVariableField OPERATION_CTRL_NO_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_OPERATION__CTRL__NO);
		OPERATION_CTRL_NO_varible.setValue(OPERATION_CTRL_NO);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "OPERATION_CTRL_NO Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +OPERATION_CTRL_NO);
		
		
		String  OPERATION_CTRL_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "OPERATION_CTRL_TYPE");
		IVariableField OPERATION_CTRL_TYPE_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_OPERATION__CTRL__TYPE);
		OPERATION_CTRL_TYPE_varible.setValue(OPERATION_CTRL_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "OPERATION_CTRL_TYPE Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +OPERATION_CTRL_TYPE);
		
		
		String  OPERATION_CTRL_NAME = (String) this.ContainKeyAndGetObject(jsonObject, "OPERATION_CTRL_NAME");
		IVariableField OPERATION_CTRL_NAME_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_OPERATION__CTRL__NAME);
		OPERATION_CTRL_NAME_varible.setValue(OPERATION_CTRL_NAME);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "OPERATION_CTRL_NAME Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +OPERATION_CTRL_NAME);
		
		
		String  OPERATION_CTRL_FLAG = (String) this.ContainKeyAndGetObject(jsonObject, "OPERATION_CTRL_FLAG");
		IVariableField OPERATION_CTRL_FLAG_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_OPERATION__CTRL__FLAG);
		OPERATION_CTRL_FLAG_varible.setValue(OPERATION_CTRL_FLAG);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "OPERATION_CTRL_FLAG Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +OPERATION_CTRL_FLAG);
		
		
		String  CTRL_START_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "CTRL_START_DATE");
		IVariableField CTRL_START_DATE_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_CTRL__START__DATE);
		CTRL_START_DATE_varible.setValue(CTRL_START_DATE);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CTRL_START_DATE Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +CTRL_START_DATE);
		
		
		String  CTRL_START_TIME = (String) this.ContainKeyAndGetObject(jsonObject, "CTRL_START_TIME");
		IVariableField CTRL_START_TIME_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_CTRL__START__TIME);
		CTRL_START_TIME_varible.setValue(CTRL_START_TIME);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CTRL_START_TIME Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +CTRL_START_TIME);
		
		
		String  CTRL_FINISH_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "CTRL_FINISH_DATE");
		IVariableField CTRL_FINISH_DATE_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_CTRL__FINISH__DATE);
		CTRL_FINISH_DATE_varible.setValue(CTRL_FINISH_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CTRL_FINISH_DATE Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +CTRL_FINISH_DATE);
		
		
		String  CTRL_FINISH_TIME = (String) this.ContainKeyAndGetObject(jsonObject, "CTRL_FINISH_TIME");
		IVariableField CTRL_FINISH_TIME_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_CTRL__FINISH__TIME);
		CTRL_FINISH_TIME_varible.setValue(CTRL_FINISH_TIME);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CTRL_FINISH_TIME Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +CTRL_FINISH_TIME);
		
		
		String  VOCAL_NUM = (String) this.ContainKeyAndGetObject(jsonObject, "VOCAL_NUM");
		IVariableField VOCAL_NUM_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_VOCAL__NUM);
		VOCAL_NUM_varible.setValue(VOCAL_NUM);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "VOCAL_NUM Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +VOCAL_NUM);
		
		
		String  CTRL_MODIFY_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "CTRL_MODIFY_DATE");
		IVariableField CTRL_MODIFY_DATE_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_CTRL__MODIFY__DATE);
		CTRL_MODIFY_DATE_varible.setValue(CTRL_MODIFY_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CTRL_MODIFY_DATE Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +CTRL_MODIFY_DATE);
		
		
		String COUNT = (String) this.ContainKeyAndGetObject(ResponseJsonObject, "count");
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_COUNT);
		count_varible.setValue(COUNT);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "@@COUNT Response(TID:["+TID+"]"+IVR_OPERATION_CTRL+"):" +COUNT);	
			
		
		
	}


	public void  FE_MSIS_CB2_TBL(com.avaya.sce.runtimecommon.SCESession mySession,JSONObject ResponseJsonObject){
		
		
		
		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		String FE_MSIS_CB2_TBL="FE_MSIS_CB2_TBL";
		
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "MSIS_CB2 ResponseJsonObject Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +ResponseJsonObject);
		
		JSONObject jsonObject = ResponseJsonObject.getJSONArray("data").getJSONObject(0);	

		
		String responseCode = ResponseJsonObject.get("responseCode").toString();
		IVariableField RESPONSE_CODE_varible = mySession.getVariableField(
				IProjectVariables.FE__MSIS__CB_2__TBL,
				IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_RESPONSE_CODE);
		RESPONSE_CODE_varible.setValue(responseCode);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "### MSIS_CB2 responseCode Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +responseCode);

		
		String CREATED__DATE = (String) this.ContainKeyAndGetObject(jsonObject, "CREATED__DATE");
		IVariableField CREATED__DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_CREATED__DATE);
		CREATED__DATE_varible.setValue(CREATED__DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CREATED__DATE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +CREATED__DATE);

		
		String FE_MSIS_TELE_NUMB = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_TELE_NUMB");
		IVariableField FE_MSIS_TELE_NUMB_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__TELE__NUMB);
		FE_MSIS_TELE_NUMB_varible.setValue(FE_MSIS_TELE_NUMB);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_TELE_NUMB Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_TELE_NUMB);
		
		
		String FE_MSIS_BT_CUST_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_BT_CUST_ID");
		IVariableField FE_MSIS_BT_CUST_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__BT__CUST__ID);
		FE_MSIS_BT_CUST_ID_varible.setValue(FE_MSIS_BT_CUST_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_BT_CUST_ID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_BT_CUST_ID);
		
		
		String FE_MSIS_PROMO_CODE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_PROMO_CODE");
		IVariableField FE_MSIS_PROMO_CODE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__PROMO__CODE);
		FE_MSIS_PROMO_CODE_varible.setValue(FE_MSIS_PROMO_CODE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_PROMO_CODE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_PROMO_CODE);
		
		
		String FE_MSIS_ACT_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_ACT_DATE");
		IVariableField FE_MSIS_ACT_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__PROMO__CODE);
		FE_MSIS_ACT_DATE_varible.setValue(FE_MSIS_ACT_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_ACT_DATE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_ACT_DATE);
	
		String FE_R4ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_R4ID");
		IVariableField FE_R4ID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__R_4ID);
		FE_R4ID_varible.setValue(FE_R4ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_R4ID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_R4ID);
		
		
		String FE_MSIS_BILL_PLAN = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_BILL_PLAN");
		IVariableField FE_MSIS_BILL_PLAN_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__BILL__PLAN);
		FE_MSIS_BILL_PLAN_varible.setValue(FE_MSIS_BILL_PLAN);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_BILL_PLAN Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_BILL_PLAN);
		
		
		String FE_MSIS_STATUS = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_STATUS");
		IVariableField FE_MSIS_STATUS_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__STATUS);
		FE_MSIS_STATUS_varible.setValue(FE_MSIS_STATUS);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_STATUS Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_STATUS);
		
		
		String FE_MSIS_REASON_CODE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_REASON_CODE");
		IVariableField FE_MSIS_REASON_CODE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__REASON__CODE);
		FE_MSIS_REASON_CODE_varible.setValue(FE_MSIS_REASON_CODE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_REASON_CODE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_REASON_CODE);
		
		
		String FE_MSIS_HOLDING_CUST_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_HOLDING_CUST_ID");
		IVariableField FE_MSIS_HOLDING_CUST_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__HOLDING__CUST__ID);
		FE_MSIS_HOLDING_CUST_ID_varible.setValue(FE_MSIS_HOLDING_CUST_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_HOLDING_CUST_ID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_HOLDING_CUST_ID);
		
		
		String FE_MSIS_PUK1 = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_PUK1");
		IVariableField FE_MSIS_PUK1_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__PUK_1);
		FE_MSIS_PUK1_varible.setValue(FE_MSIS_PUK1);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_PUK1 Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_PUK1);
		
		
		String FE_MSIS_PUK2 = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_PUK2");
		IVariableField FE_MSIS_PUK2_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__PUK_2);
		FE_MSIS_PUK1_varible.setValue(FE_MSIS_PUK2);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_PUK2 Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_PUK2);
	
		String FE_MSIS_SIM_NO = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_SIM_NO");
		IVariableField FE_MSIS_SIM_NO_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__SIM__NO);
		FE_MSIS_SIM_NO_varible.setValue(FE_MSIS_SIM_NO);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_SIM_NO Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_SIM_NO);
		
		String FE_MSIS_START_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_START_DATE");
		IVariableField FE_MSIS_START_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__START__DATE);
		FE_MSIS_START_DATE_varible.setValue(FE_MSIS_START_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_START_DATE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_START_DATE);
		
		
		String FE_MSIS_PLAN_SDATE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_PLAN_SDATE");
		IVariableField FE_MSIS_PLAN_SDATE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__PLAN__SDATE);
		FE_MSIS_PLAN_SDATE_varible.setValue(FE_MSIS_PLAN_SDATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_PLAN_SDATE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_PLAN_SDATE);
		
		
		String FE_MSIS_END_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_END_DATE");
		IVariableField FE_MSIS_END_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__END__DATE);
		FE_MSIS_END_DATE_varible.setValue(FE_MSIS_END_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_END_DATE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_END_DATE);
		
		
		String FE_MSIS_CB_CUSTOMER_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_CUSTOMER_ID");
		IVariableField FE_MSIS_CB_CUSTOMER_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__CUSTOMER__ID);
		FE_MSIS_CB_CUSTOMER_ID_varible.setValue(FE_MSIS_CB_CUSTOMER_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_CUSTOMER_ID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_CUSTOMER_ID);
		
		
		String FE_MSIS_CB_PAY_CHANNEL_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_PAY_CHANNEL_ID");
		IVariableField FE_MSIS_CB_PAY_CHANNEL_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__PAY__CHANNEL__ID);
		FE_MSIS_CB_PAY_CHANNEL_ID_varible.setValue(FE_MSIS_CB_PAY_CHANNEL_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_PAY_CHANNEL_ID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_PAY_CHANNEL_ID);
		
		
		String FE_MSIS_CB_PAY_CHANNEL_DESC = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_PAY_CHANNEL_DESC");
		IVariableField FE_MSIS_CB_PAY_CHANNEL_DESC_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__PAY__CHANNEL__DESC);
		FE_MSIS_CB_PAY_CHANNEL_DESC_varible.setValue(FE_MSIS_CB_PAY_CHANNEL_DESC);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_PAY_CHANNEL_DESC Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_PAY_CHANNEL_DESC);
		
		
		String FE_MSIS_CB_BA_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_BA_ID");
		IVariableField FE_MSIS_CB_BA_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__BA__ID);
		FE_MSIS_CB_BA_ID_varible.setValue(FE_MSIS_CB_BA_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_BA_ID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_BA_ID);
		
		
		String FE_MSIS_CB_ACCOUNT_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_ACCOUNT_ID");
		IVariableField FE_MSIS_CB_ACCOUNT_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__ACCOUNT__ID);
		FE_MSIS_CB_ACCOUNT_ID_varible.setValue(FE_MSIS_CB_ACCOUNT_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_ACCOUNT_ID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_ACCOUNT_ID);
		
		
		String FE_MSIS_CB_CON_EXPIRE_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_CON_EXPIRE_DATE");
		IVariableField FE_MSIS_CB_CON_EXPIRE_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__CON__EXPIRE__DATE);
		FE_MSIS_CB_CON_EXPIRE_DATE_varible.setValue(FE_MSIS_CB_CON_EXPIRE_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_CON_EXPIRE_DATE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_CON_EXPIRE_DATE);
		
		
		String FE_MSIS_CB_SUBSCRIBER_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_SUBSCRIBER_ID");
		IVariableField FE_MSIS_CB_SUBSCRIBER_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__SUBSCRIBER__ID);
		FE_MSIS_CB_SUBSCRIBER_ID_varible.setValue(FE_MSIS_CB_SUBSCRIBER_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_SUBSCRIBER_ID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_SUBSCRIBER_ID);
		
		
		String FE_MSIS_CB_CUSTOMER_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_CUSTOMER_TYPE");
		IVariableField FE_MSIS_CB_CUSTOMER_TYPE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__CUSTOMER__TYPE);
		FE_MSIS_CB_CUSTOMER_TYPE_varible.setValue(FE_MSIS_CB_CUSTOMER_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_CUSTOMER_TYPE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_CUSTOMER_TYPE);
		
		
		String FE_MSIS_CB_LANGUAGE_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_LANGUAGE_ID");
		IVariableField FE_MSIS_CB_LANGUAGE_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__LANGUAGE__ID);
		FE_MSIS_CB_LANGUAGE_ID_varible.setValue(FE_MSIS_CB_LANGUAGE_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_LANGUAGE_ID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_LANGUAGE_ID);
		
		
		String FE_MSIS_CB_BUSINESS_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_BUSINESS_TYPE");
		IVariableField FE_MSIS_CB_BUSINESS_TYPE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__BUSINESS__TYPE);
		FE_MSIS_CB_BUSINESS_TYPE_varible.setValue(FE_MSIS_CB_BUSINESS_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_BUSINESS_TYPE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_BUSINESS_TYPE);
		
		
		String FE_MSIS_CB_GPRS_FLAG = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_GPRS_FLAG");
		IVariableField FE_MSIS_CB_GPRS_FLAG_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__GPRS__FLAG);
		FE_MSIS_CB_GPRS_FLAG_varible.setValue(FE_MSIS_CB_GPRS_FLAG);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_GPRS_FLAG Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_GPRS_FLAG);
		
		
		String FE_MSIS_CB_MVPN_FLAG = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_MVPN_FLAG");
		IVariableField FE_MSIS_CB_MVPN_FLAG_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__MVPN__FLAG);
		FE_MSIS_CB_MVPN_FLAG_varible.setValue(FE_MSIS_CB_MVPN_FLAG);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_MVPN_FLAG Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_MVPN_FLAG);
		
		
		String MODIFIED_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "MODIFIED_DATE");
		IVariableField MODIFIED_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_MODIFIED__DATE);
		MODIFIED_DATE_varible.setValue(MODIFIED_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "MODIFIED_DATE Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +MODIFIED_DATE);
		
		
		String FE_MSIS_CB_HYBRID_FLAG = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_HYBRID_FLAG");
		IVariableField FE_MSIS_CB_HYBRID_FLAG_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__HYBRID__FLAG);
		FE_MSIS_CB_HYBRID_FLAG_varible.setValue(FE_MSIS_CB_HYBRID_FLAG);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " FE_MSIS_CB_HYBRID_FLAG Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_HYBRID_FLAG);
	
		
		String FE_MSIS_CB_SUBR_PWD = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_SUBR_PWD");
		IVariableField FE_MSIS_CB_SUBR_PWD_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__SUBR__PWD);
		FE_MSIS_CB_SUBR_PWD_varible.setValue(FE_MSIS_CB_SUBR_PWD);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " FE_MSIS_CB_SUBR_PWD Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_SUBR_PWD);
		
		
		String FE_MSIS_CB_SIMM_FLAG = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_SIMM_FLAG");
		IVariableField FE_MSIS_CB_SIMM_FLAG_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__SIMM__FLAG);
		FE_MSIS_CB_SIMM_FLAG_varible.setValue(FE_MSIS_CB_SIMM_FLAG);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " FE_MSIS_CB_SIMM_FLAG Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_SIMM_FLAG);
		
		
		String FE_MSIS_CB_CORP_FLAG = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_CORP_FLAG");
		IVariableField FE_MSIS_CB_CORP_FLAG_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__CORP__FLAG);
		FE_MSIS_CB_CORP_FLAG_varible.setValue(FE_MSIS_CB_CORP_FLAG);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " FE_MSIS_CB_CORP_FLAG Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_CORP_FLAG);
		
		
		String FE_MSIS_CB_CID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_CID");
		IVariableField FE_MSIS_CB_CID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__CID);
		FE_MSIS_CB_CID_varible.setValue(FE_MSIS_CB_CID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " FE_MSIS_CB_CID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_CID);
		
		
		String FE_MSIS_QOSID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_QOSID");
		IVariableField FE_MSIS_QOSID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__QOSID);
		FE_MSIS_QOSID_varible.setValue(FE_MSIS_QOSID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " FE_MSIS_QOSID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_QOSID);
		
		
		String GRPID = (String) this.ContainKeyAndGetObject(jsonObject, "GRPID");
		IVariableField GRPID_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_GRPID);
		GRPID_varible.setValue(GRPID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " GRPID Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +GRPID);
		
		
		String GRPLD = (String) this.ContainKeyAndGetObject(jsonObject, "GRPLD");
		IVariableField GRPLD_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_GRPLD);
		GRPLD_varible.setValue(GRPLD);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " GRPLD Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +GRPLD);
		
		
		String FE_MSIS_DATA_PLAN = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_DATA_PLAN");
		IVariableField FE_MSIS_DATA_PLAN_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__DATA__PLAN);
		FE_MSIS_DATA_PLAN_varible.setValue(FE_MSIS_DATA_PLAN);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " FE_MSIS_DATA_PLAN Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_DATA_PLAN);
		
		
		String FE_MSIS_COUNT = (String) this.ContainKeyAndGetObject(jsonObject, "count");
		IVariableField COUNT_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_COUNT);
		COUNT_varible.setValue(FE_MSIS_COUNT);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, " FE_MSIS_COUNT Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_COUNT);
		
		
		String FE_MSIS_CB_SERVICE_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MSIS_CB_SERVICE_TYPE");
		IVariableField FE_MSIS_CB_SERVICE_TYPE_varible = mySession.getVariableField(
						IProjectVariables.FE__MSIS__CB_2__TBL,
						IProjectVariables.FE__MSIS__CB_2__TBL_FIELD_FE__MSIS__CB__SERVICE__TYPE);
		FE_MSIS_CB_SERVICE_TYPE_varible.setValue(FE_MSIS_CB_SERVICE_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MSIS_CB_SERVICE_TYPE_varible Response(TID:["+TID+"]"+FE_MSIS_CB2_TBL+"):" +FE_MSIS_CB_SERVICE_TYPE_varible);
		
	}
	
	public void FE_CUST_CB2_TBL(SCESession mySession,JSONObject ResponseJsonObject) {

		
		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		String FE_CUST_CB2_TBL="FE_CUST_CB2_TBL";
		
		
		JSONObject jsonObject = ResponseJsonObject.getJSONArray("data").getJSONObject(0);
		
		String  FE_CUST_CUST_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_CUST_ID");
		IVariableField FE_CUST_CUST_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__CUST__ID);
		FE_CUST_CUST_ID_varible.setValue(FE_CUST_CUST_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_CUST_ID Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_CUST_ID);
		
		
		String  FE_CUST_DEMO_ID_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_DEMO_ID_TYPE");
		IVariableField FE_CUST_DEMO_ID_TYPE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__DEMO__ID__TYPE);
		FE_CUST_DEMO_ID_TYPE_varible.setValue(FE_CUST_DEMO_ID_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_DEMO_ID_TYPE Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_DEMO_ID_TYPE);
		
		
		String  FE_CUST_SSN = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_SSN");
		IVariableField FE_CUST_SSN_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__SSN);
		FE_CUST_SSN_varible.setValue(FE_CUST_SSN);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_SSN Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_SSN);
		
		
		String  FE_CUST_CUST_STATUS = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_CUST_STATUS");
		IVariableField FE_CUST_CUST_STATUS_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__CUST__STATUS);
		FE_CUST_CUST_STATUS_varible.setValue(FE_CUST_CUST_STATUS);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_CUST_STATUS Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_CUST_STATUS);
		
		
		String FE_CUST_INVC_OUT_AMOUNT = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_INVC_OUT_AMOUNT");	
		IVariableField FE_CUST_INVC_OUT_AMOUNT_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__INVC__OUT__AMOUNT);
		FE_CUST_INVC_OUT_AMOUNT_varible.setValue(FE_CUST_INVC_OUT_AMOUNT);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_INVC_OUT_AMOUNT Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_INVC_OUT_AMOUNT);

		
		String  FE_CUST_LAST_BILLED = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_LAST_BILLED");
		IVariableField FE_CUST_LAST_BILLED_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__LAST__BILLED);
		FE_CUST_LAST_BILLED_varible.setValue(FE_CUST_LAST_BILLED);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_LAST_BILLED Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_LAST_BILLED);
		
		
		String  FE_CUST_INVC_PAY_DUE_DAT = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_INVC_PAY_DUE_DAT");
		IVariableField FE_CUST_INVC_PAY_DUE_DAT_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__INVC__PAY__DUE__DAT);
		FE_CUST_INVC_PAY_DUE_DAT_varible.setValue(FE_CUST_INVC_PAY_DUE_DAT);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_INVC_PAY_DUE_DAT Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_INVC_PAY_DUE_DAT);
		
		
		String  FE_CUST_PAY_AMOUNT = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_PAY_AMOUNT");
		IVariableField FE_CUST_PAY_AMOUNT_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__PAY__AMOUNT);
		FE_CUST_PAY_AMOUNT_varible.setValue(FE_CUST_PAY_AMOUNT);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_PAY_AMOUNT Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_PAY_AMOUNT);
	
		
		String  FE_CUST_PAY_MADE_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_PAY_MADE_DATE");
		IVariableField FE_CUST_PAY_MADE_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__PAY__MADE__DATE);
		FE_CUST_PAY_MADE_DATE_varible.setValue(FE_CUST_PAY_MADE_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_PAY_MADE_DATE Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_PAY_MADE_DATE);
		
		
		String  FE_CUST_CURRENT_BALANCE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_CURRENT_BALANCE");
		IVariableField FE_CUST_CURRENT_BALANCE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__CURRENT__BALANCE);
		FE_CUST_CURRENT_BALANCE_varible.setValue(FE_CUST_CURRENT_BALANCE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_CURRENT_BALANCE Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_CURRENT_BALANCE);
		
		
		String  FE_CUST_INVOICE_CHECKSUM = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_INVOICE_CHECKSUM");
		IVariableField FE_CUST_INVOICE_CHECKSUM_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__INVOICE__CHECKSUM);
		FE_CUST_INVOICE_CHECKSUM_varible.setValue(FE_CUST_INVOICE_CHECKSUM);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_INVOICE_CHECKSUM Response:" +FE_CUST_INVOICE_CHECKSUM);
		
		
		String  FE_CUST_SOCIAL_NUM = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_SOCIAL_NUM");
		IVariableField FE_CUST_SOCIAL_NUM_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__SOCIAL__NUM);
		FE_CUST_SOCIAL_NUM_varible.setValue(FE_CUST_SOCIAL_NUM);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_SOCIAL_NUM Response:" +FE_CUST_SOCIAL_NUM);
		
		
		String  FE_CUST_BILL_NAME = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_BILL_NAME");
		IVariableField FE_CUST_BILL_NAME_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__BILL__NAME);
		FE_CUST_BILL_NAME_varible.setValue(FE_CUST_BILL_NAME);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_BILL_NAME Response:" +FE_CUST_BILL_NAME);
		
		
		String  FE_CUST_PAYMENT_RULE_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_PAYMENT_RULE_DATE");
		IVariableField FE_CUST_PAYMENT_RULE_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__PAYMENT__RULE__DATE);
		FE_CUST_PAYMENT_RULE_DATE_varible.setValue(FE_CUST_PAYMENT_RULE_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_PAYMENT_RULE_DATE Response:" +FE_CUST_PAYMENT_RULE_DATE);
		
		
		String  FE_CUST_PAYMENT_RULE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_PAYMENT_RULE");
		IVariableField FE_CUST_PAYMENT_RULE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__PAYMENT__RULE);
		FE_CUST_PAYMENT_RULE_varible.setValue(FE_CUST_PAYMENT_RULE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_PAYMENT_RULE Response:" +FE_CUST_PAYMENT_RULE);
		
		
		String  FE_CUST_LAST_INVOICE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_LAST_INVOICE");
		IVariableField FE_CUST_LAST_INVOICE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__LAST__INVOICE);
		FE_CUST_LAST_INVOICE_varible.setValue(FE_CUST_LAST_INVOICE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_LAST_INVOICE Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_LAST_INVOICE);
		
		
		String  FE_CUST_NEW_PAYMENT = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_NEW_PAYMENT");
		IVariableField FE_CUST_NEW_PAYMENT_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__NEW__PAYMENT);
		FE_CUST_NEW_PAYMENT_varible.setValue(FE_CUST_NEW_PAYMENT);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_NEW_PAYMENT Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_NEW_PAYMENT);
		
		
		String  FE_CUST_ADJUSTMENT = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_ADJUSTMENT");
		IVariableField FE_CUST_ADJUSTMENT_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__ADJUSTMENT);
		FE_CUST_ADJUSTMENT_varible.setValue(FE_CUST_ADJUSTMENT);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_ADJUSTMENT Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_ADJUSTMENT);
		
		
		String  FE_CUST_ACCOUNT_CAG = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_ACCOUNT_CAG");
		IVariableField FE_CUST_ACCOUNT_CAG_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__ACCOUNT__CAG);
		FE_CUST_ACCOUNT_CAG_varible.setValue(FE_CUST_ACCOUNT_CAG);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_ACCOUNT_CAG Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_ACCOUNT_CAG);
		
		
		String  FE_CUST_WRITE_OFF = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_WRITE_OFF");
		IVariableField FE_CUST_WRITE_OFF_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__WRITE__OFF);
		FE_CUST_WRITE_OFF_varible.setValue(FE_CUST_WRITE_OFF);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_WRITE_OFF Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_WRITE_OFF);
		
		
		String  FE_CUST_RC = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_RC");
		IVariableField FE_CUST_RC_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__RC);
		FE_CUST_RC_varible.setValue(FE_CUST_RC);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_RC Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_RC);
		
		
		String  FE_MKTG_MSG_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_MKTG_MSG_ID");
		IVariableField FE_MKTG_MSG_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__MKTG__MSG__ID);
		FE_MKTG_MSG_ID_varible.setValue(FE_MKTG_MSG_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_MKTG_MSG_ID Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_MKTG_MSG_ID);
		
		
		String  FE_ACCOUNT_CB_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_ACCOUNT_CB_ID");
		IVariableField FE_ACCOUNT_CB_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__ACCOUNT__CB__ID);
		FE_ACCOUNT_CB_ID_varible.setValue(FE_ACCOUNT_CB_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_ACCOUNT_CB_ID Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_ACCOUNT_CB_ID);

		
		String  FE_PAY_CHANNEL_CB_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FE_PAY_CHANNEL_CB_ID");
		IVariableField FE_PAY_CHANNEL_CB_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__PAY__CHANNEL__CB__ID);
		FE_PAY_CHANNEL_CB_ID_varible.setValue(FE_PAY_CHANNEL_CB_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_PAY_CHANNEL_CB_ID Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_PAY_CHANNEL_CB_ID);
		
		
		String  FE_CUST_CUSTOMER_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_CUSTOMER_TYPE");
		IVariableField FE_CUST_CUSTOMER_TYPE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__CUSTOMER__TYPE);
		FE_CUST_CUSTOMER_TYPE_varible.setValue(FE_CUST_CUSTOMER_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_CUSTOMER_TYPE Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_CUSTOMER_TYPE);
		
		
		String  FE_CUST_PAY_CHANNEL_DESC = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_PAY_CHANNEL_DESC");
		IVariableField FE_CUST_PAY_CHANNEL_DESC_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__PAY__CHANNEL__DESC);
		FE_CUST_PAY_CHANNEL_DESC_varible.setValue(FE_CUST_PAY_CHANNEL_DESC);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_PAY_CHANNEL_DESC Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_PAY_CHANNEL_DESC);
		
		
		String  MODIFIED_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "MODIFIED_DATE");
		IVariableField MODIFIED_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_MODIFIED__DATE);
		MODIFIED_DATE_varible.setValue(MODIFIED_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "MODIFIED_DATE Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +MODIFIED_DATE);
		
		
		String  CREATED_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "CREATED_DATE");
		IVariableField CREATED_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_CREATED__DATE);
		CREATED_DATE_varible.setValue(CREATED_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CREATED_DATE Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +CREATED_DATE);
		
		
		String  FE_CUST_BILLER_BALANCE = (String) this.ContainKeyAndGetObject(jsonObject, "FE_CUST_BILLER_BALANCE");
		IVariableField FE_CUST_BILLER_BALANCE_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_FE__CUST__BILLER__BALANCE);
		FE_CUST_BILLER_BALANCE_varible.setValue(FE_CUST_BILLER_BALANCE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FE_CUST_BILLER_BALANCE Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +FE_CUST_BILLER_BALANCE);
		
		
		String count_jsonkey = (String) this.ContainKeyAndGetObject(jsonObject, "count");
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.FE__CUST__CB_2__TBL,
						IProjectVariables.FE__CUST__CB_2__TBL_FIELD_COUNT);
		count_varible.setValue(count_jsonkey);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "count_jsonkey Response(TID:["+TID+"]"+FE_CUST_CB2_TBL+"):" +count_jsonkey);
		
	}

	public void FE_NEWCASH_TBL(SCESession mySession,JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String FE_NEWCASH_TBL="FE_NEWCASH_TBL";
		
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "NewCash ResponseJsonObject Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +ResponseJsonObject);
		
		JSONObject jsonObject = ResponseJsonObject.getJSONArray("data").getJSONObject(0);
		
		String  SERV_NBR = (String) this.ContainKeyAndGetObject(jsonObject, "SERV_NBR");
		IVariableField SERV_NBR_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_SERV__NBR);
		SERV_NBR_varible.setValue(SERV_NBR);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SERV_NBR Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +SERV_NBR);
		
		
		String  SERV_STATUS = (String) this.ContainKeyAndGetObject(jsonObject, "SERV_STATUS");
		IVariableField SERV_STATUS_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_SERV__STATUS);
		SERV_STATUS_varible.setValue(SERV_STATUS);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SERV_STATUS Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +SERV_STATUS);
		
		
		String  SUBSCRIBER_NO = (String) this.ContainKeyAndGetObject(jsonObject, "SUBSCRIBER_NO");
		IVariableField SUBSCRIBER_NO_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_SUBSCRIBER__NO);
		SUBSCRIBER_NO_varible.setValue(SUBSCRIBER_NO_varible);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SUBSCRIBER_NO Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +SUBSCRIBER_NO);
		
		
		String  PUK1 = (String) this.ContainKeyAndGetObject(jsonObject, "PUK1");
		IVariableField PUK1_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_PUK_1);
		PUK1_varible.setValue(PUK1);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "PUK1 Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +PUK1);
		
		
		String  PUK2 = (String) this.ContainKeyAndGetObject(jsonObject, "PUK2");
		IVariableField PUK2_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_PUK_2);
		PUK2_varible.setValue(PUK2);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "PUK2 Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +PUK2);

		
		String  ID_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "ID_TYPE");
		IVariableField ID_TYPE_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_ID__TYPE);
		ID_TYPE_varible.setValue(ID_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "ID_TYPE Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +ID_TYPE);
	
		
		String  BIRTHDAY = (String) this.ContainKeyAndGetObject(jsonObject, "BIRTHDAY");
		IVariableField BIRTHDAY_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_BIRTHDAY);
		BIRTHDAY_varible.setValue(BIRTHDAY);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "BIRTHDAY Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +BIRTHDAY);
	
		
		String  LANGUAGE_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "LANGUAGE_TYPE");
		IVariableField LANGUAGE_TYPE_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_LANGUAGE__TYPE);
		LANGUAGE_TYPE_varible.setValue(LANGUAGE_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "LANGUAGE_TYPE Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +LANGUAGE_TYPE);
		
		
		String  SUB_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "SUB_TYPE");
		IVariableField SUB_TYPE_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_SUB__TYPE);
		SUB_TYPE_varible.setValue(SUB_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SUB_TYPE Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +SUB_TYPE);
		
		
		String  HYBRID_EXTERNAL_ID = (String) this.ContainKeyAndGetObject(jsonObject, "HYBRID_EXTERNAL_ID");
		IVariableField HYBRID_EXTERNAL_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_HYBRID__EXTERNAL__ID);
		HYBRID_EXTERNAL_ID_varible.setValue(HYBRID_EXTERNAL_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "HYBRID_EXTERNAL_ID Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +HYBRID_EXTERNAL_ID);
	
		
		String  FLC_OFFER_ID = (String) this.ContainKeyAndGetObject(jsonObject, "FLC_OFFER_ID");
		IVariableField FLC_OFFER_ID_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_FLC__OFFER__ID);
		FLC_OFFER_ID_varible.setValue(FLC_OFFER_ID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "FLC_OFFER_ID Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +FLC_OFFER_ID);
		
		
		String  ACTIVE_DATE = (String) this.ContainKeyAndGetObject(jsonObject, "ACTIVE_DATE");
		IVariableField ACTIVE_DATE_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_ACTIVE__DATE);
		ACTIVE_DATE_varible.setValue(ACTIVE_DATE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "ACTIVE_DATE Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +ACTIVE_DATE);
		
		
		String  MDMID = (String) this.ContainKeyAndGetObject(jsonObject, "MDMID");
		IVariableField MDMID_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_MDMID);
		MDMID_varible.setValue(MDMID);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "MDMID Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +MDMID);
	
		
		String  PAYMENT_TYPE = (String) this.ContainKeyAndGetObject(jsonObject, "PAYMENT_TYPE");
		IVariableField PAYMENT_TYPE_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_PAYMENT__TYPE);
		PAYMENT_TYPE_varible.setValue(PAYMENT_TYPE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "PAYMENT_TYPE Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +PAYMENT_TYPE);
		
		
		String  CONTACT_LANGUAGE = (String) this.ContainKeyAndGetObject(jsonObject, "CONTACT_LANGUAGE");
		IVariableField CONTACT_LANGUAGE_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_CONTACT__LANGUAGE);
		CONTACT_LANGUAGE_varible.setValue(CONTACT_LANGUAGE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CONTACT_LANGUAGE Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +CONTACT_LANGUAGE);
		
		
		String count_serv_nbr = (String) this.ContainKeyAndGetObject(jsonObject, "count(serv_nbr)");
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.FE__NEWCASH__TBL,
						IProjectVariables.FE__NEWCASH__TBL_FIELD_COUNT);
		count_varible.setValue(count_serv_nbr);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "NEWCASH_TBL count_serv_nbr Response(TID:["+TID+"]"+FE_NEWCASH_TBL+"):" +count_serv_nbr);
		
	}
	
	
	public void IVR_DONATE_TRAN(SCESession mySession,JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String IVR_DONATE_TRAN = "IVR_DONATE_TRAN";
		
		JSONObject jsonObject = ResponseJsonObject.getJSONArray("data").getJSONObject(0);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Donation Count ResponseJsonObject Response(TID:["+TID+"]"+IVR_DONATE_TRAN+"):" +ResponseJsonObject);	

		
		String count_Donation = (String) this.ContainKeyAndGetObject(jsonObject, "count_Donation");
		IVariableField count_varible = mySession.getVariableField(
						IProjectVariables.IVR__OPERATION__CTRL,
						IProjectVariables.IVR__OPERATION__CTRL_FIELD_COUNT__DONATION);
		count_varible.setValue(count_Donation);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "@@count_Donation Response(TID:["+TID+"]"+IVR_DONATE_TRAN+"):" +count_Donation);	
		
	}
	
	public void FET_0809000811_STORE_LST(SCESession mySession,JSONObject ResponseJsonObject) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String FET_0809000811_STORE_LST = "FET_0809000811_STORE_LST";
		
		JSONObject jsonObject = ResponseJsonObject.getJSONArray("data").getJSONObject(0);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Donation Count ResponseJsonObject Response(TID:["+TID+"]"+FET_0809000811_STORE_LST+"):" +ResponseJsonObject);	

		
		String ENTERPRISE = (String) this.ContainKeyAndGetObject(jsonObject, "ENTERPRISE");
		IVariableField StoreList = mySession.getVariableField(
						IProjectVariables.FET___0_8_0_9_0_0_0_8_1_1__STORE__LST,
						IProjectVariables.FET___0_8_0_9_0_0_0_8_1_1__STORE__LST_FIELD_ENTERPRISE);
		StoreList.setValue(ENTERPRISE);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "@@StoreList Response(TID:["+TID+"]"+StoreList+"):" +StoreList);	
		
	}
	
}
