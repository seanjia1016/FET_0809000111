package flow.subflow.API_CreateTxn;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import org.json.JSONObject;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;
import com.infortrends.APIfunction.CreateTxn;
//import com.infotrends.APIfunction.ChangeContractComponent;


import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年6月2日 下午01時13分31秒
 */
public class excuteCreateTxnServlet extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年6月2日 下午01時13分31秒
	 */
	public excuteCreateTxnServlet() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method allows for custom integration with other Java components.
	 * You may use Java for sophisticated logic or to integrate with custom
	 * connectors (i.e. JMS, custom web services, sockets, XML, JAXB, etc.)
	 *
	 * Any custom code added here should work as efficiently as possible to prevent delays.
	 * It's important to design your callflow so that the voice browser (Voice Portal/IR)
	 * is not waiting too long for a response as this can lead to a poor caller experience.
	 * Additionally, if the response to the client voice browser exceeds the configured
	 * timeout, the platform may throw an "error.badfetch". 
	 *
	 * Using this method, you have access to all session variables through the 
	 * SCESession object.
	 *
	 * The code generator will *** NOT *** overwrite this method in the future.
	 * Last generated by Orchestration Designer at: 2017年6月2日 下午01時13分31秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		
		String CreateTxnServlet="CreateTxnServlet";
		
		IVariable info_PROPERTIES = mySession.getVariable(IProjectVariables.PROPERTIES);
		IComplexVariable PROPERTIESVariable = info_PROPERTIES.getComplexVariable();
		
		IVariableField Payment_by_Billfile = PROPERTIESVariable.getField(IProjectVariables.PROPERTIES_FIELD_MIDDLEWARE____IP);
		String IP = Payment_by_Billfile.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "IP Response(TID:["+TID+"]"+CreateTxnServlet+"):"+IP );

		//CreateTxnServlet

		IVariable CteateTXN_Varible = mySession.getVariable(IProjectVariables.CREATE_TXN__INPUT);
		IComplexVariable complexTxn = CteateTXN_Varible.getComplexVariable();
		
		//channelForCfg
		IVariableField ChannelForCFG_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_CHANNEL_FOR_CFG);
		String channelForCfg = ChannelForCFG_field.getStringValue();
		
		//FlowName
		IVariableField FlowName_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_FLOW_NAME);
		String FlowName = FlowName_field.getStringValue();
		
		//transBpId
		IVariableField transBpId_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_TRANS_BP_ID);
		String transBpId = transBpId_field.getStringValue();
		
		//txnStatusCd
		IVariableField txnStatusCd_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_TXN_STATUS_CD);
		String txnStatusCd = txnStatusCd_field.getStringValue();
		
		//txnTpCd
		IVariableField txnTpCd_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_TXN_TP_CD);
		String txnTpCd = txnTpCd_field.getStringValue();
		
		//billSubscrId
		IVariableField billSubscrId_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_BILL_SUBSCR_ID);
		String billSubscrId = billSubscrId_field.getStringValue();
		
		//identifierNum
		IVariableField identifierNum_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_IDENTIFIER_NUM);
		String identifierNum = identifierNum_field.getStringValue();
		
		//identifierNum
		IVariableField createSystem_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_CREATE_SYSTEM);
		String createSystem = createSystem_field.getStringValue();
		
		//createChannel
		IVariableField createChannel_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_CREATE_CHANNEL);
		String createChannel = createChannel_field.getStringValue();
		
		//createAgentCd
		IVariableField createAgentCd_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_CREATE_AGENT_CD);
		String createAgentCd = createAgentCd_field.getStringValue();
		
		//updateAgentCd
		IVariableField updateAgentCd_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_UPDATE_AGENT_CD);
		String updateAgentCd = updateAgentCd_field.getStringValue();
		
		//serviceProvider
		IVariableField serviceProvider_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_SERVICE_PROVIDER);
		String serviceProvider = serviceProvider_field.getStringValue();
		
		//mobileGenerationCodel
		IVariableField mobileGenerationCodel_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_MOBILE_GENERATION_CODEL);
		String mobileGenerationCodel = mobileGenerationCodel_field.getStringValue();
		
		//txnCompleteDt
		IVariableField txnCompleteDt_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_TXN_COMPLETE_DT);
		String txnCompleteDt = txnCompleteDt_field.getStringValue();
		
		//changeItemCDType
		IVariableField changeItemCDType_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_CHANGE_ITEM_CDTYPE);
		String changeItemCDType = changeItemCDType_field.getStringValue();
		
		//paymentCategory
		IVariableField paymentCategory_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_PAYMENT_CATEGORY);
		String paymentCategory = paymentCategory_field.getStringValue();
		
		//temporalTPCDType
		IVariableField temporalTPCDType_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_TEMPORAL_TPCDTYPE);
		String temporalTPCDType = temporalTPCDType_field.getStringValue();
		
		//cohGroupOrderId
		IVariableField cohGroupOrderId_field = complexTxn.getField(IProjectVariables.CREATE_TXN__INPUT_FIELD_COH_GROUP_ORDER_ID);
		String cohGroupOrderId = cohGroupOrderId_field.getStringValue();
		
		
		JSONObject ResponseJsonObject=null;
		
				try{
		HttpURLConnection con = null;
		
		//模擬OD Servlet打入http方法
		String url = "http://"+IP+"/SOA_CRM_CRMTXBizService/CreateTxnServlet"; //作業
		
		URL obj = null;
			obj = new URL(url);
			con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			
			
		//組成要傳入的JSON物件
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("channelForCfg", channelForCfg);
		jsonobject.put("FlowName", FlowName);
		jsonobject.put("transBpId",transBpId);
		jsonobject.put("txnStatusCd", txnStatusCd);
		jsonobject.put("txnTpCd", txnTpCd);
		jsonobject.put("billSubscrId", billSubscrId);
		jsonobject.put("identifierNum", identifierNum);
		jsonobject.put("createSystem", createSystem);
		jsonobject.put("createChannel", createChannel);
		jsonobject.put("createAgentCd", createAgentCd);
		jsonobject.put("updateAgentCd", updateAgentCd);
		jsonobject.put("serviceProvider", serviceProvider);
		jsonobject.put("mobileGenerationCodel", mobileGenerationCodel);
		jsonobject.put("txnCompleteDt", txnCompleteDt);
		jsonobject.put("changeItemCDType", changeItemCDType);
		jsonobject.put("paymentCategory", paymentCategory);
		jsonobject.put("temporalTPCDType", temporalTPCDType);
		jsonobject.put("cohGroupOrderId", cohGroupOrderId);
		
		
		String urlParameters = jsonobject.toString();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "CreateTx  jsonObject Request(TID:["+TID+"]"+CreateTxnServlet+"):" +urlParameters);

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = null;
		int responseCode = 0;

		wr = new DataOutputStream(con.getOutputStream());
			wr.write(urlParameters.getBytes("UTF-8"));
			wr.flush();
			wr.close();
			
			responseCode = con.getResponseCode();

		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "con Response(TID:["+TID+"]"+CreateTxnServlet+"):" +con);
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "wr Response(TID:["+TID+"]"+CreateTxnServlet+"):" +wr);
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "url Response(TID:["+TID+"]"+CreateTxnServlet+"):" +url);
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "urlParameters Response(TID:["+TID+"]"+CreateTxnServlet+"):" +urlParameters);
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "responseCode Response(TID:["+TID+"]"+CreateTxnServlet+"):" +responseCode);

		 BufferedReader in = null;

		 in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));

		 String inputLine;
		StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();

		ResponseJsonObject = new JSONObject(response.toString());
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "ResponseJsonObject Response(["+TID+"]"+CreateTxnServlet+"):" +ResponseJsonObject);
		
	 }catch (ArithmeticException ex) {
		 ex.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "ArithmeticException Response(TID:["+TID+"]"+CreateTxnServlet+"):" +ex.getMessage());
	 }catch (MalformedURLException e1) {
		 e1.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "MalformedURLException Response(TID:["+TID+"]"+CreateTxnServlet+"):" +e1.getMessage());
	 } catch (IOException e) {
		 e.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "IOException Response(TID:["+TID+"]"+CreateTxnServlet+"):" +e.getMessage());
	 } catch (Exception e) {
		 e.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "IOException Response(TID:["+TID+"]"+CreateTxnServlet+"):" +e.getMessage());
	 }
	 finally {
		 
	 try {
		 CreateTxn createTxn = new  CreateTxn();
		 createTxn.function(mySession,ResponseJsonObject);
			
	} catch (Exception e2) {
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "Exception Response(TID:["+TID+"]"+CreateTxnServlet+"):" +e2.getMessage());
	}
	 
	 }
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
	 * Last generated by Orchestration Designer at: 2024年11月20日 上午11時40分38秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("API_CreateTxn-next", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
