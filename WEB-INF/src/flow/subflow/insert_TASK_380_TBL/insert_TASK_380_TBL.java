package flow.subflow.insert_TASK_380_TBL;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年8月31日 下午09時26分58秒
 */
public class insert_TASK_380_TBL extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月31日 下午09時26分58秒
	 */
	public insert_TASK_380_TBL() {
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
	 * Last generated by Orchestration Designer at: 2017年8月31日 下午09時26分58秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		
		String insert_TASK_380_TBL = "insert TASK_380_TBL";

		
		IVariable task380_Varible = mySession.getVariable(IProjectVariables.TASK___3_8_0__TBL);
		IComplexVariable task380_complex = task380_Varible.getComplexVariable();
	
		
		IVariableField TID_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_TID);
		String TID = TID_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "TID Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + TID);
		
		
		IVariableField msisdn_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_MSISDN);
		String msisdn = msisdn_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "msisdn Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + msisdn);


		IVariableField amt_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_AMT);
		String amt = amt_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "amt Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + amt);

		
		IVariableField job_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_JOB);
		String flowName = job_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "flowName Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + flowName);


		IVariableField reason_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_REASON);
		String reason = reason_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "reason Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + reason);

		
		IVariableField req_date_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_REQ__DATE);
		String req_date = req_date_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "req_date Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + req_date);


		IVariableField req_sdate_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_REQ__STIME);
		String req_sdate = req_sdate_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "req_sdate Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + req_sdate);

		
		IVariableField req_edate_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_REQ__ETIME);
		String req_edate = req_edate_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "req_edate Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + req_edate);


		IVariableField status_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_STATUS);
		String status = status_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "status Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + status);
		
		IVariableField ani_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_ANI);
		String ANI = ani_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "ANI Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + ANI);		

		
		IVariableField sid_field = task380_complex.getField(IProjectVariables.TASK___3_8_0__TBL_FIELD_SID);
		String SID = sid_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SID Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" + SID);

		
		String SQL = "insert into TASK_380_TBL (TID,MSISDN,REQ_Date,REQ_STIME,REQ_ETIME,JOB,STATUS,REASON,AMT,ANI,SID)values" +
				"('"+ TID +"','"+ msisdn +"','"+ req_date +"','"+ req_sdate +"','"+ req_edate +"','"+ flowName +"','"+ status +"'," +
						"'"+ reason +"','"+ amt +"','"+ ANI +"','"+ SID +"')";
		
		String Table = "TASK_380_TBL";
		
		IVariableField SQL_varible = mySession.getVariableField(
				IProjectVariables.S__DB__API,
				IProjectVariables.S__DB__API_FIELD_SQL);
		
		SQL_varible.setValue(SQL);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "380 task SQL Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" +SQL);


		IVariableField Table_varible = mySession.getVariableField(
				IProjectVariables.S__DB__API,
				IProjectVariables.S__DB__API_FIELD_TABLE);
		
		Table_varible.setValue(Table);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Table Response(TID:["+TID+"]"+insert_TASK_380_TBL+"):" +Table);
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
	 * Last generated by Orchestration Designer at: 2024年11月11日 下午03時29分18秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("insert_TASK_380_TBL-CF_insetDBAPI", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
