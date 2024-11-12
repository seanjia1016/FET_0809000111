package flow.subflow.select_FET_0809000811_STORE_LST;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017�?5???25?�� 上�??11???05???40�?
 */
public class assign_FET_0809000811_STORE_LST extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017�?5???25?�� 上�??11???05???40�?
	 */
	public assign_FET_0809000811_STORE_LST() {
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
	 * Last generated by Orchestration Designer at: 2017�?5???25?�� 上�??11???05???40�?
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		String TID = TIDfield.getStringValue();
		String Select_FE_MSIS_CB2_TBL="Select FE_MSIS_CB2_TBL";
		
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "## TID Response## :"+TID);

		IVariable tenantVarible = mySession.getVariable(IProjectVariables.FET___0_8_0_9_0_0_0_8_1_1__STORE__LST);
		IComplexVariable complexVarible = tenantVarible.getComplexVariable();
		
		IVariableField tenantfield = complexVarible.getField(IProjectVariables.FET___0_8_0_9_0_0_0_8_1_1__STORE__LST_FIELD_ENTERPRISE);
		String tenantID = tenantfield.getStringValue();
		
		//4G
		//String SQL="SELECT fe_msis_cb_account_id, FE_MSIS_CB_CUSTOMER_ID, fe_msis_status, fe_msis_cb_service_type, fe_msis_cb_hybrid_flag FROM FE_MSIS_CB2_TBL WHERE FE_MSIS_TELE_NUMB = '"+ ANI +"' and FE_MSIS_STATUS ='1' and fe_msis_cb_service_type in ('6','J')";
		
		//5G修改?���?
		String SQL= "SELECT STORENO FROM FET_0809000811_STORE_LST WHERE STORENO = '"+ tenantID +"' ";
		
		String Table="FET_0809000811_STORE_LST";
		
		
		
		IVariableField SQL_varible = mySession.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_SQL);
		SQL_varible.setValue(SQL);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SQL Response(["+TID+"]"+Select_FE_MSIS_CB2_TBL+"):" +SQL);
		
		
		IVariableField Table_varible = mySession
				.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_TABLE);
		Table_varible.setValue(Table);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Table Response(["+TID+"]"+Select_FE_MSIS_CB2_TBL+"):" +Table);
		
		
		
		
		
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
	 * Last generated by Orchestration Designer at: 2024年11月12日 上午11時53分05秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("select_FET_0809000811_STORE_LST-CF_selectDBAPI", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
