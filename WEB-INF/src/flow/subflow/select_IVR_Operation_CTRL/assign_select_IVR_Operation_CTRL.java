package flow.subflow.select_IVR_Operation_CTRL;

import com.avaya.sce.runtimecommon.IComplexVariable;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariable;
import com.avaya.sce.runtimecommon.IVariableField;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2017年5月25日 下午04時09分58秒
 */
public class assign_select_IVR_Operation_CTRL extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2017年5月25日 下午04時09分58秒
	 */
	public assign_select_IVR_Operation_CTRL() {
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
	 * Last generated by Orchestration Designer at: 2017年5月25日 下午04時09分58秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {


		IVariable TIDVarible = mySession.getVariable(IProjectVariables.S__TID);
		IComplexVariable complexTID = TIDVarible.getComplexVariable();
		IVariableField TIDfield = complexTID.getField(IProjectVariables.S__TID_FIELD_TID);
		
		String TID = TIDfield.getStringValue();
		String select_IVR_OPERATION_CTRL = "Select IVR_OPERATION_CTRL";
		
		
		IVariable operationCtrlInputVarible = mySession.getVariable(IProjectVariables.IVR__OPERATION__CTRL__INPUT);
		IComplexVariable complexOperationCtrlInput = operationCtrlInputVarible.getComplexVariable();
		
		IVariableField operationInputTypefield = complexOperationCtrlInput.getField(IProjectVariables.IVR__OPERATION__CTRL__INPUT_FIELD_OPERATION__CTRL__TYPE);
		String operationCtrlType = operationInputTypefield.getStringValue();
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "operationCtrlType Response(TID:["+TID+"]"+select_IVR_OPERATION_CTRL+"):" +operationCtrlType);

		
		
		String SQL="SELECT * FROM IVR_OPERATION_CTRL WHERE OPERATION_CTRL_TYPE = '"+ operationCtrlType +"'";
		String Table="IVR_OPERATION_CTRL";
		
		
		IVariableField SQL_varible = mySession.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_SQL);
		SQL_varible.setValue(SQL);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "##Operation Ctrl SQL Response(TID:["+TID+"]"+select_IVR_OPERATION_CTRL+"):" +SQL);
		
		
		IVariableField Table_varible = mySession.getVariableField(
						IProjectVariables.S__DB__API,
						IProjectVariables.S__DB__API_FIELD_TABLE);
		Table_varible.setValue(Table);
		mySession.getTraceOutput().writeln(ITraceInfo.TRACE_LEVEL_INFO, "##Operation Ctrl Table Response(TID:["+TID+"]"+select_IVR_OPERATION_CTRL+"):" +Table);
		
	
		
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
<<<<<<< HEAD
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午06時05分38秒
=======
	 * Last generated by Orchestration Designer at: 2024年11月22日 下午05時44分50秒
>>>>>>> 1ce24f429fccbcab12844b062c4f9e73875b8a9b
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("select_IVR_Operation_CTRL-CF_selectDBAPI", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
