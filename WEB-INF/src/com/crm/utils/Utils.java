package com.crm.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.json.JSONObject;

import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;
import com.google.gson.GsonBuilder;

import flow.IProjectVariables;


public final class Utils {
	
	private Utils(){}
	
	public static String getStackTrace(Exception ex){
        StringWriter errors = new StringWriter();
        ex.printStackTrace(new PrintWriter(errors));
        return errors.toString();
    }
	
	public static String getfirstId(){
		return "firstId";
	}
	
	public static String getbirthDate(){
		return "birthDate";
	}
	
//取明碼客資參數
//	personName
//	,birthDate
//	,firstIdType
//	firstId,
//	
//	,contactMethodInfo.homePhoneNum
//	,contactMethodInfo.companyPhoneNum
//	,contactMethodInfo.mobilePhoneNum
//	,contactMethodInfo.otherPhoneNum
//	
//	,addressInfo.contactAddress 
//	,addressInfo.contactAddressCity
//	,addressInfo.contactAddressRegion
//	,addressInfo.contactAddressAddressLineOne
//	
//	,addressInfo.billAddress
//	,addressInfo.billAddressCity
//	,addressInfo.billAddressRegion
//	,addressInfo.billAddressAddressLineOne
//	
//	,addressInfo.registerlAddress
//	,addressInfo.registerAddressCity
//	,addressInfo.registerAddressRegion
//	,addressInfo.registerAddressAddressLineOne
	
	public static SimpleDateFormat DataTimeFormat(){
		return new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss", Locale.CHINESE);
	}
	
	public static long getMillisTime(int offset){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.SECOND, offset);
		return c.getTimeInMillis();
	}
	
	public static String ContainKeyAndGetJSON(JSONObject jsonObject, String key) {
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
		return "";
	}
	
	public static String TID(com.avaya.sce.runtimecommon.SCESession s){
		return getFieldString(s,IProjectVariables.S__TID, IProjectVariables.S__TID_FIELD_TID);
	}
	
	public static String IP(com.avaya.sce.runtimecommon.SCESession s){
		return getFieldString(s,IProjectVariables.PROPERTIES, IProjectVariables.PROPERTIES_FIELD_MIDDLEWARE____IP);
	}
	
	public static void LogsINFO(SCESession s, String messages){
		s.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, messages);
	}
	
	public static void LogsERROR(SCESession s, String messages){
		s.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, messages);
	}
	
	public static void LogsResponse(SCESession s,String tid, String _name, 
			HttpURLConnection con, String urlParameters, int responseCode, String response){
		
		ITraceInfo logs = s.getTraceOutput();
		logs.writeln(ITraceInfo.TRACE_LEVEL_INFO, "Response(TID:["+tid+"]"+_name+"){");
		logs.writeln(ITraceInfo.TRACE_LEVEL_INFO, "	Connection	:" + con);
		logs.writeln(ITraceInfo.TRACE_LEVEL_INFO, "	Parameters	:" + urlParameters);
		logs.writeln(ITraceInfo.TRACE_LEVEL_INFO, "	responseCode:" + responseCode);
		logs.writeln(ITraceInfo.TRACE_LEVEL_INFO, "	response	:" + response);
		logs.writeln(ITraceInfo.TRACE_LEVEL_INFO, "} ");
	}
	
	private static String getPrettyJSON(String uglyJSONString){
		return new GsonBuilder().setPrettyPrinting().create().toJson(uglyJSONString);
	}
	
	public static String getFieldString(SCESession s, String _Variables, String _field){
		Utils.LogsINFO(s, "get Value:["+ _Variables+ ":"+ _field +"]");
		return s.getVariableField(_Variables, _field).getStringValue();
	}
	
	public static int getFieldInt(SCESession s, String _Variables, String _field){
		return s.getVariableField(_Variables, _field).getIntValue();
	}
	
	public static void setFieldString(SCESession s, String _Variables, String _field, String value){
		s.getVariableField(_Variables, _field).setValue(value);
		Utils.LogsINFO(s, "set Value:["+_field+"]" + value);
	}

	public static void appendFieldString(SCESession s, String _Variables, String _field, String value){
		final String temp = Utils.getFieldString(s, _Variables, _field);
		Utils.setFieldString(s, _Variables, _field, temp+value);
	}
	
	public static void setPOSTStatus(SCESession s, int http_returncode, String api_name, long time_consuming){
//		Utils.setFieldString(s,
//				IProjectVariables.FE__API__LOG__TBL,
//				IProjectVariables.FE__API__LOG__TBL_FIELD_HTTP__RETCODE,
//				String.valueOf(http_returncode));

		Utils.setFieldString(s,
				IProjectVariables.FE__API__LOG__TBL,
				IProjectVariables.FE__API__LOG__TBL_FIELD_API, api_name.replace("Servlet", ""));

		Utils.setFieldString(s,
				IProjectVariables.FE__API__LOG__TBL,
				IProjectVariables.FE__API__LOG__TBL_FIELD_SEC,
				String.valueOf(time_consuming));
	}
	
}







