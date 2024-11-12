package flow.subflow.API_createCharge;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

import org.json.JSONObject;


import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;
import com.infortrends.APIfunction.CreateCharge;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年7月25日 上午10時41分56秒
 */
public class ExecuteCreateCharge extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年7月25日 上午10時41分56秒
	 */
	public ExecuteCreateCharge() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {
	

		Calendar API_Sdate = Calendar.getInstance();
		  API_Sdate.add(Calendar.SECOND, 0);
		 // String API_SDATETIME = sdf.format(API_Sdate.getTime()).toString();
		  
		  long timelong = API_Sdate.getTimeInMillis();
		  
		IVariable USERData_Varible = mySession.getVariable(IProjectVariables.S__USERDATA);
		IComplexVariable USERDataVarible = USERData_Varible.getComplexVariable();
		IVariableField dbid_field = USERDataVarible.getField(IProjectVariables.S__USERDATA_FIELD_BPID);
		String transBpId = dbid_field.getStringValue();	
		
		
		
		
		// 取得OD變數的值
		IVariable api_Varible = mySession.getVariable(IProjectVariables.CREATE_CHARGE__INPUT);
		IComplexVariable complexVarible = api_Varible.getComplexVariable();
		
		
		//properties
		IVariable properties_Varible = mySession.getVariable(IProjectVariables.PROPERTIES);
		IComplexVariable properties_complexVarible = properties_Varible.getComplexVariable();
		
		
		IVariableField flowName_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_FLOW_NAME);
		String flowName = flowName_field.getStringValue();
		
		
		IVariableField channelForCfg_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_CHANNEL_FOR_CFG);
		String channelForCfg = channelForCfg_field.getStringValue();

		IVariableField channelID_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_CHANNEL_ID);
		String channelID = channelID_field.getStringValue();
		
		IVariableField password_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_PASSWORD);
		String password = password_field.getStringValue();
		
		IVariableField userID_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_USER_ID);
		String userID = userID_field.getStringValue();

		IVariableField transChannelId_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_TRANS_CHANNEL_ID);
		String transChannelId = transChannelId_field.getStringValue();
		
		IVariableField transSubChannel_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_TRANS_SUB_CHANNEL);
		String transSubChannel = transSubChannel_field.getStringValue();

		IVariableField transUserId_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_TRANS_USER_ID);
		String transUserId = transUserId_field.getStringValue();
		
		IVariableField transPath_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_TRANS_PATH);
		String transPath = transPath_field.getStringValue();	

		IVariableField middle_IP_field = properties_complexVarible.getField(IProjectVariables.PROPERTIES_FIELD_MIDDLEWARE____IP);
		String middle_IP = middle_IP_field.getStringValue();	
		
		
//		com.fet.code.UUIDGenerator getBpid = new com.fet.code.UUIDGenerator();
//		String transBpId = getBpid.Bpid();
		
