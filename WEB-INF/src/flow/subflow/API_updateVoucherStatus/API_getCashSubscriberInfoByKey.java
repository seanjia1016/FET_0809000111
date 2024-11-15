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
 * Last generated by Orchestration Designer at: 2024年11月12日 上午11時12分37秒
 */
public class API_getCashSubscriberInfoByKey extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午11時12分37秒
	 */
	public API_getCashSubscriberInfoByKey() {
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
	 * It's important to design your callflow so that the voice browser (Experienve Portal/IR)
	 * is not waiting too long for a response as this can lead to a poor caller experience.
	 * Additionally, if the response to the client voice browser exceeds the configured
	 * timeout, the platform may throw an "error.badfetch". 
	 *
	 * Using this method, you have access to all session variables through the 
	 * SCESession object.
	 *
	 * The code generator will *** NOT *** overwrite this method in the future.
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午11時12分37秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		final String TID = Utils.TID(mySession);
		
		String apiName = "getCacheSubscriberInfoByKey";

		final String IP = Utils.IP(mySession);
		String url = "http://" + IP + "/FET_IVR_MiddleWare/" + apiName;
		
		String msisdn = "0989561475";
		
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
						if (responseJsonObject.has("subscriberLayerInfo.subscriberContext.subscriberId")) {
							Utils.setFieldString(mySession,
									IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT,
									IProjectVariables.GET_CASH_SUBSCRIBER_INFO_BY_KEY__OUTPUT_FIELD_SUBSCRIBER_ID,
									responseJsonObject.getString("subscriberLayerInfo.subscriberContext.subscriberId"));
						}
					}
					
					Utils.LogsINFO(mySession, "使用門號0989561475 Call CetCacheSubscriberInfoByKEY取得subscriberId (TID:[" + TID + "]" + apiName + "):" + responseJsonObject.getString("subscriberLayerInfo.subscriberContext.subscriberId"));
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
	 * Last generated by Orchestration Designer at: 2024年11月15日 下午01時35分21秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("API_updateVoucherStatus-API_updateVoucherStatus", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
