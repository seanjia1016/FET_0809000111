package flow.subflow.CF_insetDBAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONObject;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;
import com.infotrends.DBfunction.ResolveDBAPIin;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年5月23日 下午01時55分42秒
 */
public class insertDBAPI extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年5月23日 下午01時55分42秒
	 */
	public insertDBAPI() {
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
	 * Last generated by Orchestration Designer at: 2017年5月23日 下午01時55分42秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {


		IVariable DB__API_Varible = mySession.getVariable(IProjectVariables.S__DB__API);
		IComplexVariable complexVarible = DB__API_Varible.getComplexVariable();
		
		IVariableField SQL_field = complexVarible.getField(IProjectVariables.S__DB__API_FIELD_SQL);
		String SQL = SQL_field.getStringValue();
		
		IVariableField TABLE_field = complexVarible.getField(IProjectVariables.S__DB__API_FIELD_TABLE);
		String TABLE = TABLE_field.getStringValue();
		
		IVariableField JNDINAME_field = complexVarible.getField(IProjectVariables.S__DB__API_FIELD_JNDINAME);
		String JNDINAME = JNDINAME_field.getStringValue();

		IVariable PROPERTIES_Varible = mySession.getVariable(IProjectVariables.PROPERTIES);
		IComplexVariable complexPROPERTIES = PROPERTIES_Varible.getComplexVariable();
		
		IVariableField IP_field = complexPROPERTIES.getField(IProjectVariables.PROPERTIES_FIELD_DB__API__IP);
		String IP = IP_field.getStringValue();

		try{
		HttpURLConnection con = null;
		
		//模擬OD Servlet打入http方法
		String url = "http://"+IP+"/CommonDBAPI/doInsert";
		
		URL obj = null;
			obj = new URL(url);
			con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			con.setDoOutput(true);
			
		//組成要傳入的JSON物件
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("JNDINAME",JNDINAME);
		jsonobject.put("SQL", SQL);
		jsonobject.put("TABLE", TABLE);
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "jsonobject Response:" +jsonobject);
		
		String urlParameters = jsonobject.toString();
		
		// Send post request
		DataOutputStream wr = null;
		int responseCode = 0;
			wr = new DataOutputStream(con.getOutputStream());
//			wr.writeBytes(urlParameters);
			wr.write(urlParameters.getBytes("UTF-8"));
			wr.flush();
			wr.close();
			responseCode = con.getResponseCode();

			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "con Response:" +con);
			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "wr Response:" +wr);
			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "url Response:" +url);
			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "urlParameters Response:" +urlParameters);
			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "responseCode Response:" +responseCode);
		
		
		
		BufferedReader in = null;
		
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
		String inputLine;
		
		StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			
			in.close();

		//print result
		JSONObject ResponseJsonObject = new JSONObject(response.toString());
		ResolveDBAPIin resolveDBAPIin = new ResolveDBAPIin();
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "ResponseJsonObject Response:" + ResponseJsonObject);
		
			if(TABLE.equals("IVR_DONATE_TRAN")){
				resolveDBAPIin.IVR_DONATE_TRAN(mySession, ResponseJsonObject);
			}else if(TABLE.equals("IVR_591939_DONATE_TRAN")){
				resolveDBAPIin.IVR_591939_DONATE_TRAN(mySession, ResponseJsonObject);
			}else if(TABLE.equals("AIR_55135_MENU_TBL")){
				resolveDBAPIin.AIR_55135_MENU_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("AIR_380_MENU_TBL")){
				resolveDBAPIin.AIR_380_MENU_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("AIR_591939_MENU_TBL")){
				resolveDBAPIin.AIR_591939_MENU_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("AIR_591980_MENU_TBL")){
				resolveDBAPIin.AIR_591980_MENU_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("AIR_591933_MENU_TBL")){
				resolveDBAPIin.AIR_591933_MENU_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("AIR_MENU_MASTER")){
				resolveDBAPIin.AIR_MENU_MASTER(mySession, ResponseJsonObject);
			}else if(TABLE.equals("AIR_MENU_DETAIL")){
				resolveDBAPIin.AIR_MENU_DETAIL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("TASK_380_TBL")){
				resolveDBAPIin.TASK_380_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("AIR_591993_MENU_TBL")){
				resolveDBAPIin.AIR_591993_MENU_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("IVR_5919_DONATE_TRAN")){
				resolveDBAPIin.IVR_5919_DONATE_TRAN(mySession, ResponseJsonObject);
			}
			
			
			else{
			}
			
		
	 }catch (ArithmeticException ex) {
		 ex.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "ArithmeticException Response:" +ex.getMessage());
	 }catch (MalformedURLException e1) {
		 e1.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "MalformedURLException Response:" +e1.getMessage());
	 } catch (IOException e) {
		 e.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "IOException Response:" +e.getMessage());
	 }
	 finally {
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "exectureAddItemsEx END" );
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
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午11時12分37秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("CF_insetDBAPI-next", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
