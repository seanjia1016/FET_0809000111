package flow.subflow.API_getCashSubscriberInfoByKey;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.json.JSONObject;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;
import com.crm.utils.Utils;
import com.infortrends.APIfunction.GetCashSubscriberInfoByKey;

import flow.IProjectVariables;


/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年7月24日 下午05時42分58秒
 */
public class ExecuteGetCashSubscriberInfoByKey extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年7月24日 下午05時42分58秒
	 */
	public ExecuteGetCashSubscriberInfoByKey() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.CHINESE);

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
	 * Last generated by Orchestration Designer at: 2017年7月24日 下午05時42分58秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		final String TID = Utils.TID(mySession);
		
		String apiName = "getCacheSubscriberInfoByKey";

		final String IP = Utils.IP(mySession);
		String url = "http://" + IP + "/FET_IVR_MiddleWare/" + apiName;
		final String flowname = Utils.getFieldString(mySession,
				IProjectVariables.PROPERTIES,
				IProjectVariables.PROPERTIES_FIELD_FLOW_NAME);
		
		String msisdn = Utils.getFieldString(mySession,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__INPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__INPUT_FIELD_MSISDN);
		String bpid = Utils.getFieldString(mySession,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__INPUT,
				IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__INPUT_FIELD_TRANS_BP_ID);

		// API開始時間
		Calendar API_Sdate = Calendar.getInstance();
		API_Sdate.add(Calendar.SECOND, 0);
		String API_SDATETIME = sdf.format(API_Sdate.getTime()).toString();

		JSONObject responseJsonObject = null;
		int responseCode = 0;
		try {
			URL	obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			// add reuqest header
			con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");

			// 組成要傳入的JSON物件
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("msisdn", msisdn);
			jsonobject.put("bpid", bpid);
		
			String urlParameters = jsonobject.toString();
			Utils.LogsINFO(mySession, "jsonObject Request(TID:[" + TID + "]" + apiName + "):" + urlParameters);
			
			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = null;
			wr = new DataOutputStream(con.getOutputStream());
			wr.write(urlParameters.getBytes("UTF-8"));
			wr.flush();
			wr.close();
			responseCode = con.getResponseCode();

			BufferedReader in = null;
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			Utils.LogsResponse(mySession, TID, apiName, con, urlParameters, responseCode, response.toString());
			
			// print result
			responseJsonObject = new JSONObject(response.toString());
			Utils.LogsINFO(mySession, "ResponseJsonObject	:"+responseJsonObject.toString());
			// API結束時間
			Calendar API_Edate = Calendar.getInstance();
			API_Edate.add(Calendar.SECOND, 0);
			String API_EDATETIME = sdf.format(API_Edate.getTime()).toString();
			long timelong = API_Edate.getTimeInMillis() - API_Sdate.getTimeInMillis();
			// API經過時間
			String APIconnecttimelong = String.valueOf(timelong / 1000);
			
			Utils.setFieldString(mySession,
					IProjectVariables.FE__API__LOG__TBL,
					IProjectVariables.FE__API__LOG__TBL_FIELD_SEC,
					APIconnecttimelong);

			if (responseCode == 200) {
				// returnHeader
				if (responseJsonObject.has("returnHeader.returnCode")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_RETURN_CODE,
							responseJsonObject.getString("returnHeader.returnCode"));
				}
				if (responseJsonObject.has("returnHeader.processID")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_RETURN_MESG,
							responseJsonObject.getString("returnHeader.returnMesg"));
				}
				if (responseJsonObject.has("returnHeader.processID")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_PROCESS_ID,
							responseJsonObject.getString("returnHeader.processID"));
				}
				if (responseJsonObject.has("returnHeader.processName")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_PROCESS_NAME,
							responseJsonObject.getString("returnHeader.processName"));
				}

				if (responseJsonObject.has("subscriberLayerInfo.subscriberContext.subscriberId")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SUBSCRIBER_ID,
							responseJsonObject.getString("subscriberLayerInfo.subscriberContext.subscriberId"));
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberContext.msisdn")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_MSISDN,
							responseJsonObject.getString("subscriberLayerInfo.subscriberContext.msisdn"));
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberContext.accountId")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_ACCOUNT_ID,
							responseJsonObject.getString("subscriberLayerInfo.subscriberContext.accountId"));
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberContext.customerId")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_CUSTOMER_ID,
							responseJsonObject.getString("subscriberLayerInfo.subscriberContext.customerId"));
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberContext.mobileGenerationCode")) {
					// generationCode -> mobileGenerationCode
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_GENERATION_CODE,
							responseJsonObject.getString("subscriberLayerInfo.subscriberContext.mobileGenerationCode"));
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberContext.paymentCategory")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_PAYMENT_CATEGORY,
							responseJsonObject.getString("subscriberLayerInfo.subscriberContext.paymentCategory"));
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberContext.subscriberType")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SUBSCRIBER_TYPE,
							responseJsonObject.getString("subscriberLayerInfo.subscriberContext.subscriberType"));
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberContext.subscriberStatus")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SUBSCRIBER_STATUS,
							responseJsonObject.getString("subscriberLayerInfo.subscriberContext.subscriberStatus"));
				}

				if (responseJsonObject.has("subscriberLayerInfo.subscriberInfo.ivrLanguagePreferenceType")) {
					// ivrLang -> ivrLanguagePreferenceType
					String ivrLang = "";
					String ivrLanguagePreferenceType = responseJsonObject.getString("subscriberLayerInfo.subscriberInfo.ivrLanguagePreferenceType");
					switch (ivrLanguagePreferenceType) {
					case "1":
						ivrLang = "A";
						break;
					case "2":
						ivrLang = "B";
						break;
					case "3":
						ivrLang = "E";
						break;
					case "4":
						ivrLang = "H";
						break;
					case "5":
						ivrLang = "I";
						break;
					case "6":
						ivrLang = "M";
						break;
					case "7":
						ivrLang = "T";
						break;
					case "8":
						ivrLang = "C";
						break;
					case "999":
						ivrLang = "Other";
						break;
					default:
						ivrLang = ivrLanguagePreferenceType;
						break;
					}
					Utils.LogsINFO(mySession, "偏好語言設定轉換：" + ivrLanguagePreferenceType + " -> " + ivrLang);
					
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_IVR_LANG,
							ivrLang);
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberInfo.serviceProvider")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SERVICE_PROVIDER,
							responseJsonObject.getString("subscriberLayerInfo.subscriberInfo.serviceProvider"));
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberInfo.initialActiveDate")) {
					// initActiveDt -> initialActiveDate
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_INIT_ACTIVE_DT,
							responseJsonObject.getString("subscriberLayerInfo.subscriberInfo.initialActiveDate"));
				}
				if (responseJsonObject.has("subscriberLayerInfo.subscriberInfo.subscriberStatusReason")) {
					// subStReason -> subscriberStatusReason
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SUB_ST_REASON,
							responseJsonObject.getString("subscriberLayerInfo.subscriberInfo.subscriberStatusReason"));
				}

				if (responseJsonObject.has("default.contractComponentId")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_CONTRACT_COMPONENT_ID,
							responseJsonObject.getString("default.contractComponentId"));
				}
				if (responseJsonObject.has("default.partyId")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_PARTY_ID,
							responseJsonObject.getString("default.partyId"));
				}
				if (responseJsonObject.has("default.contractId")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_CONTRACT_ID,
							responseJsonObject.getString("default.contractId"));
				}
				if (responseJsonObject.has("default.accountContractComponentId")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_ACCOUNT_CONTRACT_COMPONENT_ID,
							responseJsonObject.getString("default.accountContractComponentId"));
				}
				if (responseJsonObject.has("default.accountPartyId")) {
					Utils.setFieldString(mySession,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
							IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_ACCOUNT_PARTY_ID,
							responseJsonObject.getString("default.accountPartyId"));
				}
			}

		} catch (ArithmeticException ex) {
			 ex.printStackTrace();
			 Utils.LogsERROR(mySession, "ArithmeticException Response(TID:["+TID+"]"+apiName+"):" +ex.getMessage());
		} catch (MalformedURLException e1) {
			 e1.printStackTrace();
			 Utils.LogsERROR(mySession, "MalformedURLException Response(TID:["+TID+"]"+apiName+"):" +e1.getMessage());
		} catch (IOException e) {
			 e.printStackTrace();
			 Utils.LogsERROR(mySession, "IOException Response(TID:["+TID+"]"+apiName+"):" +e.getMessage());
		} catch (Exception e) {
			 e.printStackTrace();
			 Utils.LogsERROR(mySession, "Exception Response(TID:["+TID+"]"+apiName+"):" +e.getMessage());
		} finally {
			Utils.LogsINFO(mySession, "HttpCode Response:" + responseCode);
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
	 * Last generated by Orchestration Designer at: 2024年11月15日 上午10時17分04秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("API_getCashSubscriberInfoByKey-set_datalog", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