//		IVariableField variable_Bpid = mySession.getVariableField(
//				IProjectVariables.S__USERDATA,
//				IProjectVariables.S__USERDATA_FIELD_BPID);
//				variable_Bpid.setValue(Bpid);
//		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Bpid Response:" +Bpid);
		
		
		IVariableField transBpId_field = mySession.getVariableField(
				IProjectVariables.CREATE_CHARGE__INPUT,
				IProjectVariables.CREATE_CHARGE__INPUT_FIELD_TRANS_BP_ID);
		transBpId_field.setValue(transBpId);

		IVariableField amount_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_AMOUNT);
		String amount = amount_field.getStringValue();
		
		IVariableField effectiveDate_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_EFFECTIVE_DATE);
		String effectiveDate = effectiveDate_field.getStringValue();
	
		IVariableField description_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_DESCRIPTION);
		String description = description_field.getStringValue();
		
		IVariableField chargeOrigin_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_CHARGE_ORIGIN);
		String chargeOrigin = chargeOrigin_field.getStringValue();		
		
		IVariableField accountNoInfo_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_ACCOUNT_NO_INFO);
		String accountNoInfo = accountNoInfo_field.getStringValue();

		IVariableField businessEntityNumber_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_BUSINESS_ENTITY_NUMBER);
		String businessEntityNumber = businessEntityNumber_field.getStringValue();

		IVariableField paymentCategory_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_PAYMENT_CATEGORY);
		String paymentCategory = paymentCategory_field.getStringValue();

		IVariableField chargeCode_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_CHARGE_CODE);
		String chargeCode = chargeCode_field.getStringValue();
		
		IVariableField serviceReciverType_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_SERVICE_RECIVER_TYPE);
		String serviceReciverType = serviceReciverType_field.getStringValue();

		IVariableField serviceReciverId_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_SERVICE_RECIVER_ID);
		String serviceReciverId = serviceReciverId_field.getStringValue();
		
		IVariableField reciverCustomerId_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_RECIVER_CUSTOMER_ID);
		String reciverCustomerId = reciverCustomerId_field.getStringValue();
		
		IVariableField chargeType_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_CHARGE_TYPE);
		String chargeType = chargeType_field.getStringValue();

		IVariableField businessEntity_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_BUSINESS_ENTITY);
		String businessEntity = businessEntity_field.getStringValue();

		IVariableField attributeName_0_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_ATTRIBUTE_NAME___0);
		String attributeName_0 = attributeName_0_field.getStringValue();

		IVariableField attributeType_0_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_ATTRIBUTE_TYPE___0);
		String attributeType_0 = attributeType_0_field.getStringValue();

		IVariableField mandatoryInd_0_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_MANDATORY_IND___0);
		String mandatoryInd_0 = mandatoryInd_0_field.getStringValue();
		
		IVariableField value_0_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_VALUE___0);
		String value_0 = value_0_field.getStringValue();

		
		IVariableField attributeName_1_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_ATTRIBUTE_NAME___1);
		String attributeName_1 = attributeName_1_field.getStringValue();

		IVariableField attributeType_1_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_ATTRIBUTE_TYPE___1);
		String attributeType_1 = attributeType_1_field.getStringValue();

		IVariableField mandatoryInd_1_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_MANDATORY_IND___1);
		String mandatoryInd_1 = mandatoryInd_1_field.getStringValue();
		
		IVariableField value_1_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_VALUE___1);
		String value_1 = value_1_field.getStringValue();
		
		IVariableField attributeName_2_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_ATTRIBUTE_NAME___2);
		String attributeName_2= attributeName_2_field.getStringValue();

		IVariableField attributeType_2_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_ATTRIBUTE_TYPE___2);
		String attributeType_2 = attributeType_2_field.getStringValue();

		IVariableField mandatoryInd_2_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_MANDATORY_IND___2);
		String mandatoryInd_2 = mandatoryInd_2_field.getStringValue();
		
		IVariableField value_2_field = complexVarible.getField(IProjectVariables.CREATE_CHARGE__INPUT_FIELD_VALUE___2);
		String value_2 = value_2_field.getStringValue();
		
		IVariableField varible1 = mySession.getVariableField(
			       IProjectVariables.FE__API__LOG__TBL,
			       IProjectVariables.FE__API__LOG__TBL_FIELD_STIME);
			   varible1.setValue(timelong);
			   
			   mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "AddItemsEx starttimelong:" +timelong);
		
		
//		---問leo---
//		businessEntityNumber:110154
//		paymentCategory:POST
//		accountNoInfo:825087813
//		chargeCode:3GOC11109
//		serviceReciverType:S
//		serviceReciverId:324502407
//		reciverCustomerId:209491947
//		chargeType:DBT
//		businessEntity:110154
//		attributeName:Activity reason code
//		attributeType:64
//		mandatoryInd:64
		
