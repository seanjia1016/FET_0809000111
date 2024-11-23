package flow.subflow.insert_AIR_MENU_MASTER;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年6月15日 下午07時33分56秒
 */
public class insert_AIR_MENU_MASTER extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年6月15日 下午07時33分56秒
	 */
	public insert_AIR_MENU_MASTER() {
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
	 * Last generated by Orchestration Designer at: 2017年6月15日 下午07時33分56秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {
		
		String insert_AIR_MENU_MASTER = "insert AIR_MENU_MASTER";
		
		IVariable air_Master_Varible = mySession.getVariable(IProjectVariables.AIR__MENU__MASTER);
		IComplexVariable air_Master_complex = air_Master_Varible.getComplexVariable();

		IVariableField TID_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_TID);
		String TID = TID_field.getStringValue();
		
		IVariableField ani_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_ANI);
		String ani = ani_field.getStringValue();
		
		IVariableField msisdn_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_MSISDN);
		String msisdn = msisdn_field.getStringValue();
		
		IVariableField channel_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_CHANNEL);
		String channel = channel_field.getStringValue();
		
		IVariableField menuDate_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_MENU__DATE);
		String menuDate = menuDate_field.getStringValue();
		
		IVariableField startTime_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_START__TIME);
		String startTime = startTime_field.getStringValue();
		
		IVariableField endTime_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_END__TIME);
		String endTime = endTime_field.getStringValue();
		
		IVariableField ivrFlow_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_IVRFLOW);
		String ivrFlow = ivrFlow_field.getStringValue();
		
		IVariableField ucid_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_IVR__UCID);
		String ucid = ucid_field.getStringValue();
		
		IVariableField callType_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_CALL__TYPE);
		String callType = callType_field.getStringValue();
		
		IVariableField inVDN_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_IN__VDN);
		String inVDN = inVDN_field.getStringValue();
		
		IVariableField outVDN_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_OUT__VDN);
		String outVDN = outVDN_field.getStringValue();
		
		IVariableField inEnterprise_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_IN__ENTERPRISE);
		String inEnterprise = inEnterprise_field.getStringValue();
		
		IVariableField inMVPN_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_IN__MVPN);
		String inMVPN = inMVPN_field.getStringValue();
		
		IVariableField lang_field = air_Master_complex.getField(IProjectVariables.AIR__MENU__MASTER_FIELD_LANG);
		String lang = lang_field.getStringValue();
		
		String SQL = "insert into AIR_MENU_MASTER values('"+ TID +"','"+ ani +"','"+ msisdn +"','"+ channel +"','"+ menuDate +"','"+ startTime +"','"+ endTime +"','"+ ivrFlow +"','','','','"+ ucid +"','','','"+ callType +"','"+ inVDN +"','"+ outVDN +"','"+ inEnterprise +"','"+ inMVPN +"','"+ lang +"')";
		
		String Table = "AIR_MENU_MASTER";
		
		IVariableField SQL_varible = mySession.getVariableField(
				IProjectVariables.S__DB__API,
				IProjectVariables.S__DB__API_FIELD_SQL);
		SQL_varible.setValue(SQL);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "SQL Response(TID:["+TID+"]"+insert_AIR_MENU_MASTER+"):" +SQL);


		IVariableField Table_varible = mySession.getVariableField(
				IProjectVariables.S__DB__API,
				IProjectVariables.S__DB__API_FIELD_TABLE);
		Table_varible.setValue(Table);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "Table Response(TID:["+TID+"]"+insert_AIR_MENU_MASTER+"):" +Table);

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
	 * Last generated by Orchestration Designer at: 2024年11月23日 下午08時43分46秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("insert_AIR_MENU_MASTER-CF_insetDBAPI", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
