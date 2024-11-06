package flow.subflow.CF_selectDBAPI;

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
import com.infotrends.DBfunction.ResolveDBAPI;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年5月23日 下午01時53分18秒
 */
public class selectDBAPI extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年5月23日 下午01時53分18秒
	 */
	public selectDBAPI() {
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
	 * Last generated by Orchestration Designer at: 2017年5月23日 下午01時53分18秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {


		
		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		

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
		String url = "http://"+IP+"/CommonDBAPI/doSelect"; //作業
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "url Response(TID:["+TID+"]):" +url);
			URL obj = null;
			obj = new URL(url);
			con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			
		//組成要傳入的JSON物件
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("JNDINAME",JNDINAME);
		jsonobject.put("SQL", SQL);
		jsonobject.put("TABLE", TABLE);
		
		String urlParameters = jsonobject.toString();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SystemCheck urlParameters Response(TID:["+TID+"]):" +urlParameters);

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = null;
		int responseCode = 0;
		
			wr = new DataOutputStream(con.getOutputStream());
			wr.write(urlParameters.getBytes("UTF-8"));
			wr.flush();
			wr.close();
			responseCode = con.getResponseCode();

			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "con Response(TID:["+TID+"]):" +con);
			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "wr Response(TID:["+TID+"]):" +wr);
			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "url Response(TID:["+TID+"]):" +url);
			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "urlParameters Response(TID:["+TID+"]):" +urlParameters);
			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "responseCode Response(TID:["+TID+"]):" +responseCode);
			
		BufferedReader in = null;
			in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			
		String inputLine;
		
		StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			
			in.close();


		//print result

			JSONObject ResponseJsonObject = new JSONObject(response.toString());
			ResolveDBAPI resolveDBAPI = new ResolveDBAPI();
			
			
			 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "###ResponseJsonObject Response(TID:["+TID+"]):" +ResponseJsonObject);

			
			ResponseJsonObject.put("responseCode", responseCode);
			
		
		int count = ResponseJsonObject.getInt("count");
		
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "###count Response(TID:["+TID+"]):" +count);
		 
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "###TABLE Response(TID:["+TID+"]):" +TABLE);
		
		
		if(count>0){
			if(TABLE.equals("FE_MSIS_CB2_TBL")){
				resolveDBAPI.FE_MSIS_CB2_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("IVR_OPERATION_CTRL")){
				resolveDBAPI.IVR_OPERATION_CTRL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("FE_CUST_CB2_TBL")){
				resolveDBAPI.FE_CUST_CB2_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("FE_NEWCASH_TBL")){
				resolveDBAPI.FE_NEWCASH_TBL(mySession, ResponseJsonObject);
			}else if(TABLE.equals("IVR_DONATE_TRAN")){
				resolveDBAPI.IVR_DONATE_TRAN(mySession, ResponseJsonObject);
			}
			else{
			}
		}else{
			
			mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Response: DB Permission denied " );
		}
		
	}catch (ArithmeticException ex) {
		 ex.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "ArithmeticException Response(TID:["+TID+"]):" +ex.getMessage());
	 }catch (MalformedURLException e1) {
		 e1.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "MalformedURLException Response(TID:["+TID+"]):" +e1.getMessage());
	 } catch (IOException e) {
		 e.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "IOException Response(TID:["+TID+"]):" +e.getMessage());
	 } catch (Exception e) {
		 e.printStackTrace();
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "Exception Response(TID:["+TID+"]):" +e.getMessage());
	 }
	 finally {
		 mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_ERROR, "exectureAddItemsEx END" );
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
	 * Last generated by Orchestration Designer at: 2024年11月6日 下午12時16分56秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("CF_selectDBAPI-next", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