//		value:CREQ
		
		
		// OD變數轉JSON
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("channelForCfg", channelForCfg);
		jsonobject.put("FlowName", flowName);
		jsonobject.put("channelID", channelID);
		jsonobject.put("password", password);
		jsonobject.put("userID", userID);
		jsonobject.put("transChannelId", transChannelId);
		jsonobject.put("transSubChannel", transSubChannel);
		jsonobject.put("transUserId", transUserId);
		jsonobject.put("transBpId", transBpId);
		jsonobject.put("businessEntityNumber", businessEntityNumber);
		jsonobject.put("chargeOrigin", chargeOrigin);
		jsonobject.put("paymentCategory", paymentCategory);
		jsonobject.put("accountNoInfo", accountNoInfo);
		jsonobject.put("chargeCode", chargeCode);
		jsonobject.put("serviceReciverType", serviceReciverType);
		jsonobject.put("serviceReciverId", serviceReciverId);
		jsonobject.put("amount", amount);
		jsonobject.put("reciverCustomerId", reciverCustomerId);
		jsonobject.put("chargeType", chargeType);
		jsonobject.put("description", description);
		jsonobject.put("effectiveDate", effectiveDate);

		jsonobject.put("attributeName_0", attributeName_0);
		jsonobject.put("attributeType_0", attributeType_0);
		jsonobject.put("mandatoryInd_0", mandatoryInd_0);
		jsonobject.put("value_0", value_0);
		
		jsonobject.put("attributeName_1", attributeName_1);
		jsonobject.put("attributeType_1", attributeType_1);
		jsonobject.put("mandatoryInd_1", mandatoryInd_1);
		jsonobject.put("value_1", value_1);
		
		jsonobject.put("attributeName_2", attributeName_2);
		jsonobject.put("attributeType_2", attributeType_2);
		jsonobject.put("mandatoryInd_2", mandatoryInd_2);
		jsonobject.put("value_2", value_2);

		
		// Json轉字串 (OD變數轉Json轉字串)
		String urlParameters = jsonobject.toString();

		System.out.println("## createCharge_input_urlParameters: " + urlParameters);
		
		
		// http方法設定
		HttpURLConnection con = null;
		URL obj = null;

		// API之Servlet雲端的網址        需要改成讀config_IP
		//String url = "http://10.64.69.19:7003/SOA_CRM_CRMPaymentBizService/CreateChargeServlet";
		
		String url = "http://"+ middle_IP +"/SOA_CRM_CRMPaymentBizService/CreateChargeServlet";
		
		try {
			obj = new URL(url);
			con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");

		} catch (MalformedURLException e1) {
			e1.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
		con.setRequestProperty("Content-Type","a" + "pplication/x-www-form-urlencoded");
		
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = null;
		int responseCode = 0;

		try {

			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "### con Response:" + con); 
			
			System.out.println("\n con.getOutputStream()"+ con.getOutputStream());
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "### con.getOutputStream() Response:" + con.getOutputStream()); 
			
			wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();
			responseCode = con.getResponseCode();
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		 System.out.println("\n Sending 'POST' request to URL : " + url);
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "###createCharge url:" + url); 
		 
		 System.out.println("\n Post parameters : " + urlParameters);
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "###createCharge urlParameters :" + urlParameters); 
		 
		 System.out.println("\n Response Code : " + responseCode);
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "###createCharge responseCode :" + responseCode); 

		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		String inputLine;
		StringBuffer response = new StringBuffer();

		try {
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

		// print result
		JSONObject ResponseJsonObject = new JSONObject(response.toString());
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "###createCharge ResponseJsonObject Response:" + ResponseJsonObject); 
		
		CreateCharge createCharge = new CreateCharge();

		
		createCharge.AssignODvariable(mySession, ResponseJsonObject);


	}
	/**
	 * Builds the list of branches that are defined for this servlet object.
	 * This list is built automatically by defining Goto nodes in the call flow editor.
	 * It is the programmer's responsibilty to provide at least one enabled Goto.<BR>
	 *
	 * The user should override updateBranches() to determine which Goto that the
	 * framework will activate.  If there is not at least one enabled Goto item, 
	 * the framework will throw a runtime exception.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of branches for the flow item, override:
	 *     <code>updateBranches(Collection branches, SCESession mySession)</code>
	 *
	 * @return a Collection of <code>com.avaya.sce.runtime.Goto</code>
	 * objects that will be evaluated at runtime.  If there are no gotos
	 * defined in the Servlet node, then this returns null.
	 * Last generated by Orchestration Designer at: 2024年11月11日 下午03時47分37秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("API_createCharge-set_datalog", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
