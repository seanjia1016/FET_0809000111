package flow.subflow.API_getSubscriberAndAccountProfile;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.crm.utils.TextUtils;
import com.crm.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年6月9日 上午11時07分20秒
 */
public class exectureGetSubscriberAndAccountProfile extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	private static final String SimpleName = exectureGetSubscriberAndAccountProfile.class
			.getSimpleName();
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年6月9日 上午11時07分20秒
	 */
	public exectureGetSubscriberAndAccountProfile() {
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
	 * Last generated by Orchestration Designer at: 2017年6月9日 上午11時07分20秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {
		
		// API開始時間
				final long API_Sdate = Utils.getMillisTime(0);
				String TID = Utils.TID(mySession);
				final String IP = Utils.IP(mySession);
				final String API = "getSubscriberAndAccountProfile";
				final String url = "http://" + IP + "/FET_IVR_MiddleWare/" + API;

				String Response = null;
				try {
					String ani = Utils.getFieldString(mySession,
							IProjectVariables.S__USERDATA ,
							IProjectVariables.S__USERDATA_FIELD_ANI);
					if(TextUtils.isNullOrEmpty(ani)){
						ani = Utils.getFieldString(mySession,
								IProjectVariables.CH__USERDATA,
								IProjectVariables.CH__USERDATA_FIELD_ANI);
						if(TextUtils.isNullOrEmpty(ani)){
							Utils.LogsERROR(mySession, "ani is Fuck null Or Empty.");
						}
					}
					JsonObject info = new JsonObject();
					info.addProperty("msisdn", ani);

					Gson gson = new Gson();
					String urlParameters = gson.toJson(info);

					Utils.LogsINFO(mySession, "urlParameters: " + urlParameters);

					HttpURLConnection con = (HttpURLConnection) new URL(url)
							.openConnection();
					con.setRequestMethod("POST");
					con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
					con.setDoOutput(true);
					DataOutputStream wr = new DataOutputStream(con.getOutputStream());
					wr.write(urlParameters.getBytes("UTF-8"));
					wr.flush();
					wr.close();
					final int responseCode = con.getResponseCode();

					BufferedReader in = new BufferedReader(new InputStreamReader(
							con.getInputStream()));

					String line;
					StringBuffer response = new StringBuffer();
					while ((line = in.readLine()) != null) {
						response.append(line);
					}
					in.close();

					Response = response.toString();
					Utils.LogsResponse(mySession, TID, SimpleName, con, urlParameters,
							responseCode, Response);
					
					JsonElement element = gson.fromJson(Response, JsonElement.class);
					JsonObject result = element.getAsJsonObject();

					if (null != Response && Response.length() > 20) {

						JsonElement retcode = result.get("returnCode");
						if(retcode != null && !retcode.getAsString().isEmpty()){
							//Cust-006-010-01000
							Utils.setFieldString(
									mySession,
									IProjectVariables.FE__API__LOG__TBL,
									IProjectVariables.FE__API__LOG__TBL_FIELD_RETURNCODE,
									retcode.getAsString());

							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_RETURN_CODE,
									retcode.getAsString());
						
						}

						JsonElement msg = result.get("returnMesg");
						if (msg != null && !msg.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_RETURN_MESG,
									msg.getAsString());
						}

						JsonElement pid = result.get("processID");
						if (pid != null && !pid.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_PROCESS_ID,
									pid.getAsString());
						}

						JsonElement processName = result.get("processName");
						if (processName != null && !processName.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_PROCESS_NAME,
									processName.getAsString());
						}

						JsonElement BirthDate = result.get("birthDate");
								
						if (BirthDate != null && !BirthDate.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_BIRTH_DATE,
									BirthDate.getAsString());
						}

						JsonElement id = result.get("firstId");
						
						if (id != null && !id.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_IDENTIFICATION_NUMBER,
									id.getAsString());
						}
						
						JsonElement password = result.get("password");
						if (password != null && !password.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_PASSWORD,
									password.getAsString());
						}
						
//						JsonElement subscriberId = result.get("subscriberId");
//						if (subscriberId != null && !subscriberId.getAsString().isEmpty()) {
//							Utils.setFieldString(
//									mySession,
//									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
//									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_SUBSCEIBER_ID,
//									subscriberId.getAsString());
//						}
//						
						
						JsonElement personName = result.get("personName");
						if (personName != null && !personName.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_PERSON_NAME,
									personName.getAsString());
						}
						
						JsonElement billAddressCity = result.get("billAddressCity");
						if (billAddressCity != null && !billAddressCity.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_CITY,
									billAddressCity.getAsString());
						}
						
						JsonElement billAddressRegion = result.get("billAddressRegion");
						if (billAddressRegion != null && !billAddressRegion.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_REGION,
									billAddressRegion.getAsString());
						}
						
						JsonElement billAddressAddressLineOne = result.get("billAddressAddressLineOne");
						if (billAddressAddressLineOne != null && !billAddressAddressLineOne.getAsString().isEmpty()) {
							Utils.setFieldString(
									mySession,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT,
									IProjectVariables.GET_CONTRACT_BY_ACCOUNT_ID_OR_SUBSCRIBER_ID__OUTPUT_FIELD_ADDRESS_LINE_ONE,
									billAddressAddressLineOne.getAsString());
						}
						
						// 抓地址
//						if (result.getSubscriberLayerInfo().getSubscriberProfile()
//								.getAddressInfo() != null) {
//							SubscriberAndAccountProfileResult.SubscriberLayerInfo.SubscriberProfile.AddressInfo addressInfo = result
//									.getSubscriberLayerInfo().getSubscriberProfile()
//									.getAddressInfo();
//							String FullAddress = addressInfo.getContactAddressZipCode()
//									+ addressInfo.getContactAddressCity()
//									+ addressInfo.getContactAddressRegion()
//									+ addressInfo.getContactAddressAddressLineOne();
//							// returnJson.addProperty("FullAddress", FullAddress);
		//
//						}
						// 抓家用電話
//						if (result.getSubscriberLayerInfo().getSubscriberProfile()
//								.getContactMethodInfo() != null) {
//							SubscriberAndAccountProfileResult.SubscriberLayerInfo.SubscriberProfile.ContactMethodInfo contactMethodInfo = result
//									.getSubscriberLayerInfo().getSubscriberProfile()
//									.getContactMethodInfo();
//							// returnJson.addProperty("telephone",
//							// contactMethodInfo.getHomePhoneNum());
//						}

					}

				} catch (Exception e) {
					e.printStackTrace();
					Utils.LogsERROR(mySession, "Exception Response(TID:[" + TID + "]"
							+ SimpleName + "):" + e.getMessage());
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
	 * Last generated by Orchestration Designer at: 2024年11月20日 下午01時21分45秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("API_getSubscriberAndAccountProfile-set_datalog", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
