package flow.subflow.API_updateVoucherStatus;

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
 * Last generated by Orchestration Designer at: 2024年11月12日 上午11時53分04秒
 */
public class API_updateVoucherStatus extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午11時53分04秒
	 */
	public API_updateVoucherStatus() {
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
	 * It's important to design your callflow so that the voice browser (Experienve Portal/IR)
	 * is not waiting too long for a response as this can lead to a poor caller experience.
	 * Additionally, if the response to the client voice browser exceeds the configured
	 * timeout, the platform may throw an "error.badfetch". 
	 *
	 * Using this method, you have access to all session variables through the 
	 * SCESession object.
	 *
	 * The code generator will *** NOT *** overwrite this method in the future.
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午11時53分04秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		final String TID = Utils.TID(mySession);
		
		String apiName = "updateVoucherStatus";

		final String IP = Utils.IP(mySession);
		String url = "http://" + IP + "/FET_IVR_MiddleWare/" + apiName;
		
		// API開始時間
				long apiStartTimeInMillis = Calendar.getInstance().getTimeInMillis();
				try {
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
					
					//BpID是在此API產生的
					String bdip = "";
					if (responseJsonObject.has("bdip")) {
						bdip = responseJsonObject.getString("bdip"); // 取得 returnCode 的值
					    Utils.setFieldString(mySession,
					            IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__INPUT,
					            IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__INPUT_FIELD_TRANS_BP_ID,
					            bdip);
					}
					
					// 讀取回傳值
					String status = "", exception = "",returnCode="",pinCode="";
					
					// 檢查 "returnCode" 是否存在
					if (responseJsonObject.has("returnCode")) {
					    returnCode = responseJsonObject.getString("returnCode"); // 取得 returnCode 的值
					    Utils.setFieldString(mySession,
					            IProjectVariables.QUERY_VOUCHER_CARD_SERVICE__OUTPUT,
					            IProjectVariables.QUERY_VOUCHER_CARD_SERVICE__OUTPUT_FIELD_RETURNCODE,
					            returnCode);
					}
					
					// 檢查 "voucher" 是否存在並包含 "status" 欄位
					if (responseJsonObject.has("voucher")) {
					    JSONObject voucher = responseJsonObject.getJSONObject("voucher");
					    if (voucher.has("status")) {
					    	status = voucher.getString("status"); // 取得 status 的值
					        Utils.setFieldString(mySession,
					                IProjectVariables.QUERY_VOUCHER_CARD_SERVICE__OUTPUT,
					                IProjectVariables.QUERY_VOUCHER_CARD_SERVICE__OUTPUT_FIELD_STATUS,
					                status);
					    }
					    if (voucher.has("pinCode")) {
					        pinCode = voucher.getString("pinCode"); // 取得 pinCode 的值
					        Utils.setFieldString(mySession,
					                IProjectVariables.QUERY_VOUCHER_CARD_SERVICE__OUTPUT,
					                IProjectVariables.QUERY_VOUCHER_CARD_SERVICE__OUTPUT_FIELD_PIN_CODE,
					                pinCode);
					    }
					}


					if (responseJsonObject.has("exception")) {
						exception = responseJsonObject.getString("exception");
						Utils.setFieldString(mySession,
								IProjectVariables.CREATE_TXN__OUTPUT,
								IProjectVariables.CREATE_TXN__OUTPUT_FIELD_EXCEPTION,
								exception);
					}
				}
				catch (ArithmeticException e) {
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
		
		String tenantID = Utils.getFieldString(mySession, IProjectVariables.TENANT, IProjectVariables.TENANT_FIELD_TENANT_ID);
		
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("tenantID", tenantID);
		
		return jsonObject.toString();
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
	 * Last generated by Orchestration Designer at: 2024年11月12日 下午01時22分20秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("API_updateVoucherStatus-End", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
