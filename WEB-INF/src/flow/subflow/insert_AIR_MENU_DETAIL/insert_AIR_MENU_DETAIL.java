package flow.subflow.insert_AIR_MENU_DETAIL;

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
public class insert_AIR_MENU_DETAIL extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年8月31日 下午09時26分58秒
	 */
	public insert_AIR_MENU_DETAIL() {
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


		
		String insert_AIR_MENU_DETAIL = "insert AIR_MENU_DETAIL";
		
		IVariable air_Detail_Varible = mySession.getVariable(IProjectVariables.AIR__MENU__DETAIL);
		IComplexVariable air_Detail_complex = air_Detail_Varible.getComplexVariable();

		
		
		IVariableField TID_field = air_Detail_complex.getField(IProjectVariables.AIR__MENU__DETAIL_FIELD_TID);
		String TID = TID_field.getStringValue();
		
		IVariableField menuTime_field = air_Detail_complex.getField(IProjectVariables.AIR__MENU__DETAIL_FIELD_MENU__TIME);
		String menuTime = menuTime_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "menuTime Response(TID:["+TID+"]"+insert_AIR_MENU_DETAIL+"):" +menuTime);
		
		IVariableField ivrFlow_field = air_Detail_complex.getField(IProjectVariables.AIR__MENU__DETAIL_FIELD_IVRFLOW);
		String ivrFlow = ivrFlow_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "ivrFlow Response(TID:["+TID+"]"+insert_AIR_MENU_DETAIL+"):" +ivrFlow);

		IVariableField menuID_field = air_Detail_complex.getField(IProjectVariables.AIR__MENU__DETAIL_FIELD_MENU__ID);
		String menuID = menuID_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "menuID Response(TID:["+TID+"]"+insert_AIR_MENU_DETAIL+"):" +menuID);
		
		
		IVariableField strLevelDesc_field = air_Detail_complex.getField(IProjectVariables.AIR__MENU__DETAIL_FIELD_STR__LEVEL__DESC);
		String strLevelDesc = strLevelDesc_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "strLevelDesc Response(TID:["+TID+"]"+insert_AIR_MENU_DETAIL+"):" +strLevelDesc);

		
		IVariableField strLog_field = air_Detail_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_STR__LOG);
		String strLog = strLog_field.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "strLog Response(TID:["+TID+"]"+insert_AIR_MENU_DETAIL+"):" +strLog);
		
		
		String SQL = "insert into AIR_MENU_DETAIL values('"+ TID +"','"+ menuTime +"','"+ ivrFlow +"','"+ menuID +"','"+ strLevelDesc +"','"+ strLog +"')";
		
		String Table = "AIR_MENU_DETAIL";
		
		IVariableField SQL_varible = mySession.getVariableField(
				IProjectVariables.S__DB__API,
				IProjectVariables.S__DB__API_FIELD_SQL);
		
		SQL_varible.setValue(SQL);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SQL Response(TID:["+TID+"]"+insert_AIR_MENU_DETAIL+"):" +SQL);


		IVariableField Table_varible = mySession.getVariableField(
				IProjectVariables.S__DB__API,
				IProjectVariables.S__DB__API_FIELD_TABLE);
		
		Table_varible.setValue(Table);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Table Response(TID:["+TID+"]"+insert_AIR_MENU_DETAIL+"):" +Table);
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
	 * Last generated by Orchestration Designer at: 2024年11月15日 上午10時17分05秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("insert_AIR_MENU_DETAIL-CF_insetDBAPI", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
