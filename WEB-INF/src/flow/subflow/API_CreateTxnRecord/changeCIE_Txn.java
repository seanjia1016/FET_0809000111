package flow.subflow.API_CreateTxnRecord;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.json.JSONObject;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;
import com.crm.utils.Utils;
//import com.infotrends.APIfunction.AddItemsEx;
import com.infortrends.APIfunction.TxnRecord;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年9月13日 下午04時27分53秒
 */
public class changeCIE_Txn extends com.avaya.sce.runtime.BasicServlet {
	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年9月13日 下午04時27分53秒
	 */
	public changeCIE_Txn() {
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
	 * Last generated by Orchestration Designer at: 2017年9月13日 下午04時27分53秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {
		
final String TID = Utils.TID(mySession);
		
		String apiName = "changeCIE";

		final String IP = Utils.IP(mySession);
		String url = "http://" + IP + "/FET_IVR_MiddleWare/" + apiName;
		

		// API開始時間
		long apiStartTimeInMillis = Calendar.getInstance().getTimeInMillis();
		try{
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setConnectTimeout(60000);
			con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			
			String urlParameters = this.buildParam(mySession);
			Utils.LogsINFO(mySession, "jsonObject Request(TID:["+TID+"]"+apiName+"):" +urlParameters);

			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = null;
			int responseCode = 0;
			wr = new DataOutputStream(con.getOutputStream());
			wr.write(urlParameters.getBytes("UTF-8"));
			wr.flush();
			wr.close();
			responseCode = con.getResponseCode();

			Utils.LogsINFO(mySession, "con Response(TID:["+TID+"]"+apiName+"):" +con);
			Utils.LogsINFO(mySession, "wr Response(TID:["+TID+"]"+apiName+"):" +wr);
			Utils.LogsINFO(mySession, "url Response(TID:["+TID+"]"+apiName+"):" +url);
			Utils.LogsINFO(mySession, "urlParameters Response(TID:["+TID+"]"+apiName+"):" +urlParameters);
			Utils.LogsINFO(mySession, "responseCode Response(TID:["+TID+"]"+apiName+"):" +responseCode);
			
			
			BufferedReader in = null;
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			JSONObject responseJsonObject = new JSONObject(response.toString());
			Utils.LogsINFO(mySession, "ResponseJsonObject Response(TID:["+TID+"]"+apiName+"):" +responseJsonObject);
			// API結束時間
			long apiEndTimeInMillis = Calendar.getInstance().getTimeInMillis();
			long timeLong = apiEndTimeInMillis - apiStartTimeInMillis;
			String timeLongSecStr = String.valueOf(timeLong / 1000);
			
			
			// 讀取回傳值
			String returnCode = "", exception = "", remarkResponse = "";
			if (responseJsonObject.has("returnCode")) {
				returnCode = responseJsonObject.getString("returnCode");
				Utils.setFieldString(mySession,
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT,
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT_FIELD_RETURN_CODE,
						returnCode);
			}
			if (responseJsonObject.has("exception")) {
				exception = responseJsonObject.getString("exception");
				Utils.setFieldString(mySession,
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT,
						IProjectVariables.CREATE_TXN_RECORD__OUTPUT_FIELD_EXCEPTION,
						exception);
			}
		} catch (ArithmeticException e) {
			Utils.LogsERROR(mySession, Utils.getStackTrace(e));
			Utils.LogsERROR(mySession, "ArithmeticException Response(TID:["+TID+"]"+apiName+"):" +e.getMessage());
		} catch (MalformedURLException e) {
			Utils.LogsERROR(mySession, Utils.getStackTrace(e));
			Utils.LogsERROR(mySession, "MalformedURLException Response(TID:["+TID+"]"+apiName+"):" +e.getMessage());
		} catch (IOException e) {
			Utils.LogsERROR(mySession, Utils.getStackTrace(e));
			Utils.LogsERROR(mySession, "IOException Response(TID:["+TID+"]"+apiName+"):" +e.getMessage());
		} catch (Exception e) {
			Utils.LogsERROR(mySession, Utils.getStackTrace(e));
			Utils.LogsERROR(mySession, "Exception Response(TID:["+TID+"]"+apiName+"):" +e.getMessage());
		} finally {
			Utils.LogsINFO(mySession, apiName + " END" );
		}
	}
	
	private String buildParam(com.avaya.sce.runtimecommon.SCESession mySession) {
		
		String channelForCfg = Utils.getFieldString(mySession,
				IProjectVariables.PROPERTIES,
				IProjectVariables.PROPERTIES_FIELD_CHANNEL_FOR_CFG);
		
		String flowname = Utils.getFieldString(mySession,
				IProjectVariables.AIR__MENU__MASTER,
				IProjectVariables.AIR__MENU__MASTER_FIELD_IVRFLOW);
		
		String transBpId = Utils.getFieldString(mySession,
				IProjectVariables.S__USERDATA,
				IProjectVariables.S__USERDATA_FIELD_BPID);
		
		String cieId = Utils.getFieldString(mySession,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT_FIELD_CIE_ID);
		
		String sessionUniqueId = Utils.getFieldString(mySession,
				IProjectVariables.SESSION,
				IProjectVariables.SESSION_FIELD_SESSIONID);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String transDate = dateFormat.format(date);
		
		String txnId = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN__OUTPUT,
				IProjectVariables.CREATE_TXN__OUTPUT_FIELD_TXN_ID);
		
		String accountContactId = Utils.getFieldString(mySession,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT_FIELD_ACCOUNT_CONTACT_ID);
		
		String subscriberContactId = Utils.getFieldString(mySession,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT_FIELD_SUBSCRIBER_CONTACT_ID);
		
		String accountContractCompId = Utils.getFieldString(mySession,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT_FIELD_ACCOUNT_CONTRACT_COMP_ID);
		
		String subscriberContractCompId = Utils.getFieldString(mySession,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT_FIELD_SUBSCRIBER_CONTRACT_COMP_ID);
		
		String billingAccountId = Utils.getFieldString(mySession,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT_FIELD_BILLING_ACCOUNT_ID);
		
		String billingSubscriberId = Utils.getFieldString(mySession,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT_FIELD_BILLING_SUBSCRIBER_ID);
		
		String mobileGenerationCode = Utils.getFieldString(mySession,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT,
				IProjectVariables.CIE__CREATE_SERVICE__OUTPUT_FIELD_MOBILE_GENERATION_CODE);
		
		
		String resourceValue = Utils.getFieldString(mySession,
				IProjectVariables.S__USERDATA,
				IProjectVariables.S__USERDATA_FIELD_ANI);
		
		
		String serviceProvider = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_SERVICE_PROVIDER);
		
		String topics = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_TOPICS);
		
		String remark = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_REMARK);
		
		String contactItemTypeCode = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_CONTACT_ITEM_TYPE_CODE);
		
		String contactItemTypeName = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_CONTACT_ITEM_TYPE_NAME);
		
		String contactItemGroupName = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_CONTACT_ITEM_GROUP_NAME);
		
		String contactItemGroupCode = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_CONTACT_ITEM_GROUP_CODE);
		
		String cieTxnLastUpdateUser = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_CIE_TXN_LAST_UPDATE_USER);
		
		String cieChangeItemType = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_CIE_CHANGE_ITEM_TYPE);
		
		String oldValue = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_OLD_VALUE);
		
		String newValue = Utils.getFieldString(mySession,
				IProjectVariables.CREATE_TXN_RECORD__INPUT,
				IProjectVariables.CREATE_TXN_RECORD__INPUT_FIELD_NEW_VALUE);
		

		JSONObject jsonobject = new JSONObject();
		 
		 jsonobject.put("channelForCfg", channelForCfg);
		 jsonobject.put("FlowName", flowname);
		 jsonobject.put("transBpId", transBpId);
		 jsonobject.put("cieId", cieId);
		 jsonobject.put("potentialContactIndicator", "N");
		 jsonobject.put("inOutIndicator", "I");
		 jsonobject.put("channelType", "1");
		 jsonobject.put("fetContactMethodType", "3");
		 jsonobject.put("createdSystem", "IVR");
		 jsonobject.put("sessionUniqueId", sessionUniqueId);
		 jsonobject.put("startDate", transDate);
		 jsonobject.put("endDate", transDate);
		 jsonobject.put("createDate", transDate);
		 
		 jsonobject.put("accountContactId", accountContactId);
		 jsonobject.put("subscriberContactId", subscriberContactId);
		 jsonobject.put("accountContractCompId", accountContractCompId);
		 jsonobject.put("subscriberContractCompId", subscriberContractCompId);
		 jsonobject.put("billingAccountId", billingAccountId);
		 jsonobject.put("billingSubscriberId", billingSubscriberId);
		 jsonobject.put("mobileGenerationCode", mobileGenerationCode);
		 jsonobject.put("paymentCategory", "PS");
		 jsonobject.put("createdDate", transDate);
		 jsonobject.put("txnId", txnId);

		 
		 jsonobject.put("resourceValue", resourceValue);
		 jsonobject.put("serviceProvider", serviceProvider);
		 jsonobject.put("topics", topics);
		 jsonobject.put("remark", remark);
		 jsonobject.put("contactItemTypeCode", contactItemTypeCode);
		 jsonobject.put("contactItemTypeName", contactItemTypeName);
		 jsonobject.put("contactItemGroupName", contactItemGroupName);
		 jsonobject.put("contactItemGroupCode", contactItemGroupCode);
		 jsonobject.put("cieTxnLastUpdateUser", cieTxnLastUpdateUser);
		 jsonobject.put("cieChangeItemType", cieChangeItemType);
		 jsonobject.put("oldValue", oldValue);
		 jsonobject.put("newValue", newValue);
		
		return jsonobject.toString();
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
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午04時02分57秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("API_CreateTxnRecord-next", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
